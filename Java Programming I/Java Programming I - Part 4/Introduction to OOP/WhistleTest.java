public class WhistleTest {
    public static void main(String[] args) {
        Whistle duckWhistle = new Whistle("kvaak");
        Whistle cowWhistle = new Whistle("moo");
        // Prints the whistle sounds.
        cowWhistle.sound();
        duckWhistle.sound();
    }
}
