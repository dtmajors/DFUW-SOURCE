/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 */
public class dss
extends dqk {
    ldv gYH;

    public void cleanUp() {
        super.cleanUp();
        if (this.gYH == null) {
            assert (false);
            return;
        }
        fui fui2 = (fui)this.MessageDelegator.h(1035, this.GUID, this.gYH);
        fui2.HZ(4);
        this.MessageDelegator.F(fui2);
    }

    public void c(ljq ljq2) {
        super.c(ljq2);
        if (this.gYH == null) {
            assert (false);
            return;
        }
        if (this.MessageDelegator != null) {
            fui fui2 = (fui)this.MessageDelegator.h(1035, this.GUID, this.gYH);
            fui2.HZ(1);
            fui2.c(this.Position);
            this.MessageDelegator.F(fui2);
        }
    }

    public void a(lgl lgl2) {
        super.a(lgl2);
        if (this.gYH == null) {
            assert (false);
            return;
        }
        if (this.MessageDelegator != null) {
            fui fui2 = (fui)this.MessageDelegator.h(1035, this.GUID, this.gYH);
            fui2.HZ(2);
            fui2.a(this.Rotation);
            this.MessageDelegator.F(fui2);
        }
    }

    public ldv byN() {
        return this.gYH;
    }

    public void nQ(ldv ldv2) {
        this.gYH = ldv2;
    }
}

