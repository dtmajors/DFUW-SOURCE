/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public class fe
extends ej {
    private cbx Qg = null;
    private fc Qf = new fc();

    public fe() {
        super(5);
        this.DP = 10;
    }

    public void a(cbx cbx2) {
        this.Qg = cbx2;
    }

    public fc gw() {
        if (this.Qg == null) {
            return null;
        }
        if (this.Qg.aAG() == null) {
            return null;
        }
        this.Qf.Position = this.Qg.aAG().av();
        this.Qf.Rotation = this.Qg.aAG().aw();
        return this.Qf;
    }

    @Override
    public Object getValue() {
        if (this.Qg == null) {
            return null;
        }
        if (this.Qg.aAG() == null) {
            return null;
        }
        this.Qf.Position = this.Qg.aAG().av();
        this.Qf.Rotation = this.Qg.aAG().aw();
        return new fc(this.Qf);
    }

    @Override
    public void setValue(Object object) {
        lfn.b(5, "SFPositionalInfoAttributeImpl", "setValue() You can't set the value of this attribute.");
        assert (false);
    }

    @Override
    public ej fm() {
        fe fe2 = new fe();
        fe2.setType(this.Type);
        return fe2;
    }

    @Override
    public ej fn() {
        fd fd2 = new fd();
        fd2.setType(this.Type);
        if (this.Qg != null && this.Qg.aAG() != null) {
            fd2.setValue(this.getValue());
        }
        return fd2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFPositionalInfoAttributeImpl: ");
        if (this.Qg == null) {
            stringBuilder.append("PhysicalObject=null MeshObject=null");
        } else {
            stringBuilder.append("PhysicalObject=" + this.Qg.getGUID());
            if (this.Qg.aAG() == null) {
                stringBuilder.append(" MeshObject=null");
            } else {
                stringBuilder.append(" MeshObject=" + this.Qg.aAG().getGUID());
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public final String fj() {
        assert (false);
        return null;
    }

    @Override
    public final boolean aq(String string) {
        assert (false);
        return false;
    }
}

