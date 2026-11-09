/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class sl
extends sm {
    private int aMI = -1;
    private boolean aRf;
    private boolean acV;
    private boolean acW;
    private int acX;
    private float acY;
    private long awr;
    private long aws;

    public sl(md md2) {
        super(md2, me.axi);
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            this.ca("SQL Error " + lmn2.getErrorCode());
            return;
        }
        if (lmn2.euT().length != 1) {
            this.ca(null);
            return;
        }
        lmi[] lmiArray = lmn2.euT()[0].euV();
        if (lmiArray == null || lmiArray.length != 6) {
            this.ca("Fields " + lmiArray);
            return;
        }
        this.aRf = true;
        for (int i = 0; i < lmn2.euS().length; ++i) {
            int n;
            String string = lmn2.euS()[i].getName();
            if (string.equals("Registered")) {
                n = Integer.valueOf(lmiArray[i].toString());
                this.acV = n == 1;
                continue;
            }
            if (string.equals("BlackListed")) {
                n = Integer.valueOf(lmiArray[i].toString());
                this.acW = n == 1;
                continue;
            }
            if (string.equals("NumberOfRates")) {
                this.acX = ((lml)lmiArray[i]).getValue();
                continue;
            }
            if (string.equals("TotalRating")) {
                this.acY = ((lmk)lmiArray[i]).getValue();
            }
            if (string.equals("RegisteredTime")) {
                this.awr = lmn2.euT()[0].euV()[i].euR() ? 0L : ((lmm)lmiArray[i]).getValue() * 1000L;
            }
            if (!string.equals("BlackListedTime")) continue;
            this.aws = lmn2.euT()[0].euV()[i].euR() ? 0L : ((lmm)lmiArray[i]).getValue() * 1000L;
        }
        this.ca(null);
    }

    @Override
    protected void sO() {
        this.a(pw.aJH, "SELECT Registered,BlackListed,NumberOfRates,TotalRating,UNIX_TIMESTAMP(RegisteredTime) as RegisteredTime,UNIX_TIMESTAMP(BlackListedTime) as BlackListedTime  FROM pso_mentoring WHERE GameID=" + lcw.qGe + " AND WorldID=" + lcw.qGf + " AND CharacterID=" + this.aMI, null);
    }

    @Override
    protected void sP() {
        this.aRf = false;
        this.acV = false;
        this.acW = false;
        this.acY = 0.0f;
        this.acX = 0;
        this.aws = 0L;
        this.awr = 0L;
    }

    public void cX(int n) {
        this.aMI = n;
    }

    public final boolean tX() {
        return this.aRf;
    }

    public final void al(boolean bl) {
        this.aRf = bl;
    }

    public final boolean isRegistered() {
        return this.acV;
    }

    public final void ab(boolean bl) {
        this.acV = bl;
    }

    public final boolean pT() {
        return this.acW;
    }

    public final void am(boolean bl) {
        this.acW = bl;
    }

    public final int pU() {
        return this.acX;
    }

    public final void cY(int n) {
        this.acX = n;
    }

    public final float tY() {
        return this.acY;
    }

    public final void L(float f2) {
        this.acY = f2;
    }

    public final long pW() {
        return this.awr;
    }

    public final void s(long l) {
        this.awr = l;
    }

    public final long pX() {
        return this.aws;
    }

    public final void t(long l) {
        this.aws = l;
    }
}

