import java.util.Scanner;

public class usluSayiHesaplama {

  static int us(int taban, int us){

    if( taban == 1 ){
      return 0;
    }

    return us(taban, us);

  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int taban, us;

    System.out.print("Taban değeri giriniz : ");
    taban = input.nextInt();

    System.out.print("Üs değeri giriniz : ");
    us = input.nextInt();

    int cevap = us(taban, us);
    System.out.println(cevap);



    
  }
  
}
