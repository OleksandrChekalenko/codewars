import org.junit.Test;
import static org.junit.Assert.*;

public class TimeFormatterTest {
    @Test
    public void testFormatDurationExamples() {
        // Example Test Cases
        assertEquals("1 second", TimeFormatter.formatDuration(1));
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
        assertEquals("182 days, 1 hour, 44 minutes and 40 seconds", TimeFormatter.formatDuration(15731080));
        assertEquals("182 days, 1 hour, 44 minutes and 40 seconds", TimeFormatter.formatDuration(91462160));

    }
}
