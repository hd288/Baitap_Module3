package rikkeiacademy.Session15;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiemNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập dữ liệu
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }

        // Bước 2: Sắp xếp mảng
        Arrays.sort(mang);

        // Bước 3: Tìm kiếm nhị phân
        System.out.print("Nhập giá trị cần tìm kiếm: ");
        int giaTriCanTim = scanner.nextInt();
        int viTri = timKiemNhiPhan(mang, giaTriCanTim);

        // Bước 4: Xử lý kết quả
        if (viTri != -1) {
            System.out.println("Phần tử " + giaTriCanTim + " được tìm thấy tại vị trí " + viTri);
        } else {
            System.out.println("Không tìm thấy phần tử " + giaTriCanTim + " trong mảng.");
        }

        // Bước 5: Kết thúc chương trình
        scanner.close();
    }

    // Thuật toán tìm kiếm nhị phân
    public static int timKiemNhiPhan(int[] mang, int giaTriCanTim) {
        int left = 0;
        int right = mang.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mang[mid] == giaTriCanTim) {
                return mid; // Trả về vị trí nếu tìm thấy
            }

            if (mang[mid] < giaTriCanTim) {
                left = mid + 1; // Tìm kiếm bên phải của mảng
            } else {
                right = mid - 1; // Tìm kiếm bên trái của mảng
            }
        }

        return -1; // Trả về -1 nếu không tìm thấy
    }
}

