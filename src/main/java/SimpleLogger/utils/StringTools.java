package SimpleLogger.utils;

import SimpleLogger.core.BasicLogger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringTools {
    public static HashMap<String, Object> formatBySize(String text, int size){
        final HashMap<String, Object> out = new HashMap<>();
        int txtLength = text.length();
        int dif, sideLength = 0;
        String span = "";
        out.put("max", size);
        if(txtLength % 2 != 0){
            txtLength = txtLength + 1;
            text = text + " ";
        }
        dif = size - txtLength;
        if(dif <= 0){
           size = txtLength + 2;
           dif = 2;
           out.put("max", size);
        }
//        impossible
        if(dif % 2 != 0){
            dif += 1;
        }
        sideLength = (int) (Math.floor(dif / 2));
        for (int i = 0; i < sideLength; i++) {
            span += " ";
        }
        out.put("text", span + text + span);
        return out;
    }

    public static String formatMap(String line, Map<String, Object> map){
        String out = line;
        Set<String> keys = map.keySet();
        if(out == null){
            out = "";
        }
        for (String key : keys) {
            out = out.replaceAll("\\{"+ key +"\\}", map.get(key).toString());
        }
        return out;
    }

    public static String formatList(String line, List<Object> list){
        String out = line;
        if(out == null){
            out = "";
        }
        for (int i = 0; i < list.size(); i++) {
            final Object val = list.get(i);
            out = out.replaceAll("\\{"+ i +"\\}", val.toString());
        }
        return out;
    }

    public static String formatArray(String line, Object[] list){
        String out = line;
        if(out == null){
            out = "";
        }
        for (int i = 0; i < list.length; i++) {
            final Object val = list[i];
            out = out.replaceAll("\\{"+ i +"\\}", val.toString());
        }
        return out;
    }
}
