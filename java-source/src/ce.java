/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ce {
    private ObjectOutputStream fZ;
    private lfn ga = lfn.eqw();

    public void a(dta dta2) {
        String string = null;
        if (dta2 == null) {
            return;
        }
        try {
            string = "ObjectSpace_" + dta2.getGUID().enz();
            this.fZ = new ObjectOutputStream(new FileOutputStream(string));
            this.fZ.writeObject(dta2);
            this.fZ.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void a(Object object, String string) {
        if (object == null || string == null) {
            return;
        }
        try {
            this.fZ = new ObjectOutputStream(new FileOutputStream(string));
            this.fZ.writeObject(object);
            this.fZ.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

