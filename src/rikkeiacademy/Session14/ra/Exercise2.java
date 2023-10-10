package rikkeiacademy.Session14.ra;

import rikkeiacademy.Session14.entity.Student;

public class Exercise2 {
    public static void main(String[] args) {
        Student[] arrayList = new Student[3];
        int id = 1;

        arrayList[0] = new Student(id++, "Nam", 90);
        arrayList[1] = new Student(id++, "Hoa", 70);
        arrayList[2] = new Student(id++, "Mây", 80);

        Student.selectionSort(arrayList);

        for (int i = 0; i < 3; i++) {
            System.out.println(arrayList[i].getName() + " - " + arrayList[i].getScore());
        }
    }


}
