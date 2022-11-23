
public class Main {
    public static void main(String[] args) {
        TypeAnimal newtype1, newtype2;
        newtype1 = TypeAnimal.Predator;
        newtype2 = TypeAnimal.Herbivore;

        String str1;
        str1 = "Feline class (Cat)";

        Animal CatJohny = new Animal("Johny", str1, newtype1, "Meooooow");
        Animal CatZoe = new Animal("zoe", str1, newtype1, "Meuur");
        Animal CatBob = new Animal("Bob", str1, newtype1, "Meow meow");

        ZooCage cageCat = new ZooCage();
        cageCat.Push(CatJohny, 2);
        cageCat.Push(CatZoe, 0);
        cageCat.Push(CatBob, 3);

        str1 = "Dog";
        Animal DogMark = new Animal("Mark", str1, newtype1, "WaW Waw auuuu");
        Animal DogMax = new Animal("Max", str1, newtype1, "Grrrrr");

        ZooCage cageDog = new ZooCage();
        cageDog.Push(DogMark, 0);
        cageDog.Push(DogMax, 1);

        str1 = "Hamster";
        Animal HamsterSheldon = new Animal("Sheldon", str1, newtype2, "fut fut");
        Animal HamsterLeonard = new Animal("Leonard", str1, newtype2, "Aaaau");
        Animal HamsterGovard = new Animal("Govard", str1, newtype2, "Piiiu");
        Animal HamsterRadj = new Animal("Radj", str1, newtype2, "Uaaau");

        ZooCage cageHamster = new ZooCage();
        cageHamster.Push(HamsterSheldon, 0);
        cageHamster.Push(HamsterLeonard, 1);
        cageHamster.Push(HamsterGovard, 2);
        cageHamster.Push(HamsterRadj, 3);


        ZOO Limpopo = new ZOO(2);
        Limpopo.PushCage(cageCat, 0);
        Limpopo.PushCage(cageDog, 1);

        Limpopo.WalkInZoo();

        Limpopo.BuyCage();
        Limpopo.PushCage(cageHamster, 2);

        Limpopo.WalkInZoo();
    }
}