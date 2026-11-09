/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class sz
extends qe {
    private int azE = 0;
    private String aRD = null;

    public sz(md md2) {
        super(md2, me.ayp);
    }

    private void a(ebo ebo2) {
        this.azE = ebo2.azE;
        this.aRD = ebo2.azF;
        if (this.azE <= 0 || this.aRD == null) {
            this.ca("Could not select BindStone");
        } else {
            this.ca(null);
        }
    }

    @Override
    protected void sO() {
        if (lcw.qFp) {
            ebn ebn2 = (ebn)this.MessageDelegator.h(17441, this.getGUID(), lcr.qCw);
            ebn2.ikZ = true;
            this.MessageDelegator.F(ebn2);
        } else {
            this.azE = 1;
            this.aRD = "DFLauncherBindstone";
            this.ca(null);
        }
    }

    @Override
    protected void sP() {
        this.azE = 0;
        this.aRD = null;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 17442: {
                this.a((ebo)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public final int ry() {
        return this.azE;
    }

    public final String uo() {
        return this.aRD;
    }
}

