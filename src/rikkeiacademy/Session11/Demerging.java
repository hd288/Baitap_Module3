package rikkeiacademy.Session11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class NhanSu {
    String hoTen;
    String gioiTinh;
    String ngayThangNamSinh;

    public NhanSu(String hoTen, String gioiTinh, String ngayThangNamSinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngayThangNamSinh = ngayThangNamSinh;
    }
}

public class Demerging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<NhanSu> nuQueue = new LinkedList<>();
        Queue<NhanSu> namQueue = new LinkedList<>();

        System.out.println("Nhập thông tin nhân sự (nhập 'exit' để kết thúc):");
        while (true) {
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            if ("exit".equalsIgnoreCase(hoTen)) {
                break;
            }

            System.out.print("Giới tính (Nam/Nu): ");
            String gioiTinh = scanner.nextLine();

            System.out.print("Ngày tháng năm sinh (dd/mm/yyyy): ");
            String ngayThangNamSinh = scanner.nextLine();

            NhanSu nhanSu = new NhanSu(hoTen, gioiTinh, ngayThangNamSinh);
            if ("Nu".equalsIgnoreCase(gioiTinh)) {
                nuQueue.add(nhanSu);
            } else if ("Nam".equalsIgnoreCase(gioiTinh)) {
                namQueue.add(nhanSu);
            }
        }

        // In danh sách nữ trước, sau đó in danh sách nam
        System.out.println("Danh sách nhân sự sau khi tổ chức lại:");
        System.out.println("Nữ:");
        while (!nuQueue.isEmpty()) {
            NhanSu nhanSu = nuQueue.poll();
            System.out.println(nhanSu.hoTen + "," + nhanSu.gioiTinh + "," + nhanSu.ngayThangNamSinh);
        }

        System.out.println("Nam:");
        while (!namQueue.isEmpty()) {
            NhanSu nhanSu = namQueue.poll();
            System.out.println(nhanSu.hoTen + "," + nhanSu.gioiTinh + "," + nhanSu.ngayThangNamSinh);
        }

        scanner.close();
    }
}

