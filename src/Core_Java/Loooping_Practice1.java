package Core_Java;
public class Loooping_Practice1 {
    public static void main(String[] args) {
        Loooping_Practice1 lp = new Loooping_Practice1();
        lp.printing1_5times(1); //1
        lp.Print1to5(1); //2
        lp.print2to10(2); //3
        lp.print1to9(1); //4
        lp.printodd_even(1); //5
        lp.print1_121(1); //6
        lp.print1to64(1); //7
        lp.print1to100(1); //8
        lp.print1to256(1); //9
        lp.printmul3_5(1); //10
        lp.printMul3And5(1); //11
        lp.printMul3Or5(1); //12
        lp.printMultiplicationSeries(1); //13
        lp.printPrimes(20); //15
        lp.printSumOfNumbers(10); //16
        lp.printFactorial(5); //17
        lp.printFactorialsReverse(5); //18
        lp.printMultiplicationPattern(4); //19
        lp.printSquareRoot(25); //20
    }
    
    void printing1_5times(int no) {
        int count = 1;
        while (count <= 5) {
            System.out.print(no + " ");
            count++;
        }
        System.out.println();
    }
    
    void Print1to5(int no) {
        while (no <= 5) {
            System.out.print(no + " ");
            no++;
        }
        System.out.println();
    }
    
    void print2to10(int no) {
        while (no <= 10) {
            System.out.print(no + " ");
            no = no + 2;
        }
        System.out.println();
    }
    
    void print1to9(int no) {
        while (no <= 9) {
            System.out.print(no + " ");
            no = no + 2;
        }
        System.out.println();
    }
    
    void printodd_even(int no) {
        int i = 1;
        while (i <= 10) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
    
    void print1_121(int no) {
        while (no <= 121) {
            System.out.print(no + " ");
            no = no * 11;
        }
        System.out.println();
    }
    
    void print1to64(int no) {
        while (no <= 4) {
            System.out.print(no * no * no + " ");
            no = no + 1;
        }
        System.out.println();
    }
    
    void print1to100(int no) {
        while (no <= 10) {
            System.out.print(no * no + " ");
            no = no + 1;
        }
        System.out.println();
    }
    
    void print1to256(int i) {
        int j = 0;
        while (i <= 16) {
            System.out.print(i + " ");
            j++;
            i = i + j;
        }
        System.out.println();
    }
    
    void printmul3_5(int no2) {
        int no = 1;
        while (no <= 20) {
            if ((no % 3 == 0) || (no % 5 == 0)) {
                System.out.print(no + " ");
            }
            no = no + 1;
        }
        System.out.println();
    }
    
    void printMul3And5(int no) {
        while (no <= 100) {
            if (no % 3 == 0 && no % 5 == 0) {
                System.out.print(no + " ");
            }
            no++;
        }
        System.out.println();
    }
    
    void printMul3Or5(int no) {
        while (no <= 100) {
            if (no % 3 == 0 || no % 5 == 0) {
                System.out.print(no + " ");
            }
            no++;
        }
        System.out.println();
    }
    
    void printMultiplicationSeries(int no) {
        int i = 1;
        while (i <= 5) {
            System.out.print(i + "*" + (i + 1) + " ");
            i++;
        }
        System.out.println();
    }
    
    void printPrimes(int n) {
        int count = 0;
        int number = 2;
        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.println();
    }
    
    boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    void printSumOfNumbers(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + n + " numbers is " + sum);
    }
    
    void printFactorial(int num) {
        int factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
    
    void printFactorialsReverse(int num) {
        int i = num;
        while (i >= 1) {
            int factorial = 1;
            int j = 1;
            while (j <= i) {
                factorial *= j;
                j++;
            }
            System.out.print(factorial + " ");
            i--;
        }
        System.out.println();
    }
    
    void printMultiplicationPattern(int n) {
        int i = 1;
        int j = 10;
        while (i <= n) {
            System.out.print(i + "*" + j + " ");
            i++;
            j--;
        }
        System.out.println();
    }
    
    void printSquareRoot(int num) {
        double squareRoot = Math.sqrt(num);
        System.out.println("Square root of " + num + " is " + squareRoot);
    }
}
