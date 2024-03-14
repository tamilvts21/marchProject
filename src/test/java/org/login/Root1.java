package org.login;

import java.util.ArrayList;

public class Root1 {
	private String id;
	private String name;
	public Root1(String id, String name, String type, double ppu, Batters batter,
			ArrayList<ToppingInnerValue> topping) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.ppu = ppu;
		this.batter = batter;
		Topping = topping;
	}
	private String type;
	private double ppu;
	private Batters batter;
	private ArrayList<ToppingInnerValue>Topping;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPpu() {
		return ppu;
	}
	public void setPpu(double ppu) {
		this.ppu = ppu;
	}
	public Batters getBatter() {
		return batter;
	}
	public void setBatter(Batters batter) {
		this.batter = batter;
	}
	public ArrayList<ToppingInnerValue> getTopping() {
		return Topping;
	}
	public void setTopping(ArrayList<ToppingInnerValue> topping) {
		Topping = topping;
	}
	
	
	
	
		
		
		
		
		
		
		
		
		
	
	}

