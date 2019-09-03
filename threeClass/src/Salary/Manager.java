package Salary;

public class Manager extends Employee {
    private int bonus;

    public int calculatePay() {
        return getHours() * getWage() + getBonus();
    }

    public int getBonus() {
        return this.bonus;
    }

    /**
     * @param bonus
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    /**
     * @param hours
     * @param wage
     * @param bonus
     */
    public Manager(int hours, int wage, int bonus) {
        super(hours, wage);
        setBonus(bonus);
    }

    public Manager() {
    }
}
