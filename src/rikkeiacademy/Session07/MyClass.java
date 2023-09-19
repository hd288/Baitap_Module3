package rikkeiacademy.Session07;

public class MyClass {
    private String myString; // Thuộc tính private

    // Constructor mặc định
    public MyClass() {
        myString = "Hello, World!";
    }

    public static void main(String[] args) {
        // Khởi tạo đối tượng từ lớp MyClass
        MyClass myObject = new MyClass();

        // Hiển thị giá trị ban đầu của myString
        System.out.println("Giá trị ban đầu của myString: " + myObject.getMyString());

        // Thay đổi giá trị của myString
        myObject.setMyString("Chào bạn!");

        // Hiển thị giá trị mới của myString
        System.out.println("Giá trị mới của myString: " + myObject.getMyString());
    }

    // Getter cho myString
    public String getMyString() {
        return myString;
    }

    // Setter cho myString
    public void setMyString(String value) {
        myString = value;
    }

}


