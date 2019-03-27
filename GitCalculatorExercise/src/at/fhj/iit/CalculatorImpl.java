package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class CalculatorImpl implements Calculator{
    List<Integer> intList = new ArrayList<>();

    @Override
    public int getMaximum() {
        return 0;
    }

    @Override
    public int getMinimum(){
        int min = intList.get(0);
        for(int actualVal : intList){
            if(actualVal < min)
                min = actualVal;
        }
        return min;
    }

    @Override
    public void addValue(int val){
        intList.add(val);
    }

}
