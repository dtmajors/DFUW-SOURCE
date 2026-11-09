/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class jde
extends izm {
    private jco mRV;
    private Map<jch, jdb> mSP = lcn.emw();
    private Map<jci, jdc> mSQ = lcn.emw();

    public jde(jco jco2) {
        this.dtS();
        this.Td(8);
        this.mRV = jco2;
        jco2.myP.c(new jlr<jde, itj>(this, this){
            final /* synthetic */ jde mSR;
            {
                this.mSR = jde2;
                super(jde3);
            }

            public void a(jde jde2, itj itj2) {
                jde.a(jde2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jde)object, (itj)object2);
            }
        });
        jcc.dwT().mQs.c((jlf<jch>)new jlr<jde, jch>(this, this){
            final /* synthetic */ jde mSR;
            {
                this.mSR = jde2;
                super(jde3);
            }

            public void c(jde jde2, jch jch2) {
                jde.a(jde2, jde2, jch2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((jde)object, (jch)object2);
            }
        });
        jcc.dwT().mQt.c((jlf<jch>)new jlr<jde, jch>(this, this){
            final /* synthetic */ jde mSR;
            {
                this.mSR = jde2;
                super(jde3);
            }

            public void c(jde jde2, jch jch2) {
                jde.b(jde2, jde2, jch2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((jde)object, (jch)object2);
            }
        });
        jcc.dwT().mQu.c((jlf<jch>)new jlr<jde, jch>(this, this){
            final /* synthetic */ jde mSR;
            {
                this.mSR = jde2;
                super(jde3);
            }

            public void c(jde jde2, jch jch2) {
                jde.b(jde2, jde2, jch2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((jde)object, (jch)object2);
            }
        });
        jcc.dwT().mQx.c((jlf<jci>)new jlr<jde, jci>(this, this){
            final /* synthetic */ jde mSR;
            {
                this.mSR = jde2;
                super(jde3);
            }

            public void c(jde jde2, jci jci2) {
                jde.a(jde2, jde2, jci2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((jde)object, (jci)object2);
            }
        });
        jcc.dwT().mQv.c((jlf<jci>)new jlr<jde, jci>(this, this){
            final /* synthetic */ jde mSR;
            {
                this.mSR = jde2;
                super(jde3);
            }

            public void c(jde jde2, jci jci2) {
                jde.b(jde2, jde2, jci2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((jde)object, (jci)object2);
            }
        });
        jcc.dwT().mQw.c((jlf<jci>)new jlr<jde, jci>(this, this){
            final /* synthetic */ jde mSR;
            {
                this.mSR = jde2;
                super(jde3);
            }

            public void c(jde jde2, jci jci2) {
                jde.b(jde2, jde2, jci2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((jde)object, (jci)object2);
            }
        });
    }

    public void a(jcb jcb2, jca jca2) {
        this.a(new iub(this, jcb2, jca2){
            final /* synthetic */ jcb mSS;
            final /* synthetic */ jca mST;
            final /* synthetic */ jde mSR;
            {
                this.mSR = jde2;
                this.mSS = jcb2;
                this.mST = jca2;
            }

            public boolean a(iua iua2) {
                boolean bl;
                jdd jdd2 = (jdd)iua2;
                boolean bl2 = bl = jdd2.dyp().dxd() != jbz.mQj;
                if (!this.mSS.mQp.isEmpty()) {
                    if (iua2 instanceof jdc) {
                        bl = this.mSS.mQp.contains((Object)((Object)jcz.mSA)) && bl;
                    } else if (iua2 instanceof jdb) {
                        boolean bl3 = bl = this.mSS.mQp.contains((Object)((Object)jcz.mSB)) && bl;
                    }
                }
                if (!this.mSS.mQq.isEmpty()) {
                    switch (jdd2.dyp().dxe()) {
                        case mPY: {
                            bl = this.mSS.mQq.contains((Object)((Object)jbx.mPY)) && bl;
                            break;
                        }
                        case mPZ: {
                            bl = this.mSS.mQq.contains((Object)((Object)jbx.mPZ)) && bl;
                            break;
                        }
                        case mQc: {
                            bl = this.mSS.mQq.contains((Object)((Object)jbx.mQc)) && bl;
                            break;
                        }
                        case mQb: {
                            bl = this.mSS.mQq.contains((Object)((Object)jbx.mQb)) && bl;
                            break;
                        }
                        case mQd: {
                            boolean bl4 = bl = this.mSS.mQq.contains((Object)((Object)jbx.mQd)) && bl;
                        }
                    }
                }
                if (this.mSS.mQr) {
                    boolean bl5 = bl = jdd2.dyp().vY() && bl;
                }
                if (iua2 instanceof jdb) {
                    jdb jdb2 = (jdb)iua2;
                    if (bl) {
                        if (jdb2.dyp().dxd() == jbz.mQl) {
                            ++this.mST.mQn;
                        }
                        ++this.mST.mQo;
                    }
                }
                return bl;
            }
        });
    }

    private void dyy() {
        this.removeAllItems();
        this.mSP.clear();
        this.mSQ.clear();
        ith ith2 = this.mRV.dqK();
        List<ith> list = ith2.getChildren();
        for (ith ith3 : list) {
            jdd jdd2;
            jcg jcg2;
            if (ith3 instanceof jci) {
                jcg2 = (jci)ith3;
                jdd2 = new jdc(this, (jci)jcg2, (jci)jcg2){
                    final /* synthetic */ jci mSU;
                    final /* synthetic */ jde mSR;
                    {
                        this.mSR = jde2;
                        this.mSU = jci3;
                        super(jci2);
                    }

                    public boolean du(int n, int n2) {
                        jde.b(this.mSR).a(this.mSU);
                        jcc.dwT().c(this.mSU);
                        return false;
                    }
                };
                jdd2.setVisible(((jci)jcg2).isVisible());
                this.c(jdd2);
                this.mSQ.put((jci)jcg2, (jdc)jdd2);
                continue;
            }
            if (!(ith3 instanceof jch)) continue;
            jcg2 = (jch)ith3;
            jdd2 = new jdb(this, (jch)jcg2, (jch)jcg2){
                final /* synthetic */ jch mPT;
                final /* synthetic */ jde mSR;
                {
                    this.mSR = jde2;
                    this.mPT = jch3;
                    super(jch2);
                }

                public boolean du(int n, int n2) {
                    jcc.dwT().c(this.mPT);
                    return false;
                }
            };
            jdd2.setVisible(((jch)jcg2).isVisible());
            this.c(jdd2);
            this.mSP.put((jch)jcg2, (jdb)jdd2);
        }
        this.dyz();
    }

    private void a(jde jde2, jch jch2) {
        jdb jdb2 = this.mSP.get(jch2);
        if (jdb2 != null) {
            jdb2.setVisible(jch2.isVisible());
            this.dyz();
        }
    }

    private void b(jde jde2, jch jch2) {
        jdb jdb2 = this.mSP.get(jch2);
        if (jdb2 != null) {
            jdb2.dyq();
        }
    }

    private void a(jde jde2, jci jci2) {
        jdc jdc2 = this.mSQ.get(jci2);
        if (jdc2 != null) {
            jdc2.setVisible(jci2.isVisible());
            this.dyz();
        }
    }

    private void b(jde jde2, jci jci2) {
        jdc jdc2 = this.mSQ.get(jci2);
        if (jdc2 != null) {
            jdc2.dyq();
        }
    }

    private void dyz() {
        List<iua> list = this.sU();
        int n = 0;
        for (iua iua2 : list) {
            jdd jdd2;
            if (!(iua2 instanceof jdd) || !(jdd2 = (jdd)iua2).djL()) continue;
            jdd2.dqP().setVisible(n % 2 == 0);
            ++n;
        }
    }

    static /* synthetic */ void a(jde jde2) {
        jde2.dyy();
    }

    static /* synthetic */ void a(jde jde2, jde jde3, jch jch2) {
        jde2.a(jde3, jch2);
    }

    static /* synthetic */ void b(jde jde2, jde jde3, jch jch2) {
        jde2.b(jde3, jch2);
    }

    static /* synthetic */ void a(jde jde2, jde jde3, jci jci2) {
        jde2.a(jde3, jci2);
    }

    static /* synthetic */ void b(jde jde2, jde jde3, jci jci2) {
        jde2.b(jde3, jci2);
    }

    static /* synthetic */ jco b(jde jde2) {
        return jde2.mRV;
    }
}

