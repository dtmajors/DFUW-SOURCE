/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class adz
extends adx {
    private int SkillType = -1;

    public int zg() {
        return this.SkillType;
    }

    protected adz(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.bet, n, n2);
    }

    protected adz(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.bet, n, n2, string);
    }

    @Override
    public boolean i(Element element) {
        if (super.i(element)) {
            if (element == null) {
                return false;
            }
            String string = element.getAttribute("skill_name");
            if (string == null || string.isEmpty()) {
                return false;
            }
            this.SkillType = lea.enZ().getType(string);
            return this.SkillType >= 0;
        }
        return false;
    }

    protected adz a(adz adz2) {
        super.a(adz2);
        if (adz2 != null) {
            adz2.SkillType = this.SkillType;
        }
        return adz2;
    }
}

