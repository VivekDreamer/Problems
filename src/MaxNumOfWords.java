import java.util.Arrays;
import java.util.Map;

public class MaxNumOfWords {

	public static void main(String[] args) {
		String[] sentences ={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int wordsFound = mostWordsFound(sentences);
		System.out.println(wordsFound);
	}
	
	public static int mostWordsFound(String[] sentences) {
		int current, max = 0;
		for(int i = 0; i < sentences.length; i++) {
			String sentence = sentences[i];
			String[] words = sentence.split("\\s+");
			current = words.length;
			max = Math.max(max, current);
		}
		return max;
	}
	
	//logic 2
	public int mostWordsFound1(String[] sentences) {
        int ans = 0;
        for(int i=0;i<sentences.length;i++) {
            int w = words(sentences[i]);
            ans = Math.max(ans,w);
        }
        return ans;
    }
	
    public int words(String s) {
        int ans = 1;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==' ') {
                ans++;
            }
        }
        return ans;
    }
}
