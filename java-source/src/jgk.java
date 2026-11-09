/*
 * Decompiled with CFR.
 */
public class jgk
extends ipy {
    private int lBn;
    private ist lUP;

    public jgk(int n, int n2) {
        this.lBn = n;
        this.a(irl.dnr());
        this.rF(false);
        this.W(ipx.d(new ipb("skill_slot_number_bg")));
        this.lUP = ist.c(isf.mwO, 10, 0x515151, n2 + 1 + "");
        this.W(ipx.d(this.lUP));
        jen.dzL().mUU.a((jlh<jfd, jfc, jfc>)new jlt<jgk, jfd, jfc, jfc>(this, this){
            final /* synthetic */ jgk mZZ;
            {
                this.mZZ = jgk2;
                super(jgk3);
            }

            public void a(jgk jgk2, jfd jfd2, jfc jfc2, jfc jfc3) {
                if (jfd2.dAr() == jgk.a(this.mZZ)) {
                    jgk.a(this.mZZ, jfd2);
                }
            }
        });
        jfd jfd2 = jen.dzL().dzM().dzE().Ur(this.lBn);
        this.m(jfd2);
    }

    private void m(jfd jfd2) {
        this.lUP.Rk(jfd2.dAu() != null ? 0xCCCCCC : 0x515151);
    }

    static /* synthetic */ int a(jgk jgk2) {
        return jgk2.lBn;
    }

    static /* synthetic */ void a(jgk jgk2, jfd jfd2) {
        jgk2.m(jfd2);
    }
}

