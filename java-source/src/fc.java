/*
 * Decompiled with CFR.
 */
public class fc {
    public ljq Position = null;
    public lgl Rotation = null;
    public ljq Qe = null;

    public fc() {
    }

    public fc(fc fc2) {
        if (fc2 == null) {
            return;
        }
        if (fc2.Position != null) {
            this.Position = new ljq(fc2.Position);
        }
        if (fc2.Rotation != null) {
            this.Rotation = new lgl(fc2.Rotation);
        }
        if (fc2.Qe != null) {
            this.Qe = new ljq(fc2.Qe);
        }
    }

    public fc gv() {
        return new fc(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFPositionalInfo: Position=");
        stringBuilder.append(this.Position);
        stringBuilder.append(" Rotation=");
        stringBuilder.append(this.Rotation);
        stringBuilder.append(" Velocity=");
        stringBuilder.append(this.Qe);
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof fc)) {
            return false;
        }
        fc fc2 = (fc)object;
        if (!lin.i(this.Position, fc2.Position)) {
            return false;
        }
        if (!lin.i(this.Rotation, fc2.Rotation)) {
            return false;
        }
        if (!lin.i(this.Qe, fc2.Qe)) {
            return false;
        }
        return super.equals(object);
    }
}

