package RajeeSanDailyProblems;

import java.util.Stack;

public class PostfixOperation {
	
	/*
	 * 3. Write code to evaluate a given postfix expression efficiently.

For example,

82/ will evaluate to 4 (8/2)
 
138*+ will evaluate to 25 (1+8*3)
 
545*+5/ will evaluate to 5 ((5+4*5)/5)
Assume that the postfix expression contains only single-digit numeric operands, without any whitespace.

	 */

	public static void main(String[] args) {
		
		String str = "545*+5";   //82/   //545*+5/  //138*+
		System.out.println(postFix(str));
		

	}
	
	public static int postFix(String str) {
		
		Stack<Integer> numbers = new Stack<>();
		for(char c: str.toCharArray()) {
			try {
				numbers.push(Integer.parseInt(c+""));
				
			}catch(NumberFormatException e) {
				int num2 = numbers.pop();
				int num1 = numbers.pop();
				//int num3 = 0;
				if(c == '+')
					//num3 = num1 + num2;
					numbers.push(num1 + num2);
				else if(c == '*')
					//num3 = num1 * num2;
					numbers.push(num1 * num2);
				else if(c == '/')
					//num3 = num1/num2;
					numbers.push(num1 / num2);
				else if(c == '-')
					//num3 = num1 - num2;
					numbers.push(num1 - num2);
				
				//numbers.push(num3);
			}
			
		}
		
		return numbers.pop();
	}

}
