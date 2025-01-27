public class VypoctyTvaru {

    public static void main(String[] args) {
        System.out.println("Vypocet obsahu a obvodu kruhu");

    // Hodnoty Kruh
    double polomer = 5; // Poloměr kruhu
    double pi = 3.141592653589; // Hodnota π

    // Hodnoty Obdelník
    double stranaA = 10; // Délka strany A
    double stranaB = 5; // Délka strany B

    // Volání metody a zobrazení výsledku obsahu kruhu
    System.out.println("Obsah kruhu o polomeru " + polomer + " je: " + obsahkruhu(polomer, pi));

    // Volání metody a zobrazení výsledku obvodu kruhu
    System.out.println("Obvod kruhu o polomeru " + polomer + " je: " + obvodkruhu(polomer, pi));

    // Volání metody a zobrazení výsledku obsahu obdelníku
    System.out.println("Obsah obdelníku o délce strany A " + stranaA + " a délce strany B " + stranaB + " je: " + obsahobdelniku(stranaA, stranaB));

    // Volání metody a zobrazení výsledku obsahu obdelníku
    System.out.println("Obvod obdelníku o délce strany A " + stranaA + " a délce strany B " + stranaB + " je: " + obvodobdelniku(stranaA, stranaB));

    // Volání metody a zobrazení výsledku přetíženého obsahu kruhu
    System.out.println("Přetížený obsah kruhu o polomeru " + polomer + " je: " + obsahkruhu2(polomer));
    }
    // Metoda pro výpočet obsahu kruhu
    public static double obsahkruhu (double polomer, double pi) {

    return polomer * polomer * pi;
    }

    // Metoda pro výpočet obvodu kruhu
    public static double obvodkruhu (double polomer, double pi) {

    return 2 * polomer * pi;

    }
    // Metoda pro výpočet obsahu obdelníku
    public static double obsahobdelniku (double stranaA, double stranaB) {

    return stranaA * stranaB;
    }

    // Metoda pro výpočet obsahu obdelníku
    public static double obvodobdelniku (double stranaA, double stranaB) {

    return 2 * (stranaA + stranaB);
    }

    // Přetížená metoda pro obsah kruhu
    public static double obsahkruhu2 (double polomer) {
    double pi = 2000000000;
    return polomer * polomer * pi;
    }
}