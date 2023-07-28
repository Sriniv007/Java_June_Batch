package com.learning;

public class India {
	 String pm;
	static String capital = "New Delhi";
	static int inr_value = 81;
	String state;
	String mother_tongue;
	public static void main(String[] args) {
		India.inr_value=80;
		
		India indian1 = new India();
		indian1.state = "Tamil nadu";
		India indian2 = new India();
		indian2.state="Kerala";
		indian2.pm="Gandvi";
		System.out.println(indian2.state);
		System.out.println(indian1.pm);
		System.out.println(indian2.pm);
		System.out.println(indian2.pm);
		System.out.println(indian1.pm);
		System.out.println(indian1.state);
		System.out.println(indian2.state);
	}

}
