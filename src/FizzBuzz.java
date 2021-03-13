public class FizzBuzz {
    public static void main(String[] args) {
       fizzBuzz(9);
       fizzBuzz(15);
       fizzBuzz(4);
       fizzBuzz(10);
    }
    public static int fizzBuzz (int number){
        if (number % 3 == 0 && number % 5 == 0){
            System.out.println(number + " FizzBuzz");
        }else if (number % 3 == 0){
            System.out.println(+ number+" Fizz");
        }else if(number % 5 == 0){
            System.out.println(number+" Buzz");
        }else {
            System.out.println(number);
        }
        return number;
    }
}
