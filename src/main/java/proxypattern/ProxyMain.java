package proxypattern;

import java.rmi.RemoteException;

public class ProxyMain
{
  public static void main(String[] args) throws RemoteException
  {
    GumballMachine machine = new GumballMachine("demo-location", 22);
    GumballMonitor monitor = new GumballMonitor(machine);
    monitor.report();
  }
}
