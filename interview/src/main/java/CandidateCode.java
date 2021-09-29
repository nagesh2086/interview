import java.io.*;
import java.util.*;
import java.lang.*;

public class CandidateCode {
	public static void main(String args[]) throws Exception {

		// Write code here
		int amount = 0;
		try {
			String strAmount = "10";
			amount = Integer.parseInt(strAmount);
		} catch (Exception e) {
			System.out.print("Not valid number");
			return;
		}

		// System.out.print("This " + amount + " need to be dispensed by ATM.");

		// CONSTRAINT 1
		if (amount < 1) {
			System.out.print("Error: Invalid Amount");
			return;
		}

		// CONSTRAINT 1
		if (amount % 10 != 0) {
			System.out.print("Error: The amount entered needs to be in multiples of 10");
			return;
		}

		int remaining = amount;
		while (remaining > 0) {
			int dollarNotesOf50 = remaining / 50;

			if (dollarNotesOf50 > 0) {
				System.out.print(dollarNotesOf50 + "*50" + " ");
				remaining = remaining % 50;
				//System.out.println(remaining);
			}

			int dollarNotesOf20 = remaining / 20;

			if (dollarNotesOf20 > 0) {
				System.out.print(dollarNotesOf20 + "*20" + " ");
				remaining = remaining % 20;
			}

			int dollarNotesOf10 = remaining / 10;

			if (dollarNotesOf10 > 0) {
				System.out.print(dollarNotesOf10 + "*10" + " ");
				remaining = remaining % 10;
			}
		}
	}
}