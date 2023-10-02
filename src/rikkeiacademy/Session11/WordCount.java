package rikkeiacademy.Session11;

import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        String text = "This is a sample text. This text contains some sample words. Sample text is used for testing.";

        // Sử dụng TreeMap để lưu trữ số lần xuất hiện của từ
        TreeMap<String, Integer> wordCountMap = new TreeMap<>();

        // Chuyển chuỗi thành chữ thường và tách thành các từ
        String[] words = text.toLowerCase().split("\\s+");

        // Duyệt qua từng từ trong mảng
        for (String word : words) {
            // Loại bỏ các ký tự đặc biệt như dấu chấm, dấu phẩy, dấu chấm phẩy, v.v.
            word = word.replaceAll("[^a-zA-Z]", "");

            // Kiểm tra xem từ này đã tồn tại trong TreeMap chưa
            if (wordCountMap.containsKey(word)) {
                // Nếu đã tồn tại, tăng giá trị số lần xuất hiện lên 1
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // Nếu chưa tồn tại, thêm từ vào TreeMap với giá trị là 1
                wordCountMap.put(word, 1);
            }
        }

        // In kết quả theo thứ tự bảng chữ cái của các từ
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " lần");
        }
    }
}

