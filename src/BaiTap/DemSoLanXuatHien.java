package BaiTap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9, 34, 2, 2, 4, 5, 2, 34, 6, 3, 3, 5, 4);
        Map<Integer, Integer> numberTimes = new HashMap<>();
        int maxCount = 0;
        int maxInt = 0;
        for (Integer i : listNumbers) {
            if (numberTimes.containsKey(i)) {
                int count = numberTimes.get(i);
                numberTimes.put(i, ++count);
                if (count > maxCount) {
                    maxCount = count;
                    maxInt = i;
                }
            } else {
                numberTimes.put(i, 1);
                if (1 > maxCount) {
                    maxCount = 1; // Cập nhật giá trị count lớn nhất
                    maxInt = i;
                }
            }
        }
        for (int element : numberTimes.keySet()) {
            int count = numberTimes.get(element);
            System.out.println("Phần tử " + element + " xuất hiện " + count + " lần");
        }
        System.out.println("Phần tử " + maxInt + " có số lần xuất hiện nhiều nhất là " + maxCount + " lần");

    }
}
