package Javastreams;

import java.util.Arrays;
import java.util.List;

public class LimitSkip {

	public static void main(String[] args) {
        List<Integer>list=Arrays.asList(9,8,5,6,4,3,2,4);
        int sum=list.stream().limit(5).reduce((a,b)->a+b).get();
        System.out.println(sum);
        int sum1=list.stream().skip(5).reduce((a,b)->a+b).get();
        System.out.println(sum1);
	}

}
