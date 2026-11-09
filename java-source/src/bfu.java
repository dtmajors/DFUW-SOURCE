/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cov
 *  cph
 *  cug
 *  lcr
 *  lcw
 */
public class bfu
extends bfq {
    public bfu(cbx cbx2) {
        super(cbx2);
    }

    @Override
    protected void c(bfn bfn2) {
        assert (bfn2 != null);
        super.c(bfn2);
        if (bfn2.aYF.equals(lcr.qAC)) {
            return;
        }
        this.a(bfn2.aYF, bfn2);
    }

    @Override
    protected void a(ldv ldv2, bfn bfn2) {
        Object object;
        assert (bfn2 != null);
        fbf fbf2 = (fbf)this.Qg.getMessageDelegator().h(12548, this.Qg.getGUID(), ldv2);
        fbf2.iIb = bfn2;
        ljq ljq2 = fbf2.Position = this.Qg.aAG() != null ? this.Qg.aAG().av() : new ljq(cg.gz);
        if (lea.enW().isDescendant(this.Qg.az(), cug.fpm) || lea.enW().isDescendant(this.Qg.az(), cug.fnc) || lea.enW().isDescendant(this.Qg.az(), cug.fpV)) {
            if (this.Qg instanceof ccs) {
                object = (ccs)this.Qg;
                fbf2.ade = ((ccs)object).aIY();
                fbf2.aDk = ((ccs)object).acm();
            } else if (this.Qg instanceof clb) {
                object = (clb)this.Qg;
                fbf2.ade = ((clb)object).aIY();
                fbf2.aDk = ((clb)object).acm();
            } else if (this.Qg instanceof ccj) {
                object = (ccj)this.Qg;
                fbf2.ade = ((ccj)object).abj();
                fbf2.aDk = ((ccj)object).acm();
            } else if (this.Qg instanceof ccn) {
                object = (ccn)this.Qg;
                fbf2.ade = ((ccn)object).abj();
            } else if (this.Qg instanceof cmj) {
                object = (cmj)this.Qg;
                fbf2.ade = ((cmj)object).aIY();
                fbf2.aDk = ((cmj)object).acm();
            } else assert (false) : "Unhandled Type : " + this.Qg.pa();
        }
        this.Qg.getMessageDelegator().F(fbf2);
        if (bfn2 instanceof bfl) {
            object = (bfl)bfn2;
            this.b((bfl)object);
        }
    }

    private void b(bfl bfl2) {
        if (bfl2.aYF == null) {
            lfn.b(5, "SFEventManagerResource", "checkEffectEvent() CauseObjectGUID is null.");
            return;
        }
        if (!(this.Qg instanceof coz || this.Qg instanceof cpg || this.Qg instanceof cov || this.Qg instanceof cpc)) {
            return;
        }
        assert (this.Qg instanceof cph);
        cph cph2 = (cph)this.Qg;
        if (cph2.aXq() == null) {
            lfn.b(5, "SFEventManagerResource", "checkEffectEvent() FaunaObjectServerLockedGUID is null.");
            return;
        }
        ldv ldv2 = lcr.tQ((ldv)bfl2.aYF);
        ldv ldv3 = lcr.tQ((ldv)cph2.aXq());
        if (!lcw.enb() && ldv3.equals(ldv2)) {
            lfn.b(5, "SFEventManagerResource", "checkEffectEvent() OwnerGUID equals CauseObjectGUID.");
            return;
        }
        switch (bfl2.Type) {
            case 2: 
            case 5: 
            case 6: {
                if (bfl2.Type == 2) {
                    return;
                }
                dzl dzl2 = (dzl)this.Qg.getMessageDelegator().h(23304, this.Qg.getGUID(), lcr.qCs);
                dzl2.ijx = ldv3;
                dzl2.ijy = ldv2;
                this.Qg.getMessageDelegator().F(dzl2);
                break;
            }
            case 4: {
                lfn.b(5, "SFEventManagerResource", "checkEffectEvent() Ignoring event type : '" + bfl2.getName() + "' for alignment hit");
                break;
            }
            default: {
                lfn.b(5, "SFEventManagerResource", "checkEffectEvent() Unknown eventtype provided: '" + bfl2.getName() + "'");
                return;
            }
        }
    }
}

