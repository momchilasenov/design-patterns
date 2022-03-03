package strategypattern;

import strategypattern.character.Character;
import strategypattern.character.King;
import strategypattern.character.Queen;
import strategypattern.behavior.AxeBehavior;

public class StrategyMain
{
  public static void main(String[] args)
  {
    Character king = new King();
    king.fight();
    king.setWeaponBehavior(new AxeBehavior());
    king.fight();

    System.out.println("-------");
    Character queen = new Queen();
    queen.fight();
  }
}
