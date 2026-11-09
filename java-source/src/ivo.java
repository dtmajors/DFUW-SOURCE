/*
 * Decompiled with CFR.
 */
public class ivo
extends ipx {
    private ipx lWo;
    private ism mAM;
    private ipx lWp;

    ivo() {
        this.a(iqo.dmS());
        this.lWo = ipx.c(new ipf[0]);
        this.W(this.lWo);
        this.mAM = new ism(this){
            final /* synthetic */ ivo mAN;
            {
                this.mAN = ivo2;
            }

            public boolean du(int n, int n2) {
                this.mAN.cLq();
                return true;
            }
        };
        this.W(ipx.d(this.mAM));
        this.lWp = ipx.a(8, 1, new ipf[0]);
        this.W(this.lWp);
    }

    public ism dsw() {
        return this.mAM;
    }

    public void cLq() {
    }
}

