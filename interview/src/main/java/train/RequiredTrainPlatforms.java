package train;

/**
 * nput: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00} dep[] = {9:10, 12:00,
 * 11:20, 11:30, 19:00, 20:00} Output: 3 Explanation: There are at-most three
 * trains at a time (time between 11:00 to 11:20)
 * 
 * Input: arr[] = {9:00, 9:40} dep[] = {9:10, 12:00} Output: 1 Explanation: Only
 * one platform is needed.
 * 
 * @author nagesh2086
 *
 */
public class RequiredTrainPlatforms {

	public static void main(String[] args) {
		Integer arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		Integer dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		
//		Integer arr[] = { 900, 940};
//		Integer dep[] = { 910, 1200};
		
		Integer count = 0;
		for (int i = 1; i < arr.length; i++) {
			boolean increasedOnce = false;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					if (arr[i] >= arr[j] && arr[i] <= dep[j]) {
						if(!increasedOnce){
							count++;
							increasedOnce = true;
							continue;
						}
					}
				}
			}
		}
		System.out.println(count == 0? ++count : count);
	}
}
