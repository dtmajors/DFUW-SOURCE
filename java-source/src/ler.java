/*
 * Decompiled with CFR.
 */
public class ler
implements Comparable {
    public static final int rjo = 1;
    public static final int rjp = 2;
    public static final int rjq = 3;
    public static final int rjr = 4;
    public static final int rjs = 5;
    public static final int rjt = 6;
    public static final int rju = 7;
    protected int Type = -1;
    private String Name = null;
    protected int rjv = 0;
    protected String jD = null;
    private lip rjw = null;
    private lip rjx = null;

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
        this.rjw = !this.Name.toLowerCase().startsWith("s_") ? new ljg(this.Name) : new ljg(this.Name.substring(2).replace('_', ' '));
    }

    public int eqk() {
        return this.rjv;
    }

    public void acu(int n) {
        this.rjv = n;
    }

    public String getDescription() {
        return this.jD;
    }

    public lip awP() {
        return this.rjx;
    }

    public void setDescription(String string) {
        this.jD = string;
        this.rjx = new ljk(this.jD);
    }

    public int compareTo(Object object) {
        if (object instanceof ler) {
            ler ler2 = (ler)object;
            if (this.rjv < ler2.eqk()) {
                return -1;
            }
            if (this.rjv == ler2.eqk()) {
                return 0;
            }
            return 1;
        }
        assert (false) : "Object is not a SFListItem! It's a " + object.getClass().getName();
        return -1;
    }

    public lip awO() {
        return this.rjw;
    }

    public String getTypeName() {
        if (this instanceof lby) {
            return "ActionListItem";
        }
        if (this instanceof ldi) {
            return "EffectListItem";
        }
        if (this instanceof ldu) {
            return "FunctionListItem";
        }
        if (this instanceof lfl) {
            return "ObjectListItem";
        }
        if (this instanceof lgw) {
            return "ResourceListItem";
        }
        if (this instanceof lhg) {
            return "SkillListItem";
        }
        return "Undefined ListItem";
    }

    public String toString() {
        return this.getTypeName() + ": Name='" + this.Name + "' Type=" + this.Type + " ChildOrder=" + this.rjv;
    }
}

