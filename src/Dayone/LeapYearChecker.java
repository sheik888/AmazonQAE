package Dayone;

public class LeapYearChecker {
	public static void main(String[] args) {
		
		
		
		int year = 2021;
		boolean isLeapYear =(year % 400 == 0) || ((year % 100 !=0) && (year % 4 ==0));
		
		System.out.println(year + "is a laep year: " + isLeapYear);
	}

}
// console  2021is a laep year: false