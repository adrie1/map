package main;

import adapter.ListMapAdapter;
import adapter.MapListAdapter;

public class Cliente {

	public static void main(String[] args) {
		
		// Inst�ncia o adapter ListMap
		ListMapAdapter list = new ListMapAdapter();
		
		// Adiciona itens desejados 
		list.put(1, "");
		list.put(2, "");
		list.put(3, "");
		list.put(4, "");
		
		// Verifica se a lista est� vazia
		list.isEmpty();
		
		// Retorna a quantidade de elementos
		list.size();
		
		//list.equals(obj);
		
		// Limpa a lista
		list.clear();
		
		
		
		
		
		// Inst�ncia o adapter MapList
		MapListAdapter map = new MapListAdapter();
		
		// Adiciona no map comidas juninas 
		map.add("pamonha");
		map.add("milho");
		map.add("queijo");
		map.add("canjica");
		
		// Verifica se o map est� vazio
		map.isEmpty();
		
		// Retorna a quantidade de elementos
		map.size();
		
		// Limpa o map
		map.clear();
	}

}
