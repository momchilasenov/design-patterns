package delegatepattern;

public class EnglishDelegate implements TranslationDelegate
{
  private final String LANGUAGE = "ENGLISH";

  @Override
  public void translate(String text)
  {
    System.out.println("Translating '" + text + "' to " + LANGUAGE);
  }

  @Override
  public void generateGreeting()
  {
    System.out.println("Hello in " + LANGUAGE);
  }
}
