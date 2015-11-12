package edu.towson.cis.cosc436.mleroy1.implementation;

public class Invoker {
	Aggregator agg;
	public Invoker(){

	}
	public Menu getMenu(){
		return (Menu) new CMDGetMenu(agg).execute();
	}
	public Menu getHeartHealthyMenu() {
		// TODO Auto-generated method stub
		return null;
	}
}
