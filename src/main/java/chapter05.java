import java.util.ArrayList;
import java.util.Collections;

public class chapter05 {

    public static void main(String[] args) {

        fff(8, new ArrayList<Integer>());
    }

    private static void fff(int total, ArrayList<Integer> result) {

        if (total == 1 && result.contains(1)) {
            System.out.println(result);
            return;
        }
        int i = result.contains(1) ? 2 : 1;
        for (; i <= total; i++) {
            ArrayList<Integer> temp = (ArrayList<Integer>) result.clone();
            Collections.copy(temp, result);
            if (total % i != 0) {
                continue;
            }
            temp.add(i);
            fff(total / i, temp);
        }
    }
}
