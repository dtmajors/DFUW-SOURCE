/*
 * Decompiled with CFR.
 */
import java.util.List;

public class kyh {
    private static final boolean qiZ = false;
    private boolean qja = true;
    private List qjb = lcn.emv();
    private List qjc = lcn.emv();

    public synchronized void a(kyg kyg2) {
        if (this.qja) {
            this.qjb.add(kyg2);
        } else {
            this.qjc.add(kyg2);
        }
    }

    public synchronized void clear() {
        this.qja = true;
        this.qjb.clear();
        this.qjc.clear();
    }

    public synchronized List eiI() {
        if (this.qja) {
            this.qja = !this.qja;
            this.qjc.clear();
            return this.qjb;
        }
        this.qja = !this.qja;
        this.qjb.clear();
        return this.qjc;
    }

    public synchronized boolean isEmpty() {
        if (this.qja) {
            return this.qjb.isEmpty();
        }
        return this.qjc.isEmpty();
    }
}

