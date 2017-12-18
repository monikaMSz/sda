import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
        int count = 5;
        String [] pairLeft = {"john", "john", "john", "mary", "mary"};
        String [] pairRight = {"tom", "mary", "tom", "anna", "anna"};
        Set<String> set = new HashSet<>();//w nawiasie count

        for(int i = 0; i<pairLeft.length/*count; i++){//zlaczenie
            set.put(pairLeft[i] + pairRight[i]);
                //dodawanie do set
            //wyswietlanie rozmiaru seta
        }
	}
}//set.aa(pairLeft[i] + "," + pairRight[i])
system.out.println(set.size());

sout(size)