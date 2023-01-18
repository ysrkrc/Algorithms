package lambda;

public class CodeSignal5 {
    /*
Aşağıda n-ilginç bir çokgen tanımlayacağız. Göreviniz, belirli bir n için bir çokgenin alanını bulmaktır.

1-ilginç çokgen, bir kenar uzunluğu 1 olan bir karedir. n-ilginç çokgen, n - 1-ilginç
çokgeni alıp kenarına 1-ilginç çokgenleri yan yana ekleyerek elde edilir.
Aşağıdaki resimde 1-, 2-, 3- ve 4- ilginç çokgenlerini görebilirsiniz.
 25
    */

    int solution(int n) {


        int sum= (n*n)+((n-1)* (n-1));


        return sum;
    }

}
