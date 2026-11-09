/*
 * Decompiled with CFR.
 */
import java.util.List;

public class jbw {
    public jbw() {
        jcc.dwT().mQt.c((jlf<jch>)new jlr<jbw, jch>(this, this){
            final /* synthetic */ jbw mPR;
            {
                this.mPR = jbw2;
                super(jbw3);
            }

            public void b(jbw jbw2, jch jch2) {
                jbw.a(jbw2, jch2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((jbw)object, (jch)object2);
            }
        });
        jcc.dwT().mQK.a((jlh<Integer, List<jck>, Boolean>)new jlt<jbw, Integer, List<jck>, Boolean>(this, this){
            final /* synthetic */ jbw mPR;
            {
                this.mPR = jbw2;
                super(jbw3);
            }

            public void b(jbw jbw2, Integer n, List<jck> list, Boolean bl) {
                jbw.a(jbw2, jbw2, n, list, bl);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3, Object object4) {
                this.b((jbw)object, (Integer)object2, (List)object3, (Boolean)object4);
            }
        });
    }

    private void a(jch jch2) {
        switch (jch2.dxe()) {
            case mPZ: {
                return;
            }
        }
        jbd.dwq().a(new jbb(this, jch2){
            public jbx mPS;
            final /* synthetic */ jch mPT;
            final /* synthetic */ jbw mPR;
            {
                this.mPR = jbw2;
                this.mPT = jch2;
                this.mPS = this.mPT.dxe();
            }

            public jba cVQ() {
                jct jct2 = new jct(this.mPT, this.mPS);
                jct2.setGUID(hso.cxK().cxP().cyJ().getMessageDelegator().bzv());
                hso.cxK().cxP().cyJ().getMessageDelegator().a((amf)((Object)jct2));
                return jct2;
            }
        });
    }

    private void a(jbw jbw2, Integer n, List<jck> list, Boolean bl) {
        jbd.dwq().a(new jbb(this, n, list, bl){
            final /* synthetic */ Integer mPU;
            final /* synthetic */ List mPV;
            final /* synthetic */ Boolean mPW;
            final /* synthetic */ jbw mPR;
            {
                this.mPR = jbw2;
                this.mPU = n;
                this.mPV = list;
                this.mPW = bl;
            }

            public jba cVQ() {
                jct jct2 = new jct((jch)jcc.dwT().TO(this.mPU), this.mPV, this.mPW);
                jct2.setGUID(hso.cxK().cxP().cyJ().getMessageDelegator().bzv());
                hso.cxK().cxP().cyJ().getMessageDelegator().a((amf)((Object)jct2));
                return jct2;
            }
        });
    }

    static /* synthetic */ void a(jbw jbw2, jch jch2) {
        jbw2.a(jch2);
    }

    static /* synthetic */ void a(jbw jbw2, jbw jbw3, Integer n, List list, Boolean bl) {
        jbw2.a(jbw3, n, list, bl);
    }
}

