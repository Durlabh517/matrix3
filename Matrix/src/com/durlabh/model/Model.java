package com.durlabh.model;

public class Model {
	private int a;
	private int b;
	private int c;
	public Model(int a, int b, int c) {
	
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		System.out.println(a);
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}

	
	
	
	

}
