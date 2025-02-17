import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrlist = new ArrayList<>();
        List<String> linklist = new LinkedList<>();

        arrlist.add("java");
        arrlist.add("ab");
        linklist.add("java");
        linklist.add("python");

        arrlist.set(0, "ba");
        linklist.set(0, "c++");

        Collections.sort(arrlist);

        System.out.println("ArrayList: " + arrlist);
        System.out.println("LinkedList: " + linklist.get(0));
    }
    
}
