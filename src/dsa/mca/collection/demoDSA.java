package dsa.mca.collection;

import java.util.HashMap;
import java.util.HashSet;  // ✅ import added
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class demoDSA {

    public static void main(String[] args) {
//        ArrayList<Integer> n = new ArrayList<>();
//      n.add(10);
//      n.add(20);
//        n.add(3);
       
//        n.addFirst(78);
        
//        n.add(2,400);
//       System.out.println(n.get(3));
//    	TreeSet<Integer> h = new TreeSet<Integer>();
//    	 h.add(500);
//    	 h.add(200);
//    	 h.add(300);
//    	 h.add(400);
//    	 h.add(200);
//    	 System.out.println(h);
    HashMap<String,Integer> d = new HashMap<String,Integer>();
    
    d.put("Mic",100);
    d.put("Bob",200);
    d.put("Joe",500);
    d.put("Rahul",300);
    System.out.println(d);
    }
}