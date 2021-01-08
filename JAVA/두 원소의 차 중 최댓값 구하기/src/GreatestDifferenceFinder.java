
public class GreatestDifferenceFinder {
	public int greatestDifference(int intArray []) {
		int result, min = 0, max = 0;
		
		if(intArray.length >= 2) {
			for(int i = 0; i < intArray.length; i++) {
				if(max < intArray[i])
					max = intArray[i];
				else if(min > intArray[i])
					min = intArray[i];
			}
		} else
			result = 0;
		
		result = max - min;

		return result;
	}
}
