package rikkeiacademy.Session05;

public class TrenLop_ReverseString {
    public static void main(String[] args) {
        // Gọi phương thức để đảo ngược chuỗi
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);

        // In demo.ra chuỗi đảo ngược
        System.out.println("Chuỗi ban đầu: " + originalString);
        System.out.println("Chuỗi đảo ngược: " + reversedString);
    }

    public static String reverseString(String input) {
        // Tạo một đối tượng StringBuffer từ chuỗi đầu vào
        StringBuffer stringBuffer = new StringBuffer(input);
        // Sử dụng phương thức reverse() để đảo ngược chuỗi
        stringBuffer.reverse();
        // Chuyển đối tượng StringBuffer thành chuỗi và trả về
        return stringBuffer.toString();
    }
}