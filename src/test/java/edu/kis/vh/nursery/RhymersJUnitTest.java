package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    public static int EMPTY_STACK_VALUE = -1;
    public static int TEST_VALUE = 4;
    public static int STACK_CAPACITY = 12;


    @Test
    public void testCountIn() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        int testValue = TEST_VALUE;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        final int STACK_CAPACITY = RhymersJUnitTest.STACK_CAPACITY;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = RhymersJUnitTest.EMPTY_STACK_VALUE;

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = TEST_VALUE;
        rhymer.countIn(testValue);

        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = RhymersJUnitTest.EMPTY_STACK_VALUE;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = TEST_VALUE;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
