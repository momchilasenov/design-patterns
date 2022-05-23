package observer.observerdemo;

import observer.observerdemo.observers.CurrentConditionsDisplay;
import observer.observerdemo.observers.ForecastDisplay;
import observer.observerdemo.observers.HeatIndexDisplay;
import observer.observerdemo.observers.StatisticsDisplay;
import observer.observerdemo.subject.WeatherData;

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
