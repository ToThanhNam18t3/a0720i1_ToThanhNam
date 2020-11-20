package Bai12_Java_Collection_FrameWork.Thuc_Hanh._01_Map_Luu_DS_Theo_Tuoi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 35);
        hashMap.put("Anderson", 31);
        hashMap.put("Chuong", 32);
        hashMap.put("Vai", 32);
        hashMap.put("Vai1", 33);
        hashMap.put("Vai2", 35);
        hashMap.put("Va3", 38);
        hashMap.put("Va4", 32);
        hashMap.put("Va5", 32);
        hashMap.put("Vai6", 32);
        hashMap.put("Vai7", 32);
        hashMap.put("Vai8", 32);
        hashMap.put("Vai9", 32);
        System.out.println("Hash map");
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
        System.out.println("Tree map" + "Vai 9" + treeMap.get("Vai9"));

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.5f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }
}
