package strategy.character;

import strategy.behavior.SwordBehavior;

public class King extends Character
{
  public King()
  {
    weaponBehavior = new SwordBehavior();
  }
}
