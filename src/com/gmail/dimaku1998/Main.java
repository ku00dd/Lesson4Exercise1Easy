/*1) Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета
нечетных цифр в нем.
*/
package com.gmail.dimaku1998;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 5, 2, 4, 7, 1, 3, 19};
        byte count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                count++;
                System.out.print(array[i]+" ");
            }
        }
        System.out.println("\nodd number is : "+count);
    }
}
