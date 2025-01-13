import java.util.*;

public class SystemPropertyDemo {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
