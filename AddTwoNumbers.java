import java.util.*;
public class AddTwoNumbers {
  
    public static void main(String args[]) {
    	Scanner g= new Scanner(System.in);
    	System.out.println("enter  Ist number: ");
    	int a=g.nextInt();
    	System.out.println("enter  IIst number: ");
    	int b=g.nextInt();
    	System.out.println("sum of the given numbers is= "+add(a,b));
    }

    	public static int add(int a, int b){
        if(b == 0) {
        	return a;
        }
        if(a==0){
        	return b;
        }
        int sum = a ^ b; 			//SUM of two integer is A XOR B
        int carry = (a & b) << 1;  		//CARRY of two integer is A AND B
        return add(sum, carry);
    }
    
}
