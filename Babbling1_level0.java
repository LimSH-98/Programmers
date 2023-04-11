package programmers;

public class Babbling1_level0 {

	public int findWord(String babbling, String[] word){
        int size = 0;
        for(int i=0;i<word.length;i++){
            if(babbling.contains(word[i])){
                size += word[i].length();
            }
        }
        if(size == babbling.length()){
            return 1;
        }
        else{
            return 0;
        }
    }
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
        
        for(int i=0;i<babbling.length;i++){
            if(findWord(babbling[i], word) == 1){
                answer++;
            }
        }
        return answer;
    }
}
