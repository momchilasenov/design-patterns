package facade;

import facade.hometheatercomponents.*;

public class FacadeMain
{
  public static void main(String[] args)
  {
    HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
        new Amplifier(),
        new Tuner(),
        new DvdPlayer(),
        new CdPlayer(),
        new Projector(),
        new Screen(),
        new PopcornPopper());

    homeTheaterFacade.watchMovie("The Shining");
    System.out.println("--------------");
    homeTheaterFacade.endMovie();
  }
}
