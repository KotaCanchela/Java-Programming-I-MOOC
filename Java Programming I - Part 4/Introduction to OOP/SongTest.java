public class SongTest {
    public static void main(String[] args) {
        Song garden = new Song("In the garden", 19201);
        System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
    }
}
