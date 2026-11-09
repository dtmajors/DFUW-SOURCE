/*
 * Decompiled with CFR.
 */
public class bve {
    public static final boolean a(a a2) {
        if (a2 == null) {
            lfn.b(5, "SFMeshObjectConstants", "isAnimatedMeshObject() MeshType is null.");
            return false;
        }
        switch (a2) {
            case dQy: 
            case dQz: 
            case dQA: 
            case dQF: 
            case dQK: 
            case dQu: 
            case dQG: 
            case dQE: 
            case dQI: {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(a a2) {
        if (a2 == null) {
            lfn.b(5, "SFMeshObjectConstants", "usesStreamControllerManager() MeshType is null.");
            return false;
        }
        switch (a2) {
            case dQy: 
            case dQz: 
            case dQA: 
            case dQF: 
            case dQK: 
            case dQE: 
            case dQw: 
            case dQJ: {
                return true;
            }
        }
        return false;
    }

    private bve() {
    }
}

