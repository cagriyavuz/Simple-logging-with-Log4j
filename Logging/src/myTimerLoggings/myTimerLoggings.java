package myTimerLoggings;
import org.apache.logging.log4j.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class myTimerLoggings {

	private static Logger testLogger = LogManager.getLogger(myTimerLoggings.class.getName());
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	public static void main(String[] args) {

		debug();
		info();
		error();
		
		
		
	}
	public static void debug() {
	
        LocalTime lt = LocalTime.of(20, 27, 0);       
        for (int i = 0; i < 3; i++) {
            testLogger.debug(lt.format(formatter));
            lt = lt.plusSeconds(1);
        }
    }
	public static void info() {
        LocalTime lt = LocalTime.of(20, 28, 0);
        for (int i = 0; i < 3; i++) {
            testLogger.info(lt.format(formatter));
            lt = lt.plusMinutes(1);
        }
    }
	public static void error() {
        LocalTime lt = LocalTime.of(21, 0, 0);
        for (int i = 0; i < 3; i++) {
            testLogger.error(lt.format(formatter));
            lt = lt.plusHours(1);
        }
    }
}