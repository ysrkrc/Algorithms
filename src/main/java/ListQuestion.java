import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListQuestion {
    public static void main(String[] args) {
        /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.
  */
        List<Integer> list = new ArrayList<>();
        calistir(list);
    }

    public static void calistir(List<Integer> list) {
        System.out.println("        (:(:Hoşgeldiniz:):)" + "" +
                "\n Listenize integer data girişi için --1-- " +
                "\n Listenizden eleman silmek için --2-- " +
                "\n Listenizdeki elemanı güncellemek için --3-- " +
                "\n Çıkış için -1 girişi yapınız");
        Scanner scan = new Scanner(System.in);

        try {
            Integer yapilanSecim = scan.nextInt();

            switch (yapilanSecim) {

                case 1:
                    dataGirisi(list);
                    break;
                case 2:
                    dataSil(list);
                    break;
                case 3:
                    dataGuncelle(list);
                    break;
                case -1:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Yanlış giriş yaptınız, lütfen tekrar deneyiniz");
                    calistir(list);
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Integer girişi yapınız!!!");
            calistir(list);
        }
    }

    private static void dataGirisi(List<Integer> l) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nListenize eklemek istediğiniz integer değeri giriniz : ");
        Integer i = scan.nextInt();
        l.add(i);
        System.out.println(i + " değeri eklendi");
        System.out.println("\nListenizin yeni hali : ");
        l.stream().forEach(t -> System.out.print(t + " "));
        System.out.println();
        calistir(l);


    }

    private static void dataSil(List<Integer> l) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n Silmek istediğiniz integer değeri giriniz : ");
        Integer i = scan.nextInt();
        if (l.stream().anyMatch(t -> t == i)) {
            l.remove(l.indexOf(i));
            System.out.println(i + " Değeri silindi");
            System.out.println("\n  Listenizin yeni hali : ");
            l.stream().forEach(t -> System.out.print(t + " "));
            System.out.println();
            calistir(l);
        } else {
            System.out.println("\nGirdiğiniz değer Listenizde bulunamadı");
            calistir(l);
        }
    }

    private static void dataGuncelle(List<Integer> l) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Güncellemek istediğiniz integer değeri giriniz : ");
        Integer i = scan.nextInt();
        System.out.println("Yeni değeri giriniz");
        Integer yenideger = scan.nextInt();
        if (l.stream().anyMatch(t -> t == i)) {
            l.stream().filter(t -> t == i).map(t -> yenideger);
            System.out.println("Güncellemeniz yapılmıştır.");
            calistir(l);
        } else {
            System.out.println("değer bulunamadı...");
            calistir(l);
        }
    }

}