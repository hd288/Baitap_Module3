package rikkeiacademy.Session11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Tạo một Queue (hàng đợi) sử dụng LinkedList
        Queue<Integer> myQueue = new LinkedList<>();

        // Danh sách đầu vào
        int[] danhSach = {1, 2, 3, 4, 5};

        // Đưa các phần tử của danh sách vào queue
        for (int item : danhSach) {
            myQueue.add(item);
        }

        // In ra các phần tử của queue
        System.out.println("Các phần tử trong queue:");
        while (!myQueue.isEmpty()) {
            int item = myQueue.poll();
            System.out.println(item);
        }
    }
}

