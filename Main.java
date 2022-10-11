import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> idols = new ArrayList<String>();

        Idol<String> firstIdol = new Idol<String>();
        firstIdol.setIdolName("Lisa Manoban");
        firstIdol.setIdolOrigin("BlackPink");
        idols.add("I am " + firstIdol.getIdolName()+ ".I am from " + firstIdol.getIdolOrigin());

        Idol<String> secondIdol = new Idol<String>();
        secondIdol.setIdolName("Kim Ji-Hyo");
        secondIdol.setIdolOrigin("TWICE");
        idols.add("I am " + secondIdol.getIdolName()+ ".I am from " + secondIdol.getIdolOrigin());

        Idol<String> thirdIdol = new Idol<String>();
        thirdIdol.setIdolName("Liz");
        thirdIdol.setIdolOrigin("IVE");
        idols.add("I am " + thirdIdol.getIdolName()+ ".I am from " + thirdIdol.getIdolOrigin());

        Idol<String> fourthIdol = new Idol<String>();
        fourthIdol.setIdolName("Shin Ryujin");
        fourthIdol.setIdolOrigin("ITZY");
        idols.add("I am " + fourthIdol.getIdolName()+ ".I am from " + fourthIdol.getIdolOrigin());

        

        System.out.print("[0,1,2,3]");
        System.out.print("\nEnter your choosen index:");
        int input = sc.nextInt();

        try {
            if (input < 0) {
                sc.close();
                throw new IdolException("Your input is negative. Please input positive index.");
            }
            if (input > 3) {
                sc.close();
                throw new IdolException("Your input exceeds the size of the array.");
            }

            System.out.println("Index number: " + input);
            System.out.println(idols.get(input));

        } catch (IdolException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}