public class Planet {
    String name;
    double avgTemp;

    Planet(){
        name = "Earth";
        avgTemp = 15.0; //in Celsius
    }

    public void showPlanet(){
        System.out.println("Planet: " + name);
        System.out.println("Average Temp: "+ avgTemp );
    }

    public static void main(String[] args) {
        Planet p = new Planet();
        p.showPlanet();
    }
}
