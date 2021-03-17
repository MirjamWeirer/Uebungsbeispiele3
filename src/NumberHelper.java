import java.util.Arrays;

public class NumberHelper {
    public static void main(String[] args) {
       /*
            Erstellen Sie eine neue Klasse namens NumberHelper. Legen Sie in dieser Klasse eine
            statische Methode an.

            Die Methode soll die Ganzzahlen aus dem 2d-Array (enthält nur positive Zahlen)
            in einem flachen, eindimensionalen Array abbilden.
            Beispiel:
            Input                     Output
            [[0, 1, 9], [6, 3, 2]] => [0, 1, 9, 6, 3, 2][3 Punkte]
            Erweitern Sie dieses Beispiel, sodass jede Zahl nur maximal einmal vorkommen
            soll, dh. doppelte Zahlen sind auszusortieren. Initialisieren Sie das Rückgabe-Array zuerst mit
            „-1“ Werten, sodass Sie später erkennen, wenn einzelne Plätze nicht belegt wurden.
            Beispiel:
            Input                       Output
            [[3, 5, 8], [4, 5, 6]] => [3, 5, 8, 4, 6, -1]
            (die doppelte 5 wurde aussortiert, der letzte Platz bleibt somit leer und beinhaltet folglich den Initialwert -1)
        */

        int[][] arr = {{0,1,9},{6,3,2}};
        int[][] arr2 = {{3,5,8},{4,5,6}};
        System.out.println(Arrays.toString(arr[0])); //mit dieser Zeile wird der erst Teil des Strings arr augeben
        System.out.println(Arrays.toString(arr[1])); //mit dieser Zeile wird der zweite Teil des Strings arr augeben


        System.out.println(Arrays.toString(getFlatArray(arr)));
        System.out.println(Arrays.toString(getFlatArray(arr2)));
    }

    public static int[] getFlatArray(int[][] numbers){
        int[] result = new int[numbers[0].length * numbers.length];
        int counter = 0;
        for (int i = 0; i < result.length ; i++) {
            result[i] = -1;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++){
                if (!checkDuplicate(result, numbers[i][j])){
                    result[counter] = numbers[i][j];
                    counter++;
                }
            }
        }

        return result;
    }

    public static boolean checkDuplicate(int [] arr, int value){
        for (int element:arr) {
            if (element == value){
                return true;
            }
        }
        return false;
    }

}
