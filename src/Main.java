import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        system.in sistem benden deer beklcek demek
//        eğer iki ismim varsa ikinci ismi de alırsın


//        System.out.print("isminizi giriniz:");
//        String a = scn.next();
//        System.out.print("yaşınızı giriniz:");
//        int b = scn.nextInt();
//        System.out.print(" merhaba benim adım " + a + " yasım " + b + " hoş geldiniz");


//        System.out.print("doğum yılınızı giriniz:");
//        int n = scn.nextInt();
//        int b;
//        b=2024-n;
//        System.out.print("yaşınız " + b);

//        System.out.print("celcius değerini giriniz:");
//        double celcius = scn.nextDouble();
//        double f= (celcius * 9/5)+32;
//        System.out.println("fahrenheit değeri " + f);
//


//if elseif else  lü yapısının kullanılmasının sebebi if yaparsak hepsini olsa da olmasa da hepsini tek tek kontrol edecek

//        System.out.println("a sayısını giriniz:");
//        int a = scn.nextInt();
//        System.out.println("b sayıyı giriniz:");
//        int b = scn.nextInt();
//        if (a < b) {
//            System.out.println("a b'den küçüktür");
//        } else if (b < a) {
//            System.out.println("a b'den büyüktür ");
//        } else {
//            System.out.println("iki sayı birbirine eşittir");
//        }

//        System.out.println("1. sayıyı giriniz:");
//        int n = scn.nextInt();
//        System.out.println("2. sayıyı giriniz:");
//        int m = scn.nextInt();
//        System.out.println("3. sayıyı giriniz:");
//        int s = scn.nextInt();
//        int maxS=n;
//        if (maxS<m) {
//            maxS=m;
//        }
//        if(maxS<s) {
//            maxS=s;
//        }
//
//
//        System.out.println("en büyük: " + maxS );


//        System.out.println("üçgenin taban uzunluğunu giriniz:");
//        int taban =scn.nextInt();
//        System.out.println("üçgenin yüksekliğini giriniz:");
//        int yuksekli =scn.nextInt();
//        int alan= taban*yuksekli/2;
//        System.out.println(alan);


//        System.out.println("birinci sayııyı giriniz: ");
//        int sayi1 = scn.nextInt();
//        System.out.println("ikinci sayıyı giriniz: ");
//        int sayi2 = scn.nextInt();
//
//        System.out.println("işlem giriniz: \n " +"1:toplama \n "+ "2:çıkarma \n" + "3:çarpma \n" + "4: bölme");
//        int değer=scn.nextInt();
//        if (değer==1){
//            System.out.println(sayi1+sayi2);
//        }
//        if(değer ==2){
//            System.out.println(sayi1-sayi2);
//        }
//        if(değer==3){
//            System.out.println(sayi1*sayi2);
//        }
//        if (değer == 4) {
//            System.out.println(sayi1/sayi2);
//        }


//        System.out.println("vize notunuzu giriniz:");
//        int v = scn.nextInt();
//        System.out.println("final noyunuzu giriniz:");
//        int f = scn.nextInt();
//        double sonuC= (v*0.4) + (f*0.6);
//        if (sonuC >= 90){
//            System.out.println("AA");
//        }
//        else if (sonuC>= 85 && sonuC<=89) {
//            System.out.println("BA");
//        }
//        else if (sonuC>=80 && sonuC<=84) {
//            System.out.println("BB"); jkjjk
//        }
//        else if (sonuC>=75 && sonuC<=79) {
//            System.out.println("CB");
//        }
//        else if (sonuC>=70 && sonuC<=74) {
//            System.out.println("CC");
//        }
//        else if (sonuC>=65 && sonuC<=69) {
//            System.out.println("DC");
//        }
//        else if (sonuC>=60 && sonuC<=64) {
//            System.out.println("DD");
//        }
//        else {
//            System.out.println("FF");
//        }


//        int sayac=1;
//        do {
//            System.out.println("java");
//            sayac++;
//
//        }
//        while (sayac <= 10);




//5 yazmaz  continue olduğu için atlar
//    int i;
//     for(i=1;i<=10;i++) {
//         if (i == 5) {
//             continue;
//         }
//         System.out.println(i);
//
//     }

//        System.out.println("bir sayı giriniz:");
//        int n = scn.nextInt();
//        int a=0;
//        for (int i = 0; i <= n; i++) {
//            a=+i;
//        }
//        System.out.println(a);


//        System.out.println(" bir sayı giriniz:");
//        int sayi= scn.nextInt();
//        int toplam=0;
//        int geçiciSayi=sayi;
//        int basamakSayisi =0;
//        while (geçiciSayi !=0){
//            basamakSayisi ++;
//            geçiciSayi=geçiciSayi/10;
//        }
//
//
//        while (basamakSayisi!=0){
//            toplam+= sayi%10;
//            sayi/=10;
//            toplam=sayi;
//        }
//
//
//
//        System.out.println( toplam);

//        int sayi = scn.nextInt();
//        for ( sayi=1 ; sayi <=10; sayi++)
//        {
//
//            if ( sayi % 2 ==0 )
//            {a
//                System.out.println(sayi + " çift sayı");
//
//            }
//            else
//            {
//                System.out.println(sayi + " tek sayıdır");
//            }
//        }



       // klavyeden girilen bia a tam sayısını n tam bölenlerini hesaplayıp listeleyen () -> program

//        System.out.println("bir sayı giriniz:");
//        int sayi= scn.nextInt();
//        for (int i=1; i<=sayi; i++) {
//           if( sayi%i==0)
//           {
//               System.out.println(i);
//           }
//        }




        //çarpım tablosu

//        System.out.println("birinci sınırı giriniz:");
//        int aralık1=scn.nextInt();
//        System.out.println("ikinci sınırı giriniz:");
//        int aralık2=scn.nextInt();
//        for (aralık1= aralık1; aralık1<=aralık2; aralık1++)
//        {
//            for(int j=1; j<10; j++)
//            {
//                System.out.println(aralık1+"x"+j+"="+aralık1*j);
//            }
//        }


        // klavyeden girilen b tam sayısına göre a^3-a^2= b eşitliğini sağlayan 0<a<100 sayılarını hesaplayın
//        System.out.println("bir sayı giriniz");
//        int sayi=scn.nextInt();
//        int işlem;
//        for (int i = 1; i <= 100 ; i++)
//        {
//            if(i*i*i-i*i == sayi){
//                System.out.println(i);
//            }





//        for (int i=0; i<5; i++)
//        {
//            for (int j=0; j<5; j++)
//            {
//                if (i==0 || i==4)
//                {
//                    System.out.print("*");
//                }
//                else if (j==0 || j==4)
//                {
//                    System.out.print("*");
//                } else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }



//        ağacın yüksekliğini alıp ağaç çizdirmek?????????????????????????? büyük problem




//        System.out.print("kaç öğrencinin adını ve notunu gireceksiniz:");
//        int length = scn.nextInt();
//        int[] notlar=new int[length];
//        String[] isimler=new String[length];
//        for (int i=0;i<length;i++) {
//            System.out.print(i+1 +". öğrencinin adını giriniz:");
//            isimler[i]=scn.next();
//            System.out.print(i+1 +". öğrencinin notunu giriniz:");
//            notlar[i]=scn.nextInt();
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        for (int i=0;i<length;i++)
//        {
//            System.out.println(i + 1 + "." + isimler[i] + " adlı öğrencinin aldığı not " + notlar[i]);
//        }


        
//        Random rand = new Random();
//
//        int tutulanSayi = rand.nextInt(100); // 0-99 arası bir sayı
//        int tahmin = -1;
//        System.out.println("0 ile 99 arasında bir sayı tuttum. Tahmin etmeye çalış!");
//        while (tahmin != tutulanSayi)
//        {
//            System.out.print("Tahmininizi girin: ");
//            tahmin = scn.nextInt();
//            if (tahmin < tutulanSayi)
//            {
//                System.out.println("Daha büyük bir sayı girin.");
//            }
//            else if (tahmin > tutulanSayi)
//            {
//                System.out.println("Daha küçük bir sayı girin.");
//            }
//            else
//            {
//                System.out.println("Tebrikler! Sayıyı doğru tahmin ettiniz.");
//            }
//        }


        //diziye girilen sayıların kareleri toplamını bul

//        System.out.println("kaç elemanlı bir dizi yapacaksınız:");
//        int diziSayısı = scn.nextInt();
//        int[] diziler = new int[diziSayısı];
//        int toplam=0;
//        for (int i=0; i<diziler.length; i++) {
//            System.out.println("dizinin " + (i + 1) + ". elemanını giriniz:");
//            diziler[i] = scn.nextInt();
//        }
//
//        for ( int i=0; i<diziler.length; i++){
//            System.out.println("Dizi[" + i + " ] " +": " + diziler[i]);
//            toplam += diziler[i]*diziler[i];
//
//        }
//        System.out.println(toplam);


        System.out.println("kaç elemanlı bir dizi yapacaksınız:");
        int diziSayısı = scn.nextInt();
        int[] diziler = new int[diziSayısı];
        for (int i=0; i<diziler.length; i++) {
            System.out.println("dizinin " + (i + 1) + ". elemanını giriniz:");
            diziler[i] = scn.nextInt();
        }

        for ( int i=diziler.length-1; i>=0; i--){
            System.out.println("Dizi[" + i + " ] " + ": " + diziler[i]);
        }








    }
}









