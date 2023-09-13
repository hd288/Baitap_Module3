package rikkei.academy.Session01;

import java.util.Scanner;

public class Sess1_2 {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số tiền USD: ");
        int moneyUsd = scanner.nextInt();
        System.out.println("Số tiền việt là :" +moneyUsd*rate);
    }
}
