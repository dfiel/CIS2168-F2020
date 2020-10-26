import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> retList = new ArrayList<>(list1);
        retList.retainAll(list2);
        return retList;
    }

    public static void reverse(ArrayList<String> strings){
        if(strings.size() <= 1){return;}

        int top = strings.size()-1;
        String tempString;

        for(int i = 0; i <= top/2; i++){
            tempString = strings.get(i);
            strings.set(i, strings.get(top-i));
            strings.set(top-i, tempString);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> t1l1 = new ArrayList<>(List.of(1, 3, 5, 7, 11));
        ArrayList<Integer> t1l2 = new ArrayList<>(List.of(1, 2, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> t1ret = intersect(t1l1, t1l2);
        System.out.println(t1ret); // [1, 5, 7]

        ArrayList<String> t2list = new ArrayList<>(List.of("1", "2", "3", "4", "5"));
        reverse(t2list);
        System.out.println(t2list); // [5, 4, 3, 2, 1]

        ArrayList<String> t3list = new ArrayList<>(List.of("1", "2"));
        reverse(t3list);
        System.out.println(t3list); // [2, 1]

        ArrayList<String> t4list = new ArrayList<>(List.of("1", "3", "4", "5"));
        reverse(t4list);
        System.out.println(t4list); // [5, 4, 3, 1]
    }
}
