
public class ShapePrinter {
	public void printPyramid(int height) {
		for (int i = 0; i < height; i++) {

	        for (int j = height - 1; j > i; j--) { 
	            System.out.print(" ");
	        }

	        for (int k = 1; k <= i*2+1; k++) {//k�� 1���� ����

	            System.out.print("*"); 
	            }

	        System.out.println();

	    }
    }
}
