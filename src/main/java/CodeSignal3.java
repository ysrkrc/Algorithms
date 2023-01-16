package lambda;

public class CodeSignal3 {

    public static void main(String[] args) {
        boolean mm= solution("abbja");
        System.out.println(mm);
    }


       public static boolean solution(String inputString) {


            for (int i =0; i<inputString.length()/2; i++){
               if (inputString.charAt(i)!= inputString.charAt(inputString.length()-1-i)){
                   return false;
               }
            }


      return true;
         }



    }