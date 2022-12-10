package Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		hasmap is a class which implements Map interface
		HashMap map1=new HashMap();
//		add elements to map object
		map1.put(1,"Cricket");
		map1.put(2,"hockey");
		map1.put(6,"tennis");
		map1.put(13,"Vollyball");
		map1.put("id","throwball");
		map1.put(6.7f,"Table tennis");
		map1.put(45,"forty five");
		// For traversing map we  have to use
		Set set=map1.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+""+entry.getValue());
		}
		//Unigue key and uniqe values only
		System.out.println(map1.containsKey(6.8f));
		map1.containsValue("tennis");
		System.out.println(map1.clone());
		
	

	}

}
