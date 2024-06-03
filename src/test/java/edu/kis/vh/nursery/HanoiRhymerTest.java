package edu.kis.vh.nursery;
import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {
    @Test
    public void testReportRejected() {
        HanoiRhymer rhymer = new HanoiRhymer();
        Assert.assertEquals(0, rhymer.reportRejected());

        int testValue1 = 3;
        int testValue2 = 4;
        rhymer.countIn(testValue1);
        rhymer.countIn(testValue2);
        Assert.assertEquals(0, rhymer.reportRejected());

        int testValue3 = 2;
        rhymer.countIn(testValue3);
        Assert.assertEquals(1, rhymer.reportRejected());
    }
}