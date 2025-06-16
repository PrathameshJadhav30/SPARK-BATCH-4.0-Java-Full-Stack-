public class Movie {
    String name;
    int duration; // in Minutes

    Movie(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    public void displayMovie(){
        System.out.println("Movie: " + name + " , Duration: " + duration + " Mins.");
    }

    public static void main(String[] args) {
        Movie m = new Movie("Ved", 149);
        m.displayMovie();
    }
}
