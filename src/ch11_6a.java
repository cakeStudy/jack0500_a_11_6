import java.util.ArrayList;
import java.util.Collections;

public class ch11_6a
{
    /*Write a method countUnique that accepts a list of integers as a parameter and returns the number of unique integer
    values in the list. Use a set as auxiliary storage to help you solve this problem. For example, if a list contains the values
    [3, 7, 3, –1, 2, 3, 7, 2, 15, 15], your method should return 5. The empty list contains 0 unique values.*/

    public void run()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(3);
        list.add(-1);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(15);
        list.add(15);

        System.out.println(countUnique(list));
    }

    public Integer countUnique(ArrayList<Integer> list)
    {
        Integer uniqueCount = 0;
        if (list.size() == 0)
        {
            return uniqueCount;
        }else
        {
            //sorts the list
            Collections.sort(list);
            int slutIndex = list.size();
            try
            {
                for (int i = 0; i < slutIndex; i++)
                {
                    if (list.get(i) == list.get(i + 1))
                    {
                        list.remove(i);
                        i--;
                        slutIndex--;
                    }
                    uniqueCount = list.size();
                }
            }catch (IndexOutOfBoundsException IOOBe)
            {
                return uniqueCount;
            }
        }
        return uniqueCount;
    }
}
