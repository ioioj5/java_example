package normal;

public class Student extends Person {
    private String school;

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 重载
     */
    public void whoAmI() {
        System.out.println("我是, " + this.getName() + ", 我今年, " + this.getAge() + "岁了." + "我在" + this.getSchool() + "上学");
    }

    public Student() {
        // pass
    }

    public static void main(String args[]) {
        Student s = new Student();
        s.setName("李四");
        s.setAge(29);
        s.setSchool("第一中学");
        s.whoAmI();
    }
}
