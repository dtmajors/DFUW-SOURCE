/*
 * Decompiled with CFR.
 */
public class maq
extends mal {
    private static final maq udc = new maq();
    @lok(value="$(DefenderName) has been challenged, by $(AttackerName), for control over $(HoldingName)... Fighting will begin in $(CountDown)!")
    @lpl(value="Displayed to all on-line players when a conquest challenge is initiated")
    public static final lox ucD = udc.a("ChallengeInitiated", maq.Bk("DefenderName"), maq.Bk("AttackerName"), maq.Bp("HoldingName"), maq.Bi("CountDown"));
    @lok(value="$(AttackerName) has joined the challenge of $(DefenderName), for control of $(HoldingName)!")
    @lpl(value="Displayed to all on-line players when an attacker joins an active conquest challenge")
    public static final lox ucF = udc.a("AttackerJoined", maq.Bk("AttackerName"), maq.Bk("DefenderName"), maq.Bp("HoldingName"));
    @lok(value="$(AttackerName) has placed a $(SiegeStoneResource.NameSingular) around $(HoldingName)!... The siege-stone is vulnerable to attack immediately!")
    @lpl(value="Displayed to all on-line players when an attacker places a siege-stone in an active conquest challenge, and it is immediately vulnerable to attack")
    public static final lox udd = udc.a("AttackerPlacedSiegeStoneVulnerable", maq.Bk("AttackerName"), maq.Bl("SiegeStoneResource"), maq.Bp("HoldingName"));
    @lok(value="The holdings owned by $(AttackerName) are now vulnerable to attack!")
    @lpl(value="Displayed to all on-line players when an attacker's holdings become vulnerable to attack")
    public static final lox ucJ = udc.a("AttackerHoldingsVulnerable", maq.Bk("AttackerName"));
    @lok(value="The siege-stones placed by $(AttackerName), in the challenge for $(HoldingName), are now vulnerable to attack!")
    @lpl(value="Displayed to all on-line players when an attacker's siege-stones become vulnerable to attack")
    public static final lox ucL = udc.a("AttackerSiegeStonesVulnerable", maq.Bh("PlacedSiegeStonesCount"), maq.Bk("AttackerName"), maq.Bp("HoldingName"));
    @lok(value="$(HoldingName), owned by $(DefenderName), is now vulnerable to attack!")
    @lpl(value="Displayed to all on-line players when a defender's holding becomes vulnerable to attack")
    public static final lox ucN = udc.a("ChallengedHoldingVulnerable", maq.Bp("HoldingName"), maq.Bk("DefenderName"));
    @lok(value="$(HoldingName), owned by $(DefenderName), can now become vulnerable to attack, once the $(WallsStandingCount) walls that are protecting it have been destroyed!")
    @lpl(value="Displayed to all on-line players when a defender's holding becomes vulnerable to attack, but is being protected by standing walls")
    public static final lox ucO = udc.a("ChallengedHoldingVulnerableWallsProtecting", maq.Bp("HoldingName"), maq.Bk("DefenderName"), maq.Bh("WallsStandingCount"));
    @lok(value="$(AttackerName) has lost, in the challenge for $(HoldingName), as they failed to place enough siege-stones in time!")
    @lpl(value="Displayed to all on-line players when an attacker leaves an active challenge because failed to place enough siege-stones in time")
    public static final lox ucQ = udc.a("AttackerLeftChallengeNotEnoughSiegeStonesPlaced", maq.Bk("AttackerName"), maq.Bp("HoldingName"));
    @lok(value="$(AttackerName) has lost, in the challenge for $(HoldingName), as the clan has been disbanded!")
    @lpl(value="Displayed to all on-line players when an attacker leaves an active challenge because their clan disbanded")
    public static final lox ucR = udc.a("AttackerLeftChallengeClanDisbanded", maq.Bk("AttackerName"), maq.Bp("HoldingName"));
    @lok(value="$(AttackerName) and $(DefenderName) have successfully negotiated a peace treaty, the challenge between them, for $(HoldingName), has ended!")
    @lpl(value="Displayed to all on-line players when an attacker leaves an active challenge because they negotiated a peace treaty with the defender clan")
    public static final lox ucS = udc.a("AttackerLeftChallengePeaceTreatyNegotiated", maq.Bk("AttackerName"), maq.Bk("DefenderName"), maq.Bp("HoldingName"));
    @lok(value="$(AttackerName) has lost, in the challenge for $(HoldingName), as they lost all their cities!")
    @lpl(value="Displayed to all on-line players when an attacker leaves an active challenge because they lost all of their holdings")
    public static final lox ucT = udc.a("AttackerLeftChallengeNoHoldingsRemaining", maq.Bk("AttackerName"), maq.Bp("HoldingName"));
    @lok(value="$(AttackerName) has lost, in the challenge for $(HoldingName), as all their siege-stones were destroyed!")
    @lpl(value="Displayed to all on-line players when an attacker leaves an active challenge because they lost all of thier siege-stones")
    public static final lox ucU = udc.a("AttackerLeftChallengeNoSiegeStonesRemaining", maq.Bk("AttackerName"), maq.Bp("HoldingName"));
    @lok(value="$(AttackerName) has been removed from the challenge for $(HoldingName) because their challenge was aborted by administrators!")
    @lpl(value="Displayed to all on-line players when an attacker leaves an active challenge because the attacker's challenge was aborted by administrators")
    public static final lox ucV = udc.a("AttackerLeftChallengeAbortedByAdmins", maq.Bk("AttackerName"), maq.Bp("HoldingName"));
    @lok(value="$(AttackerName) has lost, in the challenge for $(HoldingName), as all their clan size dropped below the required number!")
    @lpl(value="Displayed to all on-line players when an attacker leaves an active challenge because their clan size dropped below the minimum number of members for too long")
    public static final lox ucW = udc.a("AttackerLeftChallengeClanSizeDroppedBelowLimit", maq.Bk("AttackerName"), maq.Bp("HoldingName"));
    @lok(value="$(DefenderName) has successfully defended $(HoldingName) against all attackers, the $(HoldingType) remains theirs!")
    @lpl(value="Displayed to all on-line players when a defender wins a conquest challenge because all attackers were removed")
    public static final lox ude = udc.a("DefenderWonChallengeAllAttackersRemoved", maq.Bk("DefenderName"), maq.Bp("HoldingName"), maq.b("HoldingType", ayb.class));
    @lok(value="Time has run out in the challenge for $(HoldingName), $(DefenderName) has retained their $(HoldingType) and won the challenge!")
    @lpl(value="Displayed to all on-line players when a defender wins a conquest challenge because the challenge timed out")
    public static final lox udf = udc.a("DefenderWonChallengeTimeOut", maq.Bp("HoldingName"), maq.Bk("DefenderName"), maq.b("HoldingType", ayb.class));
    @lok(value="$(DefenderName) has gathered enough power-points, in the challenge for $(HoldingName), to win the challenge, the $(HoldingType) remains theirs!")
    @lpl(value="Displayed to all on-line players when a defender wins a conquest challenge because they gathered enough power-points")
    public static final lox udg = udc.a("DefenderWonChallengeEnoughPowerPointsGathered", maq.Bk("DefenderName"), maq.Bp("HoldingName"), maq.b("HoldingType", ayb.class));
    @lok(value="$(DefenderName) has successfully defended $(HoldingName) against all attackers... However the challenge will remain active for the next $(CountDown)... During this time further attackers are welcome to enter the challenge!")
    @lpl(value="Displayed ot all on-line players when a defender wins a conquest challenge because all attackers have been removed, but the current challenge phase must time out")
    public static final lox udh = udc.a("DefenderWonChallengeAllAttackersRemovedWaitingForPhaseToTimeOut", maq.Bk("DefenderName"), maq.Bp("HoldingName"), maq.Bi("CountDown"));
    @lok(value="$(DefenderName) has lost the challenge for $(HoldingName), $(WinnerName) has won control of the $(HoldingType)!")
    @lpl(value="Displayed ot all on-line players when a defender loses a conquest challenge because they lost control of the holding")
    public static final lox udi = udc.a("DefenderLostChallengeHoldingLost", maq.Bk("DefenderName"), maq.Bp("HoldingName"), maq.Bk("WinnerName"), maq.b("HoldingType", ayb.class));
    @lok(value="Time has run out in the challenge for $(HoldingName), a draw has been declared and $(DefenderName) has retained ownership of their $(HoldingType)!")
    @lpl(value="Displayed to all on-line players when a conquest challenge ends in a draw")
    public static final lox ucc = udc.a("ChallengeDraw", maq.Bp("HoldingName"), maq.Bk("DefenderName"), maq.b("HoldingType", ayb.class));

    protected maq(String string) {
        super("Global." + string);
    }

    private maq() {
        super("Global");
    }
}

