public class ZOO {

    protected ZooCage[] CagesZoo;
    protected int size;
    protected boolean[] FullnessCage;
    public ZOO(int size1)
    {
        size = size1;
        CagesZoo = new ZooCage[size];
        FullnessCage = new boolean[size];
        for (int i = 0; i < size; i++)
        {
            FullnessCage[i] = false;
        }
    }
    public ZOO(int size1, ZooCage CagesZoo1[])
    {
        for (int j = 0; j < size; j++)
        {
            FullnessCage[j] = false;
        }
        int i = 0;
        while (CagesZoo1[i] != null)
        {
            FullnessCage[i] = true;
            i++;
        }
        if (i > size1) {
            System.out.println("ERROR, Size not correct!!!");
        }
        else {
            size = size1;
            CagesZoo = new ZooCage[size];
            CagesZoo = CagesZoo1;
        }
    }
    public void BuyCage()
    {
        ZooCage[] HelpMass = new ZooCage[size];
        HelpMass = CagesZoo;
        boolean[] helpBool =  new boolean[size];
        helpBool = FullnessCage;
        FullnessCage = null;
        CagesZoo = null;
        size++;
        CagesZoo = new ZooCage[size];
        FullnessCage = new boolean[size];
        for (int i = 0; i < size - 1; i++)
        {
            CagesZoo[i] = HelpMass[i];
            FullnessCage[i] = helpBool[i];
        }
        FullnessCage[size - 1] = false;
    }
    public void PushCage(ZooCage CagesZoo1, int pos)
    {
        if ((pos < 0) || (pos > size - 1 ))
        {
            System.out.println("ERROR!!! not correct position!");
        }
        else {
            if (FullnessCage[pos] == false) {
                CagesZoo[pos] = CagesZoo1;
                FullnessCage[pos] = true;
            }
            else System.out.println("ERROR!!! this cage is full");
        }
    }
    public void PushAnimalInCage(Animal NewAnimal, int posCage, int posAnimal){
        if ((posCage < 0) || (posCage > size - 1 )){
            System.out.println("ERROR!!! not correct position cage!");
        } else if((posAnimal < 0) || (posAnimal > 3)) {
            System.out.println("ERROR!!! not correct position Animal!");
        } else {
            CagesZoo[posCage].Push(NewAnimal, posAnimal);
        }
    }
    public void PopCage(int pos){
        if ((pos < 0) || (pos > size - 1 ))
        {
            System.out.println("ERROR!!! not correct position!");
        } else CagesZoo[pos] = null;
    }

    public void WalkInZoo(){
        System.out.println("\n\n\tAre you walking around the zoo");
        for (int i = 0; i < size; i++)
        {
            System.out.println("\n\nYou walk near the cage " + i);
            if (CagesZoo[i] == null)
            {
                System.out.println("Cage " + i + " is empty");
            }
            else  { CagesZoo[i].Walk(); }
        }
        System.out.println("\n\nWalking is end!");
    }

}