package SharpenThePencil;

public class Movie {

    String title;
    String genre;
    int rating;

    void playIt() {

        System.out.println("Проигрывание фильма");

    }

    void info() {

        System.out.println("Название: " + title);
        System.out.println("Жанр: " + genre);
        System.out.println("Рейтинг: " + rating);
        System.out.println();

    }
}

class MovieTestDrive {

    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как Прогореть на Акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Потерянные в Офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Байт-Клуб";
        three.genre = "Трагедия, но в целом веселая";
        three.rating = 127;

        one.info();
        two.info();
        three.info();

    }
}

