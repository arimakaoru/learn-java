public class Fizzbuzz {
    public static void main(String[] atgs) {
        final int limit = 20;

        for(int i = 0; i <= limit; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}