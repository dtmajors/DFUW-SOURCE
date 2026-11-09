/*
 * Decompiled with CFR.
 */
public class mal
extends mai {
    private static final mal ubF = new mal();
    @lok(value="The challenge for $(HoldingName) has been aborted by administrators!")
    @lpl(value="Dislayed to clan members involved in a conquest challenge that was aborted by administrators")
    public static final lox ubG = ubF.a("CityChallengeAbortedByAdmins", mal.Bp("HoldingName"));
    @lok(value="A wall around $(HoldingName) has been destroyed!... If $(RemainingForTarget) more walls are destroyed the $(HoldingType) will no longer be protected!")
    @lpl(value="Displayed to clan members when a wall protecting the challenged holding is destroyed, but more must be destroyed to meet the target")
    public static final lox ubH = ubF.a("HoldingWallDestroyedNotEnough", mal.Bp("HoldingName"), mal.Bh("RemainingForTarget"), mal.b("HoldingType", ayb.class));
    @lok(value="Enough walls around $(HoldingName) have been destroyed!... The holding's clan-stone is no longer protected!")
    @lpl(value="Displayed to clan members when a wall protecting the challenged holding is destroyed, and the target is now met")
    public static final lox ubI = ubF.a("HoldingWallDestroyedEnough", mal.Bp("HoldingName"));
    @lok(value="A wall around $(HoldingName) has been destroyed!")
    @lpl(value="Displayed to clan members when a wall protecting the challenged holding is destroyed, and the target was already met")
    public static final lox ubJ = ubF.a("HoldingWallDestroyedMoreThanEnough", mal.Bp("HoldingName"));

    protected mal(String string) {
        super("Conquest." + string);
    }

    private mal() {
        super("Conquest");
    }
}

