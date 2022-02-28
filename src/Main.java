import java.util.Scanner;
public class Main {
    static public void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("0 dan sayıya ;3 ve 4 e bölünen sayılarının ortalamasını bulan programa hoşgeldin");
        System.out.println("Please enter your number: ");
        int number1 = input.nextInt();
        int total=0;
        int number2= 0;

        for (int a=1 ; a<number1; a++) {

            if (a%3== 0 && a%4==0) {
                total+=a; //System.out.println("a: "+ a);
                number2++; }//System.out.println("Number2: "+ number2);
        }
        System.out.println("Ortalama: " + total/number2);

    }
}
