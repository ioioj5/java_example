import Employee.*;
import Spider.Spider;

//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // 例子1: 爬虫
        //spider();

        Employee a = new Employee();
        a.setName("王三");
        a.setSalary(100);

        System.out.println(a.toString());

        Manager m = new Manager();
        m.setName("李四");
        m.setSalary(100);
        m.setBonus(50);

        System.out.println(m.toString());



//		CollectionTest ct = new CollectionTest();
//		ArrayList<String> al = ct.ArrayListTest();
//		//System.out.println(al);
//		ct.loopOne(al);

//        Person p = new Person();
//        p.setName("王五");
//        p.setAge(10);
//        p.whoAmI();
//        Student s = new Student();
//        s.setName("张三");
//        s.setAge(20);
//        s.whoAmI();
//		Man m = new Man();
//		System.out.println("我是: " + m.getName() + ", 今年 " + m.getAge() + " 岁, 性别 " + m.getSex());
//
//		Woman wm = new Woman();
//		System.out.println("我是: " + wm.getName() + ", 今年 " + wm.getAge() + " 岁, 性别 " + wm.getSex());

        // 集合

//		System.out.println("# ArrayList");
//		// 1. ArrayList
//		Collection c = new ArrayList();
//		c.add("孙悟空");
//		c.add(6);
//		c.add("猪八戒");
//		c.add(1);
//		c.add("沙僧");
//		c.add(2);
//		c.add(3);
//
//		// 检测是否存在"孙悟空"
//		if (c.contains("孙悟空")) {
//			System.out.println("存在\"孙悟空\"");
//		} else {
//			System.out.println("不存在\"孙悟空\"");
//		}
//		System.out.println("c集合:" + c);
//		System.out.println("c集合元素个数:" + c.size());
//
//		// 2. HashSet
//		System.out.println("\n# HashSet");
//		Collection books = new HashSet();
//		books.add("轻量级Java EE企业应用实战");
//		books.add("疯狂Java讲义");
//		books.add("C语言程序设计");
//		books.add("PHP");
//		System.out.println("books集合:" + books);
//		System.out.println("books集合元素个数:" + books.size());
//
//		books.forEach(obj->System.out.println("迭代集合元素:" + obj));
//
//
//		System.out.println("\n# Iterator迭代");
//		Iterator it = books.iterator();
//		while(it.hasNext()) {
//			String book = (String)it.next();
//			System.out.println(book);
//
//			if(book.equals("疯狂Java讲义")) {
//				it.remove();
//			}
//			book = "测试";
//		}
//		System.out.println(books);
//
//		System.out.println("\n# 使用foreach遍历集合元素");
//		for(Object obj: books) {
//			String book = (String) obj;
//			System.out.println(book);
//		}

    }

    /**
     * 例子1: 爬虫
     */
    public static void spider(){
        String url = "http://www.baidu.com";

        Spider spider = new Spider();
        // 定义一个字符串用来存储网页内容
        String result = spider.sendGet(url);
        System.out.println(result);
    }
}
