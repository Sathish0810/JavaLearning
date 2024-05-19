package Javastreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargeAndSecondLowestNumber {

	public static void main(String[] args) {
        List<Integer>list=Arrays.asList(9,8,5,6,4,3,2,4);
       int Large= list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
       
       System.out.println(Large);
       
       int small=list.stream().sorted().distinct().skip(1).findFirst().get();
       System.out.println(small);

	}

}
