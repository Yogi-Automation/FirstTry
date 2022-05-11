public class Movie {
	String movieName;
	String actor;
	String actress;
	String director;
	double viewsRating;
	Movie(){
		this.movieName = movieName;
		this.actor = actor;
		this.actress = actress;
		this.director = director;
		this.viewsRating = viewsRating;
	}
	void favouriteMovie() {
		movieName = "Spider Man";
		actor = "Tobey Maguire";
		actress = "Krsten Dunst";
		director = "Sam";
		viewsRating = 7.6;
		System.out.println("Name of the movie : "+movieName);
		System.out.println("Name of the actor in the movie : "+actor);
		System.out.println("Name of the actress in the movie : "+actress);
		System.out.println("Name of the director : "+director);
		System.out.println("Viewer's rating out of 10 : "+viewsRating);
	}
	void favouriteMovie(String movieName,String actor,String actress,String director,double viewsRating) {
		System.out.println("Name of the movie :"+movieName);
		System.out.println("Name of the actor in the movie :"+actor);
		System.out.println("Name of the actress in the movie :"+actress);
		System.out.println("Name of the director :"+director);
		System.out.println("Viewer's rating out of 10 :"+viewsRating);
	}
	public static void main(String[] args) {		
		Movie favouriteMovie1 = new Movie();		// Object 1
			favouriteMovie1.favouriteMovie();
			System.out.println();
		Movie favourteMovie2 = new Movie();			// Object 2
			favourteMovie2.favouriteMovie("Avatar","Tommy","Neytiri","James",7.8);
			System.out.println();
		Movie favourteMovie3 = new Movie();			// Object 3
		favourteMovie3.favouriteMovie("Remo","Sivakarthikeyan","Kirthi suresh","Bakkiyaraj",5.6);
		System.out.println();
	}
}
