package data;

import java.util.*;

public class DataStructure {
    static void listing(){
        List<String> list  = new ArrayList<>();
        list.add("solomon");
        list.add("debby");
        list.add("mildred");
        list.add("mildred");

        for (String name : list){
            System.out.println(name);
        }
    }

    static void setting(){
        Set<String> set  = new HashSet<>();
        set.add("solomon");
        set.add("debby");
        set.add("debby");
        set.add("mildred");


        for (String name : set){
            System.out.println(name);
        }
    }
    static void mapping(){
        Map<String, Long> contact =new  HashMap<>();
        contact.put("Mom", 808080835436L);
        contact.put("Dad", 808080809893L);
        contact.put("Uncle", 8080809977L);

        for (String key :contact.keySet()){
            System.out.println(key  +  " " + contact.get(key));

        }

    }
    public static void main(String[] args) {
       // DataStructure.listing();
       // DataStructure.setting();
        DataStructure.mapping();
    }
}
