package org.launch;

public class BatterValue {
	private String id;
	private String type;
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
	public BatterValue(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	
	

}
