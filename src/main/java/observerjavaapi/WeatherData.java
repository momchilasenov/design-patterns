package observerjavaapi;

import java.util.Observable;

public class WeatherData extends Observable
{
  private float temperature;
  private float humidity;
  private float pressure;

  public void measurementsChanged()
  {
    setChanged(); //set Observable object as sth that changed
    notifyObservers(); //using PULL model (not sending a data object)
  }

  public void setMeasurements(float temperature, float humidity, float pressure){
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
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
