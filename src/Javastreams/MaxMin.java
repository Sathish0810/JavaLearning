package Javastreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {

	public static void main(String[] args) {
        List<Integer>list=Arrays.asList(9,8,5,6,4,3,2,4,-9);
        int max=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);
        int min=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);
	}

}
