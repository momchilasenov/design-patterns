package strategypattern;

import strategypattern.characters.Character;
import strategypattern.characters.King;
import strategypattern.characters.Queen;
import strategypattern.weapons.AxeBehavior;

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
