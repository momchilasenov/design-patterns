package proxypattern;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject
                            implements GumballMachineRemote
{
  private static final Long serialVersionUID = 2L;
  private String location;
  private int    count;

  public GumballMachine(String location, int count) throws RemoteException
  {
    this.location = location;
    this.count = count;
  }

  public String getLocation()
  {
    return location;
  }

  public int getCount()
  {
    return count;
  }

  @Override
  public State getState() throws RemoteException
  {
    return null;
  }
}
