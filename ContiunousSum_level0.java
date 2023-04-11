package programmers;

public class ContiunousSum_level0 {

	public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = 0; 
        
        if(total != 0){
            if(num % 2 == 0){ // num이 짝수일 때,
                start = total / num - (num / 2 - 1);
            }else{ // num이 홀수일 때
                start = total / num - (num / 2);
            }
        }else{
            start = 0 - num / 2;
        }
        
        for(int i = 0;i<num;i++){
            answer[i] = start + i;
        }
        
        return answer;
    }
}
