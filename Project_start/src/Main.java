
public class Main {
    public static void main(String[] args) {
        String str1, str2, str3, str4;
        str1 = "Johny";
        str2 = "Feline class (Cat)";
        str3 = "Predator";
        str4 = "Meooooow";

        Animal CatJohny = new Animal(str1, str2, str3, str4);
        CatJohny.PrintAll();
    }
}