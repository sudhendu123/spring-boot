package com.rabbbit.mq.pojo;

public class RabbitMsg {

	String id;
	String name;
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
	@Override
	public String toString() {
		return "RabbitMsg [id=" + id + ", name=" + name + "]";
	}
}
