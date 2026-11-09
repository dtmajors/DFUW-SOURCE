/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class jis
extends izm {
    private Map<jhx, jip> mTk = lcn.emw();

    public jis() {
        this.dHE();
        jid.dHb().ngx.c((jlf<jhx>)new jlr<jis, jhx>(this, this){
            final /* synthetic */ jis nhf;
            {
                this.nhf = jis2;
                super(jis3);
            }

            public void b(jis jis2, jhx jhx2) {
                jis.a(jis2, jhx2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((jis)object, (jhx)object2);
            }
        });
        this.Td(8);
    }

    public int e(jhw jhw2) {
        return this.a(new iub(this, jhw2){
            final /* synthetic */ jhw nhg;
            final /* synthetic */ jis nhf;
            {
                this.nhf = jis2;
                this.nhg = jhw2;
            }

            public boolean a(iua iua2) {
                return ((jio)iua2).a(this.nhg);
            }
        });
    }

    public void a(jin jin2, boolean bl) {
    }

    private void dHE() {
        for (jhv jhv2 : jhv.values()) {
            if (!jhv2.dGG()) continue;
            jin jin2 = new jin(this, jhv2){
                final /* synthetic */ jis nhf;
                {
                    this.nhf = jis2;
                    super(jhv2);
                }

                public void pn(boolean bl) {
                    jis.a(this.nhf, this, bl);
                }
            };
            this.c(jin2);
            this.a(jin2, jhv2);
        }
    }

    private void a(jin jin2, jhv jhv2) {
        for (ain ain2 : jhv2.nfU) {
            Map<Integer, jhx> map = jid.dHb().e(ain2).dGV();
            for (jhx jhx2 : map.values()) {
                jip jip2 = new jip(jin2, jhx2);
                this.mTk.put(jhx2, jip2);
                this.c(jip2);
            }
        }
    }

    private void a(jhx jhx2) {
        jip jip2 = this.mTk.get(jhx2);
        jip2.aTg();
    }

    private void b(jin jin2, boolean bl) {
        for (jip jip2 : this.mTk.values()) {
            if (jip2.dHy() != jin2) continue;
            jip2.setVisible(bl);
        }
    }

    static /* synthetic */ void a(jis jis2, jhx jhx2) {
        jis2.a(jhx2);
    }

    static /* synthetic */ void a(jis jis2, jin jin2, boolean bl) {
        jis2.b(jin2, bl);
    }
}

