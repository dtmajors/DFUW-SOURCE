/*
 * Decompiled with CFR.
 */
public class ism
extends isi {
    public ism() {
    }

    public ism(String string) {
        super(string);
    }

    public ism(isf isf2, int n, int n2, loz loz2) {
        super(isf2, n, n2, loz2);
    }

    public ism(isf isf2, int n, int n2, String string) {
        super(isf2, n, n2, string);
    }

    @Override
    public void cND() {
        this.dpw();
    }

    @Override
    public void dpw() {
        if (this.djE() == null) {
            return;
        }
        String string = isg.b(this.dqk(), this.bll(), this.dql(), this.getText());
        if (this.dkb()) {
            string = isg.rh(string);
        }
        this.djE().b("TextField_setHtmlText", new Object[]{this.getId(), string});
    }
}

