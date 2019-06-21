package adapter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 * Adapta o map utilizando métodos da interface List
 * 
 * @author Adriele e Samara
 */
public class MapListAdapter implements List<Object> {

	private Map<Object, Object> map;

	/**
	 * Instancia o map
	 */
	public MapListAdapter() {
		map = new HashMap<>();
	}

	/**
	 * Adiciona o objeto no map
	 */
	@Override
	public void add(int arg0, Object arg1) {
		map.put(arg0, arg1);

	}

	/**
	 * Limpa o map
	 */
	@Override
	public void clear() {
		map.clear();

	}

	/**
	 * Verifica se o objeto passado como parâmetro está no map, retorna true se
	 * estiver se não retorna false
	 */
	@Override
	public boolean contains(Object arg0) {
		if (map.containsKey(arg0) || map.containsValue(arg0)) {
			return true;
		}
		return false;
	}

	/**
	 * Percorre o map e verifica se o objeto que está na posição i é igual ao objeto
	 * passado como parâmetro
	 */
	@Override
	public boolean equals(Object obj) {
		for (int i = 0; i < map.size(); i++) {
			if (map.get(i).equals(obj)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Retorna o objeto que está na posição passada como parâmetro
	 */
	@Override
	public Object get(int arg0) {
		return map.get(arg0);
	}

	/**
	 * Verifica se o map está vazio
	 */
	@Override
	public boolean isEmpty() {
		if (map.isEmpty()) {
			return true;
		}
		return false;
	}

	/**
	 * Retorna uma exception pois não tem nenhum método equivalente
	 */
	@Override
	public Iterator<Object> iterator() {
		throw new UnsupportedOperationException("A operação não é suportada por map");
	}

	/**
	 * Retorna a quantidade de elementos do map
	 */
	@Override
	public int size() {
		return map.size();
	}

	/**
	 * Remove o objeto passado como parâmetro do map
	 */
	@Override
	public Object remove(int arg0) {
		return map.remove(arg0);
	}
	
	//FALTA
	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		return false;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
