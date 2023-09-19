package rikkeiacademy.Session06.TrenLop.student;

import java.util.Scanner;

public class StudentImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int numStudents = 0;
        Student[] arrStudent = new Student[100];


        do {
            System.out.println("**********************MENU**********************");
            System.out.println("1. Nhập vào thông tin n sinh viên (n nhập từ bàn phím)");
            System.out.println("2. Tính điểm trung bình tất cả sinh viên");
            System.out.println("3. Hiển thị thông tin tất cả sinh viên");
            System.out.println("4. Sắp xếp sinh viên theo điểm trung bình giảm dần");
            System.out.println("5. Tìm kiếm sinh viên theo tên sinh viên");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    numStudents = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numStudents; i++) {
                        System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
                        arrStudent[i] = new Student();
                        arrStudent[i].inputData();
                    }
                    break;
                case 2:
                    for (int i = 0; i < numStudents; i++) {
                        arrStudent[i].calAvgScore();
                    }
                    System.out.println("Đã tính điểm trung bình cho tất cả sinh viên.");
                    break;
                case 3:
                    for (int i = 0; i < numStudents; i++) {
                        System.out.println("Thông tin sinh viên thứ " + (i + 1) + ":");
                        arrStudent[i].displayData();
                        System.out.println("----------------------------------------------");
                    }
                    break;
                case 4:
                    for (Student student :
                            arrStudent) {
                        if (student != null) {
                            student.calAvgScore();
                        }
                    }
                    for (int i = 0; i < numStudents - 1; i++) {
                        for (int j = 0; j < numStudents - i - 1; j++) {
                            if (arrStudent[j].avgScore < arrStudent[j + 1].avgScore) {
                                Student temp = arrStudent[j];
                                arrStudent[j] = arrStudent[j + 1];
                                arrStudent[j + 1] = temp;
                            }
                        }
                    }
                    for (Student student : arrStudent) {
                        if (student != null) {
                            System.out.println(student.getStudentName());
                        }
                    }
                    break;
                case 5:
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Nhập tên sinh viên cần tìm kiếm: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < numStudents; i++) {
                        if (arrStudent[i].getStudentName().contains(searchName)) {
                            System.out.println("Thông tin sinh viên có tên \"" + searchName + "\":");
                            arrStudent[i].displayData();
                            System.out.println("----------------------------------------------");
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy sinh viên có tên \"" + searchName + "\".");
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 6);
    }
}