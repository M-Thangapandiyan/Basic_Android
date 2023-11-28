package Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ExampleMap {
    public static void main(String[]args){
        //hashmap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("number3",3);
        hashMap.put("number4",4);
        hashMap.put("number1",1);
        hashMap.put("number2",2);
        hashMap.put("n",2);

        System.out.println("hash map example entryset()");

        for (Map.Entry<String, Integer> as: hashMap.entrySet()) {
            System.out.println("hashMap : " + as.getValue());
        }

        System.out.println("hash map example with keyset()");

        for (String key : hashMap.keySet()) {
            System.out.println("key : " + key);
        }

        System.out.println("hash map example with values()");

        for (Integer key : hashMap.values()) {
            System.out.println("key : " + key);
        }

        System.out.println("hash map example with keySet() get the values ");

        for (String key : hashMap.keySet()) {
            Integer k = hashMap.get(key);
            System.out.println("key : " + k);
        }


        // linkedhashmap

        Map<String, Integer> linkedhashmap = new LinkedHashMap<>();
        linkedhashmap.put("number3",3);
        linkedhashmap.put("number4",4);
        linkedhashmap.put("number1",1);
        linkedhashmap.put("number2",2);
        linkedhashmap.put(null,0);

        for (Map.Entry<String, Integer> as: linkedhashmap.entrySet()) {
            System.out.println("LinkedHashMap : " + as.getValue());
        }



        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap .put("number3",3);
        treeMap .put("number4",4);
        treeMap .put("number1",1);
        treeMap .put("number2",2);


        System.out.println("treeMap  example entryset()");

        for (Map.Entry<String, Integer> as: treeMap .entrySet()) {
            System.out.println("treemap values: " + as.getValue());
        }

        treeMap .remove("number4",4);
        treeMap .replace("number3",6);


        for (Map.Entry<String, Integer> as: treeMap .entrySet()) {
            System.out.println("key : " +as.getKey() + " ," + "values : " + as.getValue());
        }

        HashMap<String,Integer> hashMap1 = new HashMap<>();
        hashMap1.putAll(treeMap);
        System.out.println("hashsize : " + hashMap1.size());

        System.out.println("hash to linked");
        LinkedHashMap<String,Integer> linkedHashMap1 = new LinkedHashMap<>();
        linkedHashMap1.putAll(hashMap1);
        System.out.println("keys : " + linkedHashMap1.keySet() + " and values : "  + linkedHashMap1.values());

        treeMap.clear();
        System.out.println("size : " + treeMap.size());





//        HashMap<String,String> h = new HashMap<>();
//        h.put(null,null);
//        h.put("key1", null);
//        h.put(null,null);
//        h.put("key2", null);
//
//
//        for (Map.Entry<String,String> b: h.entrySet()) {
//            System.out.println("null check " + b);
//        }


    }
}