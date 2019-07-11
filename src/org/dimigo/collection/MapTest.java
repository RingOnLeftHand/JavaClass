package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        ////  2. Map 계열 : Hash Map
        ////  key, value 쌍으로 구성
        Map<String,Integer> map = new HashMap<>();
        map.put("kor",100);
        map.put("mat",90);
        map.put("eng",80);
        map.put("eng",90);
        printMap(map);
        System.out.println(map.get("kor"));
        System.out.println(map.get("sci"));
        map.remove("eng");
        printMap(map);
        map.clear();
        printMap(map);

        Map<String , List<String >> map2=new HashMap<>();
        //
        List<Map<String ,String >>list=new ArrayList<>();
    }

    public static void printMap(Map<String,Integer>map) {
        for(String key : map.keySet()){
            System.out.println(key + ":" + map.get(key) + " | ");
        }
        System.out.println();
    }
}
