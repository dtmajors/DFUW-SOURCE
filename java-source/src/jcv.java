/*
 * Decompiled with CFR.
 */
public class jcv
extends ipx {
    private jco mRV;
    private jcx mSl;
    private jcu mSm;
    private jde mSn;
    private jcw mSo;

    public jcv(jco jco2) {
        this.mRV = jco2;
        this.a(iqo.dmT());
        this.W(this.a(jco2));
        this.W(this.c(jco2));
        this.W(ipx.a(1, 4, new ipf[0]));
        this.W(ipx.c(this.d(jco2)));
        this.W(ipx.a(1, 4, new ipf[0]));
        this.W(ipx.d(new ipk(0x2F2F2F, 303, 1)));
        this.W(ipx.a(1, 5, new ipf[0]));
        this.W(this.e(jco2));
        this.W(ipx.a(1, 12, new ipf[0]));
        jcc.dwT().mQt.c((jlf<jch>)new jlr<jcv, jch>(this, this){
            final /* synthetic */ jcv mSp;
            {
                this.mSp = jcv2;
                super(jcv3);
            }

            public void b(jcv jcv2, jch jch2) {
                jcv.a(jcv2, jcv2, jch2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((jcv)object, (jch)object2);
            }
        });
        jcc.dwT().mQv.c((jlf<jci>)new jlr<jcv, jci>(this, this){
            final /* synthetic */ jcv mSp;
            {
                this.mSp = jcv2;
                super(jcv3);
            }

            public void b(jcv jcv2, jci jci2) {
                jcv.a(jcv2, jcv2, jci2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((jcv)object, (jci)object2);
            }
        });
        this.mRV.myP.c(new jlr<jcv, itj>(this, this){
            final /* synthetic */ jcv mSp;
            {
                this.mSp = jcv2;
                super(jcv3);
            }

            public void a(jcv jcv2, itj itj2) {
                jcv.a(jcv2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jcv)object, (itj)object2);
            }
        });
        this.dyh();
    }

    @Override
    public void kh(float f) {
        this.mSl.kh(f);
        this.mSn.kh(f);
    }

    public void d(jch jch2) {
        jci jci2 = jch2.dxk();
        if (jci2 != null) {
            this.mRV.a(jci2);
            return;
        }
        this.mRV.a(jcc.dwT().a(jch2.dxb()));
    }

    private ipf a(jco jco2) {
        ipx ipx2 = ipx.h(new ipf[0]);
        ipx2.W(this.dyg());
        ipx2.W(this.b(jco2));
        return ipx2;
    }

    private ipf dyg() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 64, new ipf[0]));
        ipx2.W(ipx.l(ipx.a(4, 1, new ipf[0]), new ipb("/dfdata/texture/gui/j2f/quests/category_icons/quest_navigation_list_line.png"), ipx.a(4, 1, new ipf[0])));
        ipx2.W(ipx.a(1, 3, new ipf[0]));
        return ipx2;
    }

    private ipf b(jco jco2) {
        this.mSl = new jcx(jco2);
        return this.mSl;
    }

    private ipf c(jco jco2) {
        this.mSm = new jcu(jco2);
        return this.mSm;
    }

    private ipf d(jco jco2) {
        this.mSn = new jde(jco2);
        return this.mSn;
    }

    private ipf e(jco jco2) {
        this.mSo = new jcw(this, jco2, jco2){
            final /* synthetic */ jco mSq;
            final /* synthetic */ jcv mSp;
            {
                this.mSp = jcv2;
                this.mSq = jco3;
                super(jco2);
            }

            public void az(ipf ipf2) {
                ioc ioc2 = ipf2.eo(0, 0);
                jda jda2 = new jda(this, this.djE(), new joa(ioc2.cf, ioc2.cg, ipf2.getWidth(), ipf2.getHeight()), this.mSq.dxT()){
                    final /* synthetic */ 4 mSr;
                    {
                        this.mSr = var1_1;
                        super(ioa2, joa2, jcb2);
                    }

                    public void b(jcb jcb2) {
                        this.mSr.mSq.dxT().a(jcb2);
                        jcv.a(this.mSr.mSp);
                    }
                };
                jda2.setGUID(this.djE().getMessageDelegator().bzv());
                this.djE().getMessageDelegator().a((amf)((Object)jda2));
            }
        };
        return this.mSo;
    }

    private void dyh() {
        jca jca2 = new jca();
        this.mSn.a(this.mRV.dxT(), jca2);
        this.mSo.a(jca2);
        this.mSo.c(this.mRV.dxT());
    }

    private void a(jcv jcv2, jch jch2) {
        this.dyh();
    }

    private void a(jcv jcv2, jci jci2) {
        this.dyh();
    }

    static /* synthetic */ void a(jcv jcv2, jcv jcv3, jch jch2) {
        jcv2.a(jcv3, jch2);
    }

    static /* synthetic */ void a(jcv jcv2, jcv jcv3, jci jci2) {
        jcv2.a(jcv3, jci2);
    }

    static /* synthetic */ void a(jcv jcv2) {
        jcv2.dyh();
    }
}

