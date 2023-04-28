import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusservisTest {
    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        long amount = 1000;
        boolean registered = true;
        Bonusservice service = new Bonusservice();
        long expected = 30;
        long actual = service.calculate(amount, registered = true);
        //System.out.println("1."+expected+"==?=="+actual);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateForRegisteredAndOverLimit() {
        long amount = 1_000_000;
        boolean registered = true;
        Bonusservice service = new Bonusservice();
        long expected = 500;
        Long actual = service.calculate(amount, registered = true);
        //System.out.println("2."+expected+"==?=="+actual);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateForUnregisteredAndUnderLimit() {
        long amount = 1000;
        boolean registered = true;
        Bonusservice service = new Bonusservice();
        long expected = 10;
        long actual = service.calculate(amount, registered = false);
        //System.out.println("1."+expected+"==?=="+actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnregisteredAndOverLimit() {
        long amount = 1_000_000;
        boolean registered = true;
        Bonusservice service = new Bonusservice();
        long expected = 500;
        Long actual = service.calculate(amount, registered = false);
        //System.out.println("2."+expected+"==?=="+actual);
        Assertions.assertEquals(expected, actual);
    }
}






