package com.zisu.bean;

import java.util.List;
//1把lock对应多个key，所以key作为lock的属性
//所以查询的结果以lock为封装对象，接口为lock的接口
public class Lock {
	private int  id;
	private String  name;
	//所有keys
	private List<Key> keys;
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
	
	public List<Key> getKeys() {
		return keys;
	}
	public void setKeys(List<Key> keys) {
		this.keys = keys;
	}
	@Override
	public String toString() {
		return "Lock [id=" + id + ", name=" + name + ", keys=" + keys + "]";
	}
	public Lock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lock(int id, String name, List<Key> keys) {
		super();
		this.id = id;
		this.name = name;
		this.keys = keys;
	}
		
	
	
}
