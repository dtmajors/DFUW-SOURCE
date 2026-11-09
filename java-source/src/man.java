/*
 * Decompiled with CFR.
 */
public class man
extends mam {
    private static final man uce = new man();
    @lok(value="Siege-stone placement is not allowed, in the challenge for $(HoldingName)!")
    @lpl(value="Displayed to attacker clan members when their clan joins a conquest challenge and siege-stone placement is not allowed")
    public static final lox ucf = uce.a("PlacementNotAllowed", man.Bp("HoldingName"));
    @lok(value="Siege-stone placement is allowed, in the challenge for $(HoldingName)... Siege-stones can be placed for the next $(CountDown)!")
    @lpl(value="Displayed to attacker clan members when their clan joins a conquest challenge and siege-stone placement is allowed")
    public static final lox ucg = uce.a("PlacementPhaseStarted", man.Bp("HoldingName"), man.Bi("CountDown"));
    @lok(value="$(MemberRank) $(MemberName) has just placed a $(SiegeStoneResource.NameSingular)... In the challenge for $(HoldingName)!")
    @lpl(value="Displayed to attacker clan members when a member of the clan places a siege-stone in an active conquest challenge")
    public static final lox uch = uce.a("Placed", man.b("MemberRank", bbs.class), man.Bk("MemberName"), man.Bl("SiegeStoneResource"), man.Bp("HoldingName"));
    @lok(value="$(MemberRank) $(MemberName) has just placed a $(SiegeStoneResource.NameSingular)... In the challenge for $(HoldingName)!... The siege-stone is vulnerable to attack immediately!")
    @lpl(value="Displayed to attacker clan members when a member of the clan places a siege-stone in an active conquest challenge and it is immediately vulnerable to attack")
    public static final lox uci = uce.a("PlacedVulnerable", man.b("MemberRank", bbs.class), man.Bk("MemberName"), man.Bl("SiegeStoneResource"), man.Bp("HoldingName"));
    @lok(value="The maximum number of siege-stones have been placed in the challenge for $(HoldingName)!")
    @lpl(value="Displayed to attacker clan members when they have placed the maximum number of allowed siege-stones in an active conquest challenge")
    public static final lox ucj = uce.a("MaximumNumberPlaced", man.Bp("HoldingName"));
    @lok(value="Siege-stone placement is no longer allowed, in the challenge for $(HoldingName)!")
    @lpl(value="Displayed to attacker clan members when their siege-stone placement phase has ended in an active conquest challenge")
    public static final lox uck = uce.a("PlacementPhaseEnded", man.Bp("HoldingName"));
    @lok(value="The siege-stones your clan placed in the challenge for $(HoldingName) are now vulnerable to attack!... Defend them!")
    @lpl(value="Displayed to attacker clan members when their siege-stones become vulnerable to attack")
    @lpk(value="osmsg_vulnerable_siegestone_01")
    public static final lox ucl = uce.a("Vulnerable", man.Bh("SiegeStonesCount"), man.Bp("HoldingName"));
    @lok(value="You lost a $(SiegeStoneResource.NameSingular), in the challenge for $(HoldingName)... $(RemainingCount) siege-stones remain!")
    @lpl(value="Displayed to attacker clan members when a siege-stone they placed in an active challenge is destroyed")
    public static final lox ucm = uce.a("Destroyed", man.Bl("SiegeStoneResource"), man.Bp("HoldingName"), man.Bh("RemainingCount"));
    @lok(value="Your clan has received $(Amount) $(RewardResource.Name$(Amount.Plurality)) for destroying a siege-stone placed by $(OwnerClanName), in the challenge for $(HoldingName)!")
    @lpl(value="Displayed to attacker clan members when their clan receives a reward for destroying another attacker's siege-stone in an active conquest challenge")
    public static final lox ucn = uce.a("DestructionReward", man.Bh("Amount"), man.Bl("RewardResource"), man.Bk("OwnerClanName"), man.Bp("HoldingName"));

    protected man(String string) {
        super("SiegeStones." + string);
    }

    private man() {
        super("SiegeStones");
    }
}

