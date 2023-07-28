package com.learning;

public class Dell extends Laptop {

	public static void main(String[] args) {
		Dell dell = new Dell();
		dell.browse();
		dell.doProgram();
		System.out.println(dell.harddisk);
		dell.touch_screen();
	}
	void touch_screen() {
		System.out.println("Touch Screen");
	}

}
