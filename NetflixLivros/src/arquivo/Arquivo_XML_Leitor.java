package arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import manutencao.leitor.Leitor;

/**
 * Classe Arquivo_XML_Leitor para gravar os dados do leitor.
 * @author Adriele e Samara
 */
public class Arquivo_XML_Leitor {
	
	public static List<Leitor> leitores = new ArrayList<Leitor>();

	/**
	 * Salva os dados no arquivo XML.
	 */
	public static void salvarXML() {

		XStream xstream = new XStream();
		xstream.alias("leitores", List.class);
		xstream.alias("leitor", Leitor.class);

		File arquivo = new File("leitores.xml");
		FileOutputStream gravar;

		try {
			gravar = new FileOutputStream(arquivo);
			gravar.write(xstream.toXML(leitores).getBytes());
			gravar.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Lê o arquivo XML.
	 */
	public static void lerXML() {

		try {
			XStream xstream = new XStream(new Dom4JDriver());
			xstream.alias("leitores", ArrayList.class);
			xstream.processAnnotations(Leitor.class);

			BufferedReader input = new BufferedReader(new FileReader("leitores.xml"));
			input.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
