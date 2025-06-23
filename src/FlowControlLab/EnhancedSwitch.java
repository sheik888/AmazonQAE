package FlowControlLab;

public class EnhancedSwitch {
	
	public static void main(String[] args) {
		String month = "jan";
		int days = switch (month) {
		
		case "jan", "mar", "may", "jul", "aug", "oct", "dec"  -> 31;
		case "apr", "jun", "sep", "nov" -> 30;
		case "feb" -> {
			
		
		System.out.println("feb has 28 or 29 days");
		yield 28;
		}
		
		
		default -> 0;
		};
		
		System.out.println(month + " has " + days + " days ");
		
	}
	

		}
//jan has 31 days 
