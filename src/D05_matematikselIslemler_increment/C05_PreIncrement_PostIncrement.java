package D05_matematikselIslemler_increment;

public class C05_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        // Java'da bir onceki class'da yaptigimiz gibi artirma ve atama , veya artirma ve yazdirma beraber olabilir

        int a = 20;
        int b= 10;
        System.out.println( b = 2 * a); // 40
        System.out.println(a = b - 5); // 35

        a= 10;
        // once a'nin degerini b'ye atayin, sonra a'yi artirin
        b = a++;
        System.out.println("a : " + a + " b : " + b); // a : 11 b : 10

        a=10;
        // once a'nin degerini bir artirin, sonra a'nin degerini b'ye atayin
        b = ++a;
        System.out.println("a : " + a + " b : " + b); // a : 11 b : 11

        a= 20;
        System.out.println(a++); // 20
        System.out.println(a); // 21

        a= 20 ;
        System.out.println(--a); // 19
        System.out.println(a); // 19
    }
}
