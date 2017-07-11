package prototypepattern;

public class Person implements Prototype {

	private String name;
	private String apellido;

	public Person(String nombre, String apellido) {
		this.name = nombre;
		this.apellido = apellido;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido
	 *            the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public Prototype doClone() {
		return new Person(name,apellido);
	}

}
