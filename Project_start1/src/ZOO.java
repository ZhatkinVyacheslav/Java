import java.util.ArrayList;
import java.util.List;
public class ZOO {

    protected List<ZooCage> CagesZoo = new ArrayList<ZooCage>();
    //protected int size;
    //protected boolean[] FullnessCage;
    public ZOO() {
    }

    public void BuyCage()
    {
        ZooCage newCage = new ZooCage();
        CagesZoo.add(newCage);
    }
    public void PushCage(ZooCage newCage, int pos)
    {
        CagesZoo.add(newCage);
    }
    public void PushAnimalInCage(Animal NewAnimal, int posCage, int posAnimal)throws Exception {
        if ((posCage < 0) || (posCage > CagesZoo.size() - 1 )){
            throw new Exception("ERROR!!! not correct position!");
        } else if((posAnimal < 0) || (posAnimal > 3)) {
            throw new Exception("ERROR!!! not correct position!");
        } else {
            ZooCage newCage = new ZooCage();
            newCage = CagesZoo.get(posCage);
            newCage.Push(NewAnimal, posAnimal);
            CagesZoo.set(posCage, newCage);
        }
    }
    public void PopCage(int pos) throws Exception{
        if ((pos < 0) || (pos > CagesZoo.size() - 1 ))
        {
            throw new Exception("ERROR!!! not correct position!");
        } else {
            if (CagesZoo.isEmpty()) {
                throw new Exception("ERROR!!! Empty!");
            } else {
                CagesZoo.remove(pos);
            }
        }
    }

    public void WalkInZoo(){
        System.out.println("\n\n\tAre you walking around the zoo");
        for (int i = 0; i < CagesZoo.size(); i++)
        {
            System.out.println("\n\nYou walk near the cage " + i);
            if (CagesZoo.get(i) == null)
            {
                System.out.println("Cage " + i + " is empty");
            }
            else  { CagesZoo.get(i).Walk(); }
        }
        System.out.println("\n\nWalking is end!");
    }

}