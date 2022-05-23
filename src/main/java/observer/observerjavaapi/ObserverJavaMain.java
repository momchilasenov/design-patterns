package observer.observerjavaapi;

public class ObserverJavaMain
{
  public static void main(String[] args)
  {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

    weatherData.setMeasurements(80,65,30);
    System.out.println("----");
    weatherData.setMeasurements(101,100,110);
    System.out.println("----");
    weatherData.setMeasurements(205,260,230);
  }
}
