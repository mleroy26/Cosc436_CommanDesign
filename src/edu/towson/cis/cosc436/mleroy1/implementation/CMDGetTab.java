package edu.towson.cis.cosc436.mleroy1.implementation;

import edu.towson.cis.cosc436.mleroy1.interfaces.Command;

public class CMDGetTab implements Command {

private Aggregator agg;
	
	public CMDGetTab(Aggregator agg){
		this.agg=agg;
	}
	public Orders execute() {
		return agg.getOrders();
	}

}
