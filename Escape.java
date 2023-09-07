package ru.mirea.lab1;
import java.util.Scanner;
public class Escape {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] b = new int[10];
        double sum = 0;
        int i = 0;
        do{
            b[i] = sc.nextInt();
            sum = sum + b[i];
            i++;
        }while(i<5);
        int max = b[0];
        int min = b[0];
        i = 0;
        do {
            if (b[i] > max) {
                max = b[i];
            }
            if (b[i] < min) {
                min = b[i];
            }
            i++;
        } while (i < 5);
        System.out.println(sum);
        System.out.println(+min);
        System.out.println(+max);
    }
}
