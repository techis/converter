//Project: Converter.java
//Author: techis
//Date: May 31, 2013
//Email: techis at gmx.com

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Converter {

	/**
	 * @param args
	 */
	static int num = 0;
	static Scanner in = new Scanner(System.in);


	public static void main(String[] args) {
		System.out.println("Please Select a Conversion");
		System.out.println("0: Select new conversion");
		System.out.println("1: Decimal to Binary");
		System.out.println("2: Binary to Decimal");
		System.out.println("3: Decimal to Hexidecimal");
		System.out.println("4: Hexidecimal to Decimal");
		System.out.println("5: Hexidecimal to Binary");
		System.out.println("6: Binary to Hexidecimal");
		System.out.println("7: Text to Binary");
		System.out.println("99: Exit");



		int program =  Integer.parseInt((in.nextLine()));

		switch(program){
		case 1: decimalToBinary(args[0]); break;
		case 2: binaryToDecimal(args[0]); break;
		case 3: decimalToHex(args[0]); break;
		case 4: hexToDecimal(args[0]); break;
		case 5: hexToBinary(args[0]); break;
		case 6: binaryToHex(args[0]); break;
		case 7: textToBinary(args[0]); break;
		case 99: System.exit(0);

		}
		convert(args[0]);
	}

	public static void binaryToDecimal(String output){
		System.out.println("You have selected Binary to Decimal. Please enter a Binary number to continue: ");
		Scanner input2 = new Scanner(System.in);
		String binarynum = input2.next();
		String safe = binarynum.substring(0,1) + binarynum.substring(1);
		int decimal = Integer.parseInt(safe,2);   
		input2.close();        
		System.out.println("Your decimal value is: " + decimal);

	}

	public static void decimalToBinary(String output){
		System.out.println("You have selected Decimal to Binary. Please enter a decimal number to continue: ");
		int decimal =  Integer.parseInt((in.nextLine()));
		String binaryString = Integer.toBinaryString(decimal);
		System.out.println("Your binary value is: " + binaryString);
	}


	public static void decimalToHex(String output){
		System.out.println("You have selected Decimal to Hex. Please enter a decimal number to continue: ");
		Scanner input = new Scanner(System.in);
		int decimal = input.nextInt();

		String hexstring = Integer.toHexString(decimal);
		input.close();
	}

	public static void hexToDecimal(String output){
		System.out.println("You have selected Hex to Decimal. Please enter a hex number to continue: ");
		Scanner input = new Scanner(System.in);
		String hexnumber = input.next();
		String safe = hexnumber.substring(0,1) + hexnumber.substring(1);
		int decimal = Integer.parseInt(safe,2);
		input.close();
	}

	public static void hexToBinary(String output){
		System.out.println("You have selected Hex to Binary. Please enter a Hex number to continue: ");
		Scanner input = new Scanner(System.in);
		String hexnumber = input.next();
		String safe = hexnumber.substring(0,1) + hexnumber.substring(1);
		int decimal = Integer.parseInt(safe,2);
		String binaryString = Integer.toBinaryString(decimal);
	}

	public static void binaryToHex(String output){
		System.out.println("You have selected Binary to Hex. Please enter a Binary number to continue: ");
		Scanner input2 = new Scanner(System.in);
		String binarynum = input2.next();
		String safe = binarynum.substring(0,1) + binarynum.substring(1);
		int decimal = Integer.parseInt(safe,2);   
		String hexstring = Integer.toHexString(decimal);
		input2.close();
	}

	public static void textToBinary(String output){
		System.out.println("You have selected Text to Binary. Please enter a Text string to continue:");
		Scanner input = new Scanner(System.in);
		String text = input.nextLine(); 
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
		System.out.println("'" + text + "' to binary: " + binary);
		input.close();
	}

	public static void convert(String output){
		System.out.println("Please Select a Conversion");
		System.out.println("0: Select new conversion");
		System.out.println("1: Decimal to Binary");
		System.out.println("2: Binary to Decimal");
		System.out.println("3: Decimal to Hexidecimal");
		System.out.println("4: Hexidecimal to Decimal");
		System.out.println("5: Hexidecimal to Binary");
		System.out.println("6: Binary to Hexidecimal");
		System.out.println("7: Text to Binary");
		System.out.println("99: Exit");
		int program =  Integer.parseInt((in.nextLine()));

		switch(program){
		case 1: decimalToBinary(output); break;
		case 2: binaryToDecimal(output); break;
		case 3: decimalToHex(output); break;
		case 4: hexToDecimal(output); break;
		case 5: hexToBinary(output); break;
		case 6: binaryToHex(output); break;
		case 7: textToBinary(output); break;
		case 99: System.exit(0);

		}
		convert(output);
	}

}
