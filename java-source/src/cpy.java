/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcr
 */
public abstract class cpy
extends cbx {
    protected int bno = 1;

    public cpy(boolean bl) {
        super(bl);
        this.ObjectType = 134;
    }

    public final int vM() {
        return this.bno;
    }

    public final boolean aIs() {
        return this.bno == 1;
    }

    public boolean Uz() {
        return true;
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bED()) {
            case 13312: {
                switch (dxq2.bEz()) {
                    case 13332: {
                        this.a((dya)dxq2);
                        break;
                    }
                    default: {
                        this.b((dyk)dxq2);
                    }
                }
                return;
            }
        }
        switch (dxq2.bEz()) {
            default: 
        }
        super.receiveMessage(dxq2);
    }

    protected final void sC(int n) {
        if (this.bno == n) {
            return;
        }
        this.bno = n;
        if (this.bno == 3) {
            this.nG(1442110);
        }
        if (!this.dwG) {
            return;
        }
        gza gza2 = (gza)this.MessageDelegator.h(12056, this.GUID, lcr.qAI);
        gza2.ija = 1;
        gza2.bno = this.bno;
        this.MessageDelegator.F(gza2);
    }

    protected abstract void a(dya var1);

    protected abstract void b(dyk var1);

    protected final void nG(int n) {
        if (n <= 0) {
            lfn.b(5, "SFWildlifeObject", "sendAnimationStartMessage() AnimationState is invalid.");
            return;
        }
        if (this.aAG() == null) {
            lfn.b(5, "SFWildlifeObject", "sendAnimationStartMessage() MeshObject is null.");
            return;
        }
        dzv dzv2 = (dzv)this.MessageDelegator.h(7425, this.GUID, this.aAG().getGUID());
        dzv2.dTs = n;
        this.MessageDelegator.H(dzv2);
    }

    protected final void aDk() {
        if (this.aAG() == null) {
            lfn.b(5, "SFWildlifeObject", "sendAnimationStopMessage() MeshObject is null.");
            return;
        }
        dzw dzw2 = (dzw)this.MessageDelegator.h(7426, this.GUID, this.aAG().getGUID());
        this.MessageDelegator.H(dzw2);
    }
}

