package Salary;

public class Employee {
    private int hours;
    private int wage;

    public int calculatePay() {
        return getHours() * getWage();
    }

    public int getHours() {
        return this.hours;
    }

    /**
     * @param hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getWage() {
        return this.wage;
    }

    /**
     * @param wage
     */
    public void setWage(int wage) {
        this.wage = wage;
    }

	/**
	 *
	 * @param hours
	 * @param wage
	 */
	public Employee(int hours, int wage) {
		setWage(wage);
		setHours(hours);
	}

	public Employee() {
	}

}
