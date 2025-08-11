package corejava;

public  class Operators {

	public static void main(String[] args) {
		
		// unary
		
		int i = 10;
		
		i++;
		
		System.out.println(i);
		
		i--;
		
		System.out.println(i);
		
		++i;
		
		System.out.println(i);
		
		--i;
		
		System.out.println(i);
		
		// arthimetic operators 
		
		int a = 10;
		
		int b = 12;
		
		int c = a +b;
		
		System.out.println(c);
		
		int d = a -b;
		
		System.out.println(d);
		
		int e = a / b;
		
		System.out.println(e);
		
		int f = a * b;
		
		System.out.println(f);
		
		// shift operators 
		
		// left shift  <<
		
		System.out.println(10<<2); //   10 * 2^2 = 40
		
		System.out.println(10<<3); // 10 * 2 ^ 3 = 80
		
		
		// right shift  >>
		
		System.out.println(10>>2); //  10 / 2 ^ 2 = 2
		
		System.out.println(20>>2); // 20 / 2 ^ 2 = 5
		
		// Relational Operators  > < >= <= ==
		
		/* ==	Is equal to
		!=	Is not equal to
		>	Greater than
		<	Less than
		>=	Greater than or equal to
		<=	Less than or equal to */

		int x = 10;

		int y= 8;

		System.out.println(x==y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		System.out.println(x!=y);
		System.out.println(x>y);
		System.out.println(x<y);
		
		 // bit wise operators 
		
		int p = 5; // 0101
		
		int q = 3; // 0011
		
		int r = p & q ; // 0001
		
		System.out.println(r);
		
		// 8 and 2 
		
		int a1 = 8; // 1000
		
		int b1 = 2; //0010
		
		int c1 = a1 & b1;
		
		System.out.println(c1);
		
		// bitwise or it should be present in any one 
	
		
		// 8 and 2 
		
		int a2 = 8; // 1000
		
		int b2 = 2; //0010
		
		int c2 = a1 | b1;
		
		System.out.println(c2);
		
	// bitwise xor if it is set in one operand but not both.
	
		
		// 8 and 2 
		
		int a3 = 8; // 1000
		
		int b3 = 2; //0010
		
		int c3 = a1 ^ b1;
		
		System.out.println(c3);
		
		// logical operators && , || AND !
		
		// && -  	Returns true if both operands are true, otherwise returns false.
		
		int u = 10 , v = 20;
		
		if (u < v &&  v > 15) {
			
			System.out.println("both conditions are true");
		}
		
		// || - Returns true if at least one of the operands is true.
		
	   int age = 25;
	   
	   if (age < 18 || age  > 21) {
		   
		   System.out.println("condition is true ");
	   }
				
		// ! NOT  -  	Reverses the logical state of the operand.
	   
	   boolean isRaining = false;
	   
	   if(!isRaining) {
		   
		   System.out.println("Yo can go out");
	   }
	   
	   // assignment operators // = += , -=
	   
	  int k = 10;
	  
	  int l = 20;
	  
	  k+= 4;  // (k = k +4 = 14 )
	  
	  System.out.println(k);
	  
	  l-=4; // l = l-4 = 20-4 = 16
	  
	  System.out.println(l);
	  
	  // ternary operator  short hand for if - else 
	  
	   // condition ? expression_if_true : expression_if_false;
	  
	  int w1 = 10, w2  = 20;
	  
	  int max = (w1<w2)?w1:w2;
	  
	  System.out.println(max);
	  
	  
	  
		
		
		


		
	}

}
