
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeSignal8 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        List<Integer> list= new ArrayList<>();
        for (int w: arr){
            list.add(w);
        }
        System.out.println(list);

        Integer [] arr2= list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(arr2));
    }





}
