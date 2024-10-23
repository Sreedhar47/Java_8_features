package java_8_features_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3);
		List<String> slist = Arrays.asList("sreedhar","sree","srinivas","menaka","naveen");
	
	//	Stream<Integer> newStream = list.stream()
	//	Stream<String> newStream = slist.stream()
	
		   //forEach()
		System.out.println("****forEach()*****");
			slist.stream().forEach(s->{
			System.out.println(s);
		     });
				
			//toArray()
			System.out.println("****toArray()*****");
			Object[] arStream = slist.stream().toArray();
			System.out.println(arStream);
			
			//reduce()
			System.out.println("****reduce()*****");
			Optional<String> s = slist.stream().reduce((word1, word2) -> word1.length()> word2.length()? word1:word2);
			System.out.println(s);
			
			//collect()
			System.out.println("****collect()*****");
			List<Integer> cL = list.stream().distinct().collect(Collectors.toList());
			System.out.println(cL);
			
			// min()
			System.out.println("****min()*****");
			Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
			System.out.println( min);
			
			// max()
			System.out.println("****max()*****");
			Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
		    System.out.println( max);
			
		    //count()
		    System.out.println("****count()*****");
			long count = list.stream().count();
		    System.out.println( count);
		   
		    
		    
		    
		    //anymatch()
		    System.out.println("****anymatch()*****");
			boolean anymatch = slist.stream().anyMatch(name -> name.contains("sree"));
			System.out.println(anymatch); 
			
			//allmatch()
			System.out.println("****allmatch()*****");
			boolean allmatch = slist.stream().allMatch(name -> name.startsWith("menaka"));
			System.out.println(allmatch);
			
			//nonematch()
			System.out.println("****nonematch()*****");
			boolean nonematch = slist.stream().noneMatch(name -> name.length()>10);
			System.out.println(nonematch);
			
			//findFirst()
			System.out.println("****toArray()*****");
			Optional<String> findFirst = slist.stream().findFirst();
			System.out.println(findFirst);
			
			//findAny()
			System.out.println("****findAny()*****");
			Optional<String> findAny = slist.stream().findAny();
			System.out.println(findAny);
		    
		    
			
	}

}
