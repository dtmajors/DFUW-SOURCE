/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cew
 *  cug
 *  lcr
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class cey
extends btk
implements bto {
    private static final double ety = 1.0;
    private static final float etz = 5.0f;
    private cew dLR = null;
    private dqi asE = null;
    private boolean etA = true;
    private ljq etB = null;
    private int abz = -1;
    private double bcH = 0.0;
    private ljq etC = null;
    private Map<Integer, Set<lfs<ldv, ljq>>> etD = null;
    private Map<ldv, lfs<ldv, ljq>> etE = null;
    private Set<acb> abB = null;
    private Map<Integer, Set<aby>> etF = null;
    private Map<Integer, Set<aca>> etG = null;

    public int lt() {
        return this.abz;
    }

    public ljq oB() {
        return this.etC;
    }

    public cey(cew cew2) {
        this.dLR = cew2;
        this.etD = lcn.emw();
        this.etE = lcn.emw();
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    public void aMZ() {
        this.asE = new dqi();
        this.asE.setGUID(this.MessageDelegator.bzv());
        this.asE.nC(this.GUID);
        this.asE.M(new int[]{1488});
        this.asE.setMessageDelegator(this.MessageDelegator);
        this.a(this.asE);
        this.etA = false;
    }

    @Override
    public void cleanUp() {
        if (this.asE != null) {
            this.kF(this.asE.getGUID());
            this.asE = null;
        }
        super.cleanUp();
    }

    public void aNa() {
        this.etA = true;
    }

    public void gJ() {
        if (this.abz >= 0) {
            this.bZ(this.abz);
        }
        this.etB = null;
        this.abz = -1;
        this.bcH = 0.0;
        this.etA = false;
    }

    public void s(int n, ldv ldv2) {
        this.c(n, ldv2, null);
    }

    public void c(int n, ldv ldv2, ljq ljq2) {
        if (n < 0 || ldv2 == null || ldv.au(ldv2, lcr.qAC)) {
            return;
        }
        if (lea.enW().isDescendant(n, cug.fkd)) {
            return;
        }
        Set<lfs<ldv, ljq>> set = this.etD.get(n);
        if (set == null) {
            set = lcn.emx();
            this.etD.put(n, set);
        }
        if (this.etE.containsKey(ldv2)) {
            return;
        }
        lfs<ldv, ljq> lfs2 = new lfs<ldv, ljq>(ldv2, ljq2);
        set.add(lfs2);
        this.etE.put(ldv2, lfs2);
        this.v(n, ldv2);
    }

    public void t(int n, ldv ldv2) {
        lfs<ldv, ljq> lfs2;
        if (n < 0 || ldv2 == null || ldv.au(ldv2, lcr.qAC)) {
            return;
        }
        Set<lfs<ldv, ljq>> set = this.etD.get(n);
        if (set != null && (lfs2 = this.etE.remove(ldv2)) != null) {
            set.remove(lfs2);
        }
        this.w(n, ldv2);
    }

    public Set<ldv> pE(int n) {
        Set<ldv> set = lcn.emx();
        Set<lfs<ldv, ljq>> set2 = this.etD.get(n);
        if (set2 != null) {
            for (lfs<ldv, ljq> lfs2 : set2) {
                set.add((ldv)lfs2.reX);
            }
        }
        return set;
    }

    public ljq c(lfs<ldv, ljq> lfs2) {
        if (lfs2 == null) {
            return null;
        }
        return lfs2.reY != null ? (ljq)lfs2.reY : this.kE((ldv)lfs2.reX);
    }

    public void a(acb acb2) {
        if (acb2 == null) {
            return;
        }
        if (this.abB == null) {
            this.abB = lcn.emx();
        }
        if (this.abB.contains(acb2)) {
            return;
        }
        this.abB.add(acb2);
    }

    public void b(acb acb2) {
        if (acb2 == null) {
            return;
        }
        if (this.abB == null) {
            return;
        }
        this.abB.remove(acb2);
        if (this.abB.isEmpty()) {
            this.abB = null;
        }
    }

    private void bY(int n) {
        if (this.abB == null) {
            return;
        }
        for (acb acb2 : new HashSet<acb>(this.abB)) {
            acb2.eh(n);
        }
    }

    private void bZ(int n) {
        if (this.abB == null) {
            return;
        }
        for (acb acb2 : new HashSet<acb>(this.abB)) {
            acb2.ei(n);
        }
    }

    public void a(aca aca2, int n) {
        Set<aca> set;
        if (aca2 == null || n < 0) {
            return;
        }
        if (this.etG == null) {
            this.etG = lcn.emw();
        }
        if ((set = this.etG.get(n)) == null) {
            set = lcn.emx();
            this.etG.put(n, set);
        }
        if (set.contains(aca2)) {
            return;
        }
        set.add(aca2);
        this.bcH = 0.0;
        this.etC = null;
    }

    public void b(aca aca2, int n) {
        if (aca2 == null || n < 0) {
            return;
        }
        if (this.etG == null) {
            return;
        }
        Set<aca> set = this.etG.get(n);
        if (set == null) {
            return;
        }
        set.remove(aca2);
        if (set.isEmpty()) {
            this.etG.remove(n);
        }
        if (this.etG.isEmpty()) {
            this.etG = null;
        }
    }

    private void b(int n, float f2, ldv ldv2, ljq ljq2) {
        if (this.etG == null) {
            return;
        }
        Set<aca> set = this.etG.get(n);
        if (set.isEmpty()) {
            return;
        }
        for (aca aca2 : new HashSet<aca>(set)) {
            aca2.a(n, f2, ldv2, ljq2);
        }
    }

    public void a(aby aby2, int n) {
        Set<aby> set;
        if (aby2 == null || n < 0) {
            return;
        }
        if (this.etF == null) {
            this.etF = lcn.emw();
        }
        if ((set = this.etF.get(n)) == null) {
            set = lcn.emx();
            this.etF.put(n, set);
        }
        if (set.contains(aby2)) {
            return;
        }
        set.add(aby2);
        Set<lfs<ldv, ljq>> set2 = this.etD.get(n);
        if (set2 == null) {
            return;
        }
        int n2 = 0;
        for (lfs<ldv, ljq> lfs2 : set2) {
            aby2.a(n, (ldv)lfs2.reX, this.c(lfs2), ++n2);
        }
    }

    public void b(aby aby2, int n) {
        Set<lfs<ldv, ljq>> set;
        if (aby2 == null || n < 0) {
            return;
        }
        if (this.etF == null) {
            return;
        }
        Set<aby> set2 = this.etF.get(n);
        if (set2 == null) {
            return;
        }
        set2.remove(aby2);
        if (set2.isEmpty()) {
            this.etF.remove(n);
        }
        if (this.etF.isEmpty()) {
            this.etF = null;
        }
        if ((set = this.etD.get(n)) == null) {
            return;
        }
        int n2 = set.size();
        for (lfs<ldv, ljq> lfs2 : set) {
            aby2.a(n, (ldv)lfs2.reX, this.c(lfs2), n2--);
        }
    }

    private void v(int n, ldv ldv2) {
        if (this.etF == null) {
            return;
        }
        Set<aby> set = this.etF.get(n);
        if (set == null) {
            return;
        }
        int n2 = this.etD.containsKey(n) ? this.etD.get(n).size() : 0;
        for (aby aby2 : new HashSet<aby>(set)) {
            aby2.a(n, ldv2, new ljq(), n2);
        }
    }

    private void w(int n, ldv ldv2) {
        if (this.etF == null) {
            return;
        }
        Set<aby> set = this.etF.get(n);
        if (set == null) {
            return;
        }
        int n2 = this.etD.containsKey(n) ? this.etD.get(n).size() : 0;
        for (aby aby2 : new HashSet<aby>(set)) {
            aby2.a(n, ldv2, n2);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.etA) {
            return;
        }
        if (this.etB == null) {
            return;
        }
        if (this.bcH + 1.0 > ldz2.rgz) {
            return;
        }
        if (this.etC != null && this.etB.eA(this.etC) < 25.0f) {
            return;
        }
        this.aNb();
        this.bcH = ldz2.rgz;
        this.etC = this.etB;
    }

    private void aNb() {
        int n = this.abz;
        this.abz = lea.eh(this.etB);
        if (n != this.abz) {
            if (n >= 0) {
                this.bZ(n);
            }
            if (this.abz >= 0) {
                this.bY(this.abz);
            }
        }
        if (this.etG == null) {
            return;
        }
        for (Integer n2 : new HashSet<Integer>(this.etG.keySet())) {
            float f2 = Float.MAX_VALUE;
            lfs comparable = null;
            Set<lfs<ldv, ljq>> set = null;
            if (lea.enW().e(lea.enW().acv(n2))) {
                set = this.etD.get(n2);
            } else {
                for (Integer n3 : this.etD.keySet()) {
                    if (!lea.enW().isDescendant(n3, n2)) continue;
                    if (set == null) {
                        set = new HashSet<lfs<ldv, ljq>>((Collection)this.etD.get(n3));
                        continue;
                    }
                    set.addAll((Collection<lfs<ldv, ljq>>)this.etD.get(n3));
                }
            }
            if (set == null) continue;
            for (lfs lfs2 : set) {
                float f3;
                ljq ljq2 = lfs2.reY == null ? this.kE((ldv)lfs2.reX) : (ljq)lfs2.reY;
                if (ljq2 == null || !(f2 > (f3 = ljq.t(this.etB, ljq2)))) continue;
                f2 = f3;
                comparable = lfs2;
            }
            if (comparable == null || f2 == Float.MAX_VALUE) continue;
            f2 = f2 == Float.MAX_VALUE ? f2 : (float)Math.sqrt(f2);
            this.b(n2, f2, (ldv)comparable.reX, (ljq)comparable.reY);
        }
    }

    private ljq kE(ldv ldv2) {
        amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv2);
        if (amf2 == null) {
            return null;
        }
        if (!(amf2 instanceof cbx)) {
            return null;
        }
        cbx cbx2 = (cbx)amf2;
        if (cbx2.aAG() == null) {
            return null;
        }
        if (cbx2.aAG().azb() == null) {
            return null;
        }
        return cbx2.aAG().azb();
    }

    private void a(dqi dqi2) {
        if (this.dLR == null || dqi2 == null) {
            return;
        }
        gzo gzo2 = (gzo)this.MessageDelegator.h(8193, this.GUID, this.dLR.getGUID());
        gzo2.jvG = dqi2;
        this.dLR.receiveMessage((dxq)gzo2);
    }

    private void kF(ldv ldv2) {
        if (this.dLR == null || ldv2 == null) {
            return;
        }
        gzr gzr2 = (gzr)this.MessageDelegator.h(8194, this.GUID, this.dLR.getGUID());
        gzr2.bWM = ldv2;
        this.dLR.receiveMessage((dxq)gzr2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8196: {
                this.a((gzq)dxq2);
                break;
            }
            case 8195: {
                this.a((gzp)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
                return;
            }
        }
    }

    private void a(gzq gzq2) {
        block3: for (ej ej2 : gzq2.DR) {
            switch (ej2.getType()) {
                case 1488: {
                    fc fc2 = (fc)ej2.getValue();
                    this.etB = fc2.Position;
                    continue block3;
                }
                default: {
                    assert (false) : "Recieved wiretap attribute value message for unknown attribute!!!";
                    return;
                }
            }
        }
    }

    private void a(gzp gzp2) {
        switch (gzp2.bhp.getType()) {
            case 1488: {
                fc fc2 = (fc)gzp2.bhp.getValue();
                this.etB = fc2.Position;
                break;
            }
            default: {
                assert (false) : "Recieved wiretap attribute changed message for unknown attribute!!!";
                return;
            }
        }
    }
}

