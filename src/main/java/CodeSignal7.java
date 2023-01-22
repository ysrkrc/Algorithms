package lambda;

import java.util.Arrays;

public class CodeSignal7 {

    /*
    Bir dizi olarak bir tamsayı dizisi verildiğinde, diziden birden fazla eleman çıkarmadan
    kesin olarak artan bir dizi elde etmenin mümkün olup olmadığını belirleyin.

    Not: a0, a1, ..., an dizisi, a0 < a1 < ... < an ise kesin artan olarak kabul edilir.
    Yalnızca bir eleman içeren dizinin de kesinlikle artan olduğu kabul edilir.
     */

    public static void main(String[] args) {


    }


    boolean solution(int[] sequence) {

        int count=0;
        for(int i=0; i<sequence.length-1; i++){
            if( sequence[i]>= sequence[i+1]){
                count++;
            }
            if( i>=1 && i+2<= sequence.length-1 &&
                    sequence[i] >= sequence[i+2] && sequence[i-1]>= sequence[i+1] ){
                return false;
            }


        }if(count<=1 ){
            return true;
        } else {
            return false;
        }
    }







}
