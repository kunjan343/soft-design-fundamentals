package vegetables_package;

public abstract class Vegetable {

	private String color;
	private String name;

	public abstract boolean isTasty();

	public String getColor() {
		return this.color;
	}

	/**
	 *
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return this.name;
	}

	/**
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Vegetable() {
	}

	/**
	 *
	 * @param color
	 * @param name
	 */
	public Vegetable(String color, String name) {
		setColor(color);
		setName(name);
	}

}
