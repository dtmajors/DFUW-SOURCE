/*
 * Decompiled with CFR.
 */
public class map
extends mal {
    private static final map ucC = new map();
    @lok(value="Your clan has been challenged, by $(AttackerName), for control over $(HoldingName)... Fighting will begin in $(CountDown)!")
    @lpl(value="Displayed to members of a defender clan when a challenge for one of their holdings has been initiated")
    @lpk(value="osmsg_challenge_01")
    public static final lox ucD = ucC.a("ChallengeInitiated", map.Bk("AttackerName"), map.Bp("HoldingName"), map.Bi("CountDown"));
    @lok(value="There are $(WallsStandingCount) walls around $(HoldingName)... If $(NumberOfWallsProtectingHoldingCount) are destroyed the $(HoldingType) will no longer be protected!")
    @lpl(value="Displayed to members of a defender clan when a challenge for one of their holdings starts, to inform them of the protective status of the holding walls")
    public static final lox ucE = ucC.a("HoldingWallsInitialNotification", map.Bh("WallsStandingCount"), map.Bp("HoldingName"), map.Bh("NumberOfWallsProtectingHoldingCount"), map.b("HoldingType", ayb.class));
    @lok(value="$(AttackerName) has joined the challenge for control over $(HoldingName)!")
    @lpl(value="Displayed to members of a defender clan when a new attacker joins the active challenge")
    public static final lox ucF = ucC.a("AttackerJoined", map.Bk("AttackerName"), map.Bp("HoldingName"));
    @lok(value="$(AttackerName) has placed a $(SiegeStoneResource.NameSingular) around $(HoldingName)!")
    @lpl(value="Displayed to members of a defender clan when an attacker clan places a siege-stone")
    public static final lox ucG = ucC.a("AttackerSiegeStonePlaced", map.Bk("AttackerName"), map.Bl("SiegeStoneResource"), map.Bp("HoldingName"));
    @lok(value="$(AttackerName) has placed a $(SiegeStoneResource.NameSingular) around $(HoldingName)!... The siege-stone is vulnerable to attack immediately!")
    @lpl(value="Displayed to members of a defender clan when an attacker clan places a siege-stone, and it is immediately vulnerable to attack")
    public static final lox ucH = ucC.a("AttackerSiegeStonePlacedVulnerable", map.Bk("AttackerName"), map.Bl("SiegeStoneResource"), map.Bp("HoldingName"));
    @lok(value="$(AttackerName) has placed a total of $(PlacedSiegeStonesCount) siege-stones around $(HoldingName), and can place no more... Find them and destroy them!")
    @lpl(value="Displayed to members of a defender clan when the siege-stone placement phase for an attacker has ended")
    public static final lox ucI = ucC.a("AttackerSiegeStonePlacementPhaseEnded", map.Bk("AttackerName"), map.Bh("PlacedSiegeStonesCount"), map.Bp("HoldingName"));
    @lok(value="The holdings owned by $(AttackerName) are now vulnerable to attack!... Attack them!")
    @lpl(value="Displayed to members if a defender clan when an attacker's holdings become vulnerable to attack")
    @lpk(value="osmsg_vulnerable_bindstone_01", exQ=10.0)
    public static final lox ucJ = ucC.a("AttackerHoldingsVulnerable", map.Bk("AttackerName"), map.Bh("HoldingsCount"));
    @lok(value="The holdings owned by $(AttackerName) are now vulnerable to attack!... Attack them!")
    @lpl(value="Displayed to members if a defender clan when an attacker's holdings become vulnerable to attack")
    public static final lox ucK = ucC.a("AttackerHoldingsVulnerableNoSFX", map.Bk("AttackerName"), map.Bh("HoldingsCount"));
    @lok(value="The $(SiegeStonesCount) siege-stones placed by $(AttackerName), in the challenge for $(HoldingName), are now vulnerable to attack!... Find them and destroy them!")
    @lpl(value="Displayed to members of a defender clan when an attacker's siege-stones become vulnerable to attack")
    @lpk(value="osmsg_vulnerable_siegestone_01", exQ=10.0)
    public static final lox ucL = ucC.a("AttackerSiegeStonesVulnerable", map.Bh("SiegeStonesCount"), map.Bk("AttackerName"), map.Bp("HoldingName"));
    @lok(value="$(AttackerName) lost a siege-stone that they placed around $(HoldingName)... $(RemainingSiegeStonesCount) siege-stones remain standing in the challenge!")
    @lpl(value="Displayed to members of a defender clan when a siege-stone placed by an attacker is destroyed")
    public static final lox ucM = ucC.a("AttackerSiegeStoneDestroyed", map.Bk("AttackerName"), map.Bp("HoldingName"), map.Bh("RemainingSiegeStonesCount"));
    @lok(value="$(HoldingName) is now vulnerable to attack!... Defend your $(HoldingType)!")
    @lpl(value="Displayed to members of a defender clan when a challenged holding becomes vulnerable to attack")
    @lpk(value="osmsg_vulnerable_bindstone_01")
    public static final lox ucN = ucC.a("ChallengedHoldingVulnerable", map.Bp("HoldingName"), map.b("HoldingType", ayb.class));
    @lok(value="$(HoldingName) can now be vulnerable to attack!... Only $(WallsProtectingHoldingCount) walls are protecting the $(HoldingType) from attack!")
    @lpl(value="Displayed to members of a defender clan when a challenged holding becomes vulnerable to attack, but is being protected by standing walls")
    @lpk(value="osmsg_vulnerable_bindstone_01")
    public static final lox ucO = ucC.a("ChallengedHoldingVulnerableWallsProtecting", map.Bp("HoldingName"), map.Bh("WallsProtectingHoldingCount"), map.b("HoldingType", ayb.class));
    @lok(value="For destroying a siege-stone placed by $(AttackerName), in the challenge for $(HoldingName), you have receieved $(RewardAmount) $(RewardResource.Name$(RewardAmount.Plurality)), from their wager of $(WagerAmount) $(WagerResource.Name$(WagerAmount.Plurality)), the rest has gone to the wager-pot... win the challenge to receive it all!")
    @lpl(value="Displayed to members of a defender clan when they receive a reward for destroying an attacker's siege-stone")
    public static final lox ucP = ucC.a("WagerCutReceivedForSiegeStoneDestruction", map.Bk("AttackerName"), map.Bp("HoldingName"), map.Bh("RewardAmount"), map.Bl("RewardResource"), map.Bh("WagerAmount"), map.Bl("WagerResource"));
    @lok(value="$(AttackerName) has been removed from the challenge for $(HoldingName), as they failed place the required number of siege-stones!")
    @lpl(value="Displayed to members of a defender clan when an attacker leaves an active challenge because they failed to place enough siege-stones in time")
    public static final lox ucQ = ucC.a("AttackerLeftChallengeNotEnoughSiegeStonesPlaced", map.Bk("AttackerName"), map.Bp("HoldingName"));
    @lok(value="$(AttackerName) has been removed from the challenge for $(HoldingName), as their clan has disbanded!")
    @lpl(value="Displayed to members of a defender clan when an attacker leaves an active challenge because their clan was disbanded")
    public static final lox ucR = ucC.a("AttackerLeftChallengeClanDisbanded", map.Bk("AttackerName"), map.Bp("HoldingName"));
    @lok(value="$(AttackerName) has been removed from the challenge for $(HoldingName), because of the successful negotiation of a peace treaty between your two clans!")
    @lpl(value="Displayed to members of a defender clan when an attacker leaves an active challenge because a peace treaty has been negotiated")
    @lpk(value="se_clan_conquest_peace")
    public static final lox ucS = ucC.a("AttackerLeftChallengePeaceTreatyNegotiated", map.Bk("AttackerName"), map.Bp("HoldingName"));
    @lok(value="$(AttackerName) has been removed from the challenge for $(HoldingName), as they have lost all their holdings!")
    @lpl(value="Displayed to members of a defender clan when an attacker leaves an active challenge because they lost all their holdings")
    public static final lox ucT = ucC.a("AttackerLeftChallengeNoHoldingsRemaining", map.Bk("AttackerName"), map.Bp("HoldingName"));
    @lok(value="$(AttackerName) has been removed from the challenge for $(HoldingName), as all their siege-stones have been destroyed!")
    @lpl(value="Displayed to members of a defender clan when an attacker leaves an active challenge because they lost all their siege-stones")
    public static final lox ucU = ucC.a("AttackerLeftChallengeNoSiegeStonesRemaining", map.Bk("AttackerName"), map.Bp("HoldingName"));
    @lok(value="$(AttackerName) is no longer challenging for $(HoldingName), due to administrator abort!")
    @lpl(value="Displayed to members of a defender clan when an attacker leaves an active challenge because an administrator aborted their challenge")
    public static final lox ucV = ucC.a("AttackerLeftChallengeAbortedByAdmins", map.Bk("AttackerName"), map.Bp("HoldingName"));
    @lok(value="$(AttackerName) has been removed from the challenge for $(HoldingName), as all their clan size dropped below the required number!")
    @lpl(value="Displayed to members of a defender clan when an attacker leaves an active challenge because the size of their clan dropped below the minimum allowed members")
    public static final lox ucW = ucC.a("AttackerLeftChallengeClanSizeDroppedBelowLimit", map.Bk("AttackerName"), map.Bp("HoldingName"));
    @lok(value="You win the challenge for $(HoldingName), all attackers have lost, therefore victory, the $(HoldingType) and the $(WagerRewardAmount) $(WagerRewardResource.Name$(WagerRewardAmount.Plurality)) is yours!")
    @lpl(value="Displayed to members of a defender clan when they win a challenge because all attackers were removed from the challenge")
    @lpk(value="osmsg_victory_01")
    public static final lox ucX = ucC.a("ChallengeWonAllAttackersRemoved", map.Bp("HoldingName"), map.b("HoldingType", ayb.class), map.Bh("WagerRewardAmount"), map.Bl("WagerRewardResource"));
    @lok(value="You successfully defended $(HoldingName) throughout the challenge, therefore victory, the $(HoldingType) and the $(WagerRewardAmount) $(WagerRewardResource.Name$(WagerRewardAmount.Plurality)), is yours!")
    @lpl(value="Displayed to members of a defender clan when they win a challenge because the challenge timed out")
    @lpk(value="osmsg_victory_01")
    public static final lox ucY = ucC.a("ChallengeWonChallengeTimedOut", map.Bp("HoldingName"), map.b("HoldingType", ayb.class), map.Bh("WagerRewardAmount"), map.Bl("WagerRewardResource"));
    @lok(value="You have gathered enough power-points to win the challenge for $(HoldingName), therefore victory, the $(HoldingType) and the $(WagerRewardAmount) $(WagerRewardResource.Name$(WagerRewardAmount.Plurality)), is yours!")
    @lpl(value="Displayed to members of a defender clan when they win a challenge because they gathered the required amount of power points")
    @lpk(value="osmsg_victory_01")
    public static final lox ucZ = ucC.a("ChallengeWonEnoughPowerPointsGathered", map.Bp("HoldingName"), map.b("HoldingType", ayb.class), map.Bh("WagerRewardAmount"), map.Bl("WagerRewardResource"));
    @lok(value="All attackers have been removed, in the challenge for $(HoldingName)... However the challenge will remain active for the next $(CountDown), if no further attackers join the challenge before then you will be declared the winner!")
    @lpl(value="Displayed to members of a defender clan when all attackers have been removed from a challenge, but the current phase must time out before they will be declared the winner")
    public static final lox uda = ucC.a("ChallengeWonAllAttackersRemovedWaitingForPhaseToTimeOut", map.Bp("HoldingName"), map.Bi("CountDown"));
    @lok(value="You have lost the challenge for $(HoldingName), $(WinnerName) have been declared the winners!")
    @lpl(value="Displayed to members of a defender clan when they lose an active challenge")
    @lpk(value="osmsg_defeat_01")
    public static final lox udb = ucC.a("ChallengeLost", map.Bp("HoldingName"), map.Bk("WinnerName"));
    @lok(value="The challenge for $(HoldingName) has ended, time has run out and a draw has been declared, the $(HoldingType) is still yours!")
    @lpl(value="Displayed to members of a defender clan when an active challenge ends in a draw")
    @lpk(value="se_clan_conquest_draw")
    public static final lox ucc = ucC.a("ChallengeDraw", map.Bp("HoldingName"), map.b("HoldingType", ayb.class));

    protected map(String string) {
        super("Defender." + string);
    }

    private map() {
        super("Defender");
    }
}

