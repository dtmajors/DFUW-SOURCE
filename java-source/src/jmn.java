/*
 * Decompiled with CFR.
 */
import java.util.TreeMap;

public class jmn
extends btk {
    private TreeMap<jmq, jml> nyK = lcn.emG();
    private int nyL = 0;

    public void a(jmq jmq2, jml jml2) {
        if (this.nyK.containsKey((Object)jmq2)) {
            assert (false);
            return;
        }
        this.nyK.put(jmq2, jml2);
    }

    public void j(jmq jmq2) {
        jml jml2 = this.nyK.remove((Object)jmq2);
    }

    public void k(jmq jmq2) {
        if (this.nyL > 0) {
            return;
        }
        if (jmq2.nyJ != jmp.nyT) {
            assert (false);
            return;
        }
        jml jml2 = this.nyK.get((Object)jmq2);
        if (jml2 == null) {
            lfn.b(5, "SFActionManager", "triggerEventAction(): '" + (Object)((Object)jmq2) + "' isn't registered");
            return;
        }
        jml2.a(jmq2);
    }

    public void b(jmq jmq2, double d2) {
        if (this.nyL > 0) {
            return;
        }
        if (jmq2.nyJ != jmp.nyV) {
            assert (false);
            return;
        }
        jml jml2 = this.nyK.get((Object)jmq2);
        if (jml2 == null) {
            lfn.b(5, "SFActionManager", "triggerDeltaAction(): '" + (Object)((Object)jmq2) + "' isn't registered");
            return;
        }
        jml2.a(jmq2, d2);
    }

    public void b(jmq jmq2, int n) {
        if (this.nyL > 0) {
            return;
        }
        if (jmq2.nyJ != jmp.nyU) {
            assert (false);
            return;
        }
        jml jml2 = this.nyK.get((Object)jmq2);
        if (jml2 == null) {
            lfn.b(5, "SFActionManager", "triggerStateAction(): '" + (Object)((Object)jmq2) + "' isn't registered");
            return;
        }
        jml2.a(jmq2, n);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 29441: {
                this.a((fgt)dxq2);
                break;
            }
            case 29442: {
                this.a((fgu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fgt fgt2) {
        this.a(fgt2.iMe, fgt2.iMf);
    }

    private void a(fgu fgu2) {
        this.j(fgu2.iMe);
    }

    public void un(boolean bl) {
        if (bl) {
            assert (this.nyL > 0);
            --this.nyL;
        } else {
            ++this.nyL;
        }
    }

    public boolean dMG() {
        return this.nyL < 1;
    }
}

