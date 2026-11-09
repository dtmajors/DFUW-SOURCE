/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 *  lcw
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;

public class ann
extends anp {
    public static final float bGC = 0.33f;
    private static final float bGD = 90.0f;
    private final LinkedHashSet<asv> bGE = new LinkedHashSet();
    private final Map<asv, a> bGF = lcn.emw();
    private asv bGG = null;
    private float bGH = 0.0f;
    private final Map<ldv, asv> bGI = lcn.emw();
    private final Map<ldv, ljq> bGJ = lcn.emw();
    private final ljq bBM = new ljq();
    private final ljq bGK = new ljq();
    private final ljq bGL = new ljq();
    private final ljq bGM = new ljq();
    private final ljq bGN = new ljq();
    private float bGO = 0.0f;
    private final ljq bGP = new ljq();
    private double bGQ = 0.0;
    private double bGR = 0.0;

    public ann(anf anf2) {
        super(anf2);
    }

    public boolean a(float f, boolean bl) {
        return this.a(f, 2.0f * this.bFP.Jl().TX(), bl);
    }

    public boolean a(float f, float f2, boolean bl) {
        float f3 = this.bFP.Jl().TX();
        this.bGK.ex(this.bFP.av());
        this.bGK.y += f3;
        this.e(f, f2);
        this.bGP.es(this.bGK);
        if (!bl) {
            for (asv asv2 : this.bFP.IT()) {
                if (asv2.equals(this.bFP.Jl()) || asv2.equals(this.Ly()) || !(asv2.av().eA(this.bFP.av()) > f3 * f3) || !this.a(this.bGK, this.bGP, asv2, true)) continue;
                return false;
            }
        }
        this.bGP.y -= f3;
        return !this.d(this.bFP.av(), this.bGP);
    }

    @Override
    public boolean bs(boolean bl) {
        return this.a(this.bFP.IV() + (float)Math.PI, bl);
    }

    @Override
    public boolean bt(boolean bl) {
        return this.a(this.bFP.IV(), bl);
    }

    @Override
    public boolean bu(boolean bl) {
        return this.a(this.bFP.IV() - 1.5707964f, bl);
    }

    @Override
    public boolean bv(boolean bl) {
        return this.a(this.bFP.IV() + 1.5707964f, bl);
    }

    @Override
    public boolean Ln() {
        if (this.Ly() == null) {
            return true;
        }
        float f = ljq.s(this.bFP.av(), this.Ly().av());
        if (f < 0.1f + this.bFP.Jl().TX() + this.Ly().TX()) {
            return false;
        }
        return !this.bFP.b(this.Ly(), 0.9f);
    }

    @Override
    public boolean Lo() {
        return this.bu(false);
    }

    @Override
    public boolean Lp() {
        return this.bv(false);
    }

    @Override
    public boolean Lq() {
        return this.bt(false);
    }

    @Override
    public boolean Lr() {
        return this.bs(false);
    }

    @Override
    public void x(ldz ldz2) {
        super.x(ldz2);
        if (this.bGG != null) {
            boolean bl = false;
            if (!this.bFP.b(this.bGG)) {
                bl = true;
            } else if (this.bGG.Ut()) {
                bl = true;
            } else if ((float)ldz2.rgz - this.bGO > 90.0f) {
                bl = true;
            }
            if (bl) {
                this.bGG = null;
                this.bGH = 0.0f;
                this.bGO = 0.0f;
            }
        }
    }

    @Override
    public boolean Ls() {
        if (this.Ly() == null) {
            return false;
        }
        if (!this.Lu()) {
            return false;
        }
        return this.f(this.Ly());
    }

    @Override
    public boolean f(asv asv2) {
        ljq ljq2 = asv2.av();
        ljq ljq3 = this.bFP.av();
        for (asv asv3 : this.bFP.IT()) {
            if (asv3.equals(this.bFP.Jl()) || asv3.equals(asv2) || this.s(asv2) || !this.a(ljq3, ljq2, asv3, false)) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean Lt() {
        if (this.Ly() == null) {
            return false;
        }
        return this.bGE.contains(this.Ly());
    }

    @Override
    public boolean Lu() {
        return this.bw(true);
    }

    @Override
    public boolean bw(boolean bl) {
        return this.a(this.Ly(), bl);
    }

    @Override
    protected boolean g(asv asv2) {
        if (!super.g(asv2)) {
            return false;
        }
        if (asv2.UN()) {
            return true;
        }
        if (asv2.equals(this.bGG)) {
            return true;
        }
        if (this.i(asv2)) {
            return true;
        }
        if (this.h(asv2)) {
            return true;
        }
        return this.a(asv2, false);
    }

    public void b(kuk kuk2) {
        ljq ljq2 = this.bGJ.remove(kuk2.dXg());
        if (ljq2 != null) {
            this.a(ljq2, kuk2.egY());
            return;
        }
        asv asv2 = this.bGI.remove(kuk2.dXg());
        this.a(asv2, kuk2.egY());
    }

    public void a(asv asv2, float f, ldz ldz2) {
        if (asv2 == null) {
            return;
        }
        this.bGE.remove(asv2);
        float f2 = ((float)ldz2.rgz - this.bGO) / 90.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 * f < this.bGH) {
            return;
        }
        this.bGH = f;
        this.bGO = (float)ldz2.rgz;
        this.bGG = asv2;
    }

    @Override
    public void Lv() {
        if (arw.Sx() < 0.5f && this.p(this.bGG) < 4.0f) {
            this.o(this.bGG);
            return;
        }
        if (arw.Sx() < 0.6f && this.p(this.bHe) < 4.0f) {
            this.o(this.bHe);
            return;
        }
        if (arw.Sx() < 0.7f && this.p(this.bGG) < 7.5f) {
            this.o(this.bGG);
            return;
        }
        if (arw.Sx() < 0.8f && this.p(this.bHd) < 7.5f) {
            this.o(this.bHd);
            return;
        }
        if (arw.Sx() < 0.9f && this.p(this.bHe) < 7.5f) {
            this.o(this.bHe);
            return;
        }
        if (this.bGG != null) {
            this.o(this.bGG);
        } else {
            this.o(this.bHe);
        }
    }

    @Override
    public void terminate() {
        this.bGE.clear();
        this.bGF.clear();
    }

    public void y(ldz ldz2) {
        if (this.LK()) {
            if (ldz2.rgz > this.bGR) {
                this.bGR = ldz2.rgz + 1.0 + arw.Sw() / 2.0;
                this.j(this.Ly());
            }
        } else {
            this.bGR = 0.0;
        }
        if (ldz2.rgz > this.bGQ) {
            this.bGQ = ldz2.rgz + 1.0 + (1.0 + arw.Sw()) * Math.sqrt(Math.max(1, this.bFP.IT().size() - this.bFP.Jd()));
            for (asv asv2 : this.bFP.IT()) {
                if (asv2.equals(this.bFP.Jl()) || !this.s(asv2)) continue;
                this.j(asv2);
            }
        }
    }

    private void a(ljq ljq2, lcs[] lcsArray) {
        if (lcsArray.length > 0) {
            return;
        }
        this.bFP.Ji().e(ljq2, this.bFP.Jl().av());
    }

    private void a(asv asv2, lcs[] lcsArray) {
        if (asv2 == null) {
            return;
        }
        boolean[] blArray = new boolean[a.Values.size()];
        Arrays.fill(blArray, false);
        for (lcs lcs2 : lcsArray) {
            a a2 = a.Values.get(lcs2.qEI);
            if (a2 != a.bGT && a2 != a.bGU && a2 != a.bGV) {
                return;
            }
            if (lcw.enb() && (lcs2.jbX.enw() != 5000 ? lcs2.jbX.ib() != 7000 : lcs2.jbX.ib() == 3)) continue;
            if (lea.enW().isDescendant(lcs2.ResourceType, cug.fgE) || asv2.Uq() && lea.enW().isDescendant(lcs2.ResourceType, cug.flz) || a2 == a.bGT && cug.vG((int)lcs2.ResourceType)) continue;
            blArray[a.getOrdinal((a)a2)] = true;
        }
        this.bGF.remove(asv2);
        this.bGE.remove(asv2);
        if (blArray[a.getOrdinal(a.bGV)] && blArray[a.getOrdinal(a.bGU)] && blArray[a.getOrdinal(a.bGT)]) {
            this.bGE.add(asv2);
            return;
        }
        if (blArray[a.getOrdinal(a.bGT)]) {
            this.bGF.put(asv2, a.bGT);
        } else if (blArray[a.getOrdinal(a.bGV)]) {
            this.bGF.put(asv2, a.bGV);
        } else if (blArray[a.getOrdinal(a.bGU)]) {
            this.bGF.put(asv2, a.bGU);
        }
    }

    private boolean a(ljq ljq2, ljq ljq3, ljq ljq4, float f) {
        float f2 = (ljq4.x - ljq2.x) * (ljq3.x - ljq2.x) + (ljq4.y - ljq2.y) * (ljq3.y - ljq2.y) + (ljq4.rlV - ljq2.rlV) * (ljq3.rlV - ljq2.rlV);
        float f3 = (ljq3.x - ljq2.x) * (ljq3.x - ljq2.x) + (ljq3.y - ljq2.y) * (ljq3.y - ljq2.y) + (ljq3.rlV - ljq2.rlV) * (ljq3.rlV - ljq2.rlV);
        float f4 = f2 / f3;
        if (f4 < 0.0f) {
            return false;
        }
        if (f4 > 1.0f) {
            return false;
        }
        ljq.e(ljq3, ljq2, this.bBM);
        this.bBM.nm(f4);
        this.bBM.es(ljq2);
        float f5 = this.bBM.eA(ljq4);
        return f5 < f * f;
    }

    private boolean d(ljq ljq2, ljq ljq3) {
        float f = 0.33f;
        ljq[] ljqArray = this.bFP.Ji().LY();
        for (int i = 0; i < this.bFP.Ji().LZ(); ++i) {
            if (ljqArray[i] == null || !this.a(ljq2, ljq3, ljqArray[i], 0.33f)) continue;
            float f2 = ljq.s(ljq2, ljqArray[i]);
            if (f2 < 0.33f) {
                ljq.e(ljqArray[i], ljq2, this.bGM);
                this.bGM.normalize();
                ljq.e(ljq3, ljq2, this.bGN);
                this.bGN.normalize();
                if (ljq.u(this.bGM, this.bGN) < 0.0f) continue;
            }
            return true;
        }
        return false;
    }

    private boolean a(ljq ljq2, ljq ljq3, asv asv2, boolean bl) {
        if (asv2 == null) {
            return false;
        }
        if (ljq2 == null) {
            return false;
        }
        if (ljq3 == null) {
            return false;
        }
        float f = asv2.TX();
        this.bGL.ex(asv2.av());
        if (bl) {
            this.bGL.y += f;
        }
        return this.a(ljq2, ljq3, this.bGL, f);
    }

    private boolean h(asv asv2) {
        float f = this.bFP.Jc().Tg() * asv2.Ui();
        float f2 = ljq.t(asv2.av(), this.bFP.av());
        return f2 < f * f;
    }

    private boolean i(asv asv2) {
        if (!this.bFP.Jc().To()) {
            return false;
        }
        float f = ljq.t(asv2.av(), this.bFP.av());
        return f < 2500.0f;
    }

    private boolean a(asv asv2, boolean bl) {
        if (asv2 == null) {
            return false;
        }
        float f = this.bFP.av().ez(asv2.av());
        if (!this.bFP.Jc().Tf().j(f, this.r(asv2))) {
            return false;
        }
        if (!bl && !this.bFP.Jc().Tk().a(f, this.bFP.Jp().enQ(), asv2.Ui())) {
            return false;
        }
        if (bl && f < 4.0f) {
            return true;
        }
        return !this.bGE.contains(asv2);
    }

    public void l(ljq ljq2, float f) {
        int n;
        Object object;
        ldv[] ldvArray = null;
        Collection collection = this.bFP.IT();
        if (collection.size() > 0) {
            ldvArray = new ldv[collection.size()];
            object = collection.iterator();
            n = 0;
            while (object.hasNext()) {
                ldvArray[n] = ((asv)object.next()).KY();
                ++n;
            }
        }
        object = (kjj)this.bFP.getMessageDelegator().h(2823);
        n = 0xD | (this.bFP.Jl().TV() ? 0 : 16);
        let[] letArray = new let[]{new let()};
        letArray[0].mw = new ljq(ljq2);
        letArray[0].mw.y += f;
        letArray[0].mx = new ljq(0.0f, -1.0f, 0.0f);
        letArray[0].dum = 2.0f * f;
        ((kjj)object).F(ldvArray);
        ((kjj)object).a(letArray);
        ((kjj)object).Yj(n);
        ((khd)object).ts(this.bFP.getGUID());
        ((kjb)object).Ye(0);
        this.bFP.getMessageDelegator().a((khd)object);
        this.bGJ.put(((kjj)object).GUID, ljq2);
    }

    private void j(asv asv2) {
        ldv[] ldvArray;
        ldv ldv2 = this.bFP.getGUID();
        float f = this.bFP.Jl().Ue();
        if (asv2.Ut()) {
            return;
        }
        ljq ljq2 = this.bFP.av().esF();
        ljq2.y += f;
        ljq.e(asv2.av(), ljq2, this.bBM);
        let[] letArray = new let[a.Values.size()];
        for (a a2 : a.Values) {
            ldvArray = new let();
            ldvArray.mw = ljq2;
            boolean bl = false;
            switch (a2) {
                case bGT: {
                    ldvArray.mx = this.bBM.esF();
                    ldvArray.mx.y += asv2.Ue() * 0.95f;
                    ldvArray.dum = ldvArray.mx.eqN();
                    if (ldvArray.dum < 0.001f) {
                        bl = true;
                        break;
                    }
                    ldvArray.mx.nm(1.0f / ldvArray.dum);
                    break;
                }
                case bGV: {
                    ldvArray.mx = this.bBM.esF();
                    ldvArray.mx.y += asv2.Ue() * 0.6f;
                    ldvArray.dum = ldvArray.mx.eqN();
                    if (ldvArray.dum < 0.001f) {
                        bl = true;
                        break;
                    }
                    ldvArray.mx.nm(1.0f / ldvArray.dum);
                    break;
                }
                case bGU: {
                    ldvArray.mx = this.bBM.esF();
                    ldvArray.mx.y += asv2.Ue() * 0.15f;
                    ldvArray.dum = ldvArray.mx.eqN();
                    if (ldvArray.dum < 0.001f) {
                        bl = true;
                        break;
                    }
                    ldvArray.mx.nm(1.0f / ldvArray.dum);
                }
            }
            letArray[a2.ordinal()] = ldvArray;
            if (!bl) continue;
            this.bGE.remove(asv2);
            this.bGF.remove(asv2);
            return;
        }
        kjj kjj2 = (kjj)this.bFP.getMessageDelegator().h(2823);
        int n = 13;
        ldvArray = new ldv[]{this.bFP.IX(), asv2.KY()};
        kjj2.F(ldvArray);
        kjj2.a(letArray);
        kjj2.Yj(13);
        kjj2.ts(ldv2);
        kjj2.Ye(0);
        this.bGI.put(kjj2.GUID, asv2);
        this.bFP.getMessageDelegator().a(kjj2);
    }

    private void e(float f, float f2) {
        if ((double)f > Math.PI) {
            f -= (float)Math.PI * 2;
        } else if ((double)f < -Math.PI) {
            f += (float)Math.PI * 2;
        }
        arw.a(f2, f, this.bGP);
    }

    public ljq Lw() {
        float f = (float)(Math.PI * 2 * arw.Sw());
        float f2 = 0.33f * (2.0f + arw.Sx());
        ljq ljq2 = this.bFP.av().esF();
        ljq2.x = (float)((double)ljq2.x + (double)f2 * Math.cos(f));
        ljq2.rlV = (float)((double)ljq2.rlV + (double)f2 * Math.sin(f));
        return ljq2;
    }

    @Override
    public float k(asv asv2) {
        a a2 = this.bGF.get(asv2);
        if (a2 == a.bGV) {
            return 0.95f;
        }
        return 0.6f;
    }

    @Override
    public float l(asv asv2) {
        a a2 = this.bGF.get(asv2);
        if (asv2.Uw() || a2 == a.bGV) {
            return 0.95f;
        }
        if (a2 == a.bGU || a2 == a.bGT) {
            return 0.6f;
        }
        return 0.15f;
    }
}

