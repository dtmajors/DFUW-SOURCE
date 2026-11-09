/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public abstract class aff
extends btk {
    private final afc bgu;
    private final int aGE;
    private final int ayO;
    private final afq bgv;
    private String aGG;
    private int aGF;

    aff(afc afc2, int n, int n2, afq afq2) {
        this.bgu = afc2;
        this.aGE = n;
        this.ayO = n2;
        this.bgv = afq2;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    public void start() {
        assert (!this.zZ());
        this.ez(1);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    public void g(int n, String string) {
        this.aGF = n;
        this.aGG = string;
    }

    public void ey(int n) {
        this.aGF += n;
    }

    public boolean zZ() {
        return this.aGF >= this.ayO;
    }

    void zO() {
        this.aGF = 0;
        this.aGG = null;
        this.Initialized = false;
        this.ez(3);
    }

    public void Aa() {
        this.zU();
        this.bgu.zN();
    }

    public void ez(int n) {
        Map<Integer, Integer> map = this.zj();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ldv ldv2 = lcr.abW((int)entry.getKey());
            ldv ldv3 = lcr.ak((ldv)lcr.acL, (int)entry.getValue());
            this.p(ldv3, n);
        }
    }

    public void o(ldv ldv2, int n) {
        ldv ldv3 = lcr.ak((ldv)lcr.acL, (int)n);
        this.p(ldv3, 1);
    }

    public void p(ldv ldv2, int n) {
        glk glk2 = (glk)this.MessageDelegator.h(35330, this.getGUID(), ldv2);
        glk2.Eh(n);
        glk2.kZ(this.zS());
        glk2.JS(this.Ab());
        glk2.JR(this.ze());
        this.MessageDelegator.E(glk2);
    }

    public void g(loz loz2) {
        this.bgu.g(loz2);
    }

    public final Map<Integer, Integer> zj() {
        return this.bgu.zj();
    }

    public final String zS() {
        return this.bgu.zS();
    }

    public final int ze() {
        return this.aGF;
    }

    public final int Ab() {
        return this.aGE;
    }

    public final afq Ac() {
        return this.bgv;
    }

    public String zV() {
        return "";
    }

    public void cB(ldv ldv2) {
    }

    public void zU() {
    }
}

