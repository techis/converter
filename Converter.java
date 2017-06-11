import java.util.*;

public class Converter {

	/**
	 * @param args
	 */
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true){
			//display menu
			System.out.println("Please Select a Conversion");
			System.out.println("1: Decimal to Binary");
			System.out.println("2: Binary to Decimal");
			System.out.println("3: Decimal to Hexidecimal");
			System.out.println("4: Hexidecimal to Decimal");
			System.out.println("5: Hexidecimal to Binary");
			System.out.println("6: Binary to Hexidecimal");
			System.out.println("7: Text to Binary");
			System.out.println("99: Exit");

			//take selection
			String input = in.next();
			if(isNumeric(input)){
				int program = Integer.parseInt(input);
				
				//move to applicable function
				switch(program){
				case 1: decimalToBinary(); break;
				case 2: binaryToDecimal(); break;
				case 3: decimalToHex(); break;
				case 4: hexToDecimal(); break;
				case 5: hexToBinary(); break;
				case 6: binaryToHex(); break;
				case 7: textToBinary(); break;
				case 99: System.out.println("Program Closing"); System.exit(0);
				}
			}
			else{
				System.out.println("Invalid Selection, Please select a valid option");
			}
		}
		
	}
	
	//below from https://stackoverflow.com/questions/14206768/how-to-check-if-a-string-is-numeric
	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}

	public static void binaryToDecimal(){
		System.out.println("You have selected Binary to Decimal. Please enter a Binary number to continue: ");
		String binarynum = in.next();
		String safe = binarynum.substring(0,1) + binarynum.substring(1);
		int decimal = Integer.parseInt(safe,2);
		System.out.println("Your decimal value is: " + decimal + "\n");
	}

	public static void decimalToBinary(){
		System.out.println("You have selected Decimal to Binary. Please enter a decimal number to continue: ");
		int decimal =  Integer.parseInt((in.next()));
		String binaryString = Integer.toBinaryString(decimal);
		System.out.println("Your binary value is: " + binaryString + "\n");
	}

	public static void decimalToHex(){
		System.out.println("You have selected Decimal to Hex. Please enter a decimal number to continue: ");
		int decimal = in.nextInt();
		String hexstring = Integer.toHexString(decimal);
		System.out.println("Your hex value is: " + hexstring + "\n");
	}

	public static void hexToDecimal(){
		System.out.println("You have selected Hex to Decimal. Please enter a hex number to continue: ");
		String hexnumber = in.next();
		String safe = hexnumber.substring(0,1) + hexnumber.substring(1);
		int decimal = Integer.parseInt(safe);
		System.out.println("Your decimal value is:" + decimal + "\n");
	}

	public static void hexToBinary(){
		System.out.println("You have selected Hex to Binary. Please enter a Hex number to continue: ");
		String hexnumber = in.next();
		String safe = hexnumber.substring(0,1) + hexnumber.substring(1);
		int decimal = Integer.parseInt(safe);
		System.out.println("Your binary number is: " + Integer.toBinaryString(decimal) + "\n");
	}

	public static void binaryToHex(){
		System.out.println("You have selected Binary to Hex. Please enter a Binary number to continue: ");
		String binarynum = in.next();
		String safe = binarynum.substring(0,1) + binarynum.substring(1);
		int decimal = Integer.parseInt(safe,2);
		System.out.println("Your hex value is: " + Integer.toHexString(decimal) + "\n");
	}

	public static void textToBinary(){
		System.out.println("You have selected Text to Binary. Please enter a Text string to continue:");
		String text = in.nextLine();
		byte[] bytes = text.getBytes();
		StringBuilder binary = new StringBuilder();
		for (byte b : bytes)
		{
			int val = b;
			for (int i = 0; i < 8; i++)
			{
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
		}
		System.out.println("'" + text + "' to binary: " + binary + "\n");
	}

}