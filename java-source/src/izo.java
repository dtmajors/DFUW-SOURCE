/*
 * Decompiled with CFR.
 */
public class izo
extends ipx {
    private double mDo;
    private ist mDp;
    private lie mDq;

    public izo(double d2) {
        this.mDo = d2;
        this.a(iqo.dmS());
        this.mDp = new ist(isf.mwN, 12, 0xABABAB, "");
        this.W(ipx.d(this.mDp));
        this.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/common/timer/timer.png")));
    }

    @Override
    public void a(ioa ioa2) {
        super.a(ioa2);
        this.mDq = new lie(this, 1.0, true){
            final /* synthetic */ izo mDr;
            {
                this.mDr = izo2;
                super(d2, bl);
            }

            public void dh(double d2) {
                izo.a(this.mDr);
            }
        };
        this.mDq.e(ioa2.getMessageDelegator());
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.mDq != null) {
            this.mDq.stop();
        }
    }

    private void dtZ() {
        String string = "00:00:00";
        double d2 = this.djE().getMessageDelegator().arc().rgz;
        if (d2 < this.mDo) {
            double d3 = this.mDo - d2;
            long l = (long)d3 / 3600L;
            long l2 = (long)(d3 - (double)l * 3600.0) / 60L;
            long l3 = (long)d3 % 3600L;
            string = String.format("%02d:%02d:%02d", l, l2, l3);
        } else {
            this.mDq.stop();
            this.mDq = null;
        }
        this.mDp.setText(string);
    }

    static /* synthetic */ void a(izo izo2) {
        izo2.dtZ();
    }
}

