package manning.osgi.helloworld.client2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import manning.osgi.helloworld.client.PrinterClient;

public class PrinterClientActivator2 implements BundleActivator {

	public void start(BundleContext context) throws Exception {

		System.out.println("hi2");

		new PrinterClient().printMyMessage();

	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("bye2");
		

	}
}