/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public abstract class dqn
extends btk {
    protected boolean dwG = true;
    protected ldv dJs = null;
    protected boolean gOY = true;
    protected ldv dUK = null;
    protected float gOZ = 0.0f;
    protected int gPa = 10;
    protected int dUL = 0;
    protected int gPb = 0;

    public String getMeshXML() {
        return this.ObjectDescriptionFilename;
    }

    public boolean isServerObject() {
        return this.dwG;
    }

    public void setServerObject(boolean bl) {
        this.dwG = bl;
    }

    public final ldv axa() {
        return this.dJs;
    }

    public final void ju(ldv ldv2) {
        assert (ldv2 != null) : "New EngineGUID is null for " + this.getClass().getName();
        if (this.dJs == null || this.dJs.equals(ldv2)) {
            this.dJs = ldv2;
        } else {
            lfn.b(5, "SFWorldObject", "setEngineGUID() EngineGUID is already set. Current=" + this.dJs + " New=" + ldv2);
            this.dJs = ldv2;
        }
    }

    public boolean bui() {
        return this.gOY;
    }

    public void iO(boolean bl) {
        this.gOY = bl;
    }

    public ldv bkC() {
        return this.dUK;
    }

    public void mz(ldv ldv2) {
        this.dUK = ldv2;
    }

    public float buj() {
        return this.gOZ;
    }

    public void ho(float f2) {
        this.gOZ = f2;
    }

    public int buk() {
        return this.gPa;
    }

    public void Br(int n) {
        this.gPa = n;
    }

    public int bul() {
        return this.dUL;
    }

    public void Bs(int n) {
        this.dUL = n;
    }

    public final dqn bum() {
        dqn dqn2;
        block2: {
            dqn2 = null;
            try {
                Class<?> clazz = this.getClass();
                dqn2 = (dqn)clazz.newInstance();
                this.b(dqn2);
            }
            catch (Exception exception) {
                lfn.b(5, "SFWorldObject", "createCopy() Unable to create copy of worldobject!");
                lfn.b(5, "SFWorldObject", "createCopy() Exception: " + exception + ", \n cause " + exception.getLocalizedMessage());
                if ($assertionsDisabled) break block2;
                throw new AssertionError();
            }
        }
        return dqn2;
    }

    protected void b(dqn dqn2) {
        super.copyValues(dqn2);
        dqn2.setServerObject(this.dwG);
        dqn2.iO(this.gOY);
        dqn2.ho(this.gOZ);
        dqn2.Br(this.gPa);
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            assert (this.GUID != null);
            if (this.dwG) {
                if (lcw.emZ()) {
                    this.ju(this.GUID);
                } else if (lcw.ena()) {
                    this.ju(this.GUID);
                } else if (lcw.eng()) {
                    this.ju(this.GUID);
                }
            } else if (lcw.qFQ) {
                this.ju(this.GUID);
            } else {
                this.ju(this.GUID);
            }
            this.Initialized = true;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 11033) {
            gsl gsl2 = (gsl)dxq2;
            uk[] ukArray = gsl2.joY;
            this.a(ukArray, true);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    public void a(uk[] ukArray, boolean bl) {
        lfn.b(3, "SFWorldObject", "handleSubscriptionEvent() Obj [" + this.ObjectDescriptionFilename + "], GUID " + this.GUID + ". Method not Overridden by class." + this.getClass().getName());
    }

    @Override
    public String toString() {
        return super.toString() + "[WO: ServerObject = " + this.dwG + "] ";
    }
}

