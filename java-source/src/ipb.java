/*
 * Decompiled with CFR.
 */
public class ipb
extends ipc {
    private ipe mqf;
    private boolean mqg;

    public ipb() {
        this(null);
    }

    public ipb(String string) {
        this.qP(string);
    }

    public ipb(String string, int n, int n2) {
        this.qP(string);
        this.a(new iqu(this, n, n2){
            final /* synthetic */ ipb mqh;
            {
                this.mqh = ipb2;
                super(n, n2);
            }

            public void e(ipf ipf2) {
                if (this.mqh.djt() == null || this.mqh.djt().isEmpty()) {
                    this.setSize(0, 0);
                } else {
                    super.e(ipf2);
                }
            }
        });
    }

    public static ipb qO(String string) {
        return string != null && !string.isEmpty() ? new ipb(string) : null;
    }

    public ipe djq() {
        return this.mqf != null ? this.mqf.djB() : null;
    }

    public void a(ipe ipe2) {
        this.mqf = ipe2 != null ? ipe2.djB() : null;
        this.mqg = true;
        this.dkg();
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        this.djs();
    }

    @Override
    public void djr() {
        this.djE().b("Bitmap_setBitmapData", new Object[]{this.getId(), this.qL(this.djt()), this.getWidth(), this.getHeight()});
    }

    @Override
    public void dA(int n, int n2) {
        this.djE().b("Bitmap_create", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.qL(this.djt())});
        if (this.mqf != null) {
            this.mqg = true;
            this.djs();
        }
    }

    @Override
    public void djm() {
        super.djm();
        this.mqg = false;
    }

    private void djs() {
        if (this.mqg) {
            this.mqg = false;
            if (this.mqf != null) {
                this.djE().b("Bitmap_setColorTransform", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.qL(this.djt()), Float.valueOf(this.mqf.mqH), Float.valueOf(this.mqf.mqI), Float.valueOf(this.mqf.mqJ), Float.valueOf(this.mqf.mqK), Float.valueOf(this.mqf.mqL), Float.valueOf(this.mqf.mqM), Float.valueOf(this.mqf.mqN), Float.valueOf(this.mqf.mqO)});
            } else {
                this.djE().b("Bitmap_resetColorTransform", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.qL(this.djt())});
            }
        }
    }
}

