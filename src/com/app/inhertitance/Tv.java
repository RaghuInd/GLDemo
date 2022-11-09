package com.app.inhertitance;

public class Tv extends Object {
	private Integer data=100;
	
	
	public Tv() {
		super();
		
	}
	public void display() {
		System.out.println("Balck & White: Display():"+data);
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	

}
