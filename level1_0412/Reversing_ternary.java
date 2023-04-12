package level1_0412;
//3진법 뒤집기
public class Reversing_ternary {
	String getTernary(int num) {
		String answer ="";
		while(num>=1) {
			answer = num%3+answer;
			num=num/3;
		}
		return answer;
	}
	int getDecimal(String a) {
		int answer =0;
		for (int i = 0; i < a.length(); i++) {
			answer += (a.charAt(i)-'0')*Math.pow(3, i);
		}
		return answer;
	}
    public int solution(int n) {
    	return getDecimal(getTernary(n));
    }
//   다른 풀이
//    public int solution(int n) {
//        String a = "";
//
//        while(n > 0){
//            a = (n % 3) + a;
//            n /= 3;
//        }
//        a = new StringBuilder(a).reverse().toString();
//
//
//        return Integer.parseInt(a,3);
//    }
}
