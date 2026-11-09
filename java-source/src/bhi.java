/*
 * Decompiled with CFR.
 */
public class bhi
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("string");
        if (string == null) {
            this.fw("'string' parameter required");
            return;
        }
        this.a(lzj.tWx.bD(string), 0);
        this.aoU();
    }
}

