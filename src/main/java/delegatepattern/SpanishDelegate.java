package delegatepattern;

public class SpanishDelegate implements TranslationDelegate
{
  private final String LANGUAGE = "SPANISH";

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
