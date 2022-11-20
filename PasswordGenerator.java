import java.util.ArrayList;
import java.util.Random;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
	
		ArrayList<Character> arr = new ArrayList<>();
		String password = new String();

		System.out.println("Welcome to password generator!\n");
		
		/*
		 * format: xxxxxx-xxxxxx-xxxxxx
		 */
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 6; j++) {
				arr.add(AsciiGenerator());
			}
		}
		arr.add(6,'-');
		arr.add(13, '-');
		
		/*
		 * converts the array into a string
		 */
		for(Character x : arr) {
			password += x;
		}
		
		System.out.println(password);
	}
	
	/*
	 * method used to randomly generate 
	 * lower/upper case letter or number
	 */
	public static char AsciiGenerator() {
		Random rand = new Random();
		int y = rand.nextInt(58) + 65; //65 - 122 
		
		if(y == 91 || y == 92 || y == 93 || y == 94 || y == 95 || y == 96) { //91 - 96
			int x = rand.nextInt(10) + 48; //48 - 57
			return (char)x;
		}else {
			return (char)y;
		}
	}
}
