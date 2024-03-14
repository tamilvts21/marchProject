package org.launch;

import java.util.ArrayList;

public class Root {

	private String id;
	private String type;
	private String name;
	private double ppu;
	private Batters batters;
	private ArrayList<ToppingInnerValue> topping;
	public static void main(String[] args) {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPpu() {
		return ppu;
	}
	public void setPpu(double ppu) {
		this.ppu = ppu;
	}
	public Batters getBatters() {
		return batters;
	}
	public Root(String id, String type, String name, double ppu, Batters batters,
			ArrayList<ToppingInnerValue> topping) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.ppu = ppu;
		this.batters = batters;
		this.topping = topping;
	}
	public void setBatters(Batters batters) {
		this.batters = batters;
	}
	public ArrayList<ToppingInnerValue> getTopping() {
		return topping;
	}
	public void setTopping(ArrayList<ToppingInnerValue> topping) {
		this.topping = topping;
	}
	

	}


