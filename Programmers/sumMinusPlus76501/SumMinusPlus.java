package sumMinusPlus76501;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        
        for(int i = 0; i < absolutes.length; i++) {
        	if(signs[i] == true) {
        		sum += absolutes[i];
        	} else {
        		sum -= absolutes[i];
        	}
        }
        return sum;
    }
}

public class SumMinusPlus {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		int[] absolutes1 = {4, 7, 12};
		int[] absolutes2 = {1, 2, 3};
		
		boolean[] signs1 = {true, false, true};
		boolean[] signs2 = {false, false, true};
		
		System.out.println(s.solution(absolutes1, signs1));
		System.out.println(s.solution(absolutes2, signs2));
		
	}

}
