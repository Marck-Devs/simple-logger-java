package SimpleLogger.utils;

import SimpleLogger.exceptions.IllegalLogLevelException;

public class LogLevels {
    public static final int VERBOSE = 0;
    public static final int DEBUG = 1;
    public static final int LOG = 2;
    public static final int INFO = 3;
    public static final int WARN = 4;
    public static final int ERROR = 5;
    public static final int CRITICAL = 6;

    public static int getLevel(String level) throws IllegalLogLevelException {
        char initial = level.toLowerCase().charAt(0);
        int out;
        switch (initial) {
            case 'v':
                out = VERBOSE;
                break;
            case 'd':
                out = DEBUG;
                break;
            case 'l':
                out = LOG;
                break;
            case 'i':
                out = INFO;
                break;
            case 'w':
                out = WARN;
                break;
            case  'e':
                out = ERROR;
                break;
            case 'c':
                out = CRITICAL;
                break;
            default:
                throw new IllegalLogLevelException();
        }
        return out;
    }
}
