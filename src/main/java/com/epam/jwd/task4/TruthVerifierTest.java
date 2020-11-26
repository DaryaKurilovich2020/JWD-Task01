package com.epam.jwd.task4;

import junit.framework.Assert;
import org.junit.Test;

public class TruthVerifierTest {
    @Test
    public void isTruthTest(){
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        TruthVerifier verifier=new TruthVerifier();
        boolean actual=verifier.isTruth(a,b,c,d);
        Assert.assertEquals(true,actual);
    }
}