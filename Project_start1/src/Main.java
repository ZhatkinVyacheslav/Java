
public class Main {
    public static void main(String[] args) {
        TypeAnimal newtype1, newtype2;
        newtype1 = TypeAnimal.Predator;
        newtype2 = TypeAnimal.Herbivore;

        String str1, str2, str4;
        str1 = "Johny";
        str2 = "Feline class (Cat)";
        str4 = "Meooooow";

        Animal CatJohny = new Animal(str1, str2, newtype1, str4);
        CatJohny.PrintAll();

        str1 = "Mark";
        str2 = "Dog";
        str4 = "WaW Waw auuuu";

        Animal DogMark = new Animal(str1, str2, newtype1, str4);
        DogMark.PrintAll();

        ZooCage cage = new ZooCage();
        cage.Push(CatJohny, 2);
        cage.Push(DogMark, 0);
        cage.Walk();
        cage.Delete(2);
        cage.Walk();
        cage.Push(CatJohny, 0);
    }
}