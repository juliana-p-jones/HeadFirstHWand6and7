package javaheadfirst2through4.moviedemo;

public class Movie {
    //instance variables
    public String title;
    public String genre;
    public double rating;

    //Getter
    public String getTitle(){
        return title;
    }
    //Setter
    public void setTitle(String title){
        this.title = title;
    }
    //Getter & Setter
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    //Getter & Setter
    public double getRating(){
        return rating;
    }
    //Setter
    public void setRating(double rating){
        this.rating = rating;
    }

/*    public Movie(){
        this(title, genre, rating);
    }*/
    //constructor
    public Movie(String title, String genre, double rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public void playIt(){System.out.println("Title: " + this.title + '\n' + " Genre: " + this.genre + '\n' + " Rating: " + this.rating);}


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
