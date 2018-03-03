package company.group1.project1;
import java.util.Scanner;

public class Test {
	static String str= new String("");
	public static void main(String[] args) {
		while(true) {
		int data = user_input();
		int valid_ation=validation(data);
		foobarbaz(valid_ation, data);
		}
		
	}
		
	public static int user_input() {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a number");
			int n=scan.nextInt();
			System.out.println("The entered number is:" + n);
			return n;
	
	}
	
	public static int validation(int n) {
		if(n<110) {
			System.out.println("The enterd number is in our range");
			return 1;
		}
		return 0;	
	}
		
	public static void foobarbaz(int enable, int n) {
		int i=1;
		if(enable==1) {
				while(i < n) {
					if( (i%2) == 0) {
						str="foo";	
					}
					if( (i%3) == 0) {
						str= str +"bar";	
					}
					if( (i%5) == 0) {
						str=str+"baz";	
					}
				System.out.println(i+":===="+ str);
				i++;
				str="";
		}
		
		i=0;	
		}
	}
		
}			
	
