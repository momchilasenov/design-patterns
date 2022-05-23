package strategy;

import strategy.character.Character;
import strategy.character.King;
import strategy.character.Queen;
import strategy.behavior.AxeBehavior;

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
