package stud;


public class cc20 {

		public static void main(String[] args) {
		
			String s = "abcdefg";
			String[] str = new String[s.length()];
			str = s.split("");
			int len = s.length();
			String answer = "";
			
			if(len % 2 != 0) {
				len = len/2;
				answer += str[len];
			}else {
				len = len/2-1;
				answer += str[len];
				answer += str[len+1];
			}
			System.out.println(answer);
		
		}
	}
	
