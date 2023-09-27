package demo.ra.service;

import demo.ra.model.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectService {
    private final List<Subject> subjectList = new ArrayList<>();

    // Thêm môn học
    public void addSubject(Subject subject) {
        subjectList.add(subject);
    }

    // Sửa thông tin môn học theo ID
    public boolean updateSubject(String subjectId, Subject updatedSubject) {
        for (int i = 0; i < subjectList.size(); i++) {
            if (subjectList.get(i).getSubjectId().equals(subjectId)) {
                subjectList.set(i, updatedSubject);
                return true;
            }
        }
        return false; // Không tìm thấy môn học với ID tương ứng
    }

    // Xóa môn học theo ID
    public boolean deleteSubject(String subjectId) {
        for (Subject subject : subjectList) {
            if (subject.getSubjectId().equals(subjectId)) {
                subjectList.remove(subject);
                return true;
            }
        }
        return false; // Không tìm thấy môn học với ID tương ứng
    }

    // Tìm kiếm môn học theo tên
    public List<Subject> searchSubjectsByName(String name) {
        List<Subject> results = new ArrayList<>();
        for (Subject subject : subjectList) {
            if (subject.getSubjectName().equalsIgnoreCase(name)) {
                results.add(subject);
            }
        }
        return results;
    }

    // Lấy danh sách tất cả môn học
    public List<Subject> getAllSubjects() {
        return subjectList;
    }

    public Subject getSubjectById(String subjectID) {
        for (Subject subject :
                subjectList) {
            if (subject.getSubjectId().equals(subjectID)) {
                return subject;
            }
        }
        return null;
    }
}

