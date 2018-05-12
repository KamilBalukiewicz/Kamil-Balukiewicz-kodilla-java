package collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: begin");
    }
    @After
    public void after() {
        System.out.println("Test case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test suit: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //given
        ArrayList<Integer> myList = new ArrayList();
        ArrayList<Integer> properList = new ArrayList();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //when
        System.out.println("Testing Empty List");
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(myList);
        //then
        Assert.assertEquals(properList, resultList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        ArrayList<Integer> myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(13);
        myList.add(14);
        myList.add(15);
        myList.add(16);
        myList.add(23);
        myList.add(24);

        ArrayList<Integer> properList = new ArrayList();
        properList.add(2);
        properList.add(4);
        properList.add(6);
        properList.add(14);
        properList.add(16);
        properList.add(24);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //when
        System.out.println("Testing Normal List");
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(myList);
        //then
        Assert.assertEquals(properList, resultList);
    }
}
