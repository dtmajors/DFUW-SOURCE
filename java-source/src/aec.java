/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class aec
extends acp {
    private int SkillType = -1;

    public int zg() {
        return this.SkillType;
    }

    protected aec(wy wy2, acr acr2, int n, int n2) {
        this(wy2, acr2, acs.bev, n, n2);
    }

    protected aec(wy wy2, acr acr2, int n, int n2, String string) {
        this(wy2, acr2, acs.bev, n, n2, string);
    }

    protected aec(wy wy2, acr acr2, acs acs2, int n, int n2) {
        super(wy2, acr2, acs2, n, n2);
    }

    protected aec(wy wy2, acr acr2, acs acs2, int n, int n2, String string) {
        super(wy2, acr2, acs2, n, n2, string);
    }

    @Override
    public boolean xo() {
        return false;
    }

    @Override
    public boolean i(Element element) {
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

    protected aec a(aec aec2) {
        if (aec2 != null) {
            aec2.az(this.yo());
            aec2.SkillType = this.SkillType;
        }
        return aec2;
    }
}

