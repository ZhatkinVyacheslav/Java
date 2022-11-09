import java.util.Scanner;
enum TypeAnimal {Predator, Herbivore}

public class Animal {
    protected String name, classAnimal, voice;
    //protected TypeAnimal type;
    TypeAnimal Type;
    Animal(String name1, String classAnimal1, TypeAnimal type1, String voice1){
        name = name1;
        classAnimal = classAnimal1;
        // if ((type1 == "Predator") || (type1 == "Herbivore")) type = type1;
        // else throw new MyException("String can not be empty!");
        Type = type1;
        voice = voice1;
    }
    Animal(int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInput Name: ");
        name = sc.next();
        System.out.println("\nInput Class:");
        classAnimal = sc.next();
        System.out.println("\nInput Type:");
        //Type = sc.next();
        System.out.println("\nInput the sound of an animal");
        voice = sc.next();
        sc.close();
    }

    public void PrintName(){
        System.out.println("\nName: " + name);
    }

    public void PrintClassAnimal(){
        System.out.println("\nClass: " + classAnimal);
    }

    public void PrintTypeAnimal(){
        System.out.println("\nType: " + Type);
    }

    public void PrintVoice(){
        System.out.println("\nVoce: " + voice);
    }

    public void PrintAll(){
        System.out.println("\n\tAnimal " + name);
        System.out.println("Name: " + name);
        System.out.println("Class: " + classAnimal);
        System.out.println("Type: " + Type);
        System.out.println("Voce: " + voice);
    }
    public TypeAnimal GetTypeAnimal(){
        return Type;
    }
}
