import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner digits = new Scanner(System.in);
        String lvls[]={"FirstLVL","SecondLVL","ThirdLVL"};
        System.out.println(lvls[0]);
        FirstLvl firstLvl = new FirstLvl();
        System.out.println("Write the number of teams: ");
        int n = digits.nextInt();
        System.out.println("Write the number of prizes:");
        int m = digits.nextInt();
        long result = firstLvl.Function(n,m);
        System.out.println("Results of team prizes combinations: "+result);
        System.out.println("\n"+lvls[1]);
        SecondLvl secondLvl = new SecondLvl();
        System.out.println("Write the number of characters:");
        int nC = digits.nextInt();
        System.out.println("Write the length of word");
        int nW= digits.nextInt();
        long result2 = secondLvl.Function(nC,nW);
        System.out.println("Result of words combination: "+result2);
        System.out.println("\n"+lvls[2]);
        int[] digitsForThirs = {1,2,3,4,5,6,7,8,9};
        ThirdLvl thirdLvl = new ThirdLvl(digitsForThirs);
    }

}