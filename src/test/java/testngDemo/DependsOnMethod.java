package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
    @Test(groups = {"sanity"})
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify login");
    }
    @Test
    public void verifyCreateANewUser(){
        System.out.println("Verify Create a new user");
    }
    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyFundTransfer(){
        System.out.println("verify fund transfer");
    }
}
