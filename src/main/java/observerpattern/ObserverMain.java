package observerpattern;

import observerpattern.observers.CurrentConditionsDisplay;
import observerpattern.observers.ForecastDisplay;
import observerpattern.observers.HeatIndexDisplay;
import observerpattern.observers.StatisticsDisplay;
import observerpattern.subject.WeatherData;

public class ObserverMain
{
  public static void main(String[] args)
  {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

    weatherData.setMeasurements(80,65,30);
    System.out.println("----");
    weatherData.setMeasurements(101,100,110);
    System.out.println("----");
    weatherData.setMeasurements(205,260,230);
  }
}
