/*
 * Decompiled with CFR.
 */
public class ge {
    public a Uq = a.Uv;
    public ldv Ur = null;
    public int Us = 0;
    public int Ut = -1;

    public void reset() {
        this.Uq = a.Uv;
        this.Ur = null;
        this.Us = 0;
        this.Ut = -1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFExternalObjectInfo: '");
        stringBuilder.append(this.Uq.name());
        stringBuilder.append("' ExternalObjectGUID=");
        stringBuilder.append(this.Ur);
        stringBuilder.append(" ExternalObjectType='");
        stringBuilder.append(this.hv());
        stringBuilder.append("' ExternalResourceType=");
        stringBuilder.append(this.Ut);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    private String hv() {
        switch (this.Us) {
            case 1: {
                return "Boat";
            }
            case 2: {
                return "Cannon";
            }
            case 3: {
                return "Mount";
            }
            case 4: {
                return "Stationary Gun";
            }
            case 5: {
                return "Steering Wheel";
            }
            case 6: {
                return "Tanks";
            }
        }
        return "Undefined";
    }
}

