package oop11_abastract;

import java.util.Arrays;

public class Lotto {
	
	
	int[] lottoNums = new int[6];
	int position = 0;

	public int[] generateNumbers() {
		clearLottoNumbers();
		
		while(true) {
			int number = (int)(Math.random()*45+1);
			boolean duplicationChk = isExist(number);
			if(!duplicationChk) {
				lottoNums[position] = number;
				position++;
			}
			if(position == 6) {
				break;
			}
		}
		
		Arrays.sort(lottoNums);
		return lottoNums;
	}
	
	//내부적으로만 사용되는 메소드
	private void clearLottoNumbers() {
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = 0;
		}
		position = 0;
		
	}
	
	//내부적으로만 사용되는 메소드
	private boolean isExist(int num) {
		boolean result = false;
		for(int i = 0; i < lottoNums.length; i++) {
			if(num == lottoNums[i]) {
				result = true;
				break;
			}
		}
		
		
		return result;
	}
	
	
}
