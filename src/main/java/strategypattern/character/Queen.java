package strategypattern.character;

import strategypattern.behavior.BowAndArrowBehavior;

public class Queen extends Character
{
  public Queen()
  {
    weaponBehavior = new BowAndArrowBehavior();
  }
}
