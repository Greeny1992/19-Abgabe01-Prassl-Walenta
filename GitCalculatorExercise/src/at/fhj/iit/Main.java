package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		addValue(2,intList);
		addValue(5,intList);
		addValue(4,intList);
		addValue(99,intList);
		addValue(-1,intList);
		System.out.println("The smallest number is: " + getMinimum(intList));
	}
	public static int getMinimum(List<Integer> intList){
		int min = intList.get(0);
		for(int actualVal : intList){
			if(actualVal < min)
				min = actualVal;
		}
		return min;
	}
	public static int getMaximum(List<Integer> intList){
		return 0;
	}
	public static void addValue(int val, List<Integer> intList){
		intList.add(val);
	}

}
