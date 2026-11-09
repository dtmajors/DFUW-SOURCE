/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.List;

public abstract class jlc
extends jld {
    private List<ioc> ntU = lcn.emv();

    public List<ioc> dLB() {
        return this.ntU != null ? Collections.unmodifiableList(this.ntU) : null;
    }

    public void bI(List<ioc> list) {
        if (list != null) {
            this.ntU.clear();
            for (ioc ioc2 : list) {
                this.ntU.add(new ioc(ioc2.cf, ioc2.cg));
            }
        } else {
            this.ntU = null;
        }
        this.a("setVectorObjectCoords", this.getId(), this.dLx());
    }

    @Override
    public String dLx() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.ntU != null) {
            int n = 0;
            for (ioc ioc2 : this.ntU) {
                if (n > 0) {
                    stringBuilder.append(',');
                }
                stringBuilder.append(ioc2.cf);
                stringBuilder.append(',');
                stringBuilder.append(ioc2.cg);
                ++n;
            }
        }
        return stringBuilder.toString();
    }
}

