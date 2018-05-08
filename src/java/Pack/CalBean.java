
package Pack;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


@Stateless
public class CalBean {
    
    private static List<String> listIt = new ArrayList<>(); 

    public int calAdd(int a, int b)
    {
        return (a+b);
    }
    
    public List<String> calAdList(String b)
    {
        listIt.add(b);
        return listIt;
    }
    
}
