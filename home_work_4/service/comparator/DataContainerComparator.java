package home_work_4.service.comparator;

import java.util.Comparator;

public class DataContainerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer leftNumber, Integer rightNumber) {
        if (leftNumber > rightNumber) {
            return 1;
        } else if (leftNumber < rightNumber){
            return -1;
        }
        return 0;
    }
}
