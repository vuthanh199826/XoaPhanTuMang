package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("nhap phan tu can tim vao day");
        int num = sc.nextInt();
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                index = i;
            }
        }

        for (int i = index; i < array.length-1; i++) {
            array[i]=array[i+1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
