import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
    public static <T> ArrayList<T> removeDups(ArrayList<T> list){
        ArrayList<T> retList = new ArrayList<>();
        retList.add(list.get(0));
        for(T item: list){
            if(!retList.contains(item)){
                retList.add(item);
            }
        }
        return retList;
    }

    public static void main(String[] args) {
        ArrayList<String> t1list = new ArrayList<>(List.of("1", "1", "2", "3", "3", "3", "5"));
        ArrayList<String> t1ret = removeDups(t1list);
        System.out.println(t1ret); // [1, 2, 3, 5]

        ArrayList<Integer> t2list = new ArrayList<>(List.of(1, 3, 5, 5, 5, 7, 7, 11, 13, 13));
        ArrayList<Integer> t2ret = removeDups(t2list);
        System.out.println(t2ret); // [1, 3, 5, 7, 11, 13]

        ArrayList<President> t3list = new ArrayList<>(List.of(new President("Donald", 2016),
                new President("Donald", 2016), new President("Barack", 2008),
                new President("Barack", 2012)));
        ArrayList<President> t3ret = removeDups(t3list);
        System.out.println(t3ret);
    }
}
