package edu.towson.cis.cosc436.mleroy1.implementation;

public class Invoker {
	Aggregator agg =new Aggregator();
	public Invoker(){

	}
	public Menu getMenu(){
		return (Menu) new CMDGetMenu(agg).execute();
	}
	public Menu getHeartHealthyMenu() {
		return (Menu) new CMDGetHeartHealthyMenu(agg).execute();
	}
	public Object submitOrder(){
		return new CMDSubmitOrder(agg);
	}
	public Orders getOrders(){
		return new CMDGetTab(agg).execute();
	}
}
