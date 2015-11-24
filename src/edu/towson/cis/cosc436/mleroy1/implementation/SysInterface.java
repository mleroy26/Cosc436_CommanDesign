package edu.towson.cis.cosc436.mleroy1.implementation;

public class SysInterface {
	private static Invoker invoker=new Invoker();
	
	
	public static Menu getMenu(){
		Menu menu=invoker.getMenu();
		return menu;
	}
	public static Menu getHeartHealthyMenu(){
		Menu menu=invoker.getHeartHealthyMenu();
		//same
		return menu;
	}
	public static CMDSubmitOrder submitOrder(){
		return (CMDSubmitOrder) invoker.submitOrder();
	}
	public static Orders getTab(){
		return invoker.getOrders();
	}
}
