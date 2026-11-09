/*
 * Decompiled with CFR.
 */
public enum dmf {
    gHt,
    gHu,
    gHv,
    gHw;


    public float bpV() {
        switch (this) {
            case gHu: {
                return 1.0f;
            }
            case gHv: {
                return 0.5f;
            }
            case gHw: {
                return 0.0f;
            }
        }
        return 0.0f;
    }
}

