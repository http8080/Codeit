
public class ShapePrinter {
    public void printFloydsPyramid(int height) {
    	int length = String.valueOf(height * (height + 1) / 2).length();
    	int number = 1;
    	
    	for(int row = 1; row <= height; row++) {
    		String line = "";
    		
    		for(int col = 1; col <= row; col++) {
    			for(int i = String.valueOf(number).length(); i < length; i++) {
    				line += " ";
    			}
    			
    			line += (number + " ");
    			number++;
    		}
    		System.out.println(line);
    	}
    }
}