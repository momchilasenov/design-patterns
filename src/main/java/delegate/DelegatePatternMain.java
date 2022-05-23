package delegate;

public class DelegatePatternMain
{
  public static void main(String[] args)
  {
    TranslationDelegate englishDelegate = new EnglishDelegate();
    TranslationDelegate spanishDelegate = new SpanishDelegate();

    Translator translator = new Translator(englishDelegate);
    translator.translate();
    translator.greet();

    translator = new Translator(spanishDelegate);
    translator.translate();
    translator.greet();

  }
}
