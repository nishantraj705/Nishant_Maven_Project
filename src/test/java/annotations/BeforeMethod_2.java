package annotations;

import org.testng.annotations.*;

public class BeforeMethod_2 {
    @BeforeMethod
    public void beforeMethod_2(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }



    @Test
    public void test_A(){
        System.out.println("Test A");
    }
    @Test
    public void test_B(){
        System.out.println("Test B");
    }
    @Test
    public void test_C(){
        System.out.println("Test C");
    }
}
