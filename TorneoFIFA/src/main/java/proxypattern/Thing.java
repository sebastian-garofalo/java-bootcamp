package proxypattern;

import java.util.Date;

public abstract class Thing {

	public void sayHello() {
		System.out.println(this.getClass().getSimpleName() + "says howdy at " + new Date());
	}

}
