/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 *  cxd
 *  lcw
 */
import java.util.Iterator;
import java.util.Map;

public class cel
extends btk
implements bto {
    private static final double eqp = 60.0;
    private static final double eqq = 300.0;
    private static boolean bC = false;
    private final cex aaY;
    private final cfb eqr;
    private Map<Integer, a> eqs = lcn.emw();
    private double Ec = 0.0;
    private static les ResourceTree = lea.enW();
    private static les aqN = lea.enZ();
    private static les DX = lea.enT();

    public cel(cex cex2) {
        this.aaY = cex2;
        this.eqr = new cfb(this.aaY);
    }

    public cfb aLA() {
        return this.eqr;
    }

    public void aLB() {
        this.eqr.initialize();
        if (this.aaY.aMA() != null && !this.aaY.aMA().mp()) {
            cer.e(this.aaY);
            cer.g(this.aaY);
            cer.n(this.aaY);
            cer.o(this.aaY);
            cer.d(this.aaY);
            cer.f(this.aaY);
            cer.i(this.aaY);
            cer.m(this.aaY);
            cer.h(this.aaY);
            cer.j(this.aaY);
            cer.k(this.aaY);
            cer.l(this.aaY);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.eqs.isEmpty()) {
            return;
        }
        if (ldz2.rgz < this.Ec) {
            return;
        }
        this.Ec = ldz2.rgz + 60.0;
        Iterator<a> iterator = this.eqs.values().iterator();
        while (iterator.hasNext()) {
            a a2 = iterator.next();
            if (!(a2.dth <= ldz2.rgz)) continue;
            iterator.remove();
        }
    }

    public void c(bfl bfl2) {
        switch (bfl2.Type) {
            case 2: {
                if (bfl2.aYC == cxd.fJU) {
                    return;
                }
                if (bfl2.aYC == cxd.fHJ) {
                    return;
                }
                if (bfl2.Magnitude != 0.0f) break;
                return;
            }
        }
    }

    public void f(bfn bfn2) {
    }

    public void d(et et2, float f2) {
        switch (et2.getType()) {
            case 160: {
                cer.f(this.aaY);
                cer.m(this.aaY);
                cer.i(this.aaY);
                cer.d(this.aaY);
                break;
            }
            case 176: {
                cer.f(this.aaY);
                cer.m(this.aaY);
                cer.i(this.aaY);
                break;
            }
            case 208: {
                cer.f(this.aaY);
                cer.m(this.aaY);
                cer.i(this.aaY);
                cer.d(this.aaY);
                break;
            }
            case 240: {
                cer.f(this.aaY);
                cer.m(this.aaY);
                cer.i(this.aaY);
                break;
            }
            case 1968: 
            case 3488: 
            case 14048: {
                cer.h(this.aaY);
                break;
            }
            case 416: {
                cer.j(this.aaY);
                break;
            }
            case 448: {
                cer.k(this.aaY);
                break;
            }
            case 464: {
                cer.l(this.aaY);
                break;
            }
            case 400: {
                cer.l(this.aaY);
                break;
            }
            case 384: {
                cer.k(this.aaY);
                break;
            }
            case 352: {
                cer.j(this.aaY);
                break;
            }
            case 13280: {
                if (!lcw.aQH()) break;
                cer.k(this.aaY);
                break;
            }
            default: {
                return;
            }
        }
    }

    public void a(gjb gjb2) {
        assert (gjb2.SkillType > 0);
        assert (gjb2.aYH > 0);
        a a2 = this.eqs.remove(gjb2.aYH);
        if (a2 == null) {
            return;
        }
        if (gjb2.aO().equals(this.aaY.getGUID()) && !a2.eqt) {
            if (lcw.enb()) {
                // empty if block
            }
            this.eqs.put(a2.aYH, a2);
            return;
        }
        if (aqN.isDescendant(a2.SkillType, cxd.fJq) || aqN.isDescendant(a2.SkillType, cxd.fJi)) {
            czj czj2;
            cxd.h h2 = cxd.h.fRk;
            h2 = cxd.h.getMagicSkillModeTypeFromSkillType(a2.SkillType);
            cxc cxc2 = this.aaY.aJz().ht(a2.SkillType);
            if (cxc2 == null) {
                lfn.b(5, "SFPlayerAdvancementManager", "handleSkillEffectPerformedMessage() player does not have skill " + lea.enZ().getName(a2.SkillType));
                return;
            }
            if (cxc2 instanceof czj && (czj2 = (czj)((Object)cxc2)).bhK()) {
                if (a2.eqt) {
                    this.aaY.jk().yZ(a2.SkillType);
                } else if (gjb2.jiV && (h2 == cxd.h.fRm || h2 == cxd.h.fRo)) {
                    float f2 = cxd.fOH;
                    f2 = h2 == cxd.h.fRo ? (f2 *= cxd.fOE) : (f2 *= cxd.fOF);
                    this.aaY.jk().a(a2.SkillType, f2, true, cxd.w.fTc);
                } else if (cxd.xP((int)gjb2.dhr)) {
                    this.aaY.jk().a(a2.SkillType, cxd.fOH, true, cxd.w.fTb);
                }
            }
        } else if (gjb2.jiV) {
            this.aaY.jk().a(a2.SkillType, cxd.fOE, true, cxd.w.fTa);
        } else if (cxd.xP((int)gjb2.dhr)) {
            this.aaY.jk().x(a2.SkillType, cxd.fOC);
        }
        if ((gjb2.jiW || lea.enW().isDescendant(gjb2.dhr, cug.fkw)) && cxd.xE((int)a2.SkillType)) {
            this.eqr.kG(gjb2.aO());
        }
        if (a2.SkillType == cxd.fJZ && this.aaY.aJG()) {
            this.eqr.aJK();
        }
    }

    public void a(czj czj2, int n, ldv ldv2, int n2) {
        assert (czj2 != null);
        assert (n > 0);
        assert (ldv2 != null);
        assert (n2 > 0);
        if (cxd.xz((int)czj2.zg())) {
            a a2 = this.eqs.get(n);
            if (a2 == null) {
                return;
            }
            ddy ddy2 = this.aaY.pd(a2.aYH);
            if (ddy2 == null) {
                lfn.b(0, "SFPlayerAdvancementManager", "handleSkillFoundValidTarget() No weaponinfocache found for skill '" + czj2.getName() + "' with sessionID " + a2.aYH);
                return;
            }
            if (ddy2.bkk()) {
                return;
            }
            czj2.bhq();
        }
    }

    public void c(cxc cxc2) {
        assert (cxc2 != null);
        float f2 = cxc2.bfw();
        if (cxc2.zg() == cxd.fJP) {
            cer.d(this.aaY);
        }
    }

    public void a(czb czb2) {
        if (cxd.xF((int)czb2.zg()) && this.aaY.fi().ag(1344)) {
            this.aaY.jm().w(true);
        }
        if (cxd.xx((int)czb2.zg())) {
            if (this.aaY.aJB().bkk()) {
                if (czb2.bfE() && cxd.xH((int)czb2.zg())) {
                    czb2.a(cxd.q.fSp);
                }
                return;
            }
            double d2 = this.MessageDelegator.arc().rgz + 300.0;
            a a2 = new a(this, czb2.zg(), czb2.Ec(), d2);
            this.eqs.put(a2.aYH, a2);
        }
    }

    public void b(czb czb2) {
        if (cxd.xS((int)czb2.zg())) {
            boolean bl;
            boolean bl2 = bl = czb2.bfE() && cxd.xH((int)czb2.zg());
            if (bl) {
                if (this.aaY.aJB().bkk()) {
                    return;
                }
                czb2.a(cxd.q.fSp);
                this.eqs.remove(czb2.Ec());
                return;
            }
            czj czj2 = (czj)czb2;
            if (czj2.bhK()) {
                return;
            }
            if (this.aaY.aJB().bkk() && cxd.xy((int)czb2.zg())) {
                return;
            }
            czb2.a(cxd.q.fSq);
        }
    }

    public void a(czj czj2, ldv ldv2) {
        assert (czj2 != null);
        assert (ldv2 != null);
        if (czj2.bhK()) {
            a a2 = this.eqs.get(czj2.Ec());
            if (a2 != null) {
                a2.eqt = true;
            }
            return;
        }
    }
}

