package Core_Java;

public class Looping {

	public static void main(String[] args) {
		Looping pg = new Looping();
//			pg.find_divisors(120);
//			pg.count_of_divisors(120);
//			pg.prime_Numbers(120);
//			pg.reverse_Number(9691);
//			pg.count_Of_Digits(54738);
//			pg.sum_Of_Digits(52342);
//			pg.reverse_No(44781);
		// pg.palindrome(1331);
		// pg.armstrong(153);
			pg.armstr(8);
			
		}

	void armstr(int hot_box) {
		int count = 3;
		while(count>0) {
			hot_box = hot_box + hot_box/2;
			count =count-1;
		}
		System.out.println(hot_box);
	}

	
	
	int find_power(int base, int power) {

		int box = 1;
		while (power > 0) {
			box = box * base;
			power = power - 1;
		}
		return box;
	}

	void armstrong(int no) {
		int arm = 0;
		int no2 = no;
		while (no > 0) {
			int rem = no % 10;
			arm = arm + (rem * rem * rem);
			no = no / 10;
		}
		if (no2 == arm) {
			System.out.println("armstrong");
		} else {
			System.out.println("not an armstrong");
		}

	}

	void palindrome(int cake) {
		int reverse = 0;
		int cake2 = cake;
		while (cake > 0) {

			int rem = cake % 10;
			reverse = (reverse * 10 + rem);
			cake = cake / 10;
		}
		// System.out.println("the reveresed value is :"+ reverse);
		// System.out.println(cake);
		if (reverse == cake2) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

	void reverse_No(int cake) {
		int reverse = 0;

		while (cake > 0) {
			int rem = cake % 10;
			reverse = (reverse * 10 + rem);
			cake = cake / 10;
		}
		System.out.println("the reveresed value is :" + reverse);
	}

	void sum_Of_Digits(int cake) {
		int sum = 0;

		while (cake > 0) {
			System.out.println(cake % 10);
			sum = sum + cake % 10;
			cake = cake / 10;
		}
		System.out.println("sum of digits is:" + sum);
	}

	void count_Of_Digits(int cake) {
		int count = 0;

		while (cake > 0) {
			System.out.println(cake % 10);
			cake = cake / 10;
			count = count + 1;
		}
		System.out.println("count of digits value is:" + count);
	}

	void reverse_Number(int cake) {
		while (cake > 0) {
			System.out.println(cake % 10);
			cake = cake / 10;
		}
	}

	void prime_Numbers(int no) {
		int div = 2;
		int count = 0;

		while (div < no) {
			if (no % div == 0) {
				System.out.println(div);
				count = count + 1;
			}
			div = div + 1;
		}
		System.out.println("no of counts values are:" + count);
		if (count == 0) {
			System.out.println("prime number...");
		} else {
			System.out.println("it is not prime number..");
		}
	}

	void count_of_divisors(int no) {
		int div = 2;
		int count = 0;

		while (div < no) {
			if (no % div == 0) {
				System.out.println(div);
				count = count + 1;
			}
			div = div + 1;
		}
		System.out.println("No of count:" + count);
	}

	void find_divisors(int no) {
		int div = 2;
		while (div < 100) {
			if (no % div == 0) {
				System.out.println(div);
			}
			div = div + 1;
		}

	}

}
