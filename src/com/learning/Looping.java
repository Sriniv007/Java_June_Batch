package com.learning;

public class Looping {

	public static void main(String[] args) {
		Looping ll = new Looping();
		//ll.print_11111();
		//ll.additon_of_n_numbers();
		//ll.find_common_divisors(100,120);
		//ll.find_greatest_common_divisor(100,120);
		//ll.find_least_common_multiple(4,10);
		ll.while_break();
		}

	private void while_break() {
		int no1=10,no2=20;
		int no=1;
		while(true) {
			System.out.println("hi");
			no = no+1;
			if(no==5)
				break;
		}
		
	}

	private void find_least_common_multiple(int no1, int no2) {
		int div=2;
		int big=no1>no2?no1:no2;
		while(true) {
		if(big%no1==0 && big%no2==0) {
			System.out.println("LCM is:"+big);
			break;
		}
		big=big+1;
		}
	}

	private void find_greatest_common_divisor(int no1, int no2) {
		int div=2;
		int gcd=0;
		int small= no1 < no2 ? no1 : no2;
		while(div<small) {
			if(no1%div==0 && no2%div==0) {
				gcd = div;	
			}
			div=div+1;
		}
		System.out.println("GCD is:" + gcd );
	}

	private void find_common_divisors(int no1, int no2) {
				int div=2;
			
				int small= no1 < no2 ? no1 : no2;
				while(div<small) {
					if(no1%div==0 && no2%div==0) {
						System.out.println(div);
					}
					div=div+1;
				}
	}

	private void additon_of_n_numbers() {
		// TODO Auto-generated method stub
		int box=0;
		int no =1;
		
		while(no<=10) {
			box = box +no;
			no = no+1;
		}
		System.out.println(box);
	}

	private void print_11111() {
		int no = 1;
		while(no<=5) {
			System.out.print(1+ " ");
			no = no +1;
		}
		
	}
			
}
