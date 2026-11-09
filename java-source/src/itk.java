/*
 * Decompiled with CFR.
 */
import java.util.List;

public abstract class itk
extends itl {
    private iug myS;

    public itk(itj itj2) {
        super(itj2);
        this.a(irl.dnr());
        this.myS = this.dqM();
        this.W(this.myS);
        this.dqN();
    }

    public iug dqL() {
        return this.myS;
    }

    public abstract iug dqM();

    @Override
    public void dqN() {
        if (this.myS == null) {
            return;
        }
        this.myS.removeAllItems();
        List<ith> list = this.dqO().dqK().getChildren();
        if (list != null) {
            for (ith ith2 : list) {
                iua iua2 = this.b(ith2);
                this.myS.c(iua2);
            }
        }
    }

    public abstract iua b(ith var1);
}

