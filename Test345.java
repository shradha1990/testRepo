import java.util.Scanner;

public class Test345 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {/*

		Scanner scanner = new Scanner(System.in);
		int casesCount = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < casesCount; i++) {
 
			int arraySize = Integer.parseInt(scanner.nextLine());
			int[] intArray = new int[arraySize];
			String str = scanner.nextLine();
			int ememTobeRemoved = Integer.parseInt(scanner.nextLine());

			String[] strArray = str.split(" ");

			for (int j = 0; j < arraySize; j++) {
				int currElem = Integer.parseInt(strArray[j]);
				if (currElem == ememTobeRemoved)
					intArray[j] = 1;
				else
					intArray[j] = currElem;
			}

			for (int k = intArray.length - 1; k >= 0; k--) {

				int tempIndex = k;
				if (intArray[k] == 1) {

					while (tempIndex >= 0 && intArray[tempIndex] == 1) {
						tempIndex--;
					}
					if (tempIndex != -1) {
						// swap tempIndex and j
						int tempVal = intArray[k];
						intArray[k] = intArray[tempIndex];
						intArray[tempIndex] = tempVal;
					}

				}
			}
			for (int l = 0; l < arraySize; l++) {
				System.out.print(intArray[l] + " ");

			}
			System.out.println("");
		}

	*/
		Scanner s= new Scanner(System.in);
        int PI=22;
        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double  area=(PI*r*r)/7 ;
        System.out.println("Area of Circle is: " + area);  
	}

}
