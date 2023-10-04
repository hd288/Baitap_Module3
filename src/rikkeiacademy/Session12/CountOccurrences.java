package rikkeiacademy.Session12;

import java.util.HashMap;

public class CountOccurrences {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo mảng phần tử
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 4, 5, 5, 5};

        // Bước 2: Sử dụng HashMap để đếm số lần xuất hiện của mỗi phần tử
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int element : arr) {
            // Kiểm tra xem phần tử đã có trong HashMap hay chưa
            if (countMap.containsKey(element)) {
                // Nếu đã có, tăng số lần xuất hiện lên 1
                countMap.put(element, countMap.get(element) + 1);
            } else {
                // Nếu chưa có, thêm phần tử vào HashMap với số lần xuất hiện ban đầu là 1
                countMap.put(element, 1);
            }
        }

        // Bước 3: Duyệt qua các phần tử trong HashMap và in ra số lần xuất hiện của từng phần tử
        for (int key : countMap.keySet()) {
            int count = countMap.get(key);
            System.out.println("Phần tử " + key + " xuất hiện " + count + " lần");
        }
    }
}

