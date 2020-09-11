public class IOUrun {
    public static void main(String[] args) {
        IOU testIOU = new IOU();

        testIOU.setSum("James", 50.0);
        testIOU.setSum("Michael", 30);

        System.out.println(testIOU.howMuchDoIOweTo("James"));
        System.out.println(testIOU.howMuchDoIOweTo("Michael"));

        testIOU.setSum("James", 20);

        System.out.println(testIOU.howMuchDoIOweTo("James"));

    }
}
