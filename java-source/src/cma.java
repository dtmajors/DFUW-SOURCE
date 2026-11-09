/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class cma
extends cly {
    private static final double eKg = 10.0;
    private boolean dKy = false;
    private int bgV = -1;
    private List<ljq> eKh = null;
    private int Qs = 0;
    private Map<Integer, gcb[]> eKi = lcn.emw();

    public cma() {
        super(true);
    }

    public boolean aSS() {
        return this.dKy;
    }

    public void gn(boolean bl) {
        this.dKy = bl;
    }

    public int Ah() {
        return this.bgV;
    }

    public void rG(int n) {
        this.bgV = n;
    }

    public List<ljq> aST() {
        return this.eKh;
    }

    public void ay(List<ljq> list) {
        this.eKh = list;
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 23044: {
                this.a((gbz)dxq2);
                break;
            }
            case 23046: {
                this.a((gce)dxq2);
                break;
            }
            case 9251: {
                this.a((fdu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private ljq Ky() {
        assert (!this.eKh.isEmpty());
        int n = (int)((double)this.eKh.size() * Math.random());
        if (n >= this.eKh.size()) {
            n = this.eKh.size() - 1;
        } else if (n < 0) {
            n = 0;
        }
        return new ljq(this.eKh.get(n));
    }

    private void a(gbz gbz2) {
        gca gca2 = (gca)this.MessageDelegator.h(23045, this.getGUID(), gbz2.aO());
        this.MessageDelegator.b(gbz2, gca2);
        gca2.bgV = this.dKy ? this.bgV : 0;
        int n = this.Qs++;
        gcb[] gcbArray = new gcb[]{gbz2, gca2};
        this.eKi.put(n, gcbArray);
        fdt fdt2 = (fdt)this.MessageDelegator.h(9250, this.GUID, gbz2.aZG);
        fdt2.sk(n);
        fdt2.kU(true);
        fdt2.cz(10.0);
        fdt2.kT(true);
        this.MessageDelegator.F(fdt2);
    }

    private void a(fdu fdu2) {
        gcb[] gcbArray = this.eKi.remove(fdu2.aVk());
        if (gcbArray == null) {
            return;
        }
        gbz gbz2 = (gbz)gcbArray[0];
        gca gca2 = (gca)gcbArray[1];
        if (!fdu2.bOA()) {
            gca2.bgV = -1;
        }
        this.MessageDelegator.F(gca2);
    }

    private void a(gce gce2) {
        gcf gcf2 = (gcf)this.MessageDelegator.h(23047, this.getGUID(), gce2.aO());
        this.MessageDelegator.b(gce2, gcf2);
        gcf2.be = this.Ky();
        this.MessageDelegator.F(gcf2);
    }
}

