package com.learning;

public class Looping2 {

	public static void main(String[] args) {
		Looping2 lp = new Looping2();
		//lp.print_1_10();
		lp.find_sum_of_digits(12345);
//		int no=1;
//		while(no<=3) {
//			int power = lp.find_power(no,no);
//			System.out.println(power);
//			no = no+1;
		}
	
	//Sum of digits until it becomes single digit
	private void find_sum_of_digits(int i) {
		int sum=0;
		while(i>0) {
			int rem= i%10;
			sum=sum+rem;
			i=i/10;
	}
		
		
		//This is called as Recursion
		if(sum>9) {
			find_sum_of_digits(sum);
		}
		else {
			System.out.println("Sum of Digits is" + sum);
		}
	}
	
	
	//finding 1 4 27 256, 1 8 27 64
	int find_power(int base, int power) {
		int box=1;
		while(power>0) {
			box=box*base;
			power=power-1;
		}
		return box;
	}

	private void print_1_10() {
		int no1=1,no2=10;
		while(no1<=5) {
			System.out.println(no1 * no2);
			no1=no1+1;
			no2=no2-1;
		}
		
	}
}
