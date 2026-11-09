/*
 * Decompiled with CFR.
 */
public class mam
extends mal {
    private static final mam ubK = new mam();
    @lok(value="Your clan has joined the challenge of $(DefenderName), for control over $(HoldingName)... Fighting will begin in $(CountDown)!")
    @lpl(value="Displayed to attacker clan members when their clan joins a conquest challenge in phase-one, before the fighting starts")
    @lpk(value="osmsg_challenge_01")
    public static final lox ubL = ubK.a("ChallengeInitiatedPhaseOne", mam.Bk("DefenderName"), mam.Bp("HoldingName"), mam.Bi("CountDown"));
    @lok(value="Your clan has joined the challenge of $(DefenderName), for control over $(HoldingName)... Fighting has already begun and will end in $(CountDown)!")
    @lpl(value="Displayed to attacker clan members when their clan joins a conquest challenge in phase-two, after the fighting has started")
    @lpk(value="osmsg_challenge_01")
    public static final lox ubM = ubK.a("ChallengeInitiatedPhaseTwo", mam.Bk("DefenderName"), mam.Bp("HoldingName"), mam.Bi("CountDown"));
    @lok(value="Your holdings are now vulnerable to attack!... Defend them!")
    @lpl(value="Displayed to attacker clan members when their holdings become vulnerable to attack")
    @lpk(value="osmsg_vulnerable_bindstone_01")
    public static final lox ubN = ubK.a("HoldingsVulnerable", mam.Bh("HoldingsCount"));
    @lok(value="Your holdings are now vulnerable to attack!... Defend them!")
    @lpl(value="Displayed to attacker clan members when their holdings become vulnerable to attack")
    public static final lox ubO = ubK.a("HoldingsVulnerableNoSFX", mam.Bh("HoldingsCount"));
    @lok(value="$(HoldingName) is now vulnerable to attack!... Destroy the clan-stone to take control of the $(HoldingType)!")
    @lpl(value="Displayed to attacker clan members when the defender's holding becomes vulnerable to attack")
    @lpk(value="osmsg_vulnerable_bindstone_01")
    public static final lox ubP = ubK.a("DefenderHoldingVulnerable", mam.Bp("HoldingName"), mam.b("HoldingType", ayb.class));
    @lok(value="$(HoldingName) can now be vulnerable to attack!... Destroy the remaining $(WallsStanding) walls then destroy the clan-stone!")
    @lpl(value="Displayed to attacker clan members when the defender's would become vulnerable to attack, if the remaining walls protecting it were destroyed")
    @lpk(value="osmsg_vulnerable_bindstone_01")
    public static final lox ubQ = ubK.a("DefenderHoldingVulnerableWallsStillStanding", mam.Bp("HoldingName"), mam.Bh("WallsStanding"));
    @lok(value="Your clan size has dropped below the required number to challenge for $(HoldingName)!... You have $(CountDown) to return to $(SizeLimit) members before you lose the challenge for $(HoldingName)!")
    @lpl(value="Displayed to attacker clan members when the clan's size has dropped below the minimum number of members required to participate in an active challenge")
    public static final lox ubR = ubK.a("ClanSizeDroppedBelowLimit", mam.Bp("HoldingName"), mam.Bi("CountDown"), mam.Bh("SizeLimit"));
    @lok(value="Your clan size has dropped below the required number to challenge for $(HoldingName)!... You have $(CountDown) to return to $(SizeLimit) members before you lose the challenge for $(HoldingName)!")
    @lpl(value="Displayed to attacker clan members when the clan's size has dropped below the minimum number of members required to participate in an active challenge")
    public static final lox ubS = ubK.a("ClanSizeDroppedBelowLimitNoTrialMembers", mam.Bp("HoldingName"), mam.Bi("CountDown"), mam.Bh("SizeLimit"));
    @lok(value="Your clan size has returned to the required number to continue in the challenge for $(HoldingName)!")
    @lpl(value="Displayed to attacker clan members when the clan's size has returned to the required minimum size to continue in an active challenge")
    public static final lox ubT = ubK.a("ClanSizeReturnedToMinimumSize", mam.Bp("HoldingName"));
    @lok(value="You have lost the challenge for $(HoldingName), because you have lost all your holdings!")
    @lol(value="Not in use by the current conquest configuration, but had to be included to allow compile to succeed... and because it may be re-enabled in the future")
    @lpk(value="osmsg_defeat_01")
    public static final lox ubU = ubK.a("ChallengeLostNoHoldingsRemaining", mam.Bp("HoldingName"));
    @lok(value="You have lost the challenge for $(HoldingName), because all your siege-stones have been destroyed!")
    @lpl(value="Displayed to attacker clan members when they lose a conquest challenge because they lost their siege-stones")
    @lpk(value="osmsg_defeat_01")
    public static final lox ubV = ubK.a("ChallengeLostNoSiegeStonesRemaining", mam.Bp("HoldingName"));
    @lok(value="You have lost the challenge for $(HoldingName), because you failed to place enough siege-stones in time!")
    @lpl(value="Displayed to attacker clan members when they lose a conquest challenge because they failed to place enough siege-stones in time")
    @lpk(value="osmsg_defeat_01")
    public static final lox ubW = ubK.a("ChallengeLostNotEnoughSiegeStonesPlaced", mam.Bp("HoldingName"));
    @lok(value="You lost the challenge for $(HoldingName), time has run out, therefore $(DefenderName) has won the challenge and retained their $(HoldingType)!")
    @lpl(value="Displayed to attacker clan members when they lose a conquest challenge because time ran out")
    @lpk(value="osmsg_defeat_01")
    public static final lox ubX = ubK.a("ChallengeLostTimeUp", mam.Bp("HoldingName"), mam.Bk("DefenderName"), mam.b("HoldingType", ayb.class));
    @lok(value="$(DefenderName) has gathered enough power-points to win the challenge for $(HoldingName), the $(HoldingType) remains theirs!")
    @lol(value="Not in use by the current conquest configuration, but had to be included to allow compile to succeed... and because it may be re-enabled in the future")
    @lpk(value="osmsg_defeat_01")
    public static final lox ubY = ubK.a("ChallengeLostDefenderGatheredEnoughPowerPoints", mam.Bk("DefenderName"), mam.Bp("HoldingName"), mam.b("HoldingType", ayb.class));
    @lok(value="You have lost the challenge for $(HoldingName), because your clan size dropped below the required number!")
    @lpl(value="Displayed to attacker clan members when they lose a conquest challenge because their clan size dropped below the minimum size for too long")
    @lpk(value="osmsg_defeat_01")
    public static final lox ubZ = ubK.a("ChallengeLostClanSizeDroppedBelowLimitForTooLong", mam.Bp("HoldingName"));
    @lok(value="You have won the challenge for $(HoldingName), you receive $(WagerRewardQuantity) $(WagerRewardResource.Name$(WagerRewardQuantity.Plurality)), and the $(HoldingType) is now yours!")
    @lpl(value="Displayed to attacker clan members when they win a conquest challenge, and also take ownership of the holding")
    @lpk(value="osmsg_victory_01")
    public static final lox uca = ubK.a("ChallengeWonHoldingWon", mam.Bp("HoldingName"), mam.Bh("WagerRewardQuantity"), mam.Bl("WagerRewardResource"), mam.b("HoldingType", ayb.class));
    @lok(value="You have won the challenge for $(HoldingName), you receive $(WagerRewardQuantity) $(WagerRewardResource.Name$(WagerRewardQuantity.Plurality)), but you did not win the $(HoldingType)!")
    @lpl(value="Displayed to attacker clan members when they win a conquest challenge, but do not take ownership of the holding")
    @lpk(value="osmsg_victory_01")
    public static final lox ucb = ubK.a("ChallengeWonHoldingNotWon", mam.Bp("HoldingName"), mam.Bh("WagerRewardQuantity"), mam.Bl("WagerRewardResource"), mam.b("HoldingType", ayb.class));
    @lok(value="The challenge for $(HoldingName) has ended, time has run out, and a draw has been declared!")
    @lpl(value="Displayed to attacker clan members when a conquest challenge ends in a draw")
    @lpk(value="se_clan_conquest_draw")
    public static final lox ucc = ubK.a("ChallengeDraw", mam.Bp("HoldingName"));
    @lok(value="The challenge between you and $(DefenderName), for $(HoldingName), has ended, due to the successful negotiation of a peace treaty!")
    @lpl(value="Displayed to attacker clan members when a conquest challenge ends due to a peace treaty being negotiated with the defender clan")
    @lpk(value="se_clan_conquest_peace")
    public static final lox ucd = ubK.a("PeaceTreatyNegotiated", mam.Bk("DefenderName"), mam.Bp("HoldingName"));

    protected mam(String string) {
        super("Attacker." + string);
    }

    private mam() {
        super("Attacker");
    }
}

