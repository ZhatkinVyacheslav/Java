public class ZooCage {
    protected Animal[] Cages = new Animal[4];
    protected boolean[] Fullness = new boolean[4];
    TypeAnimal TypeCage;
    protected int Quantity;

    public ZooCage(Animal[] cages1) {
        Quantity = 0;
        for (int i = 1; i < 4; i++) {
            Cages[i] = cages1[i];
            if (Cages[i] != null){
                Fullness[i] = true;
                Quantity++;
            } else {
                Fullness[i] = false;
            }
        }
    }
    public ZooCage(){
        for (int i = 1; i < 4; i++){
            Cages[i] = null;
            Fullness[i] = false;
        }
    }
    public void Push(Animal NewAnimal, int index) {
        if ((index < 0) && (index > 4)) {
            System.out.println("ERROR, not correct index");
        } else if (Fullness[index] == true) {
            System.out.println("ERROR, cage is full");
        }
        else {
            Quantity++;
            Fullness[index] = true;
            Cages[index] = NewAnimal;
        }
    }
    public void Delete(int index){
        if (Fullness[index] == true ) {
            Fullness[index] = false;
            Cages[index] = null;
            Quantity--;
        }
    }
    public void Walk(){
        System.out.println("\n\n\n\tYou walk though the zoo");
        for (int i = 0; i < 4; i++){
            if ( Fullness[i] == true){
                System.out.print("You walk past the cage with animal " + Cages[i].name);
                Cages[i].PrintVoice();
            }
        }
    }
    public int GetQuantity(){
        return Quantity;
    }
    public boolean GetFullness(int pos){
     return Fullness[pos];
    }
    public TypeAnimal GetType(int pos){
        return Cages[pos].GetTypeAnimal();
    }
    public Animal getCages(int pos) {
        return Cages[pos];
    }
    public void setCages(Animal cages, int pos) {
        Cages[pos] = cages;
    }
    public void setFullness(boolean fullness, int pos) {
        Fullness[pos] = fullness;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
