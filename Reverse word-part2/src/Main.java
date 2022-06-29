public class Main {

	public static void main(String[] args) {
		String[] wordList = {"Stressed","Parts","Straw","Keep","Wolf"};
		String reverseWord = "";
		String word = "";
		for (int i=0; i<wordList.length; i++) {
			//word assess each element of array in turn 
			word = wordList[i];
			//change first letter to lower case and last letter to upper case
			word = word.substring(0,1).toLowerCase()+word.substring(1,word.length()-1)+word.substring(word.length()-1).toUpperCase();
			//going through each letter backward
			for (int j=word.length()-1; j>=0; j--) {
				//access each letter with charAT and concatenate them into reverseWord
				reverseWord+= word.charAt(j);
			}
			System.out.println(reverseWord);
			//assign empty string to start with new word
			reverseWord = "";
		}
	}
}


	


