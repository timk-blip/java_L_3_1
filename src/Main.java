import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print ("Введите цену билета \n");
        float price = in.nextFloat();
        float mile = price / 20;
        System.out.print ("Вам начислено бесплатных миль \n" + mile);
    }
}