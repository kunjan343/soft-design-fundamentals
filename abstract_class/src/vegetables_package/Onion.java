package vegetables_package;

public class Onion extends Vegetable implements Organic {

	/**
	 *
	 * @param color
	 * @param name
	 */
	public Onion(String color, String name) {
		super(color,name);
	}

	public boolean isTasty() {
		return false;
	}

	public boolean isOrganic() {
		return false;
	}

}
