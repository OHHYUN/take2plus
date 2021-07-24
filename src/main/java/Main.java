import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        solution(new int[]{2, 1, 3, 4, 1});
    }

    public static int[] solution(int[] numbers) {
        Set<Integer> hashSet = new TreeSet<>();

        for(int i =0; i<numbers.length; i++){
            for(int j=(i+1); j<numbers.length; j++){
                hashSet.add(numbers[i]+numbers[j]);
            }
        }


        int[] answer = hashSet.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
