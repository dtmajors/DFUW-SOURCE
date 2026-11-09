/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class acp {
    private wy bbg = null;
    private String aZO = null;
    private acr bdZ = null;
    private acs bea = acs.bee;
    private int ID = -1;
    private int bbX = -1;
    private boolean aDg = false;
    private boolean Active = false;
    private boolean bdg = false;
    private lot beb = null;
    private jcn bec = null;

    public String ym() {
        return this.aZO;
    }

    public wy wF() {
        return this.bbg;
    }

    public acs yT() {
        return this.bea;
    }

    public int getID() {
        return this.ID;
    }

    public int xk() {
        return this.bbX;
    }

    public boolean isComplete() {
        return this.aDg;
    }

    public boolean isActive() {
        return this.Active;
    }

    public boolean yU() {
        return false;
    }

    public boolean yV() {
        return false;
    }

    public int xT() {
        return -1;
    }

    public boolean yo() {
        return this.bdg;
    }

    public void az(boolean bl) {
        this.bdg = bl;
    }

    public loz yp() {
        if (!this.yo()) {
            return null;
        }
        return lvm.sXq.bD(this.yW());
    }

    private lot yW() {
        if (this.beb == null) {
            this.beb = new lot(this.bbg.getID(), this.ID);
        }
        return this.beb;
    }

    protected acp(wy wy2, acr acr2, acs acs2, int n, int n2) {
        this.bbg = wy2;
        this.bdZ = acr2;
        this.bea = acs2;
        this.ID = n;
        this.bbX = n2;
        this.bbg.a(this);
    }

    protected acp(wy wy2, acr acr2, acs acs2, int n, int n2, String string) {
        this(wy2, acr2, acs2, n, n2);
    }

    public String wJ() {
        String string = 'T' + Integer.toString(this.ID) + (this.Active ? (char)'A' : 'C') + ',' + Boolean.toString(this.aDg);
        String string2 = this.yX();
        return string2 == null || string2.isEmpty() ? string : string + ',' + string2;
    }

    protected String yX() {
        return null;
    }

    public boolean cq(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        if (xc.cm(string) != 'T') {
            return false;
        }
        if (xc.cn(string) != this.ID) {
            return false;
        }
        String[] stringArray = string.split(",");
        this.aDg = Boolean.parseBoolean(stringArray[1]);
        if (!this.a(stringArray, 2)) {
            return false;
        }
        if (xc.co(string) == 'A') {
            this.activate();
        }
        return true;
    }

    protected boolean a(String[] stringArray, int n) {
        return true;
    }

    public void activate() {
        if (this.Active) {
            return;
        }
        this.Active = true;
    }

    public void wl() {
        if (!this.Active) {
            return;
        }
        this.deactivate();
        this.activate();
    }

    protected boolean xn() {
        if (!this.Active) {
            lfn.b(5, this.getClass().getSimpleName(), "checkActivated() : Task Not Active!!!... Quest = " + this.bbg + ", Task = " + this);
        }
        return this.Active;
    }

    public void deactivate() {
        if (!this.Active) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Task Not Active!!!... Quest = " + this.bbg + ", Task = " + this);
            assert (false);
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

    public boolean yY() {
        return true;
    }

    public boolean yZ() {
        if (!this.Active) {
            lfn.b(5, this.getClass().getSimpleName(), "checkCompletion() : Task Not Active!!!... Quest = " + this.bbg + ", Task = " + this);
            assert (false);
        }
        return this.aDg;
    }

    public void za() {
        this.aC(true);
    }

    protected void aC(boolean bl) {
        if (this.aDg == bl) {
            return;
        }
        if (this.bdZ == null) {
            lfn.b(5, this.getClass().getSimpleName(), "setComplete() : Listener is Null!!!... Quest = " + this.bbg + ", Task = " + this);
            assert (false);
            this.aDg = false;
        } else {
            this.aDg = bl;
            this.bdZ.c(this);
            this.aD(false);
            if (this.bec != null) {
                this.bec.aC(this.aDg);
            }
        }
    }

    protected void xs() {
    }

    protected void zb() {
    }

    public void yg() {
        if (!(this.wF().wg() instanceof xe)) {
            return;
        }
        if (this.yY()) {
            this.za();
        } else {
            this.aD(true);
        }
    }

    public jcn zc() {
        if (this.bec == null && this.yo()) {
            this.bec = this.zd();
        }
        return this.bec;
    }

    protected jcn zd() {
        return new jcn(this.ID, this.yp());
    }

    protected boolean wP() {
        return true;
    }

    protected void aD(boolean bl) {
        if (this.wP()) {
            ldv ldv2 = this.bbg.wf();
            if (ldv2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "setComplete() : Opposing Quest Manager GUID is Null!!!... Quest = " + this.bbg + ", Task = " + this);
                return;
            }
            gec gec2 = this.bbg.cs(ldv2);
            gec2.IS(this.bbg.getID());
            gec2.Jb(this.ID);
            gec2.aC(this.aDg);
            gec2.lP(bl);
            this.b(gec2);
            this.bbg.a((gdt)gec2);
        }
    }

    public void a(gec gec2) {
        this.c(gec2);
        if (gec2.bUj()) {
            this.yg();
            return;
        }
        if (this.aDg != gec2.bUg()) {
            if (this.bdZ == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handleQuestsTaskMessage() : Listener is Null!!!... Quest = " + this.bbg + ", Task = " + this);
                assert (false);
            } else {
                this.aDg = gec2.bUg();
                if (this.bec != null) {
                    this.bec.aC(this.aDg);
                }
                this.xs();
                this.bdZ.c(this);
            }
        }
    }

    protected void b(gec gec2) {
    }

    protected void c(gec gec2) {
    }

    public abstract acp b(wy var1, acr var2);

    public abstract boolean i(Element var1);
}

