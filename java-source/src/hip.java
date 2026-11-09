/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.Map;

public class hip
extends hio {
    hdm dXw;
    private Map<String, a> kvB = lcn.emG();

    public hip(hdm hdm2, String string, lgg lgg2, lhf lhf2, hio.a a2) {
        super(hdm2, string, lgg2, lhf2, a2, false, false);
        this.dXw = hdm2;
    }

    public void a(String string, bqt[] bqtArray) {
        if (bqtArray == null) {
            a a2 = this.kvB.remove(string);
            if (a2 != null) {
                super.b(a2);
            }
        } else {
            a a3 = this.kvB.get(string);
            if (a3 == null) {
                a3 = new a(this, string);
                this.kvB.put(string, a3);
                super.a(a3);
                if (this.kvB.size() == 1) {
                    this.kUg.a((hmi)a3, true);
                }
            }
            a3.b(bqtArray);
        }
    }
}

