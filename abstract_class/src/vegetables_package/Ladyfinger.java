package vegetables_package;

public class Ladyfinger extends Vegetable implements Organic {

    /**
	 *
	 * @param color
	 * @param name
	 */
	public Ladyfinger(String color, String name) {
	    super(color,name);
    }

    public boolean isTasty() {
        return true;
    }

	public boolean isOrganic() {
		return true;
	}

}
