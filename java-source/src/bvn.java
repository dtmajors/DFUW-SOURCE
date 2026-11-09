/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  lcw
 */
public class bvn {
    private bvn() {
    }

    public static final bvd c(bve.a a2) {
        switch (a2) {
            case dQt: 
            case dQu: {
                return new bvf(a2);
            }
            case dQv: {
                return new bvo(a2);
            }
            case dQw: 
            case dQx: {
                return new bvm(a2);
            }
            case dQy: 
            case dQz: 
            case dQA: {
                return new bvi(a2);
            }
            case dQB: 
            case dQC: {
                return new bvm(a2);
            }
            case dQD: {
                return new bvo(a2);
            }
            case dQG: 
            case dQF: {
                return new bvi(a2);
            }
            case dQE: {
                return new bvj(a2);
            }
            case dQH: {
                return new bvp(a2);
            }
            case dQI: {
                if (lcw.qHe) {
                    return new dsp(a2);
                }
                return new bvf(a2);
            }
            case dQJ: {
                return new bvm(a2);
            }
            case dQK: {
                return new bvi(a2);
            }
        }
        lfn.b(5, "SFMeshObjectFactoryClient", "createMeshObject() Invalid meshtype provided: " + (Object)((Object)a2));
        assert (false);
        return null;
    }
}

