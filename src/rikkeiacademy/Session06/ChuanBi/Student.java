package rikkeiacademy.Session06.ChuanBi;

public class Student {
    private int studentID;
    private String studentName;
    private boolean sex;
    private String className;

    private int age;
    private String address;

    public Student(int studentID, String studentName, boolean sex, String className, int age, String address) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public Student() {
    }

    public static void main(String[] args) {
        Student student1 = new Student(113, "ben", false, "JV230615", 23, "69TQD");
        student1.display();
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display() {
        System.out.println("mã số sinh viên là: " + studentID);
        System.out.println("tên sinh viên là: " + studentName);
        System.out.println("giới tình sinh viên: " + sex);
        System.out.println("Lớp học: " + className);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
    }
}
