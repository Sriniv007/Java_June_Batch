package com.learning;

class Looping_Practice{
	public static void main(String args[]){
		Looping_Practice lp1= new Looping_Practice();
        //lp1.print_reverse(1234);
        //lp1.find_count_of_digits(9697);
        //lp1.find_sum_of_digits(2023);
        //lp1.reverse_a_no(1234);
        // lp1.find_palindrome(12321);
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

    void reverse_a_no(int cake){
        int reverse =0;
        while(cake>0){
        int rem = cake%10;
        reverse = (reverse *10) + rem;
        cake = cake/10;
}
System.out.println("Reversed number is :" +reverse);

}

    void print_reverse(int cake){
      while(cake>0){
        System.out.println(cake%10);
        cake=cake/10;
    }
}
    void find_count_of_digits(int cake){
    int count=0;
    while(cake>0){
        System.out.println(cake%10);    
        count=count+1;
        cake=cake/10;
    }
    //System.out.println(count);
}
    void find_sum_of_digits(int cake){
            
    int sum=0;
    while(cake>0){
        sum =sum+cake%10;
        cake=cake/10;
}
    System.out.println("sum of digits is: " + sum);

        }
}

		
