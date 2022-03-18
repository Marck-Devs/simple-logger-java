package SimpleLogger.interfaces;

import java.util.List;
import java.util.Map;

public interface Logger {
    void log(String format, Map<String, Object> data);
    void log(String format, List<Object> data);
    void log(String format, Object ...data);
    void log(Object msg);

    void error(String format, Map<String, Object> data);
    void error(String format, List<Object> data);
    void error(String format, Object... data);
    void error(Object msg);

    void info(String format, Map<String, Object> data);
    void info(String format, List<Object> data);
    void info(String format, Object... data);
    void info(Object msg);

    void debug(String format, Map<String, Object> data);
    void debug(String format, List<Object> data);
    void debug(String format, Object... data);
    void debug(Object msg);

    void verbose(String format, Map<String, Object> data);
    void verbose(String format, List<Object> data);
    void verbose(String format, Object... data);
    void verbose(Object msg);

    void critical(String format, Map<String, Object> data);
    void critical(String format, List<Object> data);
    void critical(String format, Object... data);
    void critical(Object msg);

    void warn(String format, Map<String, Object> data);
    void warn(String format, List<Object> data);
    void warn(String format, Object... data);
    void warn(Object msg);
}
