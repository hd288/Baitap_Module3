package rikkeiacademy.Session05;

public class TrenLop_CheckEmptyString {
    public static void main(String[] args) {
        // Khai báo một chuỗi
        String str1 = "Hello, World!";
        String str2 = "";

        // Kiểm tra xem chuỗi có rỗng không
        if (str1.isEmpty()) {
            System.out.println("Chuỗi str1 là chuỗi rỗng.");
        } else {
            System.out.println("Chuỗi str1 không rỗng.");
        }

        if (str2.isEmpty()) {
            System.out.println("Chuỗi str2 là chuỗi rỗng.");
        } else {
            System.out.println("Chuỗi str2 không rỗng.");
        }
    }
}
