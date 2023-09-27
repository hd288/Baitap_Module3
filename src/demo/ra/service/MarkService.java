package demo.ra.service;

import demo.ra.model.Mark;

import java.util.ArrayList;
import java.util.List;

public class MarkService {
    private final List<Mark> markList = new ArrayList<>();
    private final List<StudentService> studentServiceList = new ArrayList<>();
    private int nextMarkId = 1; // Mã điểm tự động tăng

    // Thêm điểm thi
    public void addMark(Mark mark) {
        mark.setMarkId(nextMarkId++);
        markList.add(mark);
    }

    // Sửa điểm thi theo ID
    public boolean updateMark(int markId, Mark updatedMark) {
        for (int i = 0; i < markList.size(); i++) {
            if (markList.get(i).getMarkId() == markId) {
                markList.set(i, updatedMark);
                return true;
            }
        }
        return false; // Không tìm thấy điểm thi với ID tương ứng
    }

    // Xóa điểm thi theo ID
    public boolean deleteMark(int markId) {
        for (Mark mark : markList) {
            if (mark.getMarkId() == markId) {
                markList.remove(mark);
                return true;
            }
        }
        return false; // Không tìm thấy điểm thi với ID tương ứng
    }

    // Tìm kiếm điểm thi theo mã học sinh
    public List<Mark> searchMarksByStudentId(int studentId) {
        List<Mark> results = new ArrayList<>();
        for (Mark mark : markList) {
            if (mark.getStudent().getStudentId() == studentId) {
                results.add(mark);
            }
        }
        return results;
    }

    // Lấy danh sách tất cả điểm thi
    public List<Mark> getAllMarks() {
        return markList;
    }
}

