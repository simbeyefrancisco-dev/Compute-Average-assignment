import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComputeAverageTest {
    @Test
    public void testAverage() {
        ComputeAverage computeAverage = new ComputeAverage();
        double result = computeAverage.calculateAverage(new double[]{1, 2, 3, 4, 5});
        assertEquals(3.0, result);
    }

    @Test
    public void testAverageWithNegativeNumbers() {
        ComputeAverage computeAverage = new ComputeAverage();
        double result = computeAverage.calculateAverage(new double[]{-1, -2, -3, -4, -5});
        assertEquals(-3.0, result);
    }

    @Test
    public void testAverageWithZero() {
        ComputeAverage computeAverage = new ComputeAverage();
        double result = computeAverage.calculateAverage(new double[]{0, 0, 0, 0, 0});
        assertEquals(0.0, result);
    }

    @Test
    public void testAverageWithOneElement() {
        ComputeAverage computeAverage = new ComputeAverage();
        double result = computeAverage.calculateAverage(new double[]{10});
        assertEquals(10.0, result);
    }

    @Test
    public void testAverageWithNoElements() {
        ComputeAverage computeAverage = new ComputeAverage();
        double result = computeAverage.calculateAverage(new double[]{});
        assertEquals(0.0, result); // Assuming average of no elements is defined as 0
    }
}