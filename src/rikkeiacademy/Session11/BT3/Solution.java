package rikkeiacademy.Session11.BT3;

public class Solution {
    // chèn một phần tử vào hàng đợi
    public static void enQueue(Queue queue, int data) {
        queue.enQueue(data);
    }

    // lấy một phần tử ra khỏi hàng đợi
    public static int deQueue(Queue queue) {
        return queue.deQueue();
    }

    // hiển thị tất cả các phần tử trong hàng đợi
    public static void displayQueue(Queue queue) {
        Node currentNode = queue.front;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}