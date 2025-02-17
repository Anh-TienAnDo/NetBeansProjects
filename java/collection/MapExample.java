import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Khai báo và khởi tạo Map
        Map<String, String> map = new HashMap<>();
        
        // Thêm phần tử vào Map
        map.put("1", "Java");
        map.put("2", "Python");
        map.put("3", "C++");
        
        // Lấy phần tử từ Map
        String value = map.get("1");
        System.out.println("Value: " + value);
        
        // Xóa phần tử khỏi Map
        map.remove("2");
        
        // Duyệt qua các phần tử của Map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
    
}
