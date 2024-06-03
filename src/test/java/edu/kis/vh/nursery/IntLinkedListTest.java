package edu.kis.vh.nursery;
import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;
public class IntLinkedListTest {
    @Test
    public void testPushPop() {
        IntLinkedList list = new IntLinkedList();
        int testValue1 = 4;
        int testValue2 = 5;

        list.push(testValue1);
        list.push(testValue2);

        int result = list.pop();
        Assert.assertEquals(testValue2, result);
        result = list.pop();
        Assert.assertEquals(testValue1, result);
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.isEmpty());

        list.push(1);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertFalse(list.isFull());
    }

    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        final int EMPTY_STACK_VALUE = -1;

        int result = list.top();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        list.push(testValue);

        result = list.top();
        Assert.assertEquals(testValue, result);
    }
}