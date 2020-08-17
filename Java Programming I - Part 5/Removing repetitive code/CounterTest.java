public class CounterTest {
    public static void main(String[] args) {
        Counter counter  = new Counter();
        System.out.println("-- First counter --");
        System.out.println(counter);

        counter.increase();
        System.out.println(counter);

        counter.increase(5);
        System.out.println(counter);


        Counter counterAlt = new Counter(5);
        System.out.println("-- Second counter --");
        System.out.println(counterAlt);
        counterAlt.increase();
        System.out.println(counterAlt);

    }
}
