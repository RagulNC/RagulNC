package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 12;
		boolean flag = false;
		 for(int i = 2; i<=(num / 2); i++) {
			if( num % i== 0) {
			 flag =true;
			 break;
			}
		 }
		 if (flag == true)
		 {
			 System.out.println("Condition match");
		 }
		 else
		 {
			 System.out.println("Condition doesnt match");
		 }
	}

}
