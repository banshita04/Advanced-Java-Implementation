package stringtask;


public class Count {
	public static void main(String[] args) {
		String s = "Hello I am Banshita Datta Roy\n I am writing this program.";
//		String s = "hello i\n I am";
		s=s+' ';
		int words=0, ch=0, lines=0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='\n') {
					lines++;
			}
			else if(s.charAt(i)==' ')
				words++;
			else {
				ch++;
			}
		}
		
		
		System.out.println("Number of words: "+words);
		System.out.println("Number of lines: "+lines);
		System.out.println("Number of characters: "+ch);
			
	}
}

