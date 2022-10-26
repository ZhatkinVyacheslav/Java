public class ZOO {
    protected Animal[] Cages = new Animal[4];
    protected boolean[] Fullness = new boolean[4];

    ZOO(Animal[] cages1) {
        for (int i = 1; i < 4; i++) {
            Cages[i] = cages1[i];
            if (Cages[i] != null){
                Fullness[i] = true;
            } else {
                Fullness[i] = false;
            }
        }
    }

    ZOO(){
        for (int i = 1; i < 4; i++){
            Cages[i] = null;
            Fullness[i] = false;
        }
    }

    void Push(Animal NewAnimal, int index) {
        if ((index < 0) && (index > 4)) {
            System.out.println("ERROR, not correct index");
        } else if (Fullness[index] == true) {
            System.out.println("ERROR, cage is full");
        }
        else {
            Fullness[index] = true;
            Cages[index] = NewAnimal;
        }
    }

    void Delete(int index){
        if (Fullness[index] == true ) {
            Fullness[index] = false;
            Cages[index] = null;
        }
    }

    void Walk(){
        System.out.println("\n\n\n\tYou walk though the zoo");
        for (int i = 0; i < 4; i++){
            if ( Fullness[i] == true){
                System.out.print("You walk past the cage with animal " + Cages[i].name);
                Cages[i].PrintVoice();
            }
        }
    }

}