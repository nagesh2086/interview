import java.util.ArrayList;
import java.util.List;

public class ComputerDiskSpaceCalculation {

	public static void main(String[] args) {
		int x = 1;
		int[] space = {1,4,6,2,8,3,4};
		// 1 4, 4 6, 2 8, 8 3 min 1,4,2,3 max 4
		
		List<Integer> segmentMinList = new ArrayList<Integer>();
		for(int i = x-1; i<space.length;i++){
			int min = Integer.MAX_VALUE;
			for(int j = i; j>(i-x); j--){
				if(space[j] < min){
					min = space[j];
				}
			}
			segmentMinList.add(min);
		}

		Integer[] segmentArray = new Integer[segmentMinList.size()];
		segmentArray = segmentMinList.toArray(segmentArray);

		int max = 0;
		for(int i = 0; i<segmentArray.length;i++){
			if(segmentArray[i] > max){
			max = segmentArray[i];
			}
		}
		
		System.out.println("Disk space: " + max);
	}

}
