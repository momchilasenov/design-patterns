package strategy.character;

import strategy.behavior.BowAndArrowBehavior;

public class Queen extends Character
{
  public Queen()
  {
    weaponBehavior = new BowAndArrowBehavior();
  }
}
