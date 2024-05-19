package Javastreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {
        List<Integer>list=Arrays.asList(9,8,5,6,4,3,2,4);
      Set dup=  list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet());
      System.out.println(dup);

	}

}
