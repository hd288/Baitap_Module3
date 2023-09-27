package demo.ra;

import demo.ra.model.Mark;
import demo.ra.model.Student;
import demo.ra.model.Subject;
import demo.ra.service.MarkService;
import demo.ra.service.StudentService;
import demo.ra.service.SubjectService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SchoolManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        SubjectService subjectService = new SubjectService();
        MarkService markService = new MarkService();

        while (true) {
            System.out.println("************************SHOOL-MANAGEMENT*************************");
            System.out.println("1. Quản lý học sinh");
            System.out.println("2. Quản lý môn học");
            System.out.println("3. Quản lý điểm thi");
            System.out.println("4. Thoát");

            System.out.print("Chọn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentManagementMenu(scanner, studentService, markService);
                    break;
                case 2:
                    subjectManagementMenu(scanner, subjectService);
                    break;
                case 3:
                    markManagementMenu(scanner, markService, studentService, subjectService);
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void studentManagementMenu(Scanner scanner, StudentService studentService, MarkService markService) {
        while (true) {
            System.out.println("********************** STUDENT-MANAGEMENT ************************");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Hiển thị danh sách tất cả học sinh đã lưu trữ");
            System.out.println("3. Thay đổi thông tin học sinh theo mã id");
            System.out.println("4. Xóa học sinh theo mã id");
            System.out.println("5. Thoát");

            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự mới sau khi đọc số

            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.inputData();
                    studentService.addStudent(student);
                    System.out.println("Học sinh đã được thêm.");
                    break;
                case 2:
                    List<Student> allStudents = studentService.getAllStudents();
                    if (allStudents.isEmpty()) {
                        System.out.println("Không có học sinh nào được lưu trữ.");
                    } else {
                        System.out.println("Danh sách học sinh:");
                        for (Student s : allStudents) {
                            s.displayData();
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã học sinh cần sửa: ");
                    int studentIdToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Đọc ký tự mới sau khi đọc số
                    Student updatedStudent = new Student();
                    updatedStudent.inputData();
                    updatedStudent.setStudentId(studentIdToUpdate);
                    boolean updated = studentService.updateStudent(studentIdToUpdate, updatedStudent);
                    if (updated) {
                        System.out.println("Thông tin học sinh đã được cập nhật.");
                    } else {
                        System.out.println("Không tìm thấy học sinh với mã id tương ứng.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã học sinh cần xóa: ");
                    int studentIdToDelete = scanner.nextInt();
                    boolean deleted = studentService.deleteStudent(studentIdToDelete);
                    if (deleted) {
                        System.out.println("Học sinh đã được xóa.");
                    } else {
                        System.out.println("Không tìm thấy học sinh với mã id tương ứng hoặc học sinh có điểm thi.");
                    }
                    break;
                case 5:
                    return; // Quay lại menu chính
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void subjectManagementMenu(Scanner scanner, SubjectService subjectService) {
        while (true) {
            System.out.println("**********************SUBJECT-MANAGEMENT************************");
            System.out.println("1. Thêm mới môn học");
            System.out.println("2. Hiển thị danh sách tất cả môn học đã lưu trữ");
            System.out.println("3. Thay đổi thông tin môn học theo mã id");
            System.out.println("4. Xóa môn học theo mã id");
            System.out.println("5. Thoát");

            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự mới sau khi đọc số

            switch (choice) {
                case 1:
                    Subject subject = new Subject();
                    subject.inputData();
                    subjectService.addSubject(subject);
                    System.out.println("Môn học đã được thêm.");
                    break;
                case 2:
                    List<Subject> allSubjects = subjectService.getAllSubjects();
                    if (allSubjects.isEmpty()) {
                        System.out.println("Không có môn học nào được lưu trữ.");
                    } else {
                        System.out.println("Danh sách môn học:");
                        for (Subject s : allSubjects) {
                            s.displayData();
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã môn học cần sửa: ");
                    String subjectIdToUpdate = scanner.nextLine();
                    Subject updatedSubject = new Subject();
                    updatedSubject.inputData();
                    boolean updated = subjectService.updateSubject(subjectIdToUpdate, updatedSubject);
                    if (updated) {
                        System.out.println("Thông tin môn học đã được cập nhật.");
                    } else {
                        System.out.println("Không tìm thấy môn học với mã id tương ứng.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã môn học cần xóa: ");
                    String subjectIdToDelete = scanner.nextLine();
                    boolean deleted = subjectService.deleteSubject(subjectIdToDelete);
                    if (deleted) {
                        System.out.println("Môn học đã được xóa.");
                    } else {
                        System.out.println("Không tìm thấy môn học với mã id tương ứng hoặc môn học có điểm thi.");
                    }
                    break;
                case 5:
                    return; // Quay lại menu chính
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void markManagementMenu(Scanner scanner, MarkService markService, StudentService studentService, SubjectService subjectService) {
        while (true) {
            System.out.println("*********************MARK-MANAGEMENT************************");
            System.out.println("1. Thêm mới điểm thi cho 1 sinh viên");
            System.out.println("2. Hiển thị danh sách tất cả điểm thi theo thứ tự điểm tăng dần");
            System.out.println("3. Thay đổi điểm theo mã id");
            System.out.println("4. Xóa điểm theo mã id");
            System.out.println("5. Hiển thị danh sách điểm thi theo mã môn học");
            System.out.println("6. Hiển thị đánh giá học lực của từng học sinh theo mã môn học");
            System.out.println("7. Thoát");

            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự mới sau khi đọc số

            switch (choice) {
                case 1:
                    Mark mark = new Mark();
                    mark.inputData();
                    markService.addMark(mark);
                    System.out.println("Điểm thi đã được thêm.");
                    break;
                case 2:
                    List<Mark> allMarks = markService.getAllMarks();
                    if (allMarks.isEmpty()) {
                        System.out.println("Không có điểm thi nào được lưu trữ.");
                    } else {
                        // Sắp xếp danh sách điểm tăng dần
                        Collections.sort(allMarks, new Comparator<Mark>() {
                            @Override
                            public int compare(Mark mark1, Mark mark2) {
                                return Double.compare(mark1.getPoint(), mark2.getPoint());
                            }
                        });

                        System.out.println("Danh sách điểm thi (tăng dần):");
                        for (Mark m : allMarks) {
                            m.displayData();
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã điểm thi cần sửa: ");
                    int markIdToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Đọc ký tự mới sau khi đọc số
                    Mark updatedMark = new Mark();
                    updatedMark.inputData();
                    updatedMark.setMarkId(markIdToUpdate);
                    boolean updated = markService.updateMark(markIdToUpdate, updatedMark);
                    if (updated) {
                        System.out.println("Thông tin điểm thi đã được cập nhật.");
                    } else {
                        System.out.println("Không tìm thấy điểm thi với mã id tương ứng.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã điểm thi cần xóa: ");
                    int markIdToDelete = scanner.nextInt();
                    boolean deleted = markService.deleteMark(markIdToDelete);
                    if (deleted) {
                        System.out.println("Điểm thi đã được xóa.");
                    } else {
                        System.out.println("Không tìm thấy điểm thi với mã id tương ứng.");
                    }
                    break;
                case 5:
                    // Thêm chức năng hiển thị danh sách điểm thi theo mã môn học ở đây
                    break;
                case 6:
                    // Thêm chức năng hiển thị đánh giá học lực ở đây
                    break;
                case 7:
                    return; // Quay lại menu chính
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

}

