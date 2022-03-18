package SimpleLogger.core;

import SimpleLogger.exceptions.IllegalLogLevelException;
import SimpleLogger.interfaces.Logger;
import SimpleLogger.utils.LogLevels;
import SimpleLogger.utils.StringTools;

import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public abstract class BasicLogger implements Logger {
    private static PrintStream output;
    private String name;
    private Locale lcl = Locale.FRANCE;
    private static String format = "[ {date} ] [{level}] [{name}] {msg}";
    private static int maxLvl = 10;
    private static int maxName = 6;
    private static int logLvl = LogLevels.LOG;

    public BasicLogger(PrintStream output, String name) {
        this.name = name;
        BasicLogger.output = output;
    }

    public BasicLogger(OutputStream output, String name) {
        this.name = name;
        BasicLogger.output = new PrintStream(output);
    }

    public BasicLogger(String name) {
        this.name = name;
        if (output == null) {
            output = new PrintStream(System.out);
        }
    }

    protected String getDate() {
        DateFormat format = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, this.lcl);
        return format.format(new Date());
    }

    protected HashMap<String, Object> buildEssential() {
        HashMap<String, Object> data = new HashMap<>();
        data.put("date", getDate());
        HashMap<String, Object> nameData = StringTools.formatBySize(this.name, maxName);
        if (((Integer) nameData.get("max")) > maxName) {
            maxName = ((Integer) nameData.get("max"));
        }
        data.put("name", nameData.get("text").toString());
        return data;
    }

    protected String preprocess(String line, HashMap<String, Object> data) {
        HashMap<String, Object> lvlData = StringTools.formatBySize(data.get("level").toString(), maxLvl);
        if (((Integer) lvlData.get("max")) > maxLvl) {
            maxLvl = ((Integer) lvlData.get("max"));
        }
        data.put("level", lvlData.get("text").toString());
        return StringTools.formatMap(line, data);
    }

    protected boolean checkLevel(String lvl) {
        try {
            int lvlInt = LogLevels.getLevel(lvl);
            return lvlInt < logLvl;
        } catch (IllegalLogLevelException e) {
            e.printStackTrace();
            return true;
        }
    }

    protected void write(String line) {
        output.println(line);
    }

    public static PrintStream getOutput() {
        return output;
    }

    public static void setOutput(PrintStream output) {
        BasicLogger.output = output;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Locale getLocale() {
        return lcl;
    }

    public void setLocale(Locale lcl) {
        this.lcl = lcl;
    }

    public static String getFormat() {
        return format;
    }

    public static void setFormat(String format) {
        BasicLogger.format = format;
    }

    public static void setLevel(String level) {
        try {
            logLvl = LogLevels.getLevel(level);
        } catch (IllegalLogLevelException e) {
            e.printStackTrace();
        }
    }

    public static void setLevel(int level) {
        logLvl = level;
    }

}
