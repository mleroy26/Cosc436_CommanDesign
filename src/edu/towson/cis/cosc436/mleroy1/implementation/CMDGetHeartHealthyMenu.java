package edu.towson.cis.cosc436.mleroy1.implementation;

import edu.towson.cis.cosc436.mleroy1.interfaces.Command;
import edu.towson.cis.cosc436.mleroy1.interfaces.MIterator;

public class CMDGetHeartHealthyMenu implements Command {
	private Aggregator agg;
	Menu menu=agg.getMenu();
	MIterator itr=menu.getHeartHealthyMenuItr();
	Menu HHMenu;
	
//	Fill HHMenu with only heart healthy items
	
	public CMDGetHeartHealthyMenu(Aggregator agg){
		this.agg=agg;
	}
	public Object execute() {
		return HHMenu;
	}

}
