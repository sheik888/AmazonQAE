package Dayone;

public class vowelscounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "helloworld! programming is fun.";
		int vowels = 0,consonants = 0;
		text = text.toLowerCase();
		for(int i =0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if(ch >= 'a' || ch <= 'z') {
				if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u')
				vowels++;
				else 
				{
					consonants++;
					
					System.out.println("vowels:" + vowels);
					System.out.println("consonants:" + consonants);
				
			}
		}
	}

}
}