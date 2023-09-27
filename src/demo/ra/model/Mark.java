package demo.ra.model;

import demo.ra.service.StudentService;
import demo.ra.service.SubjectService;

import java.util.Scanner;

public class Mark {
    private int markId;
    private Student student;
    private Subject subject;
    private double point;

    private SubjectService subjectService;

    private StudentService studentService;

    public Mark(StudentService studentService) {
        this.studentService = studentService;
    }

    // Constructor
    public Mark(int markId, Student student, Subject subject, double point) {
        this.markId = markId;
        this.student = student;
        this.subject = subject;
        this.point = point;
    }

    public Mark() {

    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    // Getter and Setter

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        // Nhập thông tin học sinh (ID) và môn học (ID)
        System.out.print("Nhập mã học sinh: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

// Gán đối tượng Student lấy từ Service
        this.student = new Student();
        if (student.getStudentId() == studentId) {
            return;
        } else {
            System.out.println("Mời nhập thông tin học sinh: ");
            student.inputData();
        }

        System.out.print("Nhập mã môn học: ");
        String subjectId = scanner.nextLine();

// Gán đối tượng Subject lấy từ Service
        this.subject = new Subject();
        if (subject.getSubjectId() != null && subject.getSubjectId().equalsIgnoreCase(subjectId)) {
            return;
        } else {
            System.out.println("Mời nhập thông tin môn học: ");
            subject.inputData();
        }

        // Nhập điểm số
        System.out.print("Nhập điểm số (từ 0 đến 10): ");
        double score = scanner.nextDouble();
        while (score < 0 || score > 10) {
            System.out.println("Điểm số không hợp lệ. Vui lòng nhập lại.");
            System.out.print("Nhập điểm số (từ 0 đến 10): ");
            score = scanner.nextDouble();
        }
        this.point = score;
    }

    public void displayData() {
        System.out.println("Thông tin điểm số:");
        System.out.println("Mã điểm: " + markId);
        System.out.println("Tên học sinh: " + student.getStudentName());
        System.out.println("Tên môn học: " + subject.getSubjectName());
        System.out.println("Điểm số: " + point);
    }
}

