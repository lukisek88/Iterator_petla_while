import java.util.Random;

public class Kodilla{
    public static void main(String[] args) {
        int sumaA = 1000;
        int sumaB = 0;
        int count = 0;


        Random rG = new Random();

        while(sumaA>sumaB){
            count++;
            sumaA += rG.nextInt(9);
            sumaB += rG.nextInt(49);

            System.out.println("Proba: "+count+"  "+"Liczba A: "+sumaA+"  "+"Liczba B: "+sumaB);


        }
    }
}

