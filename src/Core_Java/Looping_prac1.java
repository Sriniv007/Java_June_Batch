package Core_Java;

public class Looping_prac1 {

	public static void main(String[] args) {
		Looping_prac1 lp = new Looping_prac1();
		lp.printing1_5times(1); //1
		lp.Print1to5(1);		//2
		lp.print2to10(2);       //3
		lp.print1to9(1);		//4
		lp.printodd_even(1);	//5[TBD]
		lp.print1_121(1);		//6
		lp.print1to64(1);		//7
		lp.print1to100(1);		//8
		lp.print1to256(1);		//9
		lp.printmul3_5(1);		//10
	}
	
	    void printing1_5times(int no) {
	    	while(no<=5) {
	    		System.out.print(1 +" ");
	    		no = no +1;
	    	}
	    	System.out.println();
	    }
	    
		void Print1to5(int no) {
		    while(no <= 5) {
		        System.out.print(no +" ");
		        no++;
		    }
		    System.out.println();
		}
		
		
		void print2to10(int no) {
			while(no<=10) {
				System.out.print(no +" ");
				no= no+2;
			}
			System.out.println();
		}
		
		void print1to9(int no) {
			while(no<=9) {
				System.out.print(no +" ");
				no = no+2;
			}
			System.out.println();
		}
		
		void printodd_even(int no) {
			int i = 1;
			while (i <= 10) {
			    if (i % 2 != 0) {
			        System.out.print(i);
			    }
			    i++;
			}
			System.out.println();
		}
		
		void print1_121(int no) {
			while(no<=121) {
				System.out.print(no +" ");
				no=no*11;
			}
			System.out.println();
		}
		
		void print1to64(int no) {
			while(no<=4) {
				System.out.print(no * no * no + " ");
				no = no+1; //[TBD]
			}
			System.out.println();
		}
		
		void print1to100(int no) {
			while(no<=10) {
				System.out.print(no * no+ " ");
				no = no+1;
			}
			System.out.println();
		}
		
		
		void print1to256(int i) {
			int j=0;
			while(i<=16) {
				System.out.print(i+ " ");
				j++;
				i= i + j;
			}
			System.out.println();
		}
		
		
//		 void printmul3_5(int no2){		// [TBD]
//			 int no = 1;
//				while(no<=20) {
//					if((no%3==0) && (no%5==0)){
//						System.out.println(no);
//					}
//					no = no+1;
//				}
//			}
		
		 void printmul3_5(int no2) {
			    int no = 1;
			    while (no <= 20) {
			        if ((no % 3 == 0) || (no % 5 == 0)) {
			            System.out.print(no+" ");
			        }
			        no = no + 1;
			    }
			    System.out.println();
			}
}
