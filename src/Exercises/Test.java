package Exercises;

public class Test {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {

            //y = x - y;              //0 0; 1 1; 2 1; 3 2; 4 2

            //y = y + x;              //0 0; 1 1; 2 3; 3 6; 4 10

//            y = y + 2;              //0 2; 1 4; 2 5; 3 6; 4 7
//            if (y > 4) {
//                y--;
//            }
//
//            x++;                    //1 1; 3 4; 5 9
//            y += x;
//
            if (y < 5) {              //0 2; 1 4; 3 6; 4 8
                x++;
                if (y < 3) {
                    x--;
                }
            }
            y += 2;

            System.out.println(x + " " + y + " ");
            x++;
        }
    }
}

