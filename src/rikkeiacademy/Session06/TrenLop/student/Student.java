package rikkeiacademy.Session06.TrenLop.student;

import java.util.Scanner;

class Student {
    String studentName;
    float avgScore;
    private int studentId;
    private int age;
    private boolean sex;
    private float htmlScore;
    private float cssScore;
    private float javascriptScore;

    public Student() {
        // Default constructor
    }

    public Student(String studentId, String studentName, int age, boolean sex, float htmlScore, float cssScore, float javascriptScore) {
        this.studentId = Integer.parseInt(studentId);
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
        this.javascriptScore = javascriptScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getHtmlScore() {
        return htmlScore;
    }

    public void setHtmlScore(float htmlScore) {
        this.htmlScore = htmlScore;
    }

    public float getCssScore() {
        return cssScore;
    }

    public void setCssScore(float cssScore) {
        this.cssScore = cssScore;
    }

    public float getJavascriptScore() {
        return javascriptScore;
    }

    public void setJavascriptScore(float javascriptScore) {
        this.javascriptScore = javascriptScore;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        studentId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter student name: ");
        studentName = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        System.out.print("Enter sex (true for male, false for female): ");
        sex = scanner.nextBoolean();
        System.out.print("Enter HTML score: ");
        htmlScore = scanner.nextFloat();
        System.out.print("Enter CSS score: ");
        cssScore = scanner.nextFloat();
        System.out.print("Enter Javascript score: ");
        javascriptScore = scanner.nextFloat();
    }

    public void displayData() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + (sex ? "Male" : "Female"));
        System.out.println("HTML score: " + htmlScore);
        System.out.println("CSS score: " + cssScore);
        System.out.println("Javascript score: " + javascriptScore);
        System.out.println("Average score: " + avgScore);
    }

    public void calAvgScore() {
        avgScore = (htmlScore + cssScore + javascriptScore) / 3;
    }
}
