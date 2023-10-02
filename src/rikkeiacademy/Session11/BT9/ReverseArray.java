package rikkeiacademy.Session11.BT9;

import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();

        // Push các phần tử từ mảng vào Stack
        for (int num : arr) {
            stack.push(num);
        }

        // Pop và in các phần tử từ Stack để đảo ngược mảng
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        // In mảng sau khi đã đảo ngược
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
