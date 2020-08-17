public class HealthStationTest {
    public static void main(String[] args) {
        HealthStation childrensHospital = new HealthStation();

        Person james = new Person("James", 21, 175, 64);
        Person henry = new Person("Henry", 5, 82, 27);

        System.out.println(james.getName() + "'s weight: " + childrensHospital.weigh(james) + " kilos");
        System.out.println(henry.getName() + "'s weight: " + childrensHospital.weigh(henry) + " kilos");

        childrensHospital.feed(james);
        childrensHospital.feed(james);
        childrensHospital.feed(james);

        System.out.println("");

        System.out.println(childrensHospital.weigh(james));
        System.out.println(james.getWeight());

        System.out.println(james.getName() + "'s weight: " + childrensHospital.weigh(james) + " kilos");
        System.out.println(henry.getName() + "'s weight: " + childrensHospital.weigh(henry) + " kilos");

        childrensHospital.weigh(james);
        childrensHospital.weigh(james);
        childrensHospital.weigh(james);

        System.out.println("Weighings performed: " + childrensHospital.weighings());


    }
}
