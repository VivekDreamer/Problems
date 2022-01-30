
public class ReverseString {

	public static void main(String[] args) {
		String word = "AB   CD";
		System.out.println("actual word length : "+word.length()+"  :  "+word);
	//	String result = reverseWordsWithinString(word);
	//	System.out.println("result word length : "+result.length()+"  :  "+result);
		String result1 = reverseOrderOfWordsWithinString(word);
		System.out.println("result word length : "+result1.length()+"  :  "+result1);
		String result3 = reverseOrderOfWordsWithoutAnyCondition(word);
		System.out.println(result3);
	}
	
	//this will reverse order words within string keeping the order same
			//eg.  : This is a boy       the sky is blue
			//step1 : siht si a yob      blue is sky the
			//step2 : boy a is this
	private static String reverseOrderOfWordsWithoutAnyCondition(String word) {
		if(word.length() == 0 || word == null)return word;
		char[] arr = word.toCharArray();
		int i = 0;
		int j = 0;
		while( j <= arr.length) {
			if( j == arr.length || arr[j] == ' ') {
				resverseString(arr , i , j-1);
				i = j + 1;
			}
			j++;
		}
		resverseString(arr, 0, arr.length-1);
		return new String(arr);
	}

	//this will reverse order words within string keeping the order same
		//eg.  : This is a boy       the sky is blue
		//step1 : siht si a yob      blue is sky the
		//step2 : boy a is this 
	private static String reverseOrderOfWordsWithinString(String word) {
		
		if(word.length() == 0 || word == null)return word;
		char[] arr = word.toCharArray();
		int start = 0;
		int end = arr.length-1;
		
		//removing leading zeroes
		while( start <= end && arr[start] == ' ') {
			start++;
		}
		//removing trailing zeroes
		while( start <= end && arr[end] == ' ') {
			end--;
		}
		
		resverseString(arr ,start, end);
		int i = start;
		int j = start;
		int mark = start;
		while( j <= end) {
			if(arr[j] != ' ') {
				arr[mark] = arr[j];
				mark++;
			}
			//DC   BA  
			//CD 
			if( j == end || arr[j] == ' ') {
				resverseString(arr , i , mark-1);
				
				if(j == end)break;
				
				arr[mark++] = ' ';
				i = mark;
				while(arr[j] == ' ') {
					j++;
				}
				j=j-1;
			}
			j++;
		}
		/* resverseString(arr , 0 , arr.length-1); */
		return new String(arr,start,mark-start);
		
	}

	//this will reverse words within string keeping the order same
	//eg.  : This is a boy
	//output : siht si a yob
	private static String reverseWordsWithinString(String word) {
		
		if(word.length() == 0 || word == null)return word;
		char[] arr = word.toCharArray();
		int i = 0;
		int j = 0;
		while( j <= arr.length) {
			if( j == arr.length || arr[j] == ' ') {
				resverseString(arr , i , j-1);
				i = j + 1;
			}
			j++;
		}
		
		return new String(arr);
	}
	
	//this is the code the reverse a string
	private static void resverseString(char[] str, int i , int j){
        for( ; i < j; i++,j--){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
    }
}
