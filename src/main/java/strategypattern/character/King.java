package strategypattern.character;

import strategypattern.behavior.SwordBehavior;

public class King extends Character
{
  public King()
  {
    weaponBehavior = new SwordBehavior();
  }
}
