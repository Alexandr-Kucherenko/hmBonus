public class Main {
    public static void main(String[] args) {
        long amount = 5000;
        boolean registered = true;
        Bonusservice service  = new Bonusservice();
        long expected = 150;
        long actual = service.calculate(amount, registered = true);
        System.out.println("1."+expected+"==?=="+actual);

         expected = 50;
         actual = service.calculate(amount, registered = false);
        System.out.println("2."+expected+"==?=="+actual);
    }
}
