/*
 * Decompiled with CFR.
 */
public class jdg
extends ipx {
    public jdg() {
        this.a(irl.dnr());
        this.W(new jdf());
        jcc.dwT().mQD.a((jlg<jcg, jcg>)new jls<jdg, jcg, jcg>(this, this){
            final /* synthetic */ jdg mSV;
            {
                this.mSV = jdg2;
                super(jdg3);
            }

            public void a(jdg jdg2, jcg jcg2, jcg jcg3) {
                jdg.a(jdg2, jcg3);
            }
        });
    }

    private void d(jcg jcg2) {
        this.RP(0);
        if (jcg2 instanceof jch) {
            this.W(new jdk((jch)jcg2));
        } else if (jcg2 instanceof jci) {
            this.W(new jee((jci)jcg2));
        } else {
            this.W(new jdf());
        }
    }

    static /* synthetic */ void a(jdg jdg2, jcg jcg2) {
        jdg2.d(jcg2);
    }
}

