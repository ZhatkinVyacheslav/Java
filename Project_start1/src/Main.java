
public class Main {
    public static void main(String[] args) {
        String str1, str2, str3, str4;
        str1 = "Johny";
        str2 = "Feline class (Cat)";
        str3 = "Predator";
        str4 = "Meooooow";

        Animal CatJohny = new Animal(str1, str2, str3, str4);
        CatJohny.PrintAll();

        str1 = "Mark";
        str2 = "Dog";
        str3 = "Predator";
        str4 = "WaW Waw auuuu";

        Animal DogMark = new Animal(str1, str2, str3, str4);
        DogMark.PrintAll();

        ZOO zoopark = new ZOO();
        zoopark.Push(CatJohny, 2);
        zoopark.Push(DogMark, 0);
        zoopark.Walk();
        zoopark.Delete(2);
        zoopark.Walk();
        zoopark.Push(CatJohny, 0);

    }
}