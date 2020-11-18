public class Main {
    public static void main(String[] args) {
        KneipenGang drinkingTour1 = new KneipenGang();
        drinkingTour1.registerBier(5, "halbe");
        drinkingTour1.registerBier(10, "seiterl");
        drinkingTour1.registerSchnaps(6);
        drinkingTour1.registerWein(4);
        drinkingTour1.alkoholReport();
        KneipenGang drinkingTour2 = new KneipenGang();
        drinkingTour2.registerBier(3, "halbe");
        drinkingTour2.alkoholReport();
        //System.out.println("Resultat: "+KneipenGang.name+" ist ein Säufer!");
    }
}