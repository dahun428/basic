package informationTestQnA;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UnixTest {
	

	public static void main(String[] args) {
		
		String fileName = "C:\\informationFile\\Unix.txt";
		UnixTest test = new UnixTest();
		
		System.out.println("----------목록----------");
		test.TestAnswerView(fileName);
		
		
	
	}
	
	
	//파일path명 넣어서 콘솔창에 출력하기
	public void TestAnswerView(String fileName) {
		
		Map<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		int s = 0;
		try {
			
			String str = fileInput(fileName);
			map = arrayDivided(str);
			for(String key : map.keySet()) {
				System.out.println(key+":");
				
			} 
			System.out.print("답을 보려면 숫자 1을 입력해주세요 : ");
			s = sc.nextInt();
			if(s == 1) {
				System.out.println("==========answer==========");
				
				for(String key : map.keySet()) {
					String value = map.get(key);
					System.out.print(key+":"+value+"\n");
				} 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
	}
	
	//파일 콘솔에 넣기
	private String fileInput(String fileName) throws IOException {
		
		String str = "";
		FileReader fileReader = new FileReader(fileName);
		int fr = fileReader.read();
		while(fr != -1) {
			str += String.valueOf(((char)fr));
			fr = fileReader.read();
		}
		fileReader.close();
		
		return str;
	}
	
	
	//문자열 엔터로 구분해서 리스트에 넣기
	private Map<String, String> arrayDivided(String str) {
		List<String> list = Arrays.asList(str.split("\n"));
		Map<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < list.size(); i++) {
			String str1 = list.get(i);
			String[] keyValue = str1.split(":");
			map.put(keyValue[0], keyValue[1]);
		}
		
		return map;
	}
}
