/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
import java.util.concurrent.TimeUnit;

public class akx
extends aja {
    private float bqQ = 0.0f;

    public akx() {
        this.bog = ajb.b.bpo;
    }

    @Override
    protected boolean BU() {
        boolean bl;
        if (!this.boj.bfF()) {
            return true;
        }
        if (this.boj.jk().bgR() == null) {
            lfn.b(5, "SFTimeConstraint", "checkConstraint() Skill owner is NULL!!");
            return false;
        }
        if (this.boj.jk().bgR().mA() == null) {
            lfn.b(5, "SFTimeConstraint", "checkConstraint() PSO is NULL!!");
            return false;
        }
        long l2 = this.boj.getMessageDelegator().bzy().getTimeInMillis();
        double d2 = this.boj.jk().bgR().mA().kx();
        long l3 = (long)((double)(this.bqQ * 1000.0f) - ((double)l2 - d2));
        long l4 = TimeUnit.MILLISECONDS.toHours(l3);
        long l5 = TimeUnit.MILLISECONDS.toMinutes(l3);
        long l6 = l5 - TimeUnit.HOURS.toMinutes(l4);
        boolean bl2 = bl = (double)l2 >= d2 + (double)(this.bqQ * 1000.0f);
        if (!bl) {
            StringBuffer stringBuffer = new StringBuffer();
            if (l4 > 0L) {
                stringBuffer.append(l4 + "h");
            }
            if (l6 > 0L) {
                if (l4 > 0L) {
                    stringBuffer.append(", " + l6 + "m");
                } else {
                    stringBuffer.append(l6 + "m");
                }
            } else if (l4 > 0L) {
                stringBuffer.append(", " + l6 + "m");
            } else {
                stringBuffer.append("less than 1 m");
            }
            this.bok = mcs.uBS.bD(stringBuffer.toString());
            return false;
        }
        return true;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        akx akx2 = (akx)aja2;
        akx2.an(this.bqQ);
    }

    public final void an(float f2) {
        this.bqQ = f2;
    }
}

