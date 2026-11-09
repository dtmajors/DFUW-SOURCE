/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class jit
extends ipx {
    private static final ain[] nhh = new ain[]{ain.bnC, ain.bnB, ain.bns, ain.bnt, ain.bnD, ain.bnA, ain.bnz, ain.bnu, ain.bnv, ain.bnr, ain.bny, ain.bnw, ain.bnx};
    private static final int[] nhi = new int[]{77, 35, 77};
    private static final int mfY = 20;
    private static final int nhj = 12;
    private static final int nhk = 20;
    private static final int nhl = 64;
    private static final int nhm = 64;
    private Map<ain, jiu> ngF = lcn.emw();
    private List<jiu> nhn = lcn.emv();

    public jit() {
        for (int j = 0; j < nhh.length; ++j) {
            jiu jiu2 = new jiu(this, nhh[j]){
                final /* synthetic */ jit nho;
                {
                    this.nho = jit2;
                    super(ain2);
                }

                public void i(ain ain2) {
                    this.nho.h(ain2);
                }
            };
            this.ngF.put(nhh[j], jiu2);
            this.nhn.add(jiu2);
            this.W(jiu2);
        }
        jid.dHb().ngy.c((jlf<jic>)new jlr<jit, jic>(this, this){
            final /* synthetic */ jit nho;
            {
                this.nho = jit2;
                super(jit3);
            }

            public void b(jit jit2, jic jic2) {
                jit.a(jit2, jic2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((jit)object, (jic)object2);
            }
        });
    }

    @Override
    public void cPj() {
        this.setSize(256, 600);
    }

    @Override
    public void cPk() {
        this.H(0, 3, 20, nhi[0]);
        this.H(4, 8, 96, nhi[1]);
        this.H(9, 12, 172, nhi[2]);
    }

    public void h(ain ain2) {
    }

    private void a(jic jic2) {
        jiu jiu2 = this.ngF.get((Object)jic2.BP());
        jiu2.aTg();
    }

    private void H(int n, int n2, int n3, int n4) {
        while (n <= n2) {
            this.nhn.get(n).r(n3, n4, 64, 64);
            n4 += 84;
            ++n;
        }
    }

    static /* synthetic */ void a(jit jit2, jic jic2) {
        jit2.a(jic2);
    }
}

