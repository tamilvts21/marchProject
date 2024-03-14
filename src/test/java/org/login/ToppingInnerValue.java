package org.login;

public class ToppingInnerValue {
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
	public ToppingInnerValue(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
