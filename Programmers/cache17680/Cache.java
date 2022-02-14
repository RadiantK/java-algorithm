package cache17680;

import java.util.LinkedList;

class Solution {
	// LRU ĳ�� �˰��� ���
    public int solution(int cacheSize, String[] cities) {
    	if(cacheSize == 0) return cities.length * 5;
    	
        int answer = 0; 
        LinkedList<String> cache = new LinkedList<String>();

        for(String city : cities) {
        	city = city.toLowerCase();
        	// cache hit
        	// city�� ĳ�ø޸𸮿� ���ԵǾ������� �����͸� ����� �Ǿտ� ���� ĳ�ø� �߰��� �� ����ð�+1
        	if(cache.contains(city)) {
        		cache.remove(city);
        		cache.addFirst(city);
        		answer += 1;
        	}
        	// cache miss
        	// city�� ĳ�ø޸𸮿� ���ԵǾ������������
        	// �����͸� �޸��� ù��°�� �߰� ���� �� ����ð��� +5 ���ش�
        	// ����� ĳ�û������ �������� �޸��� ������ �����͸� ����� �� �ݺ�
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
