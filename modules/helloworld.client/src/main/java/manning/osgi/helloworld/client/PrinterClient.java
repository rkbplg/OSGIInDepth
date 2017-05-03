package manning.osgi.helloworld.client;

import manning.osgi.helloworld.Printer;

public class PrinterClient {

	public void printMyMessage() {

		Printer p = new Printer();

		p.print("Hello World");

	}
}