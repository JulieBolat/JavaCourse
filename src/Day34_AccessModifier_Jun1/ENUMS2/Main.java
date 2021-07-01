package Day34_AccessModifier_Jun1.ENUMS2;

public class Main {

        public static void main(String[] args) {

            WaterLevel boiler = new WaterLevel(Level.Low);

            if (boiler.getLevel() == Level.High){
                System.out.println("Water level is high");
            }

            switch (boiler.getLevel()){
                case Low:
                    System.out.println("Water level is Low!");
                    break;
                case Medium:
                    System.out.println("Water level is Medium!");
                    System.out.println("That's good!");
                    break;
                case High:
                    System.out.println("Warning!");
                    System.out.println("Water level is High!");
                    break;
                default:
                    System.out.println("The level is not recognized!");
            }


        }

    }

