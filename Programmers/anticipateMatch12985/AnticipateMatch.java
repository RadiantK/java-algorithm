package anticipateMatch12985;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        while(a != b) {
        	answer++;
        	a = (a+1) / 2;
        	b = (b+1) / 2;
        }
        return answer;
    }
}

public class AnticipateMatch {

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(8, 4, 7));
	}

}
