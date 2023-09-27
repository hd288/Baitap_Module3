package demo.ra.model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Subject {
    private String subjectId;
    private String subjectName;

    // Constructor

    public Subject(String subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public Subject() {

    }

    // Getter and Setter

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        // Nhập mã môn học
        System.out.print("Nhập mã môn học (MHxxx, ví dụ: MH001): ");
        String id = scanner.nextLine();
        while (!isValidSubjectId(id)) {
            System.out.println("Mã môn học không hợp lệ. Vui lòng nhập lại.");
            System.out.print("Nhập mã môn học: ");
            id = scanner.nextLine();
        }
        this.subjectId = id;

        // Nhập tên môn học
        System.out.print("Nhập tên môn học: ");
        String name = scanner.nextLine();
        while (name.isEmpty()) {
            System.out.println("Tên môn học không được để trống. Vui lòng nhập lại.");
            System.out.print("Nhập tên môn học: ");
            name = scanner.nextLine();
        }
        this.subjectName = name;
    }

    public void displayData() {
        System.out.println("Thông tin môn học:");
        System.out.println("Mã môn học: " + subjectId);
        System.out.println("Tên môn học: " + subjectName);
    }

    // Hàm kiểm tra mã môn học hợp lệ
    private boolean isValidSubjectId(String subjectId) {
        // Mã môn học phải bắt đầu bằng "MH" và theo sau bởi 3 chữ số
        String regex = "MH[0-9]{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(subjectId);
        return matcher.matches();
    }
}

