package hashMap.com;
import java.util.*;
public class HashMapEg {

	public static void main(String[] args) {
		
	HashMap<Integer,String> obj= new HashMap<Integer,String>();
    System.out.println("Adding elements in Hashmap");
    
    obj.put(50,"Apple");
    obj.put(11, "Banana");
    obj.put(44, "Orange");
    obj.put(5, "Manago");
    obj.put(null, null);      //Allows
    obj.put(null, "Kiwi");
    obj.put(30,null);
    obj.put(3, "Manago");
    obj.put(44, "Papaya");
    
    System.out.println("The elements in Hashmap are :" +obj);
    
    for(Map.Entry<Integer, String> m : obj.entrySet())
    {
    	System.out.println(m.getKey()+ " "+m.getValue());;
    }
    
    obj.replace(11, "Pineapple");
    System.out.println("After replace in Haspmap :"+obj);
    
    obj.remove(11);
    System.out.println("After remove in Hashmap :"+obj);
    
    System.out.println("Does the key - 11 present or not? :" +obj.containsKey(11));
   
    HashMap<Integer,String> obj1= new HashMap<Integer,String>();
    
    obj.put(60, "Watermelon");
    obj.put(3, "Jackfruit");
    obj1.putAll(obj);
    
    System.out.println("After updation in Hashmap :"+obj1);
}
}