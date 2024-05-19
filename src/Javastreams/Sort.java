package Javastreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

	public static void main(String[] args) {
        List<Integer>list=Arrays.asList(9,8,5,6,4,3,2,4);
        List ascendingList=list.stream().sorted().collect(Collectors.toList());
        System.out.println(ascendingList);
        List descendingList=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(descendingList);

	}

}
