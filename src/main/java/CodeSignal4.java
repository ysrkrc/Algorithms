package lambda;

import java.util.Arrays;


public class CodeSignal4 {
    public static void main(String[] args) {
//Bir tamsayı dizisi verildiğinde, en büyük çarpımı olan bitişik eleman çiftini bulun ve bu ürünü döndürün.

        int inputArray[] = {-23, 4, -3, 8, -12};
        int sum=0;
        for (int i=0; i<inputArray.length-1;i++){

          sum= Math.max(sum,inputArray[i]*inputArray[i+1]);


        } System.out.println(sum);
    }
}


