package org.example.map;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, 23);
        map.put(3, 45);
        map.put(5, 76);
        map.put(8, 89);
        System.out.println("Map is:" + map);
        map.clear();
        System.out.println("After Clearing map:" + map);

        Map treeMap = new TreeMap();
        treeMap.put(10, 3);
        treeMap.put(4, 45);
        treeMap.put(0, 76);
        treeMap.put(8, 89);
        System.out.println("TreeMap is:" + treeMap);
        Set keySetValue = treeMap.keySet();
        System.out.println("keySetValue tree ->" + keySetValue);
        Set entrySetValue = treeMap.entrySet();
        System.out.println("entrySet tree ->" + entrySetValue);
        System.out.println("Getting the value: " + treeMap.get(0));
        System.out.println("hashCode is: " + treeMap.hashCode());

    }
}
