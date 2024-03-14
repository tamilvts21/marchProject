package org.login;

import java.util.ArrayList;
import java.util.List;



public class Batters {
	private List<BatterValue> batter;


	public Batters(Batters batter) {
		super();
		this.batter = batter;
	}

	/**
	 * @return the batter
	 */
	public Batters getBatter() {
		return batter;
	}

	/**
	 * @param batter the batter to set
	 */
	public void setBatter(ArrayList<BatterValue> batter) {
		this.batter = batter;
	}
	

}
