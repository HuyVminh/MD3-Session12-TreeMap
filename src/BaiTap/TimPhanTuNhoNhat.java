package BaiTap;

import java.util.TreeMap;

public class TimPhanTuNhoNhat {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo TreeMap
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        // Bước 2: Đưa các phần tử vào TreeMap
        treeMap.put(5, 50);
        treeMap.put(2, 20);
        treeMap.put(8, 80);
        treeMap.put(1, 10);
        treeMap.put(3, 30);

        // Bước 3: Lấy giá trị của phần tử nhỏ nhất trong TreeMap
        int smallestKey = treeMap.firstEntry().getKey();
        int smallestValue = treeMap.firstEntry().getValue();

        System.out.println("Phần tử nhỏ nhất trong TreeMap là: " + smallestKey + " - " + smallestValue);
    }
}
