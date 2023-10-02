package rikkeiacademy.Session11.BT3;

public class Main {
    public static void main(String[] args) {
        // tạo một hàng đợi
        Queue queue = new Queue();

        // chèn các phần tử vào hàng đợi
        Solution.enQueue(queue, 1);
        Solution.enQueue(queue, 2);
        Solution.enQueue(queue, 3);
        Solution.enQueue(queue, 4);

        // hiển thị tất cả các phần tử trong hàng đợi
        Solution.displayQueue(queue);

        // lấy một phần tử ra khỏi hàng đợi
        int data = Solution.deQueue(queue);
        System.out.println("Đã lấy ra phần tử: " + data);

        // hiển thị tất cả các phần tử trong hàng đợi
        Solution.displayQueue(queue);
    }
}
