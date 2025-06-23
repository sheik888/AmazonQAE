package Dayone;

public class Bitwiseoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 5; //0101
int b = 3; //0011

System.out.println("a & b = " + (a & b));// bitwise AND (0001 =1)
System.out.println("a | b = " + (a | b));//BITWISE OR (0111 = 7)


System.out.println("a ^ b = " +  (a ^ b));//bitwise XOR (0110 =6)
System.out.println("~a = " + (~a));//BITWISE COMPLEMENT(1010 =-6)


System.out.println("a << 1 = " + (a << 1));//LEFT SHIFT (1010 =10)
System.out.println("a >> 1 = " + (a >> 1));//SIGNED RIGHT SHIFT (0010 =2)
System.out.println("a >>> 1 = " + (a >>> 1));
//prctical use : checking if number is even 

int num = 8;
System.out.println(num + " is even: " + ((num & 1) ==0));


	}

}
