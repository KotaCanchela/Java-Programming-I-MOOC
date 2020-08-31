public class Song {
    // Declare instance variables for name of song and length in seconds.
    private String name;
    private int length;

    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String name() {
        // Returns name of the song
        return name;
    }
    public int length() {
        return length;
    }

}
