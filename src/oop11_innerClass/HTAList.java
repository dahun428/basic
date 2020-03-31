package oop11_innerClass;

public class HTAList {

	private String[] data = new String[100];
	private int position = 0;
	
	public void add(String value) {
		data[position] = value;
		position++;
	}
	
	public HTAIterator iterator() {
		HTAListIterator iter = new HTAListIterator();
		return iter;
	}
	
	class HTAListIterator implements HTAIterator{

		private int currentPosition = 0;
		
		@Override
		public boolean hasNext() {
			boolean hasValue = true;
			if(currentPosition == position) {
				hasValue = false;
			}
			
			return hasValue;
		}
		@Override
		public String next() {
			String value = data[currentPosition];
			currentPosition++;
			
			return value;
		}
		
	}
	
	
}
