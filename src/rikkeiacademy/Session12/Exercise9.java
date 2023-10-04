package rikkeiacademy.Session12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        /** Cho một danh sách các số nguyên, hãy sử dụng Stream để đếm số lượng phần tử  lớn hơn 10. */
        List<Integer> integers = Arrays.asList(2313, 12, 12, 12, 223, 32, 2, 4, 3, 3, 3, 2, 1, 321312);
        int count = integers.stream().filter(n -> n >= 10).collect(Collectors.toList()).size();
        System.out.println(count);

        /** Sắp xếp danh sách các chuỗi theo bảng chữ cái ngược dùng Stream */
        List<String> strings = Arrays.asList("sadasq", "asdasdsa", "vvvv", "bbbb");
        strings.sort(Comparator.reverseOrder());
        System.out.println(strings);

        /**Tính tổng của các số chia hết cho 3 trong danh sách:*/
        int total = integers.stream().filter(a -> a % 3 == 0).reduce(0, (a, b) -> a + b);
        System.out.println("Total: " + total);

        /**Tìm các số nguyên đầu tiên trong danh sách lớn hơn một giá trị cụ thể:
         * Cho một danh sách các số nguyên lớn, hãy sử dụng Stream để tìm các số đầu tiên lớn hơn một giá trị cụ thể.*/
        int pareNumber = 20;

        List<Integer> list = integers.stream().filter(n -> n > pareNumber).collect(Collectors.toList());
        System.out.println(integers);
        System.out.println(list);
    }
}
