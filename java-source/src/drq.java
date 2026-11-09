/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 */
public abstract class drq
extends dqk {
    protected ldv gUf;
    protected ldv gUg;

    public drq() {
        this.ObjectType = 64;
    }

    public abstract void jT(ldv var1);

    public ldv bwc() {
        return this.gUf;
    }

    public void nH(ldv ldv2) {
        if (this.gUf != null && ldv2 != null && this.gUg.equals(ldv2)) {
            if (mje.DBp) {
                knj knj2 = (knj)this.MessageDelegator.h(778);
                knj2.ehv = this.GUID;
                knj2.ehw = ldv2;
                knj2.biE = new ljq();
                knj2.biF = new lgl();
                knj2.doP = this.gUf;
                knj2.pPN = 1;
                knj2.ts(this.GUID);
                this.MessageDelegator.a(knj2);
            }
            this.gUf = null;
        } else {
            String string = "Cannot UnAttach. ActiveRelationGUID is null -> [" + this.gUf + ", or ObjectGUID is null -> " + ldv2 + ", or Trying to Unattach from wrong obj. AttachedTO " + this.gUg + ", Trying to Unattach from " + ldv2;
            lfn.b(5, "SFWorldMeshGizmoObject", "unattachFromObject() : " + string);
        }
        this.gUg = null;
    }

    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 1026: {
                kuv kuv2 = (kuv)ktv2;
                if (kuv2.getResult() != 0) {
                    lfn.b(5, ((Object)((Object)this)).getClass().getName(), "receiveResponse() ObjectPosInfoRequest failed! GUID=" + this.GUID + " Mesh=" + this.ObjectDescriptionFilename);
                    return;
                }
                if (!kuv2.axa().equals(this.gUg)) break;
                this.c(kuv2.av());
                this.a(kuv2.aw());
                this.m(this.Position, this.Rotation.eqT());
                this.jT(kuv2.axa());
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public void nI(ldv ldv2) {
        this.gUg = ldv2;
    }
}

