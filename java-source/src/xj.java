/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class xj {
    private wy bbg = null;
    private xl bbh = null;
    private xm bbi = xm.bbl;
    private int ID = -1;
    private boolean bbj = false;

    public wy wF() {
        return this.bbg;
    }

    public xm wG() {
        return this.bbi;
    }

    public int getID() {
        return this.ID;
    }

    public boolean wH() {
        return this.bbj;
    }

    protected xl wI() {
        return this.bbh;
    }

    protected xj(wy wy2, xl xl2, xm xm2, int n) {
        this.bbg = wy2;
        this.bbh = xl2;
        this.bbi = xm2;
        this.ID = n;
        this.bbg.a(this);
    }

    public String wJ() {
        return 'A' + Integer.toString(this.ID) + (this.bbh.isActive() ? (char)'A' : 'C') + ',' + Boolean.toString(this.bbj);
    }

    public boolean cq(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        if (xc.cm(string) != 'A') {
            return false;
        }
        if (xc.cn(string) != this.ID) {
            return false;
        }
        String[] stringArray = string.split(",");
        this.bbj = Boolean.parseBoolean(stringArray[1]);
        if (xc.co(string) == 'A' && this.wK()) {
            this.bbj = false;
        }
        return true;
    }

    public boolean wK() {
        return false;
    }

    public boolean wL() {
        return true;
    }

    public void perform() {
        if (this.bbj) {
            return;
        }
        if (this.bbh == null) {
            lfn.b(5, this.getClass().getSimpleName(), "perform() : Listener is Null!!!... Quest = " + this.bbg + ", Action = " + this);
            assert (false);
            this.bbj = false;
        } else {
            this.bbj = true;
            this.bbh.c(this);
            if (this.wP()) {
                ldv ldv2 = this.bbg.wf();
                if (ldv2 == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "perform() : Opposing Quest Manager GUID is Null!!!... Quest = " + this.bbg + ", Action = " + this);
                    return;
                }
                gdq gdq2 = this.bbg.ct(ldv2);
                gdq2.IS(this.bbg.getID());
                gdq2.IW(this.ID);
                gdq2.lK(this.bbj);
                this.bbg.a((gdt)gdq2);
            }
        }
    }

    public void wM() {
        if (!this.bbj) {
            return;
        }
        if (!this.wK() || !this.wN()) {
            return;
        }
        this.wO();
        this.perform();
    }

    protected boolean wN() {
        return false;
    }

    public void wO() {
    }

    protected boolean wP() {
        return true;
    }

    public void a(gdq gdq2) {
        if (this.bbj == gdq2.bTS()) {
            return;
        }
        if (this.bbh == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleQuestsActionMessage() : Listener is Null!!!... Quest = " + this.bbg + ", Action = " + this);
            assert (false);
        } else {
            this.bbj = gdq2.bTS();
            this.bbh.c(this);
        }
    }

    public abstract xj a(wy var1, xl var2);

    public abstract boolean i(Element var1);
}

