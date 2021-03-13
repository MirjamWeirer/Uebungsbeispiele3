public class Straßenbahnapp {
    public static void main(String[] args) {
        ziel(3,true,10);
        ziel(4,false,0);
        ziel(1,true,5);
        ziel(6,false,0);

    }
    public static void ziel(int station, boolean problem, int dauer){
        if (problem == true){
            switch (station){
                case 1:
                    System.out.println("20 + " +dauer + " Verspätung durch Problem Minuten zum Ziel");
                    break;
                case 2:
                    System.out.println("16 + " +dauer + "Verspätung durch Problem Minuten zum Ziel");
                    break;
                case 3:
                    System.out.println("15 + " +dauer + "Verspätung durch Problem Minuten zum Ziel");
                    break;
                case 4:
                    System.out.println("10 + " +dauer + "Verspätung durch Problem Minuten zum Ziel");
                    break;
                case 5:
                    System.out.println("3 + " +dauer + "Verspätung durch Problem Minuten zum Ziel");
                    break;
                case 6:
                    System.out.println("Du bist am Ziel");
                    break;
                default:
                    System.out.println("Parameter (Station) falsch");
            }
        }else {
                switch (station){
                    case 1:
                        System.out.println(station + " noch 20 Minuten zum Ziel");
                        break;
                    case 2:
                        System.out.println(station + " noch 16 Minuten zum Ziel");
                        break;
                    case 3:
                        System.out.println(station + " noch 15 Minuten zum Ziel");
                        break;
                    case 4:
                        System.out.println(station + " noch 10 Minuten zum Ziel");
                        break;
                    case 5:
                        System.out.println(station + " noch 3 Minuten zum Ziel");
                        break;
                    case 6:
                        System.out.println(station + " du bist am Ziel");
                        break;
                    default:
                        System.out.println("Parameter (Station) falsch");
                }
            }
    }
}
