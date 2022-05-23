package proxy.rmidemo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteServiceImpl extends UnicastRemoteObject implements MyRemoteService
{
  private static final long serialVersionUID = 1L;

  public MyRemoteServiceImpl() throws RemoteException
  {
  }

  @Override
  public String sayHello()
  {
    return "Server says Hello";
  }

  public static void main(String[] args)
  {
    try {
      MyRemoteService service = new MyRemoteServiceImpl();
      Naming.rebind("RemoteHello", service);
    }
    catch (RemoteException | MalformedURLException e) {
      e.printStackTrace();
    }
  }
}
