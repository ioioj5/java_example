package normal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by ioioj5 on 2016/7/26.
 */
public class CollectionTest {
	public ArrayList<String> arrayList;
	public HashSet<String> hashSet;

	public CollectionTest() {

	}

	public ArrayList<String> ArrayListTest(){
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("西游记");
		arrayList.add("水浒传");
		arrayList.add("红楼梦");
		arrayList.add("三国演义");

		return arrayList;
	}

	public HashSet<String> HashSetTest() {
		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("孙悟空");
		hashSet.add("猪八戒");
		hashSet.add("沙僧");

		return hashSet;
	}

	public void loopOne(ArrayList<String> al) {
		Iterator it = al.iterator();
		while (it.hasNext()) {
			String array = (String) it.next();
			System.out.println(array);
		}
	}

}
