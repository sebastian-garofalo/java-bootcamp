package proxypattern;

public class ProxyMain {

	public static void main(String[] args) {

		Proxy proxy = new Proxy();
		FastThing fastThing = new FastThing();
		fastThing.sayHello();
		proxy.sayHello();
	}
}
