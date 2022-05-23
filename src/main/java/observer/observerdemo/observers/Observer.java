package observer.observerdemo.observers;

public interface Observer
{
  //method that will be called by the Subject/Observable
  //when it have to notify the observers of a change
  void update(float temperature, float humidity, float pressure);
}
