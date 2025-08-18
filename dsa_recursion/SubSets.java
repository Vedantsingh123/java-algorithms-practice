import java.util.ArrayList;

public class SubSets {
    static void sets(int[] arr, int i, ArrayList<Integer> list){
        if(i == arr.length){
            System.out.print(list);
            return;
        }
        sets(arr, i + 1, list);
        ArrayList<Integer> newList = new ArrayList<>(list);
        newList.add(arr[i]);
        sets(arr, i + 1, newList);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        sets(arr, 0, new ArrayList<>());
    }
}
