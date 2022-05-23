package facade;

import facade.hometheatercomponents.*;

public class HomeTheaterFacade
{
  Amplifier     amplifier;
  Tuner         tuner;
  DvdPlayer     dvdPlayer;
  CdPlayer      cdPlayer;
  Projector     projector;
  Screen        screen;
  PopcornPopper popcornPopper;

  public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, Screen screen, PopcornPopper popcornPopper)
  {
    this.amplifier = amplifier;
    this.tuner = tuner;
    this.dvdPlayer = dvdPlayer;
    this.cdPlayer = cdPlayer;
    this.projector = projector;
    this.screen = screen;
    this.popcornPopper = popcornPopper;
  }

  public void watchMovie(String movie)
  {
    System.out.println("Get ready to watch " + movie);
    popcornPopper.on();
    popcornPopper.pop();
    screen.down();
    projector.on();
    amplifier.on();
    amplifier.setDvd(movie);
    amplifier.setSurroundSound();
    dvdPlayer.on();
    dvdPlayer.play(movie);
  }

  public void endMovie()
  {
    System.out.println("Shutting movie theater down...");
    popcornPopper.off();
    projector.off();
    amplifier.off();
    dvdPlayer.off();
  }
}
