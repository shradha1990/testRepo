import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Test123 {

	/*
	 * 
	 * 1 5 1 2 3 1 1 5 1 2 3 4 5
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int casesCount = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < casesCount; i++) {

			HashMap<Integer, List<Integer>> map = new HashMap<>();
			int noOfFloors = Integer.parseInt(scanner.nextLine());
			String[] ladderlenArray = scanner.nextLine().split(" ");

			// int [] finalladderlenArray=new int[noOfFloors];

			for (int j = 0; j < noOfFloors; j++) {
				int count = Integer.parseInt(ladderlenArray[j]);// 1
				while (count > 0) {

					if (map.containsKey(j + count)) {
						List<Integer> list = map.get(j + count);
						list.add(j);
						map.put(j + count, list);
					} else {
						List<Integer> list = new ArrayList<Integer>();
						list.add(j);
						map.put(j + count, list);
					}

					count--;
				}

			}

			int noOfQuestions = Integer.parseInt(scanner.nextLine());
			for (int k = 0; k < noOfQuestions; k++) {
				int counter = 0;
				int floorNum = Integer.parseInt(scanner.nextLine());
				if (floorNum == 0)
					System.out.println(0);

				while (floorNum != 0) {

					if (map.containsKey(floorNum)) {
						floorNum = map.get(floorNum).get(0);
						counter++;
					} else {
						System.out.println("No ladder available from floorNum"
								+ floorNum);
					}

				}

				System.out.println(counter);

			}

		}

	}

}
