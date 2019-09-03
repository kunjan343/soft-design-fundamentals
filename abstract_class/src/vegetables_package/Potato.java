package vegetables_package;

public class Potato extends Vegetable {

	/**
	 *
	 * @param color
	 * @param name
	 */
	public Potato(String color, String name) {
		super(color,name);
	}

	public boolean isTasty() {
		return true;
	}

}
