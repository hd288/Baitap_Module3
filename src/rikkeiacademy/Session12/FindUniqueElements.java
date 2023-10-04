package rikkeiacademy.Session12;

import java.util.ArrayList;
import java.util.HashMap;

public class FindUniqueElements {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo mảng chứa các phần tử
        int[] arr = {1, 2, 3, 4, 1, 2, 5, 6, 7};

        // Bước 2: Sử dụng HashMap để đếm số lần xuất hiện của mỗi phần tử
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int element : arr) {
            // Kiểm tra xem phần tử đã có trong HashMap hay chưa
            if (countMap.containsKey(element)) {
                // Nếu đã có, tăng giá trị tương ứng với phần tử lên 1
                countMap.put(element, countMap.get(element) + 1);
            } else {
                // Nếu chưa có, thêm phần tử vào HashMap với giá trị ban đầu là 1
                countMap.put(element, 1);
            }
        }

        // Bước 3: Duyệt qua các phần tử trong HashMap và lưu trữ các phần tử có giá trị bằng 1 vào một mảng mới
        ArrayList<Integer> uniqueElements = new ArrayList<>();

        for (int key : countMap.keySet()) {
            if (countMap.get(key) == 1) {
                uniqueElements.add(key);
            }
        }

        // Bước 4: In ra các phần tử duy nhất
        System.out.println("Các phần tử duy nhất trong mảng:");

        for (int element : uniqueElements) {
            System.out.println(element);
        }
    }
}
