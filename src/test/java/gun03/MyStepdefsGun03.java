package gun03;

import gun02.pac2.LoginPO;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.ParentClass;

import java.util.List;
import java.util.Map;

public class MyStepdefsGun03 extends ParentClass {

    LoginPO loginPO=new LoginPO();

    @Given("user write {string}")
    public void userWrite(String text) {
        System.out.println(text);
    }

    @When("user write the followings")
    public void userWriteTheFollowings(DataTable table) {
        List<String>list=table.asList(String.class);
        //System.out.println(list);
        for (String s:list) {
            System.out.println(s);
        }
    }

    @When("user write the following integers")
    public void userWriteTheFollowingIntegers(DataTable table) {
        System.out.println(table);

        List<List<Integer>>lists=table.asLists(Integer.class);
        //System.out.println(lists);

        for (List<Integer> list:lists) {
            System.out.println(list);
        }

    }

    @When("user login as follows")
    public void userLoginAsFollows(DataTable table) {
        /*
    [
       [kullanici1, sifre1, 0]      // list
       [kullanici2, sifre2, 0]
       [kullanici3, sifre3, 1]
     ]
         */

        List<List<String>>lists=table.asLists();

        for (List<String> list:lists) {
            String username=list.get(0);
            String password=list.get(1);
            String status=list.get(2);

            sendKeys(By.cssSelector("input[name='email']"),username);
            sendKeys(By.cssSelector("input[name='password']"),password);
            clickTo(By.cssSelector("input[value='Login']"));
            if (status.equalsIgnoreCase("0")){
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.alert.alert-danger']")));
            }
            else {
                Assert.assertTrue(driver.getTitle().contains("My Account"));
            }

        }
    }


}
