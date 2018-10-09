package com;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

@Description("This is an example test suite")
public class mainTests {
    @Title("first test")
    @Test
    public void first_test(){
        Assert.assertEquals(5, 2+4);
    }

    @Title("second test")
    @Test
    public void second_test(){
        Assert.assertEquals(5, 2+3);
    }
}
