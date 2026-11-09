/*
 * Decompiled with CFR.
 */
import java.util.regex.Pattern;

public class axj
extends awu {
    @Override
    public boolean d(Object object, String string) {
        if (object == null) {
            return false;
        }
        return Pattern.compile(string.toLowerCase()).matcher(object.toString().toLowerCase()).matches();
    }
}

