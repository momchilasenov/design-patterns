package observer.observerjavaapi;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement
{
  Observable observable;
  private float temperature;
  private float humidity;

  public CurrentConditionsDisplay(Observable observable)
  {
    this.observable = observable;
    observable.addObserver(this);
  }

  @Override
  public void update(Observable observable, Object arg)
  {
    if (observable instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) observable;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }

  @Override
  public void display()
  {
    System.out.println("Current conditions: "
        + temperature + " degrees Celsius "
        + humidity + "% humidity");
  }
}