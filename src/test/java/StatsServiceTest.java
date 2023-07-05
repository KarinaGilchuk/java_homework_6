import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void testIsMinMonthExpected () {
        int [] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        StatsService service = new StatsService();
        int actual = service.getMinMonth(array);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIsMaxMonthExpected () {
        int [] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        StatsService service = new StatsService();
        int actual = service.getMaxMonth(array);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIsAvgAllMonthsExpected () {
        int [] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        StatsService service = new StatsService();
        int actual = service.avgAllMonths(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIsSumAllMonthsExpected () {
        int [] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        StatsService service = new StatsService();
        int actual = service.sumAllMonths(array);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIsCountMonthsBelowAvgExpected () {
        int [] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatsService service = new StatsService();
        int actual = service.countMonthsBelowAvg(array);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIsCountMonthsAboveAvgExpected () {
        int [] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatsService service = new StatsService();
        int actual = service.countMonthsAboveAvg(array);

        Assertions.assertEquals(expected, actual);
    }
}
