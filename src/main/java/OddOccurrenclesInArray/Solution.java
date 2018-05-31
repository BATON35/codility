package OddOccurrenclesInArray;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] A){
        Map<Integer, Boolean> trueIfOddOccurred = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (trueIfOddOccurred.containsKey(A[i])) {
                trueIfOddOccurred.put(A[i], !trueIfOddOccurred.get(A[i]));
            }else{
                trueIfOddOccurred.put(A[i], true);
            }
        }
//        for (Map.Entry element : trueIfOddOccurred.entrySet()) {
//            System.out.println(element.getKey() + " " + element.getValue());
//        }
        return trueIfOddOccurred.entrySet().stream().
                filter(e->e.getValue()==true).mapToInt(e->e.getKey()).toArray()[0];
    }
}
