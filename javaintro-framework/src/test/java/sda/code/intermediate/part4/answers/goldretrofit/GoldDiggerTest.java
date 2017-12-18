package sda.code.intermediate.part4.answers.goldretrofit;

import org.junit.Test;
import sda.code.intermediate.part4.answers.goldmodel.GoldPrice;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import static org.junit.Assert.assertEquals;

public class GoldDiggerTest {

    @Test
    public void recoomendationHold() {
        assertEquals(GoldDigger.ratioToRecommendation(OptionalDouble.of(1.0), OptionalDouble.of(1.0)),
                Messages.RECOMMEND_HOLD);
    }

    @Test
    public void recoomendationFailAvgAll() {
        assertEquals(GoldDigger.ratioToRecommendation(OptionalDouble.empty(), OptionalDouble.of(1.0)),
                Messages.FAILED_RECENT_AVG_COMPUTATION);
    }

    @Test
    public void recoomendationFailAvgRecent() {
        assertEquals(GoldDigger.ratioToRecommendation(OptionalDouble.of(1.0), OptionalDouble.empty()),
                Messages.FAILED_AVG_COMPUTATION);
    }

    @Test
    public void testAverage() {
        List<GoldPrice> prices = new ArrayList<>(3);
        prices.add(new GoldPrice(null, 1.0));
        prices.add(new GoldPrice(null, 2.0));
        prices.add(new GoldPrice(null, 3.0));

        OptionalDouble avg = GoldDigger.average(prices);

        assertEquals(OptionalDouble.of(2.0), avg);
    }

    @Test
    public void testAverageRecent() {
        List<GoldPrice> prices = new ArrayList<>(4);
        prices.add(new GoldPrice(null, 0.0));
        prices.add(new GoldPrice(null, 1.0));
        prices.add(new GoldPrice(null, 2.0));
        prices.add(new GoldPrice(null, 3.0));

        OptionalDouble avg = GoldDigger.averageRecent(prices);

        assertEquals(OptionalDouble.of(2.0), avg);
    }

    @Test
    public void testAvgToStringStripZeros() {
        assertEquals("2", GoldDigger.avgToString(OptionalDouble.of(2.0)));
    }

    @Test
    public void testAvgToStringOk() {
        assertEquals("2.5", GoldDigger.avgToString(OptionalDouble.of(2.5)));
    }

    @Test
    public void testAvgToStringEmpty() {
        assertEquals(Messages.UNKNOWN, GoldDigger.avgToString(OptionalDouble.empty()));
    }

    @Test
    public void testValidateInputOk() {
        GoldDigger.validateInput(GoldService.LONGEST_PERIOD_IN_DAYS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateInputTooLarge() {
        GoldDigger.validateInput(GoldService.LONGEST_PERIOD_IN_DAYS + 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateInputTooSmall() {
        GoldDigger.validateInput(GoldDigger.SHORT_PERIOD_IN_DAYS - 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateInputALittleTooSmall() {
        GoldDigger.validateInput(GoldDigger.SHORT_PERIOD_IN_DAYS);
    }

}
