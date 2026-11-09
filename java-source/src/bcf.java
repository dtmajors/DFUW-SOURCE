/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  azn
 */
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;

public class bcf
extends btk {
    private ayd cCy = null;
    private azn cwP = null;
    private Map<String, bcc> cVJ = null;

    public bcf(ayd ayd2, azn azn2) {
        this.cCy = ayd2;
        this.cwP = azn2;
        this.cVJ = lcn.emw();
    }

    public void c(nm nm2) {
        if (this.cVJ == null || this.cVJ.isEmpty()) {
            return;
        }
        nm2.aDA = lcn.abH(this.cVJ.size());
        for (bcc bcc2 : this.cVJ.values()) {
            nr nr2 = new nr();
            nr2.ade = this.cCy.getGUID();
            nr2.aEN = bcc2.getName();
            nr2.aEO = bcc2.abG().akV();
            nm2.aDA.add(nr2);
        }
    }

    public void a(nm nm2) {
        if (nm2.aDA == null || nm2.aDA.isEmpty()) {
            return;
        }
        for (nr nr2 : nm2.aDA) {
            bcc bcc2 = new bcc(nr2.aEN);
            bcc2.abG().p(nr2.aEO);
            this.cVJ.put(bcc2.getName(), bcc2);
        }
    }

    public boolean ZR() {
        return true;
    }

    public void a(bbr bbr2) {
        if (bbr2 == null) {
            return;
        }
        if (this.cCy.dS(bbr2.abB())) {
            bbr2.abG().addAll((Collection<? extends bca>)EnumSet.allOf(bca.class));
        } else {
            bbr2.abG().addAll((Collection<? extends bca>)bca.addNewMemberPermissions(null));
        }
    }

    public void b(bbr bbr2) {
        if (bbr2.abJ()) {
            bbr2.abG().addAll((Collection<? extends bca>)EnumSet.allOf(bca.class));
        } else {
            for (bca bca2 : bbr2.abG()) {
                if (!bca2.akN()) continue;
                for (bca bca3 : bca2.akP()) {
                    if (bbr2.abG().d(bca3)) continue;
                    bbr2.abG().e(bca3);
                }
            }
        }
    }

    public void a(bbr bbr2, bbr bbr3) {
        bbr3.cP(true);
        if (bbr2 != null) {
            bbr2.cP(false);
            bbr2.abG().f(bca.cTj);
            this.cCy.e(bbr2);
        }
        bbr3.abG().addAll((Collection<? extends bca>)EnumSet.allOf(bca.class));
        this.cCy.e(bbr3);
    }

    private void a(end end2, bce bce2, boolean bl) {
        if (end2 == null || bce2 == null) {
            return;
        }
        ene ene2 = (ene)this.MessageDelegator.h(13879, this.cCy.getGUID(), end2.aO());
        this.MessageDelegator.b(end2, ene2);
        ene2.a(bce2);
        ene2.a(bl ? this.cVJ.values().toArray(new bcc[this.cVJ.size()]) : null);
        this.MessageDelegator.F(ene2);
    }

    private void a(enf enf2, bch bch2, bcb bcb2) {
        if (enf2 == null || bch2 == null) {
            return;
        }
        eng eng2 = (eng)this.MessageDelegator.h(13881, this.cCy.getGUID(), enf2.aO());
        this.MessageDelegator.b(enf2, eng2);
        eng2.a(bch2);
        eng2.e(bcb2);
        this.MessageDelegator.F(eng2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13878: {
                this.a((end)dxq2);
                break;
            }
            case 13880: {
                this.a((enf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(end end2) {
        boolean bl;
        boolean bl2 = bl = end2.bEN().compareTo(ayi.cyA) >= 0;
        if (bl) {
            lfn.b(2, this.getClass().getSimpleName(), "handleClanPermissionsGroupOperationRequest() : Admin-Override Enabled for Received Operation Request!... Operation = " + (Object)((Object)end2.bIX()) + ", Requesting Player = " + end2.bHL() + "[" + (Object)((Object)end2.bEN()) + "]");
        }
        bbr bbr2 = this.cCy.dR(end2.bHL());
        if (!bl && bbr2 == null) {
            this.a(end2, bce.cVz, false);
            return;
        }
        switch (end2.bIX()) {
            case cVp: {
                if (bl || bbr2.b(bca.cTu)) break;
                this.a(end2, bce.cVA, false);
                return;
            }
            case cVq: {
                if (bl || bbr2.b(bca.cTu)) break;
                this.a(end2, bce.cVA, false);
                return;
            }
            case cVr: {
                if (!bl && !bbr2.b(bca.cTr)) {
                    this.a(end2, bce.cVA, false);
                    return;
                }
                if (end2.zo().length() == 0) {
                    this.a(end2, bce.cVy, true);
                    return;
                }
                if (this.cVJ.size() == 10) {
                    this.a(end2, bce.cVC, true);
                    return;
                }
                if (this.cVJ.containsKey(end2.zo())) {
                    this.a(end2, bce.cVD, true);
                    return;
                }
                this.cVJ.put(end2.zo(), new bcc(end2.zo()));
                break;
            }
            case cVs: {
                if (!bl && !bbr2.b(bca.cTs)) {
                    this.a(end2, bce.cVA, false);
                    return;
                }
                bcc bcc2 = this.cVJ.get(end2.zo());
                if (bcc2 == null) {
                    this.a(end2, bce.cVB, true);
                    return;
                }
                if (end2.bIY() == null || end2.zo().compareTo(end2.bIY()) == 0) {
                    this.a(end2, bce.cVy, true);
                    return;
                }
                if (this.cVJ.containsKey(end2.bIY())) {
                    this.a(end2, bce.cVD, true);
                    return;
                }
                if (!bl && !bcc2.v(bbr2)) {
                    this.a(end2, bce.cVA, true);
                    return;
                }
                this.cVJ.remove(end2.bIY());
                bcc2.setName(end2.bIY());
                this.cVJ.put(bcc2.getName(), bcc2);
                break;
            }
            case cVt: {
                if (!bl && !bbr2.b(bca.cTt)) {
                    this.a(end2, bce.cVA, false);
                    return;
                }
                bcc bcc3 = this.cVJ.get(end2.zo());
                if (bcc3 == null) {
                    this.a(end2, bce.cVB, true);
                    return;
                }
                if (!bl && !bcc3.v(bbr2)) {
                    this.a(end2, bce.cVA, true);
                    return;
                }
                this.cVJ.remove(end2.zo());
                break;
            }
            case cVu: {
                bcc bcc4 = this.cVJ.get(end2.zo());
                if (bcc4 == null) {
                    this.a(end2, bce.cVB, true);
                    return;
                }
                bcb bcb2 = end2.abG();
                if (bcb2 == null || bcb2.isEmpty()) {
                    this.a(end2, bce.cVE, true);
                    return;
                }
                EnumSet<bca> enumSet = EnumSet.copyOf(bcb2);
                for (Object object : bcb2) {
                    enumSet.addAll(object.akR());
                }
                for (Object object : enumSet) {
                    if (!object.akO()) {
                        this.a(end2, bce.cVF, true);
                        return;
                    }
                    if (bl || bbr2.c((bca)((Object)object))) continue;
                    this.a(end2, bce.cVA, true);
                    return;
                }
                if (end2.bIZ()) {
                    for (Object object : this.cCy.ZU().values()) {
                        if (!bcc4.v((bbr)object)) continue;
                        ((bbr)object).abG().addAll((Collection<? extends bca>)enumSet);
                        this.cCy.e((bbr)object);
                        this.cwP.a(773, (bbr)object);
                    }
                }
                bcc4.i(enumSet);
                break;
            }
            case cVv: {
                bcc bcc5 = this.cVJ.get(end2.zo());
                if (bcc5 == null) {
                    this.a(end2, bce.cVB, true);
                    return;
                }
                bcb bcb3 = end2.abG();
                if (bcb3 == null || bcb3.isEmpty()) {
                    this.a(end2, bce.cVE, true);
                    return;
                }
                for (Object object : bcb3) {
                    if (!bl && !bbr2.c((bca)((Object)object))) {
                        this.a(end2, bce.cVA, true);
                        return;
                    }
                    EnumSet<bca> enumSet = ((bca)((Object)object)).akS();
                    for (bca bca2 : enumSet) {
                        if (!bcc5.d(bca2) || bcb3.d(bca2)) continue;
                        this.a(end2, bce.cVG, true);
                        return;
                    }
                }
                if (end2.bIZ()) {
                    for (Object object : this.cCy.ZU().values()) {
                        if (!bcc5.v((bbr)object) || this.cCy.dS(((bbr)object).abB())) continue;
                        boolean bl3 = false;
                        for (bca bca2 : bcb3) {
                            EnumSet<bca> enumSet = bca2.akS();
                            for (bca bca3 : enumSet) {
                                if (!((bbr)object).b(bca3) || bcb3.d(bca3)) continue;
                                bl3 = true;
                                break;
                            }
                            if (!bl3) continue;
                            break;
                        }
                        if (bl3) continue;
                        ((bbr)object).abG().removeAll(bcb3);
                        this.cCy.e((bbr)object);
                        this.cwP.a(773, (bbr)object);
                    }
                }
                bcc5.j(bcb3);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleClanPermissionGroupOperationRequestMessage() : Unrecognised Operation Requested!!!... Operation = " + (Object)((Object)end2.bIX()));
                this.a(end2, bce.cVy, true);
                assert (false);
                return;
            }
        }
        this.a(end2, bce.cVH, true);
    }

    private void a(enf enf2) {
        boolean bl;
        boolean bl2 = bl = enf2.bEN().compareTo(ayi.cyB) >= 0;
        if (bl) {
            lfn.b(2, this.getClass().getSimpleName(), "handleClanPermissionsMemberOperationRequestMessage() : Admin-Override Enabled for Received Operation Request!... Operation = " + (Object)((Object)enf2.bJc()) + ", Requesting Player = " + enf2.bHL() + "[" + (Object)((Object)enf2.bEN()) + "]");
        }
        bbr bbr2 = this.cCy.dR(enf2.bHL());
        if (!bl && bbr2 == null) {
            this.a(enf2, bch.cVW, null);
            return;
        }
        bbr bbr3 = this.cCy.dR(enf2.bJd());
        if (bbr3 == null) {
            this.a(enf2, bch.cVX, null);
            return;
        }
        switch (enf2.bJc()) {
            case cVN: {
                if (bl || bbr2 == bbr3) break;
                this.a(enf2, bch.cVV, null);
                return;
            }
            case cVO: {
                if (!bl && bbr2 == bbr3) {
                    this.a(enf2, bch.cVZ, bbr3.abG());
                    return;
                }
                bcb bcb2 = enf2.abG();
                if (bcb2 == null || bcb2.isEmpty()) {
                    this.a(enf2, bch.cVY, bbr3.abG());
                    return;
                }
                EnumSet<bca> enumSet = EnumSet.copyOf(bcb2);
                for (bca bca2 : bcb2) {
                    enumSet.addAll(bca2.akR());
                }
                for (bca bca2 : enumSet) {
                    if (!bl && !bbr2.c(bca2)) {
                        this.a(enf2, bch.cVV, bbr3.abG());
                        return;
                    }
                    if (!bca2.akI()) continue;
                    int n = -1;
                    for (bbr bbr4 : this.cCy.ZU().values()) {
                        if (!bbr4.b(bca2)) continue;
                        ++n;
                    }
                    if (n < bca2.akJ()) continue;
                    this.a(enf2, bch.cWb, bbr3.abG());
                    return;
                }
                bbr3.abG().addAll((Collection<? extends bca>)enumSet);
                this.cCy.e(bbr3);
                this.cwP.a(773, bbr3);
                break;
            }
            case cVP: {
                if (this.cCy.dS(bbr3.abB())) {
                    this.a(enf2, bch.cVV, bbr3.abG());
                    return;
                }
                if (!bl && bbr2 == bbr3) {
                    this.a(enf2, bch.cVZ, bbr3.abG());
                    return;
                }
                bcb bcb3 = enf2.abG();
                if (bcb3 == null || bcb3.isEmpty()) {
                    this.a(enf2, bch.cVY, bbr3.abG());
                    return;
                }
                for (bca bca3 : bcb3) {
                    if (!bl && !bbr2.c(bca3)) {
                        this.a(enf2, bch.cVV, bbr3.abG());
                        return;
                    }
                    EnumSet<bca> enumSet = bca3.akS();
                    for (bca bca4 : enumSet) {
                        if (!bbr3.b(bca4) || bcb3.d(bca4)) continue;
                        this.a(enf2, bch.cWc, bbr3.abG());
                        return;
                    }
                }
                bbr3.abG().removeAll(bcb3);
                this.cCy.e(bbr3);
                this.cwP.a(773, bbr3);
                break;
            }
            case cVQ: {
                if (!bl && bbr2 == bbr3) {
                    this.a(enf2, bch.cVZ, bbr3.abG());
                    return;
                }
                bcc bcc2 = this.cVJ.get(enf2.zo());
                if (bcc2 == null) {
                    this.a(enf2, bch.cWd, bbr3.abG());
                    return;
                }
                if (!bl && !bcc2.v(bbr2)) {
                    this.a(enf2, bch.cVV, bbr3.abG());
                    return;
                }
                if (!bl && !bcc2.w(bbr2)) {
                    this.a(enf2, bch.cVV, bbr3.abG());
                    return;
                }
                for (bca bca5 : bcc2) {
                    if (!bca5.akI()) continue;
                    int n = -1;
                    for (bbr bbr5 : this.cCy.ZU().values()) {
                        if (!bbr5.b(bca5)) continue;
                        ++n;
                    }
                    if (n < bca5.akJ()) continue;
                    this.a(enf2, bch.cWb, bbr3.abG());
                    return;
                }
                bcc2.x(bbr3);
                this.cCy.e(bbr3);
                this.cwP.a(773, bbr3);
                break;
            }
            case cVR: {
                if (this.cCy.dS(bbr3.abB())) {
                    this.a(enf2, bch.cVV, bbr3.abG());
                    return;
                }
                if (!bl && bbr2 == bbr3) {
                    this.a(enf2, bch.cVZ, bbr3.abG());
                    return;
                }
                bcc bcc3 = this.cVJ.get(enf2.zo());
                if (bcc3 == null) {
                    this.a(enf2, bch.cWd, bbr3.abG());
                    return;
                }
                if (!bl && !bcc3.v(bbr2)) {
                    this.a(enf2, bch.cVV, bbr3.abG());
                    return;
                }
                if (!bl && !bcc3.w(bbr2)) {
                    this.a(enf2, bch.cVV, bbr3.abG());
                    return;
                }
                bcc3.y(bbr3);
                this.cCy.e(bbr3);
                this.cwP.a(773, bbr3);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleClanPermissionsMemberOperationRequestMessage() : Unrecognised Operation Requested!!!... Operation = " + (Object)((Object)enf2.bJc()));
                this.a(enf2, bch.cVU, null);
                assert (false);
                return;
            }
        }
        this.a(enf2, bch.cWe, bbr3.abG());
    }
}

