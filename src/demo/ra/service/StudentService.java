package demo.ra.service;

import demo.ra.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private final List<Student> studentList = new ArrayList<>();
    private int nextStudentId = 1; // Mã học sinh tự động tăng

    public List<Student> getStudentList() {
        return studentList;
    }

    // Thêm học sinh
    public void addStudent(Student student) {
        student.setStudentId(nextStudentId++);
        studentList.add(student);
    }

    // Sửa thông tin học sinh theo ID
    public boolean updateStudent(int studentId, Student updatedStudent) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == studentId) {
                studentList.set(i, updatedStudent);
                return true;
            }
        }
        return false; // Không tìm thấy học sinh với ID tương ứng
    }

    // Xóa học sinh theo ID
    public boolean deleteStudent(int studentId) {
        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                studentList.remove(student);
                return true;
            }
        }
        return false; // Không tìm thấy học sinh với ID tương ứng
    }

    // Tìm kiếm học sinh theo tên
    public List<Student> searchStudentsByName(String name) {
        List<Student> results = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getStudentName().equalsIgnoreCase(name)) {
                results.add(student);
            }
        }
        return results;
    }

    public Student getStudentById(int studentId) {
        for (Student student :
                studentList) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    // Lấy danh sách tất cả học sinh
    public List<Student> getAllStudents() {
        return studentList;
    }
}

