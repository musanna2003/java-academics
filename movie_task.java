import java.util.Scanner;

public class movie_task {
    public static class Movie {
        private static int TotalMovie = 0;

        private String title;
        private String director;
        private int year;

        public Movie() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter movie title: ");
            this.title = sc.nextLine();

            System.out.print("Enter director: ");
            this.director = sc.nextLine();

            System.out.print("Enter release year: ");
            this.year = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            TotalMovie++; // increase total movies created
        }

        public void displayMovieDetails() {
            System.out.println("Title: " + title);
            System.out.println("Director: " + director);
            System.out.println("Year: " + year);
        }

        public static int getTotalMovie() {
            return TotalMovie;
        }
    }

    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.displayMovieDetails();
        System.out.println("Total Movies: " + Movie.getTotalMovie());
        System.out.println();

        Movie m2 = new Movie();
        m2.displayMovieDetails();
        System.out.println("Total Movies: " + Movie.getTotalMovie());
        System.out.println();
    }
}
