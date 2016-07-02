package normal;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void whoAmI() {
        System.out.println("我是, " + this.name + ", 我今年, " + this.age + "岁了.");
    }

    public Person() {
        // pass
    }

    public static void main(String args[]) {
        Person p = new Person();
        p.setName("张三");
        p.setAge(30);
        p.whoAmI();

    }
}
