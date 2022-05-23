package observer.observerdemo.observers;

import observer.observerdemo.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement
{
  private float   temperature;
  private float   humidity;
  private float   pressure;
  private Subject weatherData;

  public StatisticsDisplay(Subject weatherData)
  {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display()
  {
    System.out.println("Statistics Display");
  }

  @Override
  public void update(float temperature, float humidity, float pressure)
  {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }
}
