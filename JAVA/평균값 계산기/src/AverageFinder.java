
public class AverageFinder {
	double computeAverage(int [] intArray) {
		double result = 0;
		
		for(int i : intArray) {
			result += i;
		}
		return (double)result / intArray.length;
	}

}
