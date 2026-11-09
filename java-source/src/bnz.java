/*
 * Decompiled with CFR.
 */
public class bnz {
    public static final float dwN = 1.0f;
    public static final int dwO = 1;
    public static final int dwP = 2;
    public static final int dwQ = 4;
    public static final int dwR = 8;
    public static final int dwS = 16;
    public static final int dwT = 32;
    public static final int dwU = 64;
    public static final int dwV = 128;

    public static final String lm(int n) {
        switch (n) {
            case 1: {
                return "SFInteractionBuyFromPlayerLogic";
            }
            case 2: {
                return "SFInteractionSellToPlayerLogic";
            }
            case 4: {
                return "SFInteractionQuestLogic";
            }
            case 8: {
                return "SFInteractionTrainingLogic";
            }
            case 16: {
                return "SFInteractionChangeStartingWeapon";
            }
            case 32: {
                return "SFInteractionSkillExtension";
            }
            case 64: {
                return "SFInteractionBarber";
            }
            case 128: {
                return "SFInteractionOwnedVendor";
            }
        }
        return "Undefined interactionlogic";
    }

    private bnz() {
    }
}

