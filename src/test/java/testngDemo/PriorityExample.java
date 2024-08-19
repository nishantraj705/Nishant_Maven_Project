package testngDemo;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority =1)
    public void testDemo_A(){
        System.out.println("Test Demo A");
    }
    @Test(priority = -8)
    public void testDemo_B(){
        System.out.println("Test Demo B");
    }
    @Test(priority = -1,groups = {"sanity"})
    public void testDemo_C(){
        System.out.println("Test Demo C");
    }
    @Test(priority = 'B')
    public void testDemo_X(){
        System.out.println("Test Demo d");
    }
    @Test(priority = 5)
    public void testDemo_Y(){
        System.out.println("Test Demo g");
    }
    @Test(priority = 0)
    public void testDemo_Z(){
        System.out.println("Test Demo h");
    }
}
