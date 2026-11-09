/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  mcs
 */
import java.util.Iterator;
import java.util.Map;

public class cfa
extends btk
implements bto {
    private static final String TC = "SFPlayerSoulFlayManagerServer";
    private static final double etK = 0.3;
    public static float etL = 0.5f;
    public static float etM = 10.0f;
    public static boolean etN = false;
    public static int ern = 10;
    private final cex baW;
    private final Map<ldv, Double> etO = lcn.abI(ern);
    private double abo = 0.0;

    public cfa(cex cex2) {
        this.baW = cex2;
    }

    public void b(ldv ldv2, double d2) {
        Double d3 = this.etO.get(ldv2);
        if (d3 != null) {
            d3 = d3 + d2;
            this.b(ldv2, mcs.uAf.bD(new Object[0]));
            this.baW.c(mcs.uAg.bD(new Object[0]));
            return;
        }
        this.etO.put(ldv2, this.MessageDelegator.arc().rgz + d2);
        this.b(ldv2, mcs.uAf.bD(new Object[0]));
        this.baW.c(mcs.uAg.bD(new Object[0]));
    }

    public void aLH() {
        if (this.etO.isEmpty()) {
            return;
        }
        for (ldv ldv2 : this.etO.keySet()) {
            this.b(ldv2, mcs.uAj.bD(new Object[0]));
        }
        this.etO.clear();
    }

    public void t(int n, float f2) {
        if (this.etO.isEmpty()) {
            return;
        }
        float f3 = etN ? etM : Math.abs(f2 * etL);
        for (ldv ldv2 : this.etO.keySet()) {
            eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
            eam2.ikF = 1;
            eam2.bnM = n;
            eam2.ikG = f3;
            eam2.ikH = true;
            this.MessageDelegator.F(eam2);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.etO.isEmpty()) {
            return;
        }
        this.abo -= ldz2.qwh;
        if (this.abo > 0.0) {
            return;
        }
        this.abo = 0.3;
        Iterator<Map.Entry<ldv, Double>> iterator = this.etO.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<ldv, Double> entry = iterator.next();
            double d2 = entry.getValue();
            if (!(ldz2.rgz > d2)) continue;
            iterator.remove();
            this.b(entry.getKey(), mcs.uAj.bD(new Object[0]));
            this.baW.c(mcs.uAk.bD(new Object[0]));
        }
    }

    public void b(ldv ldv2, loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }
}

