/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 */
import java.util.Map;

public class ceq
extends btk {
    private static final double eqB = 5.0;
    public static final double eqC = 55.0;
    private final Map<Integer, Double> eqD = lcn.emw();
    private final Map<Integer, Double> dyn = lcn.emw();
    private int dyo = 0;
    private double eqE = 0.0;
    private final cex abN;

    public ceq(cex cex2) {
        this.abN = cex2;
    }

    public void a(ljq ljq2, int n, String string, double d2) {
        if (this.abN.mA() == null) {
            return;
        }
        eaa eaa2 = (eaa)this.MessageDelegator.h(22785, this.getGUID(), this.abN.mA().getGUID());
        eaa2.Position = ljq2;
        eaa2.ResourceType = n;
        eaa2.aFo = string;
        eaa2.aFp = false;
        eaa2.aqs = this.dyo;
        this.MessageDelegator.F(eaa2);
        this.dyn.put(this.dyo, d2);
        ++this.dyo;
    }

    private void a(eaf eaf2) {
        int n = eaf2.aVk();
        ldv ldv2 = eaf2.aO();
        int n2 = eaf2.ex;
        Double d2 = this.dyn.remove(n);
        if (d2 == null) {
            assert (false);
            return;
        }
        switch (n2) {
            case 4: {
                lfn.b(5, this.getClass().getSimpleName(), "handleAnnotationResponseMessage() Add Annotation [" + n + "] Failed");
                break;
            }
            case 2: {
                assert (!this.eqD.containsKey(eaf2.Zn[0].ID));
                this.eqD.put(eaf2.Zn[0].ID, this.MessageDelegator.arc().rgz + d2);
                break;
            }
            case 3: {
                Double d3 = this.eqD.remove(eaf2.Zn[0].ID);
                assert (d3 != null);
                break;
            }
            case 5: {
                lfn.b(5, this.getClass().getSimpleName(), "handleAnnotationResponseMessage() Remove Annotation [" + n + "] Failed");
            }
        }
    }

    public void S(ldz ldz2) {
        if (this.eqD.isEmpty()) {
            return;
        }
        if (this.abN.mA() == null) {
            return;
        }
        this.eqE -= ldz2.qwh;
        if (this.eqE > 0.0) {
            return;
        }
        this.eqE = 5.0;
        for (Map.Entry<Integer, Double> entry : this.eqD.entrySet()) {
            Double d2 = entry.getValue();
            if (!(ldz2.rgz > d2)) continue;
            eae eae2 = (eae)this.MessageDelegator.h(22786, this.getGUID(), this.abN.mA().getGUID());
            eae2.iks = entry.getKey();
            eae2.aqs = this.dyo;
            this.MessageDelegator.F(eae2);
            this.dyn.put(this.dyo, 0.0);
            ++this.dyo;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 22788: {
                this.a((eaf)dxq2);
                break;
            }
            default: {
                assert (false) : "Unhandled message type : " + dxq2.bEz();
                break;
            }
        }
    }
}

