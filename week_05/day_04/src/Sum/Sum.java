package Sum;



import java.util.ArrayList;

public class Sum {

    public int sumMe(ArrayList<Integer> sumNumList) {
        int sum = 0;
        for (int temp : sumNumList)
            sum += temp;
        return sum;
    }
}
