package strategy.character;

import strategy.behavior.KnifeBehavior;

public class Knight extends Character
{
  public Knight()
  {
    weaponBehavior = new KnifeBehavior();
  }
}
