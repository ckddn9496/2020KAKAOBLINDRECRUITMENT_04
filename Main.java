import java.util.Arrays;
import java.util.HashMap;

/* KAKAO 2020 신입 개발자 블라인드 채용
 * 4번 -> 시간초과
 * */
public class Main {

	public static void main(String[] args) {
		String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
		String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"}; // return [3, 2, 4, 1, 0]
		
		System.out.println(Arrays.toString(new Solution().solution(words, queries)));
	}
}

class Solution {
    public int[] solution(String[] words, String[] queries) {
        int[] result = new int[queries.length];
        
        // <query, word count> for duplications
        HashMap<String, Integer> logSet = new HashMap<String, Integer>();
        
        for (int i = 0; i < queries.length; i++) {
        	String query = queries[i];
        	if (logSet.containsKey(query)) {
        		result[i] = logSet.get(query);
            	continue;
        	}
        		
        	// 검색 기록이 없다면
    		String keyword = query.replace("?","");
    		
    		int count = 0;
    		if (keyword.equals("")) {
    			count = (int) Arrays.stream(words).filter(s -> s.length() == query.length()).count();
    		}
    		else if (query.startsWith("?"))  {// keyword가 tail
    			for (String word : words) {
            		if (query.length() != word.length()) continue;
        			if (word.endsWith(keyword))
            			count++;
            	}
    		} else {
    			for (String word : words) {
            		if (query.length() != word.length()) continue;
            		if (word.startsWith(keyword))
        				count++;
            	}
    		}
    		result[i] = count;
        	logSet.put(query, count);
        }
        
        
        return result;
    }
}