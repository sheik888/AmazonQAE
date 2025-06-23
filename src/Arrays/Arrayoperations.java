package Arrays;

public class Arrayoperations {

	public static void main(String[] args) {
String[] fruits = new String[3];
fruits[0] = "apple";
fruits[1] = "banana";
fruits[2] = "orange";
System.out.println("Myfruits:");
for (String fruit : fruits )
{

System.out.println(fruit);

	}
fruits[1] = "mango";


System.out.println("\nAfter upadating:");
for (String fruit : fruits) {
System.out.println(fruit);	
}
}
}