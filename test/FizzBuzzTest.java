import fizzbuzztdd.FizzBuzz;
import junit.framework.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    
    FizzBuzz fizzBuzz;    
    
    @Test
    public void testDivisibleByThreeReturnsTrue() {
        fizzBuzz = new FizzBuzz();
        Assert.assertEquals(true, fizzBuzz.isDividedByThree(3));
        Assert.assertEquals(true, fizzBuzz.isDividedByThree(9));
        Assert.assertEquals(true, fizzBuzz.isDividedByThree(15));
        Assert.assertEquals(true, fizzBuzz.isDividedByThree(27));
        Assert.assertEquals(true, fizzBuzz.isDividedByThree(36));
        Assert.assertEquals(true, fizzBuzz.isDividedByThree(63));
        Assert.assertEquals(true, fizzBuzz.isDividedByThree(99));       
    }   
    
    @Test
    public void testDivisibleByFiveReturnsTrue() {
        fizzBuzz = new FizzBuzz();
        Assert.assertEquals(true, fizzBuzz.isDividedByFive(5));
        Assert.assertEquals(true, fizzBuzz.isDividedByFive(10));
        Assert.assertEquals(true, fizzBuzz.isDividedByFive(25));
        Assert.assertEquals(true, fizzBuzz.isDividedByFive(35));
        Assert.assertEquals(true, fizzBuzz.isDividedByFive(50));
        Assert.assertEquals(true, fizzBuzz.isDividedByFive(85));
        Assert.assertEquals(true, fizzBuzz.isDividedByFive(90));     
    }
    
    @Test
    public void testDivisibleByThreeAndFiveReturnsTrue() {
        fizzBuzz = new FizzBuzz();
        Assert.assertEquals(true, fizzBuzz.isDividedByThreeAndFive(15));
        Assert.assertEquals(true, fizzBuzz.isDividedByThreeAndFive(30));
        Assert.assertEquals(true, fizzBuzz.isDividedByThreeAndFive(45));
        Assert.assertEquals(true, fizzBuzz.isDividedByThreeAndFive(60));
        Assert.assertEquals(true, fizzBuzz.isDividedByThreeAndFive(90));     
    }    
    
}
