package com.surya.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Application1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashSet hashset = new HashSet();
   hashset.add(12);
   hashset.add(13);
   hashset.add(14);
   hashset.add(10);
   hashset.add(11);
   hashset.add(15);
   hashset.add(15);
   
   List list = new ArrayList(hashset);// to convert the hashset into list
   Collections.sort(list);//to sort the hashset we need to conert into list
   System.out.println(list);// in place sorting
   
//------------------------------------------------
   LinkedHashMap<String , String> hmp1 = new LinkedHashMap<String,String>();
   // no insertion order is preserved in hashmap
   
   
   hmp1.put("Brave", "who have the courage to do");
   hmp1.put("lazy", "who used to hasitate in evry work");
   hmp1.put("Cleaver", "who apply mind before work");
   
   // for each loop in hashmap
   
//   for(String word :hmp1.keySet()) {
//	   System.out.println(hmp1.get(word));
//   }
   for(Map.Entry<String, String> entry : hmp1.entrySet()) {
	   System.out.println(entry.getKey());
	   System.out.println(entry.getValue());
   }
   
   
	}

}
