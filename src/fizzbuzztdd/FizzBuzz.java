package fizzbuzztdd;

public class FizzBuzz {
    
    
    public String showMagic(){
        for ( int i = 1; i <= 100; i++ ) {
            
            if( isDividedByThreeAndFive(i) == true ){
                System.out.println( i + " Fizz Buzz" );
            } else if ( isDividedByThree(i) == true ){
                System.out.println( i + " Fizz" );
            } else if ( isDividedByFive(i) == true ){
                System.out.println( i + " Buzz" );
            } else {
                System.out.println(i);
            }   
 
       } 
        return null;
    }

    public boolean isDividedByThree(int number) {
        boolean three = false;
        three = ( number % 3 ) == 0;
        return three; 
    }

    public boolean isDividedByFive(int number) {
        boolean five = false;
        five = ( number % 5 ) == 0;
        return five;
    }
    
    public boolean isDividedByThreeAndFive(int number){
        boolean threefive = false;
        if( isDividedByThree(number) == true && isDividedByFive(number) == true ){
            threefive = true;
        }
        return threefive;
    }
    
}
