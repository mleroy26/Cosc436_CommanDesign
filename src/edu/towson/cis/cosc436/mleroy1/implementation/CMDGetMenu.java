package edu.towson.cis.cosc436.mleroy1.implementation;

import edu.towson.cis.cosc436.mleroy1.interfaces.Command;

public class CMDGetMenu implements Command {
	private Aggregator agg;
	
	public CMDGetMenu(Aggregator agg){
		this.agg=agg;
	}

	public Object execute() {
		return agg.getMenu();
	}

}
