package rikkeiacademy.Session14.entity;

public class Student {
    private int studentId;
    private String name;
    private Double score;


    public Student(int studentId, String name, double score) {
        this.studentId = studentId;
        this.name = name;
        this.score = score;
    }

    public static Student[] selectionSort(Student[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getScore() > arr[j].getScore()) {
                    swapElement(arr, i, j);
                }
            }
        }

        return arr;
    }

    public static Student[] bubbleSort(Student[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[i].getScore() > arr[j].getScore()) {
                    swapElement(arr, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    public static Student[] insertionSort(Student[] arr) {
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getScore() < key.getScore()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }

        return arr;
    }

    static <T> void swapElement(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
