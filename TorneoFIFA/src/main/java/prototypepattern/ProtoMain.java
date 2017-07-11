package prototypepattern;

public class ProtoMain {

	public static void main(String[] args) {
		Person andres = new Person("andres", "Vaninetti");
		System.out.println(andres.getName() + " " + andres.getApellido());
		Person clon = (Person) andres.doClone();
		System.out.println(clon.getName() + " " + clon.getApellido());
	}

}
