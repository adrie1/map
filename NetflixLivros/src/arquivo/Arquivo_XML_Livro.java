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

import manutencao.livro.Livro;

/**
 * Classe Arquivo_XML_Livro para gravar os dados do livro.
 * @author Adriele e Samara
 */
public class Arquivo_XML_Livro {
	
	public static List<Livro> livros = new ArrayList<Livro>();
	
	/**
	 * Salva os dados no arquivo XML. 
	 */
	public static void salvarXML() {
		
		XStream xstream = new XStream();
		xstream.alias("livros", List.class);
		xstream.alias("livro", Livro.class);
		
		File arquivo = new File("livros.xml");
		FileOutputStream gravar;

		try {
			gravar = new FileOutputStream(arquivo);
			gravar.write(xstream.toXML(livros).getBytes());
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
			xstream.alias("livros", ArrayList.class);
			xstream.processAnnotations(Livro.class);
			
			BufferedReader input = new BufferedReader(new FileReader("livros.xml"));
			input.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
