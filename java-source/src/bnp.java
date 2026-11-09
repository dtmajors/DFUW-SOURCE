/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public abstract class bnp
extends btk {
    public static final int dwC = 0;
    public static final int dwD = 1;
    public static final int dwE = 2;
    public static final int dwF = 3;
    protected final boolean dwG;
    protected int dwH = 0;
    protected int dwI = 0;
    protected bnx dwJ;

    public bnp(boolean bl2) {
        this.dwG = bl2;
    }

    public final int arV() {
        return this.dwH;
    }

    public final int arW() {
        return this.dwI;
    }

    public final void b(bnx bnx2) {
        this.dwJ = bnx2;
    }

    public final String arX() {
        return bnz.lm(this.dwI);
    }

    public void a(bpm bpm2) {
    }

    public void b(bpm bpm2) {
    }

    @Override
    public void initialize() {
        assert (this.GUID != null);
        super.initialize();
        this.dwH = 1;
    }

    public boolean arY() {
        return true;
    }

    public final void arZ() {
        this.dwH = 2;
    }

    @Override
    public String toString() {
        return "SFInteractionLogic: Type='" + this.arX() + "' GUID=" + this.GUID;
    }

    protected final ldv Uj() {
        if (this.dwJ == null) {
            return null;
        }
        return this.dwJ.Uj();
    }

    protected final void a(loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    @Override
    protected void setDefaultState() {
        super.setDefaultState();
        this.dwH = 0;
    }
}

