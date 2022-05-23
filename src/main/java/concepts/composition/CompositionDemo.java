package concepts.composition;

public class CompositionDemo
{
  public static void main(String[] args)
  {
    //create a Superbot that can speak, move, clean and play games without using inheritance
    Superbot superbot = new Superbot();
    superbot.speak();
    superbot.move();
    superbot.clean();
    superbot.playGame();
  }
}

class SpeakBehavior
{
  public void speak()
  {
    System.out.println("Talking");
  }
}

class MoveBehavior
{
  public void move()
  {
    System.out.println("Moving");
  }
}

class CleanBehavior
{
  public void clean()
  {
    System.out.println("Cleaning");
  }
}

class Superbot
{
  private SpeakBehavior speakBehavior = new SpeakBehavior();
  private MoveBehavior  moveBehavior  = new MoveBehavior();
  private CleanBehavior cleanBehavior = new CleanBehavior();

  public void playGame()
  {
    System.out.println("Playing chess");
  }

  public void speak()
  {
    speakBehavior.speak();
  }

  public void move()
  {
    moveBehavior.move();
  }

  public void clean()
  {
    cleanBehavior.clean();
  }
}


