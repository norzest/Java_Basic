import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		String[] arr1 = {"leo", "leo", "kiki", "eden"};
		String[] arr2 = {"leo", "eden", "kiki"};
		
		String temp = solution(arr1, arr2);
		System.out.println(temp);
	}
	
	static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> ht = new HashMap<>();
        
        for (int i = 0; i < participant.length; ++i) {
        	if (ht.containsKey(participant[i])) {
				ht.replace(participant[i], ht.get(participant[i])+1);
			} else {
				ht.put(participant[i], 1);
			}
        } // for participant.length
        
        for (int i = 0; i < completion.length; ++i) {
        	if (ht.get(completion[i]) == 1) {
        		ht.remove(completion[i]);
        	} else {
        		ht.replace(completion[i], ht.get(completion[i])-1);
        	}
        } // for completion.lengt
        
        String answer = ht.keySet().toString();
        return answer.substring(1, answer.length()-1);
    }

}
