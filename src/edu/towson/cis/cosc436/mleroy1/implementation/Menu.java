package edu.towson.cis.cosc436.mleroy1.implementation;

import java.util.ArrayList;

import edu.towson.cis.cosc436.mleroy1.interfaces.MIterator;

public class Menu {
	private ArrayList<MenuItem> items=new ArrayList<MenuItem>();
	public Menu(){
		items.add(new MenuItem("Pasta", 10,false));
		items.add(new MenuItem("Soup",20,false));
	}
	//various iterators

	public MIterator getMenuIterator(){
		return null;
	}
	public MIterator getHeartHealthyMenuItr() {
		return null;
	}
	public void print(){
		int i=1;
		for(MenuItem e:items){
			System.out.println(i+": "+e.getName()+"  $"+e.getPrice());
			i++;
		}
	}
	public MenuItem get(int i){
		return items.get(i-1);
	}
}
