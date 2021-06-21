package com.example.sofabootdemo;

import com.alipay.sofa.test.runner.SofaJUnit4Runner;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

//@RunWith(SofaBootRunner.class
@RunWith(SofaJUnit4Runner.class)
class SofaBootApplicationTests {
    @Test
    public void test() {
        Assert.assertTrue(true);
    }
}
