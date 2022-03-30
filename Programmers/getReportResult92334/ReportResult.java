package getReportResult92334;

import java.util.*;

class Solution {
	
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 유저의 이름, 신고당한 횟수를 담을 리스트
 		Map<String, Integer> userList = new HashMap<>();
 		// 유저의 이름과, 유저가 신고한 사람을 담을 리스트
 		Map<String, Set<String>> reportList = new HashMap<>();
 		
 		for(String id : id_list) {
 			userList.put(id, 0);
 			reportList.put(id, new HashSet<>());
 		}

 		for(String re : report) {
 			String[] temp = re.split(" ");
 			String user = temp[0];
 			String reported = temp[1];
 			if(reportList.get(user).add(reported)) {
 				userList.put(reported, userList.get(reported)+1);
 			}
 		}
 		
 		for(String re : report) {
 			String[] rep = re.split(" ");
 			if(userList.get(rep[1]) < k) {
 				reportList.get(rep[0]).remove(rep[1]);
 			}
 		}
		for(int i = 0; i < answer.length; i++) {
			answer[i] = reportList.get(id_list[i]).size();
		}
        return answer;
    }
}

class Solution2 {
	
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> idIndex = new HashMap<>();
        Map<String, List<String>> reportMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            idIndex.put(id_list[i], i);
            reportMap.put(id_list[i], new ArrayList<>());
        }
        System.out.println();
        System.out.println(idIndex);
        System.out.println(reportMap);

        for (String reported : report) {
            String[] temp = reported.split(" ");
            if (!reportMap.get(temp[1]).contains(temp[0])) {
                reportMap.get(temp[1]).add(temp[0]);
            }
        }
        System.out.println();
        System.out.println(idIndex);
        System.out.println("reportmap : " + reportMap);

        for (String id : reportMap.keySet()) {
            if (k <= reportMap.get(id).size()) {
                for (String reporter : reportMap.get(id)) {
                    answer[idIndex.get(reporter)]++;
                    System.out.println(Arrays.toString(answer));
                }
            }
        }
		System.out.println(Arrays.toString(answer));
        return answer;
    }
}

public class ReportResult {

	public static void main(String[] args) {

		Solution s = new Solution();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//		String[] id_list = {"con", "ryan"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//		String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
		int k = 2;
		System.out.println(Arrays.toString(s.solution(id_list, report, k)));
		
		
	}

}