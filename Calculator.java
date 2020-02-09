package calculator;
import java.util.*;
import java.io.*;
public class Calculator {
		public static void main(String[] args) throws IOException {
		       Operations object;
		       char ch;
		       try {
		    	   Scanner sc = new Scanner(System.in);
		    	   boolean flag=true;
		    	   int res = 0;
		    	   while(flag) {
		    		   System.out.print("Enter the First number : ");
		    		   int a =sc.nextInt();
		    		   System.out.print("Enter the Second number : ");
		    		   int b =sc.nextInt();
		    		   System.out.println("MENU\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION");
		    		   System.out.print("Enter your choice : ");
		    		   int c = sc.nextInt();
		    		   switch(c) {
		        			case 1:
		        				System.out.print("The sum of "+a+" & "+b+" : ");
		        				object = new Addition();
		        				res = object.operation(a, b);
		        				System.out.print(res);
		        				System.out.println("\nDo you want to perform more calculations?(y/n)");
		        				ch=sc.next().charAt(0);
		        				if(ch == 'y'||ch=='Y')
		        					flag = true;
		        				else {
		        					flag = false;
		        				}
		        				break;
		        			case 2:
		        				System.out.print("The difference of "+a+" & "+b+" : ");
		        				object = new Subtract();
		        				res = object.operation(a, b);
		        				System.out.print(res);
		        				System.out.println("\nDo you want to perform more calculations?(y/n)");
		        				ch=sc.next().charAt(0);
		        				if(ch == 'y'||ch=='Y')
		        					flag = true;
		        				else {
		        					flag = false;
		        				}break;
		        			case 3:
		        				System.out.print("The product of "+a+" & "+b+" : ");
		        				object = new Multiply();
		        				res = object.operation(a, b);
		        				System.out.print(res);
		        				System.out.println("\nDo you want to perform more calculations?(y/n)");
		        				ch=sc.next().charAt(0);
		        				if(ch == 'y'||ch=='Y')
		        					flag = true;
		        				else {
		        					flag = false;
		        				}break;
		        			case 4:
		        				System.out.print("The division of "+a+" & "+b+" : ");
		        				object = new Division();
		        				res = object.operation(a, b);
		        				System.out.print(res);
		        				System.out.println("\nDo you want to perform more calculations?(y/n)");
		        				ch=sc.next().charAt(0);
		        				if(ch == 'y'||ch=='Y')
		        					flag = true;
		        				else {
		        					flag = false;
		        				}break;
		        			default:
		        				System.out.print("Please enter a valid input");
		    		   	}
		    	   	}
		       	}catch(Exception e) {
		       		System.out.println("Exception occurred!!!");
			}
		}
}
