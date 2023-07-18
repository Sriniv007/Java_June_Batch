package Core_Java;

public class ArmStrong {

	public static void main(String[] args) {
		
		int no = 1635;
		ArmStrong ga = new ArmStrong();
		int d_count = ga.find_digits(no);
		int result = ga.find_rev(no,d_count);
		
		if(no == result) 
			System.out.println("Armstrong Number");
		else {
			System.out.println("not a armstrong number");
		}
			
	}
	
		int find_digits(int no) {
			int dig_count = 0;
			
			while(no>0) {
				dig_count = dig_count+1;
				no = no/10;
			}
			return dig_count;
		
		}
		
		int find_rev(int no,int d_count) {
			int sum = 0;
			while(no>0) {
				int rem = no %10;
				int result = find_power(rem,d_count);
				sum = sum +result;
				no = no/10;
			}
			return sum;
		}
		
		int find_power(int base, int power) {
			int result=1;
			while(power>0) {
				result = result *base;
				power = power - 1;
			}
			return result;
		}

}
