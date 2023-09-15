package rikkeiacademy.Session05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChuanBi_ValidateAccount {
    public static void main(String[] args) {
        String[] accountNames = {
                "123abc_",
                "_abc123",
                "InvalidAccount",
                "short",
                "account_with_special_chars!",
                "12345",
                "abcde"
        };

        for (String accountName : accountNames) {
            boolean isValid = isAccountNameValid(accountName);
            System.out.println(accountName + " is valid? \t - " + isValid);
        }
    }

    public static boolean isAccountNameValid(String accountName) {
        // Biểu thức chính quy để kiểm tra tính hợp lệ của tên tài khoản
        String regex = "^[_a-z0-9]{6,}$";

        // Tạo một Pattern object từ biểu thức chính quy
        Pattern pattern = Pattern.compile(regex);

        // Tạo một Matcher object để so khớp chuỗi với biểu thức chính quy
        Matcher matcher = pattern.matcher(accountName);

        // Kiểm tra xem tên tài khoản có khớp với biểu thức chính quy không
        return matcher.matches();
    }
}
