package edu.towson.cis.cosc436.mleroy1.implementation;

import java.util.ArrayList;

public class Orders {
	private ArrayList<OrderItem> orders=new ArrayList<OrderItem>();
	
	public void add(OrderItem item){
		orders.add(item);
	}
	
	public void print(){
		for(OrderItem e:orders){
			System.out.println(e.getName()+"  $"+e.getPrice());
		}
	}
}
