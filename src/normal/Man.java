package normal;

public class Man extends People {
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public String getSex() {
		return this.sex;
	}


	public Man() {
		this.name = "王三";
		this.age = 20;
		this.sex = "男";
	}
}