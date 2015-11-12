package edu.towson.cis.cosc436.mleroy1.implementation;

public class Invoker {
	Aggregator agg;
	public Invoker(){

	}
	public Menu GetMenu(){
		return (Menu) new CMDGetMenu(agg).execute();
	}
}
