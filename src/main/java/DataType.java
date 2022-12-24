package Questions;

import java.util.Scanner;

public class DataType {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int count =scan.nextInt();
        String s="";

        for(int i=0;i<count;i++){
            try{
                s=scan.next();
                long l=Long.valueOf(s);
                if(l>Byte.MIN_VALUE&l<Byte.MAX_VALUE){
                    System.out.println(s+" can be fitted in:"+
                            "\n* byte "+"\n* short"+"\n* int"+"\n* long ");
                }else if(l>Short.MIN_VALUE & l<Short.MAX_VALUE){
                    System.out.println(s+" can be fitted in:"+
                            "\n* short"+"\n* int"+"\n* long ");
                }else if(l>Integer.MIN_VALUE & l<Integer.MAX_VALUE){
                    System.out.println(s+" can be fitted in:"+
                            "\n* int"+"\n* long ");
                }else {
                    System.out.println(s+" can be fitted in:"+
                            "\n* long ");
                }

            }catch(Exception e){
                System.out.println( s+ " can't be fitted anywhere.");
            }
        }

    }
}