package SimpleLogger.core;

import SimpleLogger.utils.StringTools;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Simple logger for Java
 * @author Marck C. Guzmán
 * @see SimpleLogger.interfaces.Logger
 * @version 0.1.0
 */
public class SimpleLogger extends BasicLogger{
    public SimpleLogger(PrintStream output, String name) {
        super(output, name);
    }

    public SimpleLogger(OutputStream output, String name) {
        super(output, name);
    }

    public SimpleLogger(String name) {
        super(name);
    }

    @Override
    public void log(String format, Map<String, Object> data) {
        if(checkLevel("log"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "LOG");
        String msg = StringTools.formatMap(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void log(String format, List<Object> data) {
        if(checkLevel("log"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "LOG");
        String msg = StringTools.formatList(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void log(String format, Object ...data) {
        if(checkLevel("log"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "LOG");
        String msg = StringTools.formatArray(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void log(Object msg) {
        if(checkLevel("log"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "LOG");
        basic.put("msg", msg.toString());
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void error(String format, Map<String, Object> data) {
        if(checkLevel("error"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "ERROR");
        String msg = StringTools.formatMap(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void error(String format, List<Object> data) {
        if(checkLevel("error"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "ERROR");
        String msg = StringTools.formatList(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void error(String format, Object... data) {
        if(checkLevel("error"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "ERROR");
        String msg = StringTools.formatArray(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void error(Object msg) {
        if(checkLevel("error"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "ERROR");
        basic.put("msg", msg.toString());
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void info(String format, Map<String, Object> data) {
        if(checkLevel("info"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "INFO");
        String msg = StringTools.formatMap(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void info(String format, List<Object> data) {
        if(checkLevel("info"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "INFO");
        String msg = StringTools.formatList(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void info(String format, Object... data) {
        if(checkLevel("info"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "INFO");
        String msg = StringTools.formatArray(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void info(Object msg) {
        if(checkLevel("info"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "INFO");
        basic.put("msg", msg.toString());
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void debug(String format, Map<String, Object> data) {
        if(checkLevel("debug"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "DEBUG");
        String msg = StringTools.formatMap(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void debug(String format, List<Object> data) {
        if(checkLevel("debug"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "DEBUG");
        String msg = StringTools.formatList(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void debug(String format, Object... data) {
        if(checkLevel("debug"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "DEBUG");
        String msg = StringTools.formatArray(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void debug(Object msg) {
        if(checkLevel("debug"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "DEBUG");
        basic.put("msg", msg.toString());
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void verbose(String format, Map<String, Object> data) {
        if(checkLevel("verbose"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "VERBOSE");
        String msg = StringTools.formatMap(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void verbose(String format, List<Object> data) {
        if(checkLevel("VERBOSE"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "VERBOSE");
        String msg = StringTools.formatList(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void verbose(String format, Object... data) {
        if(checkLevel("VERBOSE"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "VERBOSE");
        String msg = StringTools.formatArray(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }


    @Override
    public void verbose(Object msg) {
        if(checkLevel("verbose"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "VERBOSE");
        basic.put("msg", msg.toString());
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void critical(String format, Map<String, Object> data) {
        if(checkLevel("CRITICAL"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "CRITICAL");
        String msg = StringTools.formatMap(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void critical(String format, List<Object> data) {
        if(checkLevel("CRITICAL"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "CRITICAL");
        String msg = StringTools.formatList(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void critical(String format, Object... data) {
        if(checkLevel("CRITICAL"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "CRITICAL");
        String msg = StringTools.formatArray(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void critical(Object msg) {
        if(checkLevel("CRITICAL"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "CRITICAL");
        basic.put("msg", msg.toString());
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void warn(String format, Map<String, Object> data) {
        if(checkLevel("WARN"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "WARN");
        String msg = StringTools.formatMap(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void warn(String format, List<Object> data) {
        if(checkLevel("WARN"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "WARN");
        String msg = StringTools.formatList(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void warn(String format, Object... data) {
        if(checkLevel("warn"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "WARN");
        String msg = StringTools.formatArray(format, data);
        basic.put("msg", msg);
        String label = preprocess(getFormat(), basic);
        write(label);
    }

    @Override
    public void warn(Object msg) {
        if(checkLevel("war"))
            return;
        HashMap<String, Object> basic = this.buildEssential();
        basic.put("level", "WARN");
        basic.put("msg", msg.toString());
        String label = preprocess(getFormat(), basic);
        write(label);
    }

}
