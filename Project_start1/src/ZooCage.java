public class ZooCage {
    protected Animal[] Cages = new Animal[4];
    protected boolean[] Fullness = new boolean[4];
    protected TypeAnimal TypeCage;
    protected int Quantity;

    public ZooCage(Animal[] cages1) {
        Quantity = 0;
        for (int i = 0; i < 4; i++) {
            Cages[i] = cages1[i];
            if (Cages[i] != null){
                Fullness[i] = true;
                Quantity++;
                TypeCage = Cages[i].Type;
            } else {
                Fullness[i] = false;
            }
        }
        for (int i = 1; i < 4; i++)
        {
            if ((Cages[i] != null) && (Cages[i].Type != TypeCage))
            {
                Cages = null;
                System.out.println("ERROR! The type of animal in a cage must be the same in");
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
        if ((index < 0) && (index > 3)) {
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
    public int GetQuantity(){
        return Quantity;
    }
    public boolean GetFullness(int pos){
     return Fullness[pos];
    }
    public TypeAnimal GetType(){
        return TypeCage;
    }
    public Animal getCages(int pos) {
        return Cages[pos];
    }
    public void setCages(Animal cages, int pos) {
        if(cages.Type == TypeCage) Cages[pos] = cages;
        else System.out.println("ERROR! The type of animal in a cage must be the same");
    }
    public void setFullness(boolean fullness, int pos) {
        Fullness[pos] = fullness;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
    public void Walk(){
        for (int i = 0; i < 4; i++){
            if ( Fullness[i] == true){
                System.out.print("\nAnimal " + Cages[i].name + " says:");
                Cages[i].PrintVoice();
            }
        }
    }
}
