package makePrime;

class Solution {
	
	static boolean[] prime;
	
    public int solution(int[] nums) {
        int count = 0;
        prime = new boolean[10000];
        isPrime();

        for (int i = 0; i < nums.length-2; i++) {
        	for(int j = i+1; j < nums.length-1; j++) {
        		for(int k = j+1; k < nums.length; k++) {
        			
        			int sum = nums[i] + nums[j] + nums[k];
        			
        			if(!prime[sum]) {
        				count++;
        			}
        		}
        	}
        }

        return count;
    }
    public static boolean isPrime() {
    	prime[0] = prime[1] = true;
    	
    	for(int i = 0; i <= Math.sqrt(prime.length); i++) {
    		if (prime[i]) {
    			continue;
    		}
    		for(int j = i*i; j < prime.length; j += i) {
    			prime[j] = true;
    		}
    	}
    	return false;
    }  
}

class Solution2 {
	
    public int solution(int[] nums) {
    	int count = 0;

        for (int i = 0; i < nums.length-2; i++) {
        	for(int j = i+1; j < nums.length-1; j++) {
        		for(int k = j+1; k < nums.length; k++) {
        			
        			int sum = nums[i] + nums[j] + nums[k];
        			
        			if(isPrime(sum)) {
        				count++;
        			}
        		}
        	}
        }

        return count;
    }
    // 소수를 구함
    public static boolean isPrime(int num) {
    	if(num == 1)
    		return false;
    	
    	for(int i = 2; i <= Math.sqrt(num); i++) {
    		// num이 i로 나누어 떨어지면 소수가 아님
    		if (num % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}

public class MakePrime {

	public static void main(String[] args) {

		Solution s = new Solution();
		Solution2 s2 = new Solution2();
		
		int[] nums1 = {1,2,3,4};
		int[] nums2 = {1,2,7,6,4};
		
		System.out.println(s.solution(nums1));
		System.out.println(s.solution(nums2));
		
		System.out.println(s2.solution(nums1));
		System.out.println(s2.solution(nums2));
	}

}
