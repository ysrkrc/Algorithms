package lambda;

import java.util.*;

public class CodeSignal6 {

/*
Ratiorg, doğum günü için CodeMaster'dan farklı boyutlarda heykeller aldı, her heykelin negatif olmayan bir tamsayı boyutu vardı.
 Her şeyi mükemmelleştirmeyi sevdiği için, her heykelin bir öncekinden tam olarak 1 kat daha büyük olması için onları küçükten büyüğe doğru düzenlemek istiyor.
 Bunu başarabilmesi için ek heykellere ihtiyacı olabilir. Gereken minimum ek heykel sayısını bulmasına yardım edin.
 */
public static void main(String[] args) {

    int statues []= {12,3,5,6,8,16,22};

    Arrays.sort(statues);

    System.out.println(Arrays.toString(statues));
    List<Integer> arr = new ArrayList();

    int v = statues[statues.length-1];
    int o= statues[0];

    for(int i=o; i<=v; i++){


        int finalI = i;
        if(!Arrays.stream(statues).anyMatch(t ->t== finalI)){
            arr.add(i);
        }



        }
    System.out.println(arr);
    }
/*
int solution(int[] a) {
    Arrays.sort(a);
    int n = a[a.length-1] - a[0];
    return n - a.length + 1;
}

 */





    public static int solution(int[] statues) {

        Arrays.sort(statues);

        List<Integer> arr = new ArrayList();


        for(int i=1; i<statues.length-1; i++){

            if (statues[i-1]!=statues[i]-1){

                arr.add(i);
                i++;

            }

        }

       return arr.size();

    }

}
