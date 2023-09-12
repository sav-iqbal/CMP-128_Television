//The purpose of this class is to model a television
//Savaas Iqbal, 11/22/22

public class Television {
   private final String MANUFACTURER; //TV manufacturer
   private final int SCREEN_SIZE; //screen size
   private boolean powerOn;   //determines if the TV is on or off
   private int channel; //channel that the TV is currently on
   private int volume; //volume that the TV is currently at
   
   
   //initializes Television object
   public Television(String manufacturer, int size){
      MANUFACTURER = manufacturer; 
      SCREEN_SIZE = size; 
      volume = 20; 
      channel = 2;
   }

   public int getVolume(){
      return volume;
   }

   public int getChannel(){
      return channel;
   }

   public String getManufacturer(){
      return MANUFACTURER;
   }

   public int getScreenSize(){
      return SCREEN_SIZE;
   }

   public void setChannel(int newChannel){
      channel = newChannel;
   }

   public void power(){
      powerOn = !powerOn;
   }

   public void increaseVolume(){
      volume++;
   }

   public void decreaseVolume(){
      volume--; 
   }


}

