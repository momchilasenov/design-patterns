package observer.observerdemo.observers;

import observer.observerdemo.subject.WeatherData;

public class HeatIndexDisplay implements Observer, DisplayElement
{
  private float       temperature;
  private float       humidity;
  private WeatherData weatherData;

  public HeatIndexDisplay(WeatherData weatherData)
  {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display()
  {
    float heatIndex = computeHeatIndex(temperature, humidity);
    System.out.println("Humidity is: " + heatIndex);
  }

  @Override
  public void update(float temperature, float humidity, float pressure)
  {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  private float computeHeatIndex(float temperature, float humidity) {
    return (float)((16.923 + (0.185212 * temperature) + (5.37941 * humidity) - (0.100254 * temperature * humidity) +
        (0.00941695 * (temperature * temperature)) + (0.00728898 * (humidity * humidity)) +
        (0.000345372 * (temperature * temperature * humidity)) - (0.000814971 * (temperature * humidity * humidity)) +
        (0.0000102102 * (temperature * temperature * humidity * humidity)) - (0.000038646 * (temperature * temperature * temperature)) + (0.0000291583 *
        (humidity * humidity * humidity)) + (0.00000142721 * (temperature * temperature * temperature * humidity)) +
        (0.000000197483 * (temperature * humidity * humidity * humidity)) - (0.0000000218429 * (temperature * temperature * temperature * humidity * humidity)) +
        0.000000000843296 * (temperature * temperature * humidity * humidity * humidity)) -
        (0.0000000000481975 * (temperature * temperature * temperature * humidity * humidity * humidity)));
  }
}
