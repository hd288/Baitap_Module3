package rikkeiacademy.Session11;

import java.util.LinkedList;
import java.util.Queue;

public class MinElementInArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 1, 4, 8};

        int minElement = findMinElement(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + minElement);
    }

    public static int findMinElement(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        int minElement = Integer.MAX_VALUE;

        for (int element : arr) {
            queue.add(element);
            minElement = Math.min(minElement, element);
        }

        while (!queue.isEmpty() && queue.peek() != minElement) {
            queue.add(queue.poll());
        }

        return minElement;
    }
}

