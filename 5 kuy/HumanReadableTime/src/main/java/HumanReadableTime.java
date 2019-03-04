
import java.util.concurrent.TimeUnit;

public class HumanReadableTime {
  public static String makeReadable(int seconds) {
      /*return String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(seconds * 1000L),
              TimeUnit.MILLISECONDS.toMinutes(seconds * 1000L) % TimeUnit.HOURS.toMinutes(1),
              TimeUnit.MILLISECONDS.toSeconds(seconds * 1000L) % TimeUnit.MINUTES.toSeconds(1));*/
      return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
  }
}