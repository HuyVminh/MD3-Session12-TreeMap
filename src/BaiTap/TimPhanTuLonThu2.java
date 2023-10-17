package BaiTap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TimPhanTuLonThu2 {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9, 34, 2, 2, 4, 5, 2, 34, 6, 3, 3, 5, 4);
        Map<Integer, Integer> treeMap = new TreeMap<>();
        for (Integer i : listNumbers) {
            treeMap.put(i, 0);
        }
        // Bước 4: Lấy giá trị của phần tử lớn nhất trong TreeMap
        int largestElement = ((TreeMap<Integer, Integer>) treeMap).lastKey();

        // Bước 5: Xóa phần tử lớn nhất khỏi TreeMap
        treeMap.remove(largestElement);
        int secondLargestElement = ((TreeMap<Integer, Integer>) treeMap).lastKey();

        System.out.println("Phần tử lớn thứ hai trong mảng là: " + secondLargestElement);
    }
}
