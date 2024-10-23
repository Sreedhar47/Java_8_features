package java_8_features_streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
	
	public static void main(String []arg) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3);
		System.out.println(list);
		// filter is used to filter
		Stream<Integer> newStream = list.stream()
				
				//distinct is used to remove duplicates
				.distinct().filter(l-> l%2 == 0)
				
				//map is used to do operations
				.map(l ->l+1)
				
				// limit is used to set limit
				 .limit(2)
				 
				// sorted is used sort
				.sorted(Collections.reverseOrder());
		
		List<Integer> listrs = newStream.toList();
		
		System.out.print(listrs);

	}

}
