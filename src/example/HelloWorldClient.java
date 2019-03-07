package example;

import mypackage.HelloWorldServiceLocator;
import mypackage.HelloWorld_PortType;

public class HelloWorldClient {
    public static void main(String[] argv) {
        try {
            HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
            HelloWorld_PortType service = locator.getHelloWorld();

            String response = service.sayHelloWorldFrom("Yoyoyo it works!");
            System.out.println(response);
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}