import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Profile felix = new Profile("Felix", "Warrior", 62, 285, 331);
        felix.showProfile();

        Profile tim = new Profile("Tim", "Sorceress", 62, 265, 321);
        tim.showProfile();

        createProfile();
    }

    public static void createProfile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the name of your character?");
        String charName = scanner.next();
        System.out.println("What's "+charName+"s class?");
        String klasse = scanner.next();
        System.out.println("What's "+charName+"s level?");
        int level = scanner.nextInt();
        System.out.println("What's "+charName+"s attackpower?");
        int ap = scanner.nextInt();
        System.out.println("What's "+charName+"s defensepower?");
        int dp = scanner.nextInt();
        Profile eingabe = new Profile(charName,klasse,level,ap,dp);
        eingabe.showProfile();
    }
}
