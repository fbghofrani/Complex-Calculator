import java.util.Scanner;
import java.util.ArrayList;
//a+b*i=> complex number
public class Complex {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int a1 = input.nextInt();
		int b1 = input.nextInt();
		int a2 = input.nextInt();
		int b2 = input.nextInt();
		System.out.println("number1:"+a1+"+"+b1+"i");
		System.out.println("number1:"+a2+"+"+b2+"i");
		System.out.println("Enter the number of operators that you want to calculate=");
		int n=input.nextInt();
		String o = null;
		ArrayList<String> operators=new ArrayList <String>();
	   for(int j=0;j<n;j++) {
		//get operator:
	      o = input.next();
	      Complex.addarray(n, operators, o);
	 }
	   for ( String o1: operators) {
		switch (o1 ) {
		  case "+":
		       Complex.sum(a1,b1,a2,b2);
		       break;
		  case "-":
			   Complex.sub(a1, b1, a2, b2);
			   break;
		  case "*":
			   Complex.multi(a1, b1, a2, b2);
			   break;
		  case "/":
		       Complex.divide(a1, b1, a2, b2);
			   break;
		  case "#":
			  break;
			
		}
      }  
	}
	public static void sum(int a1, int b1,int a2,int b2) {
		int a=a1+a2;
		int b=b1+b2;
		System.out.println("sum="+a+"+"+b+"i");
		
	}
	public static void sub(int a1, int b1,int a2,int b2) {
		int c=a1-a2;
		int d=b1-b2;
		System.out.println("sub="+c+d+"i");
	}
	public static void multi(int a1, int b1,int a2,int b2) {
		  int m=a1*b2+a2*b1;
		  System.out.println("multi="+(a1*a2-b1*b2)+"+"+m+"i");	
	}
	public static void divide(int a1, int b1,int a2,int b2) {
	      double x=a1*a2;
		  double y=Math.pow(a2, 2)+Math.pow(b2, 2); //the denominator
		  double z=-a1*b2+a2*b1;
		  System.out.println("divide="+((x+b1+b2)/y)+z/y+"i");
		  
	}
	public static ArrayList<String> addarray(int n,ArrayList<String> ar, String x) {
		int i;
		for (i=0;i<n;i++)
			ar.add(x);
		return ar;
		
		
	}
}


















