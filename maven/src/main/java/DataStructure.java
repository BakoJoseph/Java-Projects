import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import javax.xml.crypto.Data;
public class DataStructure {
    public static void bagging(){
        Bag<String> bag = new  HashBag<>();
        bag.add("CHRIS");
        bag.add("MOCHA");
        bag.add("CHRIS");
        bag.add("CHRIS");
        bag.add("GIFT");
        System.out.println(bag.getCount("CHRIS"));
    }
    public static void bidiMapping(){
        BidiMap<Integer, String> bidiMap = new TreeBidiMap<>();
        bidiMap.put(1, "one");
        System.out.println(bidiMap.get(1));
        System.out.println(bidiMap.getKey("one"));
    }
    public static void main(String[] args) {

        //DataStructure.bagging();
        DataStructure.bidiMapping();
    }
}
