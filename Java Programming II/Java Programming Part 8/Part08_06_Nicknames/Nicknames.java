import java.util.HashMap;


public class Nicknames {

    public static void main(String[] args) {

        HashMap<String, String> hashTest = new HashMap<>();
        hashTest.put("matthew", "matt");
        hashTest.put("michael", "mix");
        hashTest.put("arthur", "artie");

        // Print out Matthew's nickname from the hashmap.
        System.out.println(hashTest.get("matthew"));
    }

}


