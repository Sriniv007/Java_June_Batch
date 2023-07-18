package Core_Java;

public class Practice {

	public static void main(String[] args) {
	int balls = 2002;
	int reverse = 0;
	int ball2= balls;
	
	while(balls>0) {
		int rem = balls%10;
		reverse = reverse * 10 + rem;
		balls = balls /10;
	}
	System.out.println(reverse);
	
	if(reverse == ball2) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome..");
	}
}
}
