/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 */
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class cb {
    private ObjectInputStream fN;

    public dta u(String string) {
        if (string == null) {
            return null;
        }
        Object object = this.v(string);
        if (object == null) {
            return null;
        }
        if (object instanceof dta) {
            return (dta)object;
        }
        return null;
    }

    public Object v(String string) {
        if (string == null) {
            return null;
        }
        try {
            this.fN = new ObjectInputStream(new FileInputStream(string));
            Object object = this.fN.readObject();
            this.fN.close();
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

