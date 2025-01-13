import java.util.ArrayList;
import java.util.List;

public class AnrQ1 {
    public static void main(String [] args){
        List list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(9);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List list2 = new ArrayList<Integer>();
        list2.add(5);
        list2.add(6);
        list2.add(4);
        list2.add(7);
        list2.add(2);
        list2.add(8);

        List list3 = new ArrayList<Object>();
        list3 = AnrQ1.intersect(list1, list2);

        for (Object i : list3){
            System.out.print(i);            
        }
    }
    public static List<Integer> intersect(List<Integer> l1, List<Integer> l2){
        List list = new ArrayList<Integer>();
        for (Integer i : l1){
            if(l2.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
