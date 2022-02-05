package observerpattern.observers;

import observerpattern.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement
{
  private float   temperature;
  private float   humidity;
  private Subject weatherData; //reference to the Subject-to subscribe and unsubscribe

  public CurrentConditionsDisplay(Subject weatherData) //injecting a Subject through ctor injection
  {
    this.weatherData = weatherData;
    weatherData.registerObserver(this); //register the display as an observer
  }

  @Override
  public void update(float temperature, float humidity, float pressure)
  {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  @Override
  public void display()
  {
    System.out.println("Current conditions: " + temperature + " degrees Celsius");
    System.out.println(humidity + "% humidity");
  }
}
