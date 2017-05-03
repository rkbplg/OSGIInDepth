package manning.osgi.helloworld.client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class PrinterClientActivator implements BundleActivator {

	public void start(BundleContext context) throws Exception {

		System.out.println("hi");

		new PrinterClient().printMyMessage();

	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("bye");
		

	}
}