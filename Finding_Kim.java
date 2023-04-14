package level1_0329;

public class Finding_Kim {
	public String solution(String[] seoul) {
		
		for(int i=0; i<seoul.length; i++){
			if(seoul[i].contains("Kim")){
				return "김서방은 "+i+"에 있다";
			}
		}
		return "";
//   다른 풀이
//   int x = Arrays.asList(seoul).indexOf("Kim"); 
	}
}

