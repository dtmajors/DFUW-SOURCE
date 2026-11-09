/*
 * Decompiled with CFR.
 */
public abstract class qe
extends btk {
    protected static final String aMq = "                                                                                                                                ";
    public final me aMr;
    private boolean aMs;
    private boolean aMt;
    private boolean aMu;
    private String aMv;
    private long aMw;
    private long aMx;
    public final md aMy;

    protected qe(md md2, me me2) {
        this.aMr = me2;
        this.aMy = md2;
    }

    public void b(int n, String string, int n2, boolean bl) {
        String string2 = aMq.substring(0, 2 * n2);
        lfn.b(n, string, string2 + this.toString());
    }

    private long sM() {
        if (this.aMx > this.aMw) {
            return this.aMx - this.aMw;
        }
        if (this.aMw > 0L) {
            return System.currentTimeMillis() - this.aMw;
        }
        return 0L;
    }

    public String sN() {
        return qe.q(this.sM());
    }

    public static String q(long l) {
        String string = l / 1000L + ".";
        l = l % 1000L + 1000L;
        string = string + ("" + l).substring(1);
        return string;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aMy.a(this);
    }

    @Override
    public void cleanUp() {
        this.sP();
        this.aMy.b(this);
        super.cleanUp();
    }

    @Override
    public void reset() {
        this.sP();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.aMr);
        stringBuilder.append(" Flags=");
        stringBuilder.append(this.aMs ? "W" : "w");
        stringBuilder.append(this.aMt ? "S" : "s");
        stringBuilder.append(this.aMu ? "C" : "c");
        stringBuilder.append(this.sS() ? "F" : "f");
        if (this.sR()) {
            stringBuilder.append(" Duration=").append(qe.q(System.currentTimeMillis() - this.aMw)).append("s");
        } else if (this.aMx > 0L) {
            stringBuilder.append(" Duration=").append(qe.q(this.aMx - this.aMw)).append("s");
        }
        if (this.sS()) {
            stringBuilder.append(" Error='").append(this.aMv).append("'");
        }
        return stringBuilder.toString();
    }

    public final void start() {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorker(" + this.getClass().getSimpleName() + ")", "start: Already working");
            assert (false);
            return;
        }
        this.sP();
        this.aMs = true;
        this.aMu = false;
        this.aMv = null;
        this.aMt = true;
        this.aMw = System.currentTimeMillis();
        this.aMx = 0L;
        this.aMy.d(this);
        this.sO();
        this.aMt = false;
    }

    protected abstract void sO();

    protected abstract void sP();

    protected final void sQ() {
    }

    public final boolean sR() {
        return this.aMs;
    }

    public final boolean isCompleted() {
        return this.aMu;
    }

    public final boolean sS() {
        return this.aMv != null;
    }

    public final String getErrorMessage() {
        return this.aMv;
    }

    public final void ca(String string) {
        if (!this.sR()) {
            lfn.b(5, "SFPersistenceWorker(" + this.getClass().getSimpleName() + ")", "workCompleted: Not working");
            assert (false);
            return;
        }
        if (this.aMt) {
            this.aMy.a(this, string);
            return;
        }
        this.aMs = false;
        this.aMu = true;
        this.aMv = string;
        this.aMx = System.currentTimeMillis();
        this.sQ();
        if (this.aMv != null) {
            lfn.b(5, "SFPersistenceWorker(" + this.getClass().getSimpleName() + ")", "workCompleted Error: " + this.aMv + " - " + this.toString());
        }
        this.aMy.c(this);
    }
}

