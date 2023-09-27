package demo.ra.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private static int nextStudentId = 1;
    private int studentId;
    private String studentName;
    private Date birthDay;
    private String address;
    private boolean gender;

    // Constructor
    private String phone;

    public Student(String studentName, Date birthDay, String address, boolean gender, String phone) {
        this.studentId = getNextStudentId();
        this.studentName = studentName;
        this.birthDay = birthDay;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    public Student() {
    }

    private static int getNextStudentId() {
        return nextStudentId++;
    }

    public int getStudentId() {
        return studentId;
    }


    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
// Getter and Setter

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên học sinh
        System.out.print("Nhập tên học sinh: ");
        String name = scanner.nextLine();
        while (name.isEmpty()) {
            System.out.println("Tên không được để trống. Vui lòng nhập lại.");
            System.out.print("Nhập tên học sinh: ");
            name = scanner.nextLine();
        }
        this.studentName = name;

        // Nhập ngày sinh
        boolean isValidDate = false;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        do {
            System.out.print("Nhập ngày sinh (yyyy-MM-dd): ");
            String dobString = scanner.nextLine();
            try {
                Date dob = dateFormat.parse(dobString);
                this.birthDay = dob;
                isValidDate = true;
            } catch (ParseException e) {
                System.out.println("Ngày sinh không hợp lệ. Vui lòng nhập lại theo định dạng yyyy-MM-dd.");
            }
        } while (!isValidDate);

        // Nhập địa chỉ
        System.out.print("Nhập địa chỉ: ");
        String addr = scanner.nextLine();
        while (addr.isEmpty()) {
            System.out.println("Địa chỉ không được để trống. Vui lòng nhập lại.");
            System.out.print("Nhập địa chỉ: ");
            addr = scanner.nextLine();
        }
        this.address = addr;

        // Nhập giới tính
        System.out.print("Nhập giới tính (Nam/Nữ): ");
        String genderStr = scanner.nextLine();
        this.gender = genderStr.equalsIgnoreCase("Nam");

        // Nhập số điện thoại
        boolean isValidPhone = false;
        do {
            System.out.print("Nhập số điện thoại (10 hoặc 11 số, bắt đầu bằng số 0, không trùng lặp): ");
            String phoneNum = scanner.nextLine();
            if (isValidPhoneNumber(phoneNum)) {
                this.phone = phoneNum;
                isValidPhone = true;
            } else {
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!isValidPhone);
    }

    // Hàm kiểm tra số điện thoại hợp lệ
    private boolean isValidPhoneNumber(String phone) {
        String regex = "0[0-9]{9,10}"; // Số điện thoại bắt đầu bằng 0, có 10 hoặc 11 số
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public void displayData() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Thông tin học sinh:");
        System.out.println("Mã học sinh: " + studentId);
        System.out.println("Tên học sinh: " + studentName);
        System.out.println("Ngày sinh: " + dateFormat.format(birthDay));
        System.out.println("Địa chỉ: " + address);
        System.out.println("Giới tính: " + (gender ? "Nam" : "Nữ"));
        System.out.println("Số điện thoại: " + phone);
    }
}

