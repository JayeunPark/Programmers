package level1_0330;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//자연수 뒤집어 배열로 만들기
public class Reversing_a_natural_number {
    public int[] solution(long n) {
    	List<String> arr = Arrays.asList((n+"").split(""));
    	Collections.reverse(arr);
		
    	int [] answer = new int [arr.size()];
    	for (int i = 0; i < arr.size(); i++) {
    		answer[i]=Integer.parseInt(arr.get(i));
		}
    	
    	return answer ;
    }
    
//	다른 풀이..getNumericValue:아스키코드 int값 반환 //StringBuilder:문자열을 추가,삽입,뒤집기 등 할때 사용하기 위한 클래스
//	return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
}
