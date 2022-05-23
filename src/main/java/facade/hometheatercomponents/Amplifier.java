package facade.hometheatercomponents;

public class Amplifier
{
  public void on()
  {
    System.out.println("Amplifier is ON");
  }

  public void off()
  {
    System.out.println("Amplifier is OFF");
  }

  public void setDvd(String dvd){
    System.out.println("Setting DVD");
  }

  public void setSurroundSound(){
    System.out.println("Setting surround sound");
  }

}
