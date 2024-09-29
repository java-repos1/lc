package lc;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		
		ValidParanthesis obj = new ValidParanthesis();
		
		String[] inputs = {"()[]{}", "(]", "([])" };
		
		for (String e: inputs) {
			System.out.println(obj.checkMatch(e));
		}
		
	}
	
	public boolean checkMatch(String ip) {
		
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("{", "}");
		hm.put("[", "]");
		hm.put("(", ")");
		
		Stack<String> st = new Stack<>();
		
		for (String s: ip.split("")) {
			if(hm.containsKey(s)) {
				st.push(s);
			}
			else if(hm.containsValue(s)) {
				if(hm.get(st.peek()).equals(s))
					st.pop();
			}
			
		}
		
		if(st.empty())
			return true;
		
		return false;
	}

}
