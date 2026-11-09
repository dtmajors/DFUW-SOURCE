/*
 * Decompiled with CFR.
 */
public class ita
extends itb {
    private String myw;
    private int myx;

    public ita(String string, int n, boolean bl) {
        super(bl);
        this.myw = string;
        this.myx = n;
    }

    public String dpP() {
        return this.myw;
    }

    @Override
    public void a(isj isj2) {
        isj2.djE().b("ITextInput_setRegularExpression", new Object[]{isj2.getId(), this.myw, this.myx, this.dqD()});
    }
}

