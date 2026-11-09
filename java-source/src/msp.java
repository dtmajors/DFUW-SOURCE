/*
 * Decompiled with CFR.
 */
import java.util.List;

public class msp {
    private cgr Esw;
    private che Eut;
    private List<cgw> Euu;

    public msp(cgr cgr2, che che2) {
        this.Esw = cgr2;
        this.Eut = che2;
    }

    public msp(cgr cgr2, che che2, List<cgw> list) {
        this(cgr2, che2);
        this.Euu = lcn.emv();
        if (list != null) {
            for (cgw cgw2 : list) {
                if (this.Euu.contains(cgw2)) continue;
                this.Euu.add(cgw2);
            }
        }
    }

    public cgr eNZ() {
        return this.Esw;
    }

    public che eOa() {
        return this.Eut;
    }

    public List<cgw> eOb() {
        return this.Euu;
    }
}

