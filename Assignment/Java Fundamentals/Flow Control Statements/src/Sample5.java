
public class Sample5 {

	public static void main(String[] args) {
		char c = '$';
		int input_char = c;
		 if ((input_char >= 65 && input_char <= 90) 
		            || (input_char >= 97 && input_char <= 122)) 
		            System.out.println(" Alphabet "); 
		  
		        // CHECKING FOR DIGITS 
		        else if (input_char >= 48 && input_char <= 57) 
		            System.out.println(" Digit "); 
		  
		        // OTHERWISE SPECIAL CHARACTER 
		        else
		            System.out.println(" Special Character "); 
	}

}
