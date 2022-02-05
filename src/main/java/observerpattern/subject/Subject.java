package observerpattern.subject;

import observerpattern.observers.Observer;

public interface Subject
{
  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers();
}
