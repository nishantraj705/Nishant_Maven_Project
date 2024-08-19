package annotations;

import org.testng.annotations.*;

public class AfterClass_3 {

    @BeforeMethod
    public void beforeMethod_2(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClassExample(){
        System.out.println("After Class");
    }
    @BeforeClass
    public void beforeClassExample(){
        System.out.println("Before class");
    }

    @Test(groups ={"sanity"})
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


