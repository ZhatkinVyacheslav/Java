public class ZOO {

    protected ZooCage[] CagesZoo;
    protected int size;

    public ZOO(int size1)
    {
        size = size1;
        CagesZoo = new ZooCage[size];
    }

    public ZOO(int size1, ZooCage CagesZoo1[])
    {
        int i = 0;
        while (CagesZoo1[i] != null)
        {
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
        CagesZoo = null;
        size++;
        CagesZoo = new ZooCage[size];
        for (int i = 0; i < size; i++)
        {
            CagesZoo[i] = HelpMass[i];
        }
    }

    public void Push(ZooCage CagesZoo1, int pos)
    {
        if  (((CagesZoo1.GetQuantity() - CagesZoo[pos].GetQuantity()) > 0) || ((CagesZoo[pos].GetQuantity() - CagesZoo1.GetQuantity()) > 0 )){
            for (int i = 0; i < 4; i++)
            {
                TypeAnimal typeAnimalCage = null;
                int flag = 0;
                if (CagesZoo[pos].GetFullness(i) && CagesZoo1.GetFullness(i))
                {
                    System.out.println("ERROR! There is no place in the cage");
                    break;
                } else {
                    if (flag == 0) {
                        if (CagesZoo[pos].GetFullness(i)) {
                            typeAnimalCage = CagesZoo[pos].GetType(i);
                            flag = 1;
                        }
                        else {
                            typeAnimalCage = CagesZoo1.GetType(i);
                            flag = 1;
                        }
                    }

                    if ((typeAnimalCage != CagesZoo1.GetType(i)) || (typeAnimalCage != CagesZoo[pos].GetType(i))){
                        System.out.println("ERROR, not correct type animal");
                        break;
                    }
                    else{
                        CagesZoo[pos].setCages(CagesZoo1.getCages(i), i);
                        CagesZoo[pos].setFullness(CagesZoo1.GetFullness(i), i);
                    }
                }
            }
            CagesZoo[pos].setQuantity(CagesZoo[pos].GetQuantity() + CagesZoo1.GetQuantity());
        } else System.out.println("ERROR! There is no place in the cage");
    }

}