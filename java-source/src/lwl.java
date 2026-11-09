/*
 * Decompiled with CFR.
 */
public class lwl
extends lvn {
    private static final lwl teA = new lwl();
    @lok(value="Clan Perks")
    @lpl(value="Clan Perks window title")
    public static final lox sXP = teA.BC("WindowTitle");
    @lok(value="Cost")
    @lpl(value="Cost label for each perk")
    public static final lox teB = teA.BC("LabelPerkCost");
    @lok(value="Total Cost")
    @lpl(value="Cost label for all the selected perks")
    public static final lox teC = teA.BC("LabelTotalCost");
    @lok(value="$(HourCount)H")
    @lpl(value="Duration of perk in Hours")
    public static final lox teD = teA.a("PerkDurationHours", lwl.Bh("HourCount"));
    @lok(value="Holding")
    @lpl(value="Holding Label")
    public static final lox teE = teA.BC("LabelHolding");
    @lok(value="Perk")
    @lpl(value="Perk Label")
    public static final lox teF = teA.BC("LabelPerk");
    @lok(value="Expires In")
    @lpl(value="Expires In Label")
    public static final lox teG = teA.BC("LabelExpiresIn");
    @lok(value="Duration")
    @lpl(value="Duration Label")
    public static final lox teH = teA.BC("LabelDuration");
    @lok(value="$(Value) Max Health")
    @lpl(value="Text for attribute Health for Perk 1 tooltip")
    public static final lox teI = teA.a("Perk1_Health", lwl.Bk("Value"));
    @lok(value="$(Value) Max Mana")
    @lpl(value="Text for attribute Mana for Perk 1 tooltip")
    public static final lox teJ = teA.a("Perk1_Mana", lwl.Bk("Value"));
    @lok(value="$(Value) Damage Multiplier On Performing Back Side Critical Hit")
    @lpl(value="Text for Critical Damange Multiplier for Perk 2 tooltip")
    public static final lox teK = teA.a("Perk2_CriticalDamageMultiplier", lwl.Bk("Value"));
    @lok(value="$(Value) Damage Reduction On Accepting Back Side Critical Hit")
    @lpl(value="Text for Critical Damange Multiplier for Perk 3 tooltip")
    public static final lox teL = teA.a("Perk3_CriticalDamageMultiplier", lwl.Bk("Value"));
    @lok(value="$(Value) Metal Armor Density")
    @lpl(value="Text for Density for Perk 4 tooltip")
    public static final lox teM = teA.a("Perk4_Density", lwl.Bk("Value"));
    @lok(value="$(Value) Increased Fury For An Elementalist Robe Set")
    @lpl(value="Text for increased Fury for Perk 5 tooltip")
    public static final lox teN = teA.a("Perk5_Fury", lwl.Bk("Value"));
    @lok(value="$(Value) Increased Velocity For A Leather Armor Set")
    @lpl(value="Text for increased velocity for Perk 6 tooltip")
    public static final lox teO = teA.a("Perk6_Velocity", lwl.Bk("Value"));
    @lok(value="$(Value) Increased Vitality For A Primalist Robe Set")
    @lpl(value="Text for increased vitality for Perk 7 tooltip")
    public static final lox teP = teA.a("Perk7_Vitality", lwl.Bk("Value"));
    @lok(value="$(Value) Bow Damage")
    @lpl(value="Text for increased bow damage for Perk 8 tooltip")
    public static final lox teQ = teA.a("Perk8_BowDamage", lwl.Bk("Value"));
    @lok(value="$(Value) Melee Damage")
    @lpl(value="Text for increased melee damage for Perk 9 tooltip")
    public static final lox teR = teA.a("Perk9_MeleeDamage", lwl.Bk("Value"));
    @lok(value="$(Value) Staff Damage")
    @lpl(value="Text for increased staff damage for Perk 10 tooltip")
    public static final lox teS = teA.a("Perk10_StaffDamage", lwl.Bk("Value"));
    @lok(value="$(Value) Mount Speed")
    @lpl(value="Text for increased mount speed for Perk 11 tooltip")
    public static final lox teT = teA.a("Perk11_MountSpeed", lwl.Bk("Value"));
    @lok(value="$(Value) Master Ship Acceleration")
    @lpl(value="Text for increased master ship acceleration for Perk 12 tooltip")
    public static final lox teU = teA.a("Perk12_Acceleration", lwl.Bk("Value"));
    @lok(value="$(Value) Master Ship Top Speed")
    @lpl(value="Text for increased master ship top speed for Perk 12 tooltip")
    public static final lox teV = teA.a("Perk12_TopSpeed", lwl.Bk("Value"));
    @lok(value="$(Value) Master Ship Turn Speed")
    @lpl(value="Text for increased master ship turn speed for Perk 12 tooltip")
    public static final lox teW = teA.a("Perk12_TurnSpeed", lwl.Bk("Value"));
    @lok(value="$(Value) Parry Defense For Two-Handed Weapons")
    @lpl(value="Text for increased parry defense for two handed melee weapons for Perk 13 tooltip")
    public static final lox teX = teA.a("Perk13_ParryDefense", lwl.Bk("Value"));
    @lok(value="$(Value) Max Carrying Weight")
    @lpl(value="Text for increased max currying weight for Perk 14 tooltip")
    public static final lox teY = teA.a("Perk14_MaxCarryingWeight", lwl.Bk("Value"));
    @lok(value="$(Value) Impact Damage On All Targets Except Monsters And Players")
    @lpl(value="Text for increased impact damage (except for living creatures and players) for Perk 15 tooltip")
    public static final lox teZ = teA.a("Perk15_ImpactDamage", lwl.Bk("Value"));
    @lok(value="$(Value) Health Regeneration While Out Of Combat")
    @lpl(value="Text for increased health regeneration while out of combat for Perk 16 tooltip")
    public static final lox tfa = teA.a("Perk16_Health", lwl.Bk("Value"));
    @lok(value="$(Value) Mana Regeneration While Out Of Combat")
    @lpl(value="Text for increased mana regeneration while out of combat for Perk 16 tooltip")
    public static final lox tfb = teA.a("Perk16_Mana", lwl.Bk("Value"));
    @lok(value="Cost: $(Value) Dominion / Hour")
    @lpl(value="Perk cost text")
    public static final lox tfc = teA.a("PerkCostPerHour", lwl.Bh("Value"));
    @lok(value="Perk Expiration Countdown")
    @lpl(value="Tooltip text for expiration countdown.")
    public static final lox tfd = teA.BC("TooltipExpirationCountdown");
    @lok(value="Perk Duration")
    @lpl(value="Tooltip text for duration button.")
    public static final lox tfe = teA.BC("TooltipDurationButton");
    @lok(value="Select Perk For Activation")
    @lpl(value="Tooltip text for selection button.")
    public static final lox tff = teA.BC("TooltipSelectionButton");
    @lok(value="Perk Activation Cost In Dominion")
    @lpl(value="Tooltip text for activation cost.")
    public static final lox tfg = teA.BC("TooltipActivationCost");
    @lok(value="Total Perk Activation Cost In Dominion")
    @lpl(value="Tooltip text for total activation cost.")
    public static final lox tfh = teA.BC("TooltipTotalActivationCost");
    @lok(value="Activate Selected Perks")
    @lpl(value="Tooltip text for the activation button.")
    public static final lox tfi = teA.BC("TooltipActivationButton");

    protected lwl() {
        super("ClanPerksWindow");
    }
}

