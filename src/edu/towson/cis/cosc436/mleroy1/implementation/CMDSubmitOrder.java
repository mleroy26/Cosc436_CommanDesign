package edu.towson.cis.cosc436.mleroy1.implementation;

import edu.towson.cis.cosc436.mleroy1.interfaces.Command;

public class CMDSubmitOrder implements Command {
	
private Aggregator agg;
	
	public CMDSubmitOrder(Aggregator agg){
		this.agg=agg;
	}

	public Object execute(int num) {
		agg.getOrders().add( (OrderItem) agg.getMenu().get(num));
		return null;
	}
	public Object execute() {
		return null;
	}

}
