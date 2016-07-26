package normal;

/**
 * 抽象类
 */
abstract class People {
	public String name;
	public int age;
	public String sex;

	/**
	 * 抽象方法: 获取姓名
	 * @return
	 */
	abstract String getName();

	/**
	 * 抽象方法: 获取年龄
	 * @return
	 */
	abstract int getAge();

	/**
	 * 抽象方法: 获取性别
	 * @return
	 */
	abstract String getSex();
}


