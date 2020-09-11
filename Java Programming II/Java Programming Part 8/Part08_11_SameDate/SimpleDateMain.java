public class SimpleDateMain {
    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 1982)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}
