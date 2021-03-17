import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        /*Die Methode soll die Ganzzahlen im Array in eine aufsteigende Reihenfolge bringen.  Programmieren Sie diese Funktionalität mit folgendem einfachen Verfahren:

          1) Durchlaufen Sie das Array elementweise von links nach rechts.

          2) Vergleichen Sie dabei in jedem Schritt das aktuelle Element mit dem unmittelbar
             nachfolgenden Element (= “mit seinem rechten Nachbar”)
                a. Sofern das aktuelle Element größer ist als sein rechter Nachbar müssen Sie die
                beiden Elemente im Array vertauschen.

          3) Wiederholen Sie den gesamten Vorgang (Schritte 1+2) solange, bis Sie feststellen,
             dass keine Vertauschung mehr nötig war.

            Haben Sie alles richtig gemacht, beinhaltet das Array am Ende die Ganzzahlen in aufsteigender Reihenfolge.
            Beispiel: [8,5,1,9,0,4] => beinhaltet danach => [0,1,4,5,8,9]
         */

        int[] arr = {8,5,1,9,0,4};
        arrangeOrder(arr);
    }

    public static void  arrangeOrder (int [] numbers){
        System.out.println(Arrays.toString(numbers));

        int temp = 0;
        boolean changed = true;
        while (changed == true){
            changed = false;
            for (int i = 0; i < numbers.length -1; i++) {
                if (numbers[i]>numbers[i +1]){
                    temp = numbers[i];
                    numbers[i] = numbers[i +1];
                    numbers[i+1] = temp;
                    changed = true;
                }
            }
        }
        System.out.println("Sortiert: " + numbers.length);
        System.out.println(Arrays.toString(numbers));
    }
}
