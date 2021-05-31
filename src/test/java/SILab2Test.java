import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SILab2Test {
    @Test
    public void multipleCondition() {

    }

    @Test
    public void everyBranch() {
        ArrayList<Time> testList1 = new ArrayList<>(){
            {
                add(new Time(15, 25, 30));
                add(new Time(16, 03, 22));
            }
        };

        ArrayList<String> resultList = new ArrayList<>() {
            {
                add(55530);
                add(57802);
            }
        };
        assertEquals(SILab2.function(testList1), resultList);
        
        ArrayList<String> testList2 = new ArrayList<>();
        assertTrue(SILab2.function(testList2).isEmpty());

        ArrayList<Time> testList3 = new ArrayList<>(){
            {
                add(new Time(27, 02, 22));
            }
        };

        assertThrows(RuntimeException.class, () -> SILab2.function(testList3));

        ArrayList<Time> testList4 = new ArrayList<>(){
            {
                add(new Time(-15, 02, 22));
            }
        };

        assertThrows(RuntimeException.class, () -> SILab2.function(testList4));

        ArrayList<Time> testList5 = new ArrayList<>(){
            {
                add(new Time(12, 88, 22));
            }
        };

        assertThrows(RuntimeException.class, () -> SILab2.function(testList5));

        ArrayList<Time> testList6 = new ArrayList<>(){
            {
                add(new Time(12, 30, 120));
            }
        };

        assertThrows(RuntimeException.class, () -> SILab2.function(testList6));
    }
}