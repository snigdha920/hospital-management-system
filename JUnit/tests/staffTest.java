import org.junit.Test;

import static org.junit.Assert.*;

public class staffTest {

   @Test(expected=IllegalArgumentException.class)
    public void testExceptionIsThrown(){
       Staff tester=new Staff();
       tester.createNewStaff("12@","Maithili","nurse","F",50000);
   }
   @Test
    public void test_staff_id(){
	   Staff tester=new Staff();
       tester.createNewStaff("12","Maithili","nurse","F",50000);
       assertNotEquals(null,tester.staff_id);
   }

}