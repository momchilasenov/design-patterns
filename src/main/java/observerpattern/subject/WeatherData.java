package observerpattern.subject;

import observerpattern.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject
{
  private float          temperature;
  private float          humidity;
  private float          pressure;
  private List<Observer> observers;

  public WeatherData()
  {
    this.observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer observer)
  {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer)
  {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers()
  {
    for (Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  public void measurementsChanged()
  {
    //notify observers when you get updated measurements from the Weather station
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure)
  {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged(); //notify the observers;
  }

  public float getTemperature()
  {
    return temperature;
  }

  public float getHumidity()
  {
    return humidity;
  }

  public float getPressure()
  {
    return pressure;
  }
}
