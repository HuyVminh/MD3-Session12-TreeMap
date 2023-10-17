import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("a", "Audi");
        m.put("a", "toyota");
        System.out.println(m);
    }
}
