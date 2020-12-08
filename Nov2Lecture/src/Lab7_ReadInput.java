//---------------------------------------------------------------------
//	IST242, Fall 2020	Dan Cook
//
//	This file will store the main() and the static methods that
//	are needed for this lab.
//---------------------------------------------------------------------

import java.util.*;

public class Lab7_ReadInput
{

//-----------------------------------------------------------------
public static void main (String[] args)
	{
	int i, item = 0;
	int	intValue, newValue;
	Scanner kb = new Scanner (System.in);
	byte 	byteValue;
	double 	dblValue;
	boolean	boolValue;
	
	intValue = ReadInt("Enter the test score you received", 0, 100);
	System.out.printf ("Integer value entered = [%d].\n", intValue);

//	byteValue = ReadByte("asdfa");
//	System.out.printf ("Byte value entered = [%d].\n", byteValue);

	dblValue = ReadDouble();
	System.out.printf ("Double value entered = [%.2f].\n", dblValue);

	boolValue = ReadBoolean();
	System.out.printf ("Integer value entered = [%s].\n", boolValue);
	}

//----------------------------------------------------------------
//	ReadInt() is created to be a better version of .nextInt().
//
//	Parameters:
//		String: The msg to be displayed when user wants to inut a value.
//		int:	Lowest value the iput can be be.
//		int:	Largest value the input can be.
//	Note: if min and maxValue are equal, the input doesn't have a range.
//------------------------------------------------------------------
private static int ReadInt (String infoMsg, int minValue, int maxValue)
	{
	int retInt = 0;
	String s1;
	boolean validInput = false;
	Scanner kb = new Scanner(System.in);
	
	while (validInput == false)
		{
		System.out.print (infoMsg + ": ");
		s1 = kb.nextLine();
	
		try	{
			retInt = Integer.parseInt(s1);	// throw an exception
			if (((retInt >= minValue) && (retInt <= maxValue)) || (minValue == maxValue))
        		validInput = true;
			else
				System.out.println ("The value is not in range.");
			}
		catch (Exception e)
			{
//			System.out.println (e.getMessage());
			System.out.println ("Value entered is not a valid integer!!");
			}
		}
		
	return retInt;
	}

private static double ReadDouble ()
{
	double retDbl = 0;
	String s1;
	boolean validInput = false;
	Scanner kb = new Scanner(System.in);

	while (validInput == false)
	{
		System.out.print ("Enter a double: ");
		s1 = kb.nextLine();

		try	{
			retDbl = Double.parseDouble(s1);	// throw an exception
			validInput = true;
		}
		catch (Exception e)
		{
//			System.out.println (e.getMessage());
			System.out.println ("Value entered is not a valid double!!");
		}
	}

	return retDbl;
}

private static boolean ReadBoolean ()
{
	String s1;
	int i1;
	Scanner kb = new Scanner(System.in);

	while (true)
	{
		System.out.print("Enter a boolean: ");
		s1 = kb.nextLine().toLowerCase();
		try{
			i1 = Integer.parseInt(s1);
		}
		catch (Exception e){
			i1 = -1;
		}

		if (s1.equals("t") || s1.equals("true") || s1.equals("y") || s1.equals("yes") || i1 == 1) return true;
		else if (s1.equals("f") || s1.equals("false") || s1.equals("n") || s1.equals("no") || i1 == 0) return false;
		else {
//			System.out.println (e.getMessage());
			System.out.println ("Value entered is not a valid boolean!!");
		}
	}
}

}
