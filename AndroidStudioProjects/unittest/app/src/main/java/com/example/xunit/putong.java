package com.example.xunit;

import android.test.AndroidTestCase;

import com.example.xiaoming.Servies.Services;

import junit.framework.Assert;
import junit.framework.TestResult;

public class putong extends AndroidTestCase {


    public void testSave() throws Exception {
        Services services = new Services();
        services.save(null);
    }

    public void testAdd() throws Exception{
        Services services = new Services();
        int actual = services.add(1,2);

        Assert.assertEquals(3,actual);

    }
}
