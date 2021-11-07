package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Если вы хотите посчитать произведение чисел, нажмине (1)");
        System.out.println("Если вы хотите сделать другую опперацию, нажмите (2)");

        System.out.println(in);
        if (in.hasNextInt()) {
            int numder = in.nextInt();

            if (numder == 2) {
                System.out.println("извините, мы только считаем произведения чисел");
            }

            if (numder == 1) {
                Math multiplication = new Math();
                System.out.println("введите два числа : ");
                multiplication.setAnswer(in.nextInt(), in.nextInt());
                int a1 = multiplication.treatment();
                multiplication.speak();
            }
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!"); // и сновва сканер запускается сам
        }
    }
}
class Math {
    int numb1;
    int numb2;
    int answer;

    void setAnswer(int numb1, int numb2) {
        this.numb1 = numb1;
        this.numb2 = numb2;
    }

    int treatment() {
        answer = numb1 * numb2;
        return answer;
    }

    void speak() {
        System.out.println("произведение числе " + numb1 + " и " + numb2 + " равняется " + treatment());
    }

}
