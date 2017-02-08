package Employee;

/**
 * Created by ioioj5 on 2017/2/8.
 */
public class Employee {
    private String name; // 姓名
    private double salary; // 薪水

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: name: " + name + ", salary: " + salary;
    }
}
