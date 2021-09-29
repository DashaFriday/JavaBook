package Exercises;

public class LittleX {

    public static void main(String[] args) {

        int x = 5;

        while (x > 1) {
            x = x - 1;

            if (x < 3) {
                System.out.println("Little X!");
            }
        }
    }
}

class Exerciselb1 {

    public static void main(String[] args) {

        int x = 1;

        while (x < 10) {

            if (x > 3) {
                System.out.println("большой икс");
            }
            x++; //X hasn't changed, the cycle is infinitive
        }
    }
}

class Exerciselb2 {

    public static void main(String[] args) { //main was missing

        int x = 5;

        while (x > 1) {
            x = x - 1;

            if (x < 3) {
                System.out.println("маленький икс");
            }
        }
    }
}