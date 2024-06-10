import java.util.Arrays;

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double answer = 0;
        for(int i=1; i<salary.length-1; i++) {
            answer += salary[i];
        }

        answer = answer / (salary.length-2);

        return answer;
    }
}