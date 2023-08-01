package Core_Java;

public class Looping_Practice2 {

	public static void main(String[] args) {
		 Looping_Practice2 rd = new Looping_Practice2();
		 //rd.Fibo();   				  //21
		 //rd.print_fibo_without_third(); //22
		 //rd.print_reverse(1234);  	  //23
		 //rd.reverse_a_no(1234);		  //24
		 //rd.find_palindrome(12321);	  //25
		 //rd.find_common_divisors(100,120); //26
		 //rd.find_greatest_common_divisor(100,120); //27
		 //rd.find_least_common_multiple(4,10);//28
		 //rd.BintoDec(101);		//30
		 //rd.Count_of_Digits(23456);	
		 
	}
	
	private void Count_of_Digits(int balls) {
		int count=0;
		while(balls>0) {
			System.out.println(balls%10);
			balls=balls/10;
			count=count+1;
		}
		System.out.println("count is:"+count);
		
	}

	private void BintoDec(int no) {
		int decimal =0;
		int po=0;
		ArmStrong ga = new ArmStrong();
		while(no>0) {
			 int rem = no%10;
			 decimal = decimal + rem * ga.find_power(2,po);
			 no = no /10;
			 po=po+1;
		}
		System.out.println("The decimal value is: "+decimal);
		
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


	void find_palindrome(int cake){
        int no2=cake;
        int reverse =0;
        while(cake>0){
        int rem = cake%10;
        reverse = (reverse *10) + rem;
        cake = cake/10;
        }
        System.out.println(reverse);
        if(reverse == no2){
            System.out.println("palindrome");
            }
        else{ 
            System.out.println("It is not palindrome");
            }
}
	
	
	private void print_reverse(int cake){
	      while(cake>0){
	        System.out.println(cake%10);
	        cake=cake/10;
	    }
	}

	private void reverse_a_no(int cake) {
		int reverse =0;
        while(cake>0){
        int rem = cake%10;
        reverse = (reverse *10) + rem;
        cake = cake/10;
        }
System.out.println("Reversed number is :" +reverse);	
}

	private void print_fibo_without_third() {
		int p1=0, p2=1;
		while(p1<=21) {
			System.out.println(p1);
			p2=p1+p2;
			p1=p2-p1;
		}
		
	}

	private void Fibo() {
		int p1=0, p2=1;
		
		while(p1<=10) {
		System.out.println(p1+" ");
		int p3 = p1+p2;
		p1=p2;
		p2=p3;
		
		}
	}

}
