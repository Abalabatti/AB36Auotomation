package InterviewQn;

import java.util.Arrays;

public class PowerOffProblem {

	public static void main(String[] args) {
		
		//a,a^2,a^3,a^4,a^5,a^6
		
		int a=2;
		int b = 2;
		int PowerNumber[]= new int[15];
		
		for (b=0;b<15;b++) {
			
			double d=Math.pow(a, b);
			System.out.println("OutPut Power "+d);
			PowerNumber[b]=(int) d;
			
		}
		
		System.out.println("OutPut Power in array "+ Arrays.toString(PowerNumber));
		

//		double d=Math.pow(a, b);
//		System.out.println("Input a "+a);
		//System.out.println("OutPut b "+d);
		
	}

}
