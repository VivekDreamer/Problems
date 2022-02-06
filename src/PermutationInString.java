
public class PermutationInString {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidbaooo";
		boolean b = checkInclusion(s1, s2);
		System.out.println(b);
		int[] s1Data = new int[26];
        int[] s2Data = new int[26];
        for(int i=0;i<s1.length();i++){
            s1Data[s1.charAt(i) - 'a']++;
            s2Data[s2.charAt(i) - 'a']++;
        }
		 
		   int windowStart = 0;
	        int windowEnd = s1.length();
		 
	        System.out.println("s1 is : "+s1);
	        System.out.println("s2 is : "+s2);
		 while(windowEnd < s2.length()){
			 System.out.println("windowStart is : "+windowStart);
			 System.out.println("windowEnd is : "+windowEnd);
			 System.out.println("length of s2 is : "+s2.length());
			 for(int i=0;i<26;i++){
				 System.out.print(s1Data[i]+" ");
			 }
			 	
			 System.out.println();
			 
			 for(int i=0;i<26;i++){
				 System.out.print(s2Data[i]+" ");
			 }
			 System.out.println();
			 System.out.println("**************************************************************************");
			 
			 s2Data[s2.charAt(windowEnd) - 'a']++;
	         s2Data[s2.charAt(windowStart) - 'a']--;
	            
	         windowStart++;
	         windowEnd++;       
	        }
	}
	public static boolean checkInclusion(String s1, String s2) {
		
		if(s1.length() > s2.length()){
            return false;
        }
		
		int[] s1Data = new int[26];
        int[] s2Data = new int[26];
       
        for(int i=0;i<s1.length();i++){
            s1Data[s1.charAt(i) - 'a']++;
            s2Data[s2.charAt(i) - 'a']++;
        }
        
        int windowStart = 0;
        int windowEnd = s1.length();
        
        while(windowEnd < s2.length()){
            if(matches(s1Data, s2Data)){
                return true;
            }
            
            s2Data[s2.charAt(windowEnd) - 'a']++;
            s2Data[s2.charAt(windowStart) - 'a']--;
            
            windowStart++;
            windowEnd++;       
        }
        if(matches(s1Data, s2Data)){
            return true;
    }
    return false;	
	}
	public static boolean matches(int[] s1Data, int[] s2Data){
        for(int i = 0; i < 26; i++){
            if(s1Data[i] != s2Data[i]){
                return false;
            }
        }
        return true;
    }
}
