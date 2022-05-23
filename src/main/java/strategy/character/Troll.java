package strategy.character;

import strategy.behavior.AxeBehavior;

public class Troll extends Character
{
  public Troll()
  {
    weaponBehavior = new AxeBehavior();
  }
}
