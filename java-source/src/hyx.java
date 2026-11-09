/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hyx
extends hzk
implements bto {
    protected List<lfs<String, Float>> bbR = lcn.emv();
    protected double lrb = 0.0;
    float lrc = 3.0f;

    public hyx() {
        super("LargeNotificationWindow", "largenotification.swf");
        this.a(hya.lmp, true);
        this.OQ(jnz.nGi | jnz.nGk | jnz.nGe | jnz.nGf);
        this.a(hyb.lmG);
    }

    public void cBa() {
        super.cBa();
        this.a("setNotificationAlpha", new Object[]{Float.valueOf(0.0f)});
        this.a(hya.lmt, false);
        this.a(hya.lmv, false);
        this.a(hya.lmw, false);
    }

    public void a(String string, Float f) {
        this.bbR.add(new lfs<String, Float>(string, f));
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.cEU()) {
            return;
        }
        if (this.lrb == 0.0 && this.bbR.size() > 0) {
            this.lrb = ldz2.rgz;
            lfs<String, Float> lfs2 = this.bbR.get(0);
            this.a("setNotificationText", new Object[]{lfs2.getFirst()});
            this.lrc = lfs2.eqz().floatValue();
        }
        float f = 0.5f;
        if (this.lrb != 0.0) {
            float f2 = (float)(ldz2.rgz - this.lrb);
            if (f2 < f) {
                this.a("setNotificationAlpha", new Object[]{Float.valueOf(f2 / f)});
            } else if (f2 > this.lrc - f) {
                this.a("setNotificationAlpha", new Object[]{Float.valueOf(1.0f - (f2 - (this.lrc - f)) / f)});
            }
            if (f2 > this.lrc) {
                this.bbR.remove(0);
                this.lrb = 0.0;
            }
        }
    }
}

