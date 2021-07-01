package Day36_Encapsulation_Jun7;

public class MyPlanetMain {

        public static void main(String[] args) {

            MyPlanet halit = new MyPlanet();
            System.out.println(halit.getPlanet());
            System.out.println(halit.getSatellite());
            System.out.println(halit.getDaysInAYear());

            MyPlanet astronaut = new MyPlanet();

            astronaut.setPlanet("Mars");
            astronaut.setSatellite("Phobos");
            astronaut.setDaysInAYear(687);

            System.out.println(astronaut.getPlanet());
            System.out.println(astronaut.getSatellite());
            System.out.println(astronaut.getDaysInAYear());

        }

    }
