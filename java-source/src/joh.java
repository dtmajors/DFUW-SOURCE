/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class joh
implements lbr {
    protected static final joi nHy = joi.nHV;
    private final lbh kAz;
    private final lha<dxq, dxq> jAj;
    private final lbn jEL = new lbn(this){
        final /* synthetic */ joh nHT;
        {
            this.nHT = joh2;
        }

        public final void W() {
            joh.a(this.nHT);
        }
    };

    public joh(lbh lbh2, lha<dxq, dxq> lha2, jom jom2) {
        assert (lbh2 != null);
        assert (lha2 != null);
        assert (jom2 != null);
        this.kAz = lbh2;
        this.jAj = lha2;
        this.kAz.eme().a(true, this.jEL);
        List<jos> list = joj.dOL();
        HashMap<String, jos> hashMap = new HashMap<String, jos>();
        for (jos jos2 : list) {
            assert (!hashMap.containsKey(jos2.Name));
            hashMap.put(jos2.Name, jos2);
        }
        this.a(null, jom2, hashMap);
    }

    public void dispose() {
    }

    @Override
    public boolean a(lfu lfu2) {
        jqb.nRm = lfu2.e("CameraSpeedFast", jqb.nRm);
        jqb.nRl = lfu2.e("CameraSpeedNormal", jqb.nRl);
        jqb.nRk = lfu2.e("CameraSpeedSlow", jqb.nRk);
        return lfu2.eqA();
    }

    private void a(jov jov2, boolean bl, int n) {
        assert (lda.by(jov2));
        fir fir2 = (fir)this.CW(2818);
        fir2.ixE = n;
        fir2.iNk = bl;
        this.b(fir2, lcr.qBQ);
    }

    private void P(int n, float f2) {
        fiq fiq2 = (fiq)this.CW(2817);
        fiq2.ixE = n;
        fiq2.iNj = f2;
        this.b(fiq2, lcr.qBQ);
    }

    private void dOK() {
        fit fit2 = (fit)this.CW(2820);
        this.b(fit2, lcr.qBQ);
    }

    private dxq CW(int n) {
        return (dxq)this.jAj.rng.ik(n);
    }

    private void b(dxq dxq2, ldv ldv2) {
        dxq2.on(ldv2);
        this.jAj.rnh.m(dxq2);
    }

    private void a(ler ler2, jom jom2, Map<String, jos> map) {
        ler ler3 = lea.enS().g(ler2);
        while (ler3 != null) {
            jos jos2 = map.get(ler3.getName());
            if (jos2 != null) {
                a a2;
                int n = ler3.getType();
                if (jos2 instanceof jov) {
                    a2 = new c(this, n);
                    jom2.a(true, (jov)jos2, (jor)((Object)a2));
                } else if (jos2 instanceof jou) {
                    a2 = new b(this, n);
                    jom2.a(true, (jou)jos2, (joq)((Object)a2));
                } else assert (false);
            }
            this.a(ler3, jom2, map);
            ler3 = lea.enS().h(ler3);
        }
    }

    static /* synthetic */ void a(joh joh2, jov jov2, boolean bl, int n) {
        joh2.a(jov2, bl, n);
    }

    static /* synthetic */ void a(joh joh2, int n, float f2) {
        joh2.P(n, f2);
    }

    static /* synthetic */ void a(joh joh2) {
        joh2.dOK();
    }
}

