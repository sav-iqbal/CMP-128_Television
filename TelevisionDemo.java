/** This class demonstrates the Television class*/

import java.util.Scanner;

public class TelevisionDemo
{
	public static void main(String[] args)
	{
		//create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner (System.in);

		//declare variables
		int station;	//the user's channel choice

		//declare and instantiate a television object
		Television bigScreen = new Television("Toshiba", 55);
		//turn the power on
		bigScreen.power();
		//display the state of the television
		System.out.println("A " + bigScreen.getScreenSize() + " inch " +
			bigScreen.getManufacturer()	+ " has been turned on.");
		//prompt the user for input and store into station
		System.out.print("What channel do you want?  ");
		station = keyboard.nextInt();

		//change the channel on the television
		bigScreen.setChannel(station);
		//increase the volume of the television
		bigScreen.increaseVolume();
		//display the the current channel and volume of the television
		System.out.println("Channel:  " + bigScreen.getChannel() +
			"   Volume:  "	+ bigScreen.getVolume());
		System.out.println("Too loud!! I am lowering the volume.");
		//decrease the volume of the television
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		//display the current channel and volume of the television
		System.out.println("Channel:  " + bigScreen.getChannel() +
			"   Volume:  "	+ bigScreen.getVolume());
		System.out.println();   	//for a blank line


		//HERE IS WHERE YOU DO TASK #5
      Television portable = new Television("Sharp", 19);
      portable.power();
      
      //display the state of the television
      System.out.println("A " + portable.getScreenSize() + " inch " + portable.getManufacturer() + " has been turned on. " );
      
      //prompt the user for input and store into station
      System.out.println("What channel do you want? ");
      station = keyboard.nextInt();
      
      //change the channel on the television
      portable.setChannel(station);
      //decrease the volume of the station
      portable.decreaseVolume();
      portable.decreaseVolume();
      
      //display the current channel and volume of the television
      System.out.println("Channel:  " + portable.getChannel() + 
                           "  Volume:  "  + portable.getVolume() );
      System.out.println(); 
	}
}

/*** Output
A 55 inch Toshiba has been turned on.
 What channel do you want?  6
 Channel:  6   Volume:  21
 Too loud!! I am lowering the volume.
 Channel:  6   Volume:  15
 
 A 19 inch Sharp has been turned on. 
 What channel do you want? 
 7
 Channel:  7  Volume:  18

*/