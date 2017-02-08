package Employee;

/**
 * Created by ioioj5 on 2017/2/8.
 */
public class Manager extends Employee {
    private double bonus; // 奖金

    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();

        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        return "Manager: name: " + this.getName() + ", salary:" + this.getSalary();
    }
}
