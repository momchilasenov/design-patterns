package strategypattern.characters;

import strategypattern.weapons.BowAndArrowBehavior;

public class Queen extends Character
{
  public Queen()
  {
    weaponBehavior = new BowAndArrowBehavior();
  }
}
