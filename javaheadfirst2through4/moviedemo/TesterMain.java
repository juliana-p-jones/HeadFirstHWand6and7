package javaheadfirst2through4.moviedemo;

public class TesterMain {
    public static void main(String[] args) {

    Movie movie1 = new Movie("Gone with the Stock","Tragic", -2.0d);
    Movie movie2 = new Movie("Lost in Cubicle Space", "Comedy" ,5.0d);
    Movie movie3 = new Movie("Byte CLub", "Tragic but ultimately uplifting", 127.0d);
        movie1.playIt();
    }
}
