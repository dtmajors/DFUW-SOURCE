/*
 * Decompiled with CFR.
 */
public class mar
extends mal {
    private static final mar udj = new mar();
    @lok(value="Your clan's mercenary contract with $(DefenderName), to aid in the defence of $(HoldingName), has been accepted... Fighting will begin in $(CountDown)!")
    @lpl(value="Displayed to members of a defender-mercenary clan when their contract is activated and they join the challenge")
    @lpk(value="osmsg_challenge_01")
    public static final lox udk = udj.a("ChallengeInitiatedDefence", mar.Bk("DefenderName"), mar.Bp("HoldingName"), mar.Bi("CountDown"));
    @lok(value="Your clan's mercenary contract with $(EmployerName), to aid them in their challenge for control over $(HoldingName), has been accepted... Fighting will begin in $(CountDown)!")
    @lpl(value="Displayed to members of a attacker-mercenary clan when their contract is activated and they join the challenge")
    @lpk(value="osmsg_challenge_01")
    public static final lox udl = udj.a("ChallengeInitiatedAttack", mar.Bk("EmployerName"), mar.Bp("HoldingName"), mar.Bi("CountDown"));
    @lok(value="The $(SiegeStonesCount) siege-stones placed by $(AttackerName), in the challenge for $(HoldingName), are now vulnerable to attack!... Find them and destroy them!")
    @lpl(value="Displayed to members of a defender-mercenary clan when an attacker's siege-stones become vulnerable to attack")
    @lpk(value="osmsg_vulnerable_siegestone_01", exQ=10.0)
    public static final lox ucL = udj.a("AttackerSiegeStonesVulnerable", mar.Bh("SiegeStonesCount"), mar.Bk("AttackerName"), mar.Bp("HoldingName"));
    @lok(value="The $(SiegeStonesCount) siege-stones placed by your clan's employer, $(EmployerName), in the challenge for $(HoldingName), are now vulnerable to attack!... Help to defend them!")
    @lpl(value="Displayed to members of an attacker-mercenary clan when the siege-stones placed by their employer become vulnerable to attack")
    @lpk(value="osmsg_vulnerable_siegestone_01", exQ=10.0)
    public static final lox udm = udj.a("AttackerSiegeStonesVulnerableEmployer", mar.Bh("SiegeStonesCount"), mar.Bk("EmployerName"), mar.Bp("HoldingName"));
    @lok(value="The $(SiegeStonesCount) siege-stones placed by $(AttackerName), in the challenge for $(HoldingName), are now vulnerable to attack!... Find them and destroy them!")
    @lpl(value="Displayed to members of an attacker-mercenary clan when the siege-stones placed by another attacker become vulnerable to attack")
    @lpk(value="osmsg_vulnerable_siegestone_01", exQ=10.0)
    public static final lox udn = udj.a("AttackerSiegeStonesVulnerableNotEmployer", mar.Bh("SiegeStonesCount"), mar.Bk("AttackerName"), mar.Bp("HoldingName"));
    @lok(value="$(HoldingName) is now vulnerable to attack!... Help to defend the $(HoldingType)!")
    @lpl(value="Displayed to members of a defender-mercenary clan when a challenged holding becomes vulnerable to attack")
    @lpk(value="osmsg_vulnerable_bindstone_01")
    public static final lox udo = udj.a("ChallengedHoldingVulnerableDefence", mar.Bp("HoldingName"), mar.b("HoldingType", ayb.class));
    @lok(value="$(HoldingName) is now vulnerable to attack!... Help to take over the $(HoldingType)!")
    @lpl(value="Displayed to members of an attacker-mercenary clan when a challenged holding becomes vulnerable to attack")
    @lpk(value="osmsg_vulnerable_bindstone_01")
    public static final lox udp = udj.a("ChallengedHoldingVulnerableAttack", mar.Bp("HoldingName"), mar.b("HoldingType", ayb.class));
    @lok(value="$(HoldingName) can now be vulnerable to attack!... Only $(WallsProtectingHoldingCount) walls are protecting the $(HoldingType) from attack!")
    @lpl(value="Displayed to members of a mercenary clan when a challenged holding becomes vulnerable to attack, but is being protected by standing walls")
    @lpk(value="osmsg_vulnerable_bindstone_01")
    public static final lox ucO = udj.a("ChallengedHoldingVulnerableWallsProtectingDefence", mar.Bp("HoldingName"), mar.Bh("WallsProtectingHoldingCount"), mar.b("HoldingType", ayb.class));
    @lok(value="You successfully aided $(DefenderName) in their defence of $(HoldingName), you have received $(RewardAmount) $(GoldResource.Name$(RewardAmount.Plurality)) for completing your contract")
    @lpl(value="Displayed to members of a defender-mercenary clan when the challenge ends in success")
    @lpk(value="osmsg_victory_01")
    public static final lox udq = udj.a("ChallengeEndedSuccessfulDefenceNoBond", mar.Bk("DefenderName"), mar.Bp("HoldingName"), mar.Bh("RewardAmount"), mar.Bl("GoldResource"));
    @lok(value="You successfully aided $(DefenderName) in their defence of $(HoldingName), you have received $(RewardAmount) $(GoldResource.Name$(RewardAmount.Plurality)) for completing your contract, along with $(BondAmount) $(GoldResource.Name$(BondAmount.Plurality)) from the bond you paid")
    @lpl(value="Displayed to members of a defender-mercenary clan when the challenge ends in success, and some or all of the contract bond is returned")
    @lpk(value="osmsg_victory_01")
    public static final lox udr = udj.a("ChallengeEndedSuccessfulDefenceBondReturned", mar.Bk("DefenderName"), mar.Bp("HoldingName"), mar.Bh("RewardAmount"), mar.Bl("GoldResource"), mar.Bh("BondAmount"));
    @lok(value="You successfully aided $(EmployerName) in their challenge for control over $(HoldingName), you have received $(RewardAmount) $(GoldResource.Name$(RewardAmount.Plurality)) for completing your contract")
    @lpl(value="Displayed to members of an attacker-mercenary clan when the challenge ends in success")
    @lpk(value="osmsg_victory_01")
    public static final lox uds = udj.a("ChallengeEndedSuccessfulAttackNoBond", mar.Bk("EmployerName"), mar.Bp("HoldingName"), mar.Bh("RewardAmount"), mar.Bl("GoldResource"));
    @lok(value="You successfully aided $(EmployerName) in their challenge for control over $(HoldingName), you have received $(RewardAmount) $(GoldResource.Name$(RewardAmount.Plurality)) for completing your contract, along with $(BondAmount) $(GoldResource.Name$(BondAmount.Plurality)) from the bond you paid")
    @lpl(value="Displayed to members of an attacker-mercenary clan when the challenge ends in success, and some or all of the contract bond is returned")
    @lpk(value="osmsg_victory_01")
    public static final lox udt = udj.a("ChallengeEndedSuccessfulAttackBondReturned", mar.Bk("EmployerName"), mar.Bp("HoldingName"), mar.Bh("RewardAmount"), mar.Bl("GoldResource"), mar.Bh("BondAmount"));
    @lok(value="$(DefenderName) failed in their defence of $(HoldingName), your contract has ended without reward")
    @lpl(value="Displayed to members of a defender-mercenary clan when the challenge ends in failure")
    @lpk(value="osmsg_defeat_01")
    public static final lox udu = udj.a("ChallengeEndedFailedDefenceNoBond", mar.Bk("DefenderName"), mar.Bp("HoldingName"));
    @lok(value="$(DefenderName) failed in their defence of $(HoldingName), your contract has ended without reward, but $(BondAmount) $(GoldResource.Name$(BondAmount.Plurality)) has been returned from the bond you paid")
    @lpl(value="Displayed to members of a defender-mercenary clan when the challenge ends in failure, but some or all of the contract bond is returned")
    @lpk(value="osmsg_defeat_01")
    public static final lox udv = udj.a("ChallengeEndedFailedDefenceBondReturned", mar.Bk("DefenderName"), mar.Bp("HoldingName"), mar.Bh("BondAmount"), mar.Bl("GoldResource"));
    @lok(value="$(EmployerName) failed in their challenge for control over $(HoldingName), your contract has ended without reward")
    @lpl(value="Displayed to members of an attacker-mercenary clan when the challenge ends in failure")
    @lpk(value="osmsg_defeat_01")
    public static final lox udw = udj.a("ChallengeEndedFailedAttackNoBond", mar.Bk("EmployerName"), mar.Bp("HoldingName"));
    @lok(value="$(EmployerName) failed in their challenge for control over $(HoldingName), your contract has ended without reward, but $(BondAmount) $(GoldResource.Name$(BondAmount.Plurality)) has been returned from the bond you paid")
    @lpl(value="Displayed to members of an attacker-mercenary clan when the challenge ends in failure, but some or all of the contract bond is returned")
    @lpk(value="osmsg_defeat_01")
    public static final lox udx = udj.a("ChallengeEndedFailedAttackBondReturned", mar.Bk("EmployerName"), mar.Bp("HoldingName"), mar.Bh("BondAmount"), mar.Bl("GoldResource"));

    protected mar(String string) {
        super("Mercenary." + string);
    }

    private mar() {
        super("Mercenary");
    }
}

