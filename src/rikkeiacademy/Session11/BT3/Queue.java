package rikkeiacademy.Session11.BT3;

class Queue {
    Node front;
    Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    // chèn một phần tử vào hàng đợi
    public void enQueue(int data) {
        // tạo một node mới
        Node newNode = new Node(data);

        // nếu hàng đợi trống
        if (this.front == null) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            // chèn node vào cuối hàng đợi
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }

    // lấy một phần tử ra khỏi hàng đợi
    public int deQueue() {
        // nếu hàng đợi trống
        if (this.front == null) {
            return -1;
        }

        // lấy phần tử đầu tiên trong hàng đợi
        int data = this.front.data;

        // cập nhật front và rear
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }

        return data;
    }
}
