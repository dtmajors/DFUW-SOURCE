/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.LinkedList;

public class hhu
extends hhv {
    private hdm dXw = null;
    private hnt.a ktN = null;

    public hhu(hdm hdm2, String string, lgg lgg2, lhf lhf2, float f2, float f3, hnt.a a2) {
        super(hdm2, string, lgg2, lhf2, hdm2.jXw, 0.0f, f2, f3, new ljk("Bind-Stone Health"));
        this.dXw = hdm2;
        this.ktN = a2;
    }

    @Override
    public void ccc() {
        if (this.ktN == null) {
            return;
        }
        LinkedList<hnt> linkedList = lcn.emA();
        linkedList.add(new hnt(this.ktN, "Bind-Stone Health: " + Integer.toString((int)this.cum()) + " / " + Integer.toString((int)this.cqb()) + " (" + Integer.toString((int)(this.cum() / this.cqb() * 100.0)) + "%)"));
        this.dXw.a(null, linkedList);
    }
}

