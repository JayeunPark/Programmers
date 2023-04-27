package level1_0329;
//시저 암호
class Caesar_Cipher {
	public String solution(String s, int n) {
        String answer = "";
        char[] sChar =s.toCharArray();
        for (int i = 0; i < sChar.length; i++) {
			if(sChar[i] == 'z'||sChar[i] == 'Z'||sChar[i]+n>'z'||sChar[i]+n>'Z'&&sChar[i]+n<'a') {
				answer +=(char)(sChar[i]-26+n);
			}
			else if(sChar[i]==' ') {
				answer += " ";
			}
			else {
				answer += (char)(sChar[i]+n);
			}
		}
        return answer;
    }
}

