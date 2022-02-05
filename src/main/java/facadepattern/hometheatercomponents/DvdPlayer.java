package facadepattern.hometheatercomponents;

public class DvdPlayer
{
  public void on()
  {
    System.out.println("DVD is ON");
  }

  public void off()
  {
    System.out.println("DVD is OFF");
  }

  public void play(String movie)
  {
    System.out.println("Playing movie: " + movie);
  }
}
