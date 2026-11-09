/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class yy {
    private wy bbg = null;
    private zb bbV = null;
    private zc bbW = zc.bca;
    private int ID = -1;
    private int bbX = -1;
    private boolean bbY = false;
    private boolean Active = false;

    public wy wF() {
        return this.bbg;
    }

    public zc xj() {
        return this.bbW;
    }

    public int getID() {
        return this.ID;
    }

    public int xk() {
        return this.bbX;
    }

    public boolean xl() {
        return this.bbY;
    }

    public boolean isActive() {
        return this.Active;
    }

    public boolean xm() {
        return false;
    }

    public double v(ldz ldz2) {
        return 0.0;
    }

    protected yy(wy wy2, zb zb2, zc zc2, int n, int n2) {
        this.bbg = wy2;
        this.bbV = zb2;
        this.bbW = zc2;
        this.ID = n;
        this.bbX = n2;
        this.bbg.a(this);
    }

    public String wJ() {
        return 'C' + Integer.toString(this.ID) + (this.Active ? (char)'A' : 'C') + ',' + Boolean.toString(this.bbY);
    }

    public boolean cq(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        if (xc.cm(string) != 'C') {
            return false;
        }
        if (xc.cn(string) != this.ID) {
            return false;
        }
        String[] stringArray = string.split(",");
        this.bbY = Boolean.parseBoolean(stringArray[1]);
        if (xc.co(string) == 'A') {
            this.at(this.bbY);
        }
        return true;
    }

    public void at(boolean bl) {
        if (this.Active) {
            return;
        }
        this.bbY = bl;
        this.Active = true;
    }

    public void au(boolean bl) {
        if (!this.Active) {
            return;
        }
        this.deactivate();
        this.at(bl);
    }

    protected boolean xn() {
        if (!this.Active) {
            lfn.b(5, this.getClass().getSimpleName(), "checkActivated() : Condition Not Active!!!... Quest = " + this.bbg + ", Condition = " + this);
        }
        return this.Active;
    }

    public void deactivate() {
        if (!this.Active) {
            return;
        }
        this.Active = false;
    }

    public boolean xo() {
        return true;
    }

    public boolean xp() {
        return true;
    }

    public boolean xq() {
        return true;
    }

    public boolean xr() {
        if (!this.Active) {
            lfn.b(5, this.getClass().getSimpleName(), "checkCondition() : Condition Not Active!!!... Quest = " + this.bbg + ", Condition = " + this);
            assert (false);
            this.bbY = false;
        }
        return this.bbY;
    }

    protected void av(boolean bl) {
        if (this.bbY == bl) {
            return;
        }
        if (this.bbV == null) {
            lfn.b(5, this.getClass().getSimpleName(), "setTrue() : Listener is Null!!!... Quest = " + this.bbg + ", Condition = " + this);
            assert (false);
            this.bbY = false;
        } else {
            this.bbY = bl;
            this.bbV.c(this);
            if (this.wP()) {
                ldv ldv2 = this.bbg.wf();
                if (ldv2 == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "setComplete() : Opposing Quest Manager GUID is Null!!!... Quest = " + this.bbg + ", Task = " + this);
                    return;
                }
                gds gds2 = this.bbg.cr(ldv2);
                gds2.IS(this.bbg.getID());
                gds2.IX(this.ID);
                gds2.lL(this.bbY);
                this.b(gds2);
                this.bbg.a((gdt)gds2);
            }
        }
    }

    protected void xs() {
    }

    protected boolean wP() {
        return true;
    }

    public void a(gds gds2) {
        if (this.bbY == gds2.bTZ()) {
            return;
        }
        if (this.bbV == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleQuestsConditionMessage() : Listener is Null!!!... Quest = " + this.bbg + ", Condition = " + this);
            assert (false);
        } else {
            this.bbY = gds2.bTZ();
            this.c(gds2);
            this.xs();
            this.bbV.c(this);
        }
    }

    protected void b(gds gds2) {
    }

    protected void c(gds gds2) {
    }

    public abstract yy a(wy var1, zb var2);

    public abstract boolean i(Element var1);
}

