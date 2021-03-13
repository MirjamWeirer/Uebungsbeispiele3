import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
       //fizzBuzz();
       fizzBuzzArry();
       int zahl = 100;
       //System.out.println(Arrays.toString(fizzBuzzArry(100));
        //System.out.println(Arrays.toString(fizzBuzzArry()));
       printArr(fizzBuzzArry());

    }




    public static void fizzBuzz (){
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " FizzBuzz");
            }else if (i % 3 == 0){
                System.out.println(+ i+" Fizz");
            }else if(i % 5 == 0){
                System.out.println(i+" Buzz");
            }else {
                System.out.println(i);
            }
        }

    }
    //Methode mit String
    public static String fizzBuzz2 (int i){
        String fizzbuzz = " ";

            if (i % 3 == 0 && i % 5 == 0){
                fizzbuzz = "FizzBuzz";
            }else if (i % 3 ==0){
                fizzbuzz = "Fizz";
            }else if (i % 5 == 0){
                fizzbuzz = "Buzz";
            }else {
                fizzbuzz = String.valueOf(i);
            }

        return fizzbuzz;
    }
    //Methode benutzt fizzBuzz2; zahlen 1 bis 100; gibt string in methode
    public static String[] fizzBuzzArry() {
        String [] arr = new String[100];

        for (int i = 0; i < 100; i++) {

            arr[i] = fizzBuzz2(i+1);
        }
        return arr;
    }
    public static void printArr (String[] string_arry){
        for (int i = 0; i < string_arry.length; i++) {
            System.out.println(string_arry[i]);
        }
        System.out.println(Arrays.toString(string_arry)); //Array.toString [Objekte]
    }
}
