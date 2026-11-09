/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;

public class hji
implements lbi<egi> {
    ArrayList<a> kzg = new ArrayList();
    lha<dxq, dxq> cdh;

    public void a(a a2) {
        this.kzg.add(a2);
    }

    public void b(a a2) {
        this.kzg.remove(a2);
    }

    public void cnx() {
        if (this.kzg.size() == 0) {
            return;
        }
        ehk ehk2 = (ehk)this.cdh.rng.ik(2327);
        ehk2.on(lcr.qCM);
        this.cdh.rnh.m(ehk2);
    }

    public void Wa() {
        egu egu2 = (egu)this.cdh.rng.ik(2310);
        egu2.on(lcr.qCM);
        this.cdh.rnh.m(egu2);
    }

    public hji(lha<dxq, dxq> lha2) {
        this.cdh = lha2;
        this.cdh.rex.a(true, egi.class, this);
    }

    public void dispose() {
        this.cdh.rex.a(false, egi.class, this);
    }

    public void b(egi egi2) {
        for (a a2 : this.kzg) {
            a2.a(false, egi2.crz);
        }
    }

    @Override
    public /* synthetic */ void m(Object object) {
        this.b((egi)object);
    }
}

