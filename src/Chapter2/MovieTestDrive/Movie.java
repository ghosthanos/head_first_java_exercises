package Chapter2.MovieTestDrive;

class Movie {
    String title;
    String genre;
    double rating;

    void playIt() {
        System.out.println("Playing " + title + "\n" + "genre: " + genre + "\n" + "rating of: " + rating);
    }

    Movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }
}
