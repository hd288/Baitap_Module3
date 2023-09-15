package rikkeiacademy.Session05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChuanBi_ValidateEmail {
    public static void main(String[] args) {
        String[] emails = {
                "example@gmail.com",
                "invalid_email",
                "no@special#chars.com",
                "valid_email@domain.com",
                "user@sub.domain.co.uk"
        };

        for (String email : emails) {
            boolean isValid = isEmailValid(email);
            System.out.println(email + " is valid?\t -" + isValid);
        }
    }

    public static boolean isEmailValid(String email) {
        // Biểu thức chính quy để kiểm tra tính hợp lệ của email
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

        // Tạo một Pattern object từ biểu thức chính quy
        Pattern pattern = Pattern.compile(regex);

        // Tạo một Matcher object để so khớp chuỗi với biểu thức chính quy
        Matcher matcher = pattern.matcher(email);

        // Kiểm tra xem email có khớp với biểu thức chính quy không
        return matcher.matches();
    }
}
