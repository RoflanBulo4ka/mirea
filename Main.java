package ru.mirea.lab1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] b = new int[10];
        double sum = 0;
        if(sc.hasNextInt()){
            for (int i = 0; i < 10; i++){
                b[i] = sc.nextInt();
                sum = sum + b[i];
            }
            System.out.println(sum);
            System.out.println(sum/2);
        }
    }
}

