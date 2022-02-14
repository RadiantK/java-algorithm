package cache17680;

import java.util.LinkedList;

class Solution {
	// LRU 캐시 알고리즘 사용
    public int solution(int cacheSize, String[] cities) {
    	if(cacheSize == 0) return cities.length * 5;
    	
        int answer = 0; 
        LinkedList<String> cache = new LinkedList<String>();

        for(String city : cities) {
        	city = city.toLowerCase();
        	// cache hit
        	// city가 캐시메모리에 포함되어있으면 데이터를 지우고 맨앞에 새로 캐시를 추가한 뒤 실행시간+1
        	if(cache.contains(city)) {
        		cache.remove(city);
        		cache.addFirst(city);
        		answer += 1;
        	}
        	// cache miss
        	// city가 캐시메모리에 포함되어있지않은경우
        	// 데이터를 메모리의 첫번째에 추가 해준 뒤 실행시간을 +5 해준다
        	// 사이즈가 캐시사이즈랑 같아지면 메모리의 마지막 데이터를 지우고 위 반복
        	else {
        		if(cache.size() == cacheSize) {
        			cache.pollLast();
        		}
        		cache.addFirst(city);
        		answer += 5;
        	}
        }
        return answer;
    }
}

public class Cache {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		String[] cities = {
				"Jeju", "Pangyo", "Seoul", "NewYork", "LA",
				"Jeju", "Pangyo", "Seoul", "NewYork", "LA"
				};
	
		System.out.println(s.solution(3, cities));
	}

}
