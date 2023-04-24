import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;
import java.util.List;

public class ListTests {
    @Test 
	public void removeOneFilterTest() {
        List<String> lst = new ArrayList<String>();
        lst.add("longestWord");
        lst.add("longWord");
        lst.add("short");
        checker sc = new checker();
        for (int i = 0; i < lst.size(); i++) {
            if (!sc.checkString(lst.get(i))) {
                lst.remove(i);
            }
        }
        String[] result = {"longestWord", "longWord"};
        assertArrayEquals(result, lst.toArray());
	}

    @Test 
	public void emptyFilterTest() {
        List<String> lst = new ArrayList<String>();
        List<String> actual = new ArrayList<String>();
        lst.add("short");
        lst.add("short");
        lst.add("short");
        lst.add("short");
        checker sc = new checker();
        // for (int i = 0; i < lst.size(); i++) {
        //     if (sc.checkString(lst.get(i))) {
        //         actual.add(lst.get(i));
        //     }
        // }
        String[] result = {};
        System.out.println(lst.toArray().length);
        assertArrayEquals(result, actual.toArray());
	}
}
