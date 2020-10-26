public class MovieInfo {
   String title;
   String genre;
   String leadActor;
   MovieInfo(String t, String g, String a) {
      title = t; genre = g; leadActor = a;
   }
   public String toString() {
      return title + " " + genre + " " + leadActor + "\n";
   }
   // getters and setters go here
}
