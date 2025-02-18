import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrlist = new ArrayList<>();
        List<String> linklist = new LinkedList<>();

        arrlist.add("java");
        arrlist.add("python");
        linklist.add("java");
        linklist.add("python");

        System.out.println("ArrayList: " + arrlist);
        System.out.println("LinkedList: " + linklist);
    }
    
}
