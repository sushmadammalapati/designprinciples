package calculator;

public class Division extends Operations{
	public int operation(int a, int b){
		int div=0;
		if(b == 0)
			System.out.println("Division can't be performed");
		else 
	       div = a/b;
	 return div;
	}
}
