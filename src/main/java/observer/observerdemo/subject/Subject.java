package observer.observerdemo.subject;

import observer.observerdemo.observers.Observer;

public interface Subject
{
  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers();
}
