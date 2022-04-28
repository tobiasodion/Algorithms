import java.util.ArrayList;
import java.util.Scanner;

public class StringPermute {

	static ArrayList<String> wordList = new ArrayList<String>();

    public static ArrayList<String> Permutations(String uniqueCharStr) {
		int leftIndex = 0;
		int rightIndex = uniqueCharStr.length()- 1;

		Permute(uniqueCharStr, leftIndex, rightIndex);
		return wordList;	
	}

	private static void Permute(String word, int left, int right){
		String swapped;
		
		if (left == right){
			wordList.add(word);
		}

		else{
			for(int i=left; i<=right; i++){
				swapped = Swap(word, left, i);
				StringPermute.Permute(swapped, left+1, right);  
			}
		}
	}

	private static String Swap(String inputString, int i, int j){
		//convert input to Array
		char[] charArray = inputString.toCharArray();

		//swap array content
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;

		return new String(charArray);
	}

	public static void main(String[] args){
		//get string
		Scanner myScanner = new Scanner(System.in);
		//ArrayList<String> wordList = new ArrayList<String>();

		System.out.print("Enter word to rearrange: ");
	    String userWord = myScanner.nextLine();

		//rearrange string
		wordList = Permutations(userWord);

		//display strings in List
		for (String word : wordList) {
			System.out.println(word);
		}
	}
}