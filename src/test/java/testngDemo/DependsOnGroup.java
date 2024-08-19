package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {
    @Test(groups = {"smoke"},enabled = false)
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify login");
    }
    @Test
    public void verifyCreateANewUser(){
        System.out.println("Verify Create a new user");
    }
    @Test(dependsOnGroups = {"smoke"},alwaysRun = true)
    public void verifyFundTransfer(){
        System.out.println("verify fund transfer");
    }

}
