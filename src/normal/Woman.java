package normal;

public class Woman extends People {

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

	public Woman(){
		this.name = "李四";
		this.age = 10;
		this.sex = "不男不女";
	}
}