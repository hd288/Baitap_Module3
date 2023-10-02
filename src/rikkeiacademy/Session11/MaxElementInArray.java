package rikkeiacademy.Session11;

import java.util.Stack;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 8, 6};

        int maxElement = findMaxElement(arr);
        System.out.println("Phần tử lớn nhất trong mảng là: " + maxElement);
    }

    public static int findMaxElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int maxElement = Integer.MIN_VALUE;

        for (int element : arr) {
            // Nếu stack rỗng hoặc phần tử đang xét lớn hơn phần tử trên đỉnh của stack
            if (stack.isEmpty() || element > stack.peek()) {
                stack.push(element);
            } else {
                // Nếu phần tử đang xét không lớn hơn, lấy phần tử trên đỉnh của stack ra khỏi stack
                stack.pop();
            }
        }

        // Phần tử lớn nhất nằm trên đỉnh của stack
        if (!stack.isEmpty()) {
            maxElement = stack.peek();
        }

        return maxElement;
    }
}
