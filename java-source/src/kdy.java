/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public abstract class kdy {
    protected Map<lef, kee> pio = lcn.emw();
    protected Map<lef, kee> pip = lcn.emw();
    protected List<kee> piq = lcn.emv();
    protected List<kee> pir = lcn.emv();
    protected Map<lef, List<lef>> pis = lcn.emw();
    protected kdw.a pit = kdw.a.phU;

    public int a(lef lef2, lef lef3) {
        kee kee2 = this.pio.get(lef2);
        kee kee3 = this.pip.get(lef3);
        if (kee2 != null && kee3 != null) {
            List<lef> list = this.pis.get(lef2);
            if (list != null) {
                list.add(lef3);
            } else {
                list = lcn.emv();
                list.add(lef3);
                this.pis.put(lef2, list);
            }
        } else {
            lfn.b(5, this.getClass().getName(), "Pipe Coupling failed for Module" + this.getClass() + ", PipeFrom = " + kee2 + ", PipeTo = " + kee3);
            return -1;
        }
        return 0;
    }

    public void a(kee kee2) {
        this.pio.put(kee2.dVH(), kee2);
        this.piq.add(kee2);
    }

    public void b(kee kee2) {
        this.pip.put(kee2.dVH(), kee2);
        this.pir.add(kee2);
    }

    public void c(lef lef2) {
        kee kee2 = this.pio.get(lef2);
        if (kee2 != null) {
            this.piq.remove(kee2);
            this.pis.remove(lef2);
            this.pio.remove(lef2);
        } else {
            lfn.b(5, this.getClass().getName(), "Could not remove Incoming Pipe with key [" + lef2 + "]. Pipe not Found!");
        }
    }

    public void d(lef lef2) {
        kee kee2 = this.pip.get(lef2);
        if (kee2 != null) {
            this.pir.remove(kee2);
            this.pip.remove(lef2);
        } else {
            lfn.b(5, this.getClass().getName(), "Could not remove Outgoing Pipe with key [" + lef2 + "]. Pipe not Found!");
        }
    }

    public void b(kdw.a a2) {
        this.pit = a2;
    }

    public boolean a(kdw.a a2) {
        return true;
    }

    public kdw.a dVA() {
        return this.pit;
    }
}

