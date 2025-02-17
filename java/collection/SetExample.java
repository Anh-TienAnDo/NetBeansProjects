import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        Set<String> ts = new TreeSet<>();

        hs.add("java");
        ts.add("java");
        hs.add("python");
        ts.add("python");

        System.out.println("HashSet: " + hs);
        System.out.println("TreeSet: " + ts);
        if (hs.contains("java")) {
            System.out.println("java is existed in HashSet");
        }
    }
    
}
