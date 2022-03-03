package strategypattern.character;

import strategypattern.behavior.KnifeBehavior;

public class Knight extends Character
{
  public Knight()
  {
    weaponBehavior = new KnifeBehavior();
  }
}
