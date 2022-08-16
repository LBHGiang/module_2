import java.util.*;

class Test {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Hải", 1);
        treeMap.put("Trường", 2);
        treeMap.put("Giang", 3);
        treeMap.put("Tiến", 1);

        int n= treeMap.get("Hải")+1;
        treeMap.put("Hải",n);
        System.out.println(treeMap);




    }
}

