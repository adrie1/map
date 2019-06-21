package adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Adapta a lista utilizando métodos da interface Map
 * 
 * @author Adriele e Samara
 */
public class ListMapAdapter implements Map<Object, Object> {

	private List<Object> lista;

	/**
	 * Instancia a lista
	 */
	public ListMapAdapter() {
		lista = new ArrayList<>();
	}

	/**
	 * Limpa a lista
	 */
	@Override
	public void clear() {
		lista.clear();
	}

	/**
	 * Verifica se o objeto está na lista, se estiver retorna true se não retorna
	 * false
	 */
	@Override
	public boolean containsKey(Object arg0) {
		if (lista.contains(arg0)) {
			return true;
		}
		return false;
	}

	/**
	 * Verifica se o objeto está na lista, se estiver retorna true se não retorna
	 * false
	 */
	@Override
	public boolean containsValue(Object arg0) {
		if (lista.contains(arg0)) {
			return true;
		}
		return false;
	}

	/**
	 * Percorre a lista e verifica se o objeto que está na posição i é igual ao
	 * objeto passado como parâmetro
	 */
	@Override
	public boolean equals(Object obj) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).equals(obj)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Retorna o objeto que está na posição passada como parâmetro
	 */
	@Override
	public Object get(Object arg0) {
		return lista.get((int) arg0);
	}

	/**
	 * Verifica se a lista está vazia
	 */
	@Override
	public boolean isEmpty() {
		if (lista.isEmpty()) {
			return true;
		}
		return false;
	}

	/**
	 * Adiciona o objeto na lista
	 */
	@Override
	public Object put(Object obj1, Object obj2) {
		lista.add((int) obj1, obj2);
		return lista;
	}

	/**
	 * Remove o objeto passado como parâmetro da lista
	 */
	@Override
	public Object remove(Object arg0) {
		return lista.remove(arg0);
	}

	/**
	 * Retorna a quantidade de elementos que a lista possui
	 */
	@Override
	public int size() {
		return lista.size();
	}

	//FALTA
	@Override
	public Collection values() {
		lista.toArray();
		return null;
	}

	@Override
	public Set<Object> keySet() {
		return null;
	}

	@Override
	public Set entrySet() {
		return null;
	}

	@Override
	public void putAll(Map<?, ?> arg0) {
	}

}
