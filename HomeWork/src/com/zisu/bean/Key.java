package com.zisu.bean;
//1把lock对应多个key，所以key作为lock的属性
public class Key {
	private int  id;
	private String  name;
	//private int lid;  //为测试动态sql加进来的
	//private Lock lock;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Key(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public Key() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*@Override
	public String toString() {
		return "Key [id=" + id + ", name=" + name + "]";
	}*/
	@Override
	public String toString() {
		return "Key [id=" + id + ", name=" + name + "]";
	}
		
}
