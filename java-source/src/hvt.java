/*
 * Decompiled with CFR.
 */
public class hvt
extends hvn {
    public hvt(ipf ipf2, ipf ipf3, double d2) {
        if (ipf2 != null) {
            this.a(new hvm(this, ipf2.getAlpha(), 0.0f, d2, ipf2){
                final /* synthetic */ ipf lgm;
                final /* synthetic */ hvt lgn;
                {
                    this.lgn = hvt2;
                    this.lgm = ipf2;
                    super(f2, f3, d2);
                }

                public void hz(float f2) {
                    this.lgm.hz(f2);
                }

                public void czS() {
                    this.lgm.setVisible(false);
                    this.lgm.hz(1.0f);
                }
            });
            ipf2.setVisible(true);
        }
        if (ipf3 != null) {
            this.a(new hvm(this, ipf3.getAlpha(), 1.0f, d2, ipf3){
                final /* synthetic */ ipf lgo;
                final /* synthetic */ hvt lgn;
                {
                    this.lgn = hvt2;
                    this.lgo = ipf2;
                    super(f2, f3, d2);
                }

                public void hz(float f2) {
                    this.lgo.hz(f2);
                }
            });
            ipf3.setVisible(true);
        }
    }
}

