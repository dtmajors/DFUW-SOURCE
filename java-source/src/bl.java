/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.Map;

public class bl
extends bg {
    String Filename;
    String eO;
    Map eP;

    public bl(String string, String string2, Map map, Throwable throwable) {
        super(null, throwable);
        this.Filename = string;
        this.eO = string2;
        this.eP = map;
    }

    @Override
    public String getMessage() {
        assert (super.getMessage() == null);
        return "Filename='" + this.Filename + "' NodeType='" + this.eO + "' Keyset={" + this.aa() + "}";
    }

    private String aa() {
        StringBuilder stringBuilder = new StringBuilder(8192);
        Iterator iterator = this.eP.keySet().iterator();
        while (iterator.hasNext()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(",");
            }
            Object k = iterator.next();
            Object v = this.eP.get(k);
            stringBuilder.append(k);
            stringBuilder.append("=");
            stringBuilder.append(v);
        }
        return stringBuilder.toString();
    }
}

