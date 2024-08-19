package testngDemo;

import org.testng.annotations.Test;

public class InvocationCount {
    @Test(invocationCount = 100000, invocationTimeOut = 1)
    public void methodForRepeatation(){
        System.out.println("Hello World...How are you");
    }
}
