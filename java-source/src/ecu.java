/*
 * Decompiled with CFR.
 */
public class ecu {
    public ect DF(int n2) {
        switch (n2) {
            case 19457: {
                return new ecr();
            }
            case 19458: {
                return new ecs();
            }
            case 19459: {
                return new ecx();
            }
            case 19460: {
                return new ecv();
            }
            case 19461: {
                return new ecw();
            }
        }
        lfn.b(5, "SFBuildingMessageFactory", "createBuildingMessage() Invalid messagetype provided: " + n2);
        return null;
    }
}

