package delegatepattern;

public class Translator
{
  //client HAS-A TranslationDelegate
  TranslationDelegate translationDelegate;

  public Translator(TranslationDelegate translationDelegate)
  {
    this.translationDelegate = translationDelegate;
  }

  public void translate()
  {
    translationDelegate.translate("Foreign text that needs translation");
  }

  public void greet()
  {
    translationDelegate.generateGreeting();
  }


}
