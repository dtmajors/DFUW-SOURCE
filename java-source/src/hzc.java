/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class hzc
extends hzk
implements hwb {
    private Map<alu, hwt> lvM = lcn.emw();
    private int lhy = 0;

    public hzc() {
        super("modifiers", "modifiers.swf");
        this.a(hxy.llM);
        this.a(hyb.lmC);
        this.OQ(jnz.nGe | jnz.nGi);
    }

    public void cBa() {
        super.cBa();
        for (hwt hwt2 : this.lvM.values()) {
            this.a("addModifier", new Object[]{hwt2.cBj()});
        }
    }

    public void initialize() {
        super.initialize();
    }

    public void cleanUp() {
        super.cleanUp();
    }

    @Override
    public void m(alu alu2) {
    }

    @Override
    public void n(alu alu2) {
    }

    protected void b(jnz jnz2, jnz jnz3) {
        if (jnz3.isSet(jnz.nGe)) {
            this.a(hyb.lmF);
        }
        if (jnz3.isSet(jnz.nGi)) {
            this.a(hyb.lmE);
        }
    }

    @Override
    public void a(List<hvz> list, List<hvz> list2, List<hvz> list3) {
    }

    @Override
    public void a(hvz hvz2, List<Integer> list, List<Integer> list2) {
    }

    @Override
    public int cAQ() {
        return -1;
    }

    @Override
    public void a(List<hvz> list, float[] fArray) {
    }

    @Override
    public void a(hvz hvz2, float[] fArray) {
    }
}

