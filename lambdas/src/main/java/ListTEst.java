import java.util.ArrayList;
import java.util.List;

public class ListTEst {

    public static void main(String[] args) {
        List test = new ArrayList();
        test.add("one");
        test.add("two");
        if (test != null && !test.isEmpty()) {
            System.out.println("data: " + test.get(0));
        }
    }
}
