package proxypattern;

import java.util.Date;

public class Proxy {

	private SlowThing slowThing;

	public Proxy() {
		System.out.println("Creating proxy at" + new Date());
	}

	public void sayHello() {
		if (slowThing == null) {
			slowThing = new SlowThing();
		}
		slowThing.sayHello();
	}

}
