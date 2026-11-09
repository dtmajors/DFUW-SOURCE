/*
 * Decompiled with CFR.
 */
public class lya
extends lvn {
    private static final lya tCo = new lya();
    @lok(value="$(Skill.NameSingular)")
    @lpl(value="Displayed to the player the name of a skill in the GUI.")
    public static final lox tCp = tCo.a("SkillName", lya.Bm("Skill"));
    @lok(value="$(Skill.Description)")
    @lpl(value="Displayed to the player the skill description in the GUI.")
    public static final lox tCq = tCo.a("SkillDescription", lya.Bm("Skill"));
    @lok(value="SkillLevel")
    @lpl(value="Display skill's level.")
    public static final lox tCr = tCo.BC("SkillLevel");
    @lok(value="$(ResourceName.NameSingular)")
    @lpl(value="Display needed reagents in order to cast the specific spell.")
    public static final lox tCs = tCo.a("SpellConstraint", lya.Bl("ResourceName"));
    @lok(value="LEVEL UP")
    @lpl(value="Title text for skill and attribute level up window.Has to be uppercase.")
    public static final lox tCt = tCo.BC("LevelUpTitle");
    @lok(value="Level")
    @lpl(value="Header in the level up window for the current skill level.")
    public static final lox tCu = tCo.BC("LevelUpLevelHeader");
    @lok(value="Level Up Improves")
    @lpl(value="Header in the level up window for the Improvements section.")
    public static final lox tCv = tCo.BC("LevelUpImprovesHeader");
    @lok(value="Cost")
    @lpl(value="Header in the level up window for the Costs section.")
    public static final lox tCw = tCo.BC("LevelUpCostHeader");
    @lok(value="Total Cost")
    @lpl(value="Label in the level up window in the Costs section for the total cost of the level up.")
    public static final lox tCx = tCo.BC("LevelUpTotalCost");
    @lok(value="Remaining")
    @lpl(value="Label in the level up window in the Costs section for the remaining prowess points after the level up .")
    public static final lox tCy = tCo.BC("LevelUpRemaining");
    @lok(value="Magnitude")
    @lpl(value="Text that describes what will improve when the player levels up a skill.")
    public static final lox tCz = tCo.BC("ImprovesMagnitude");
    @lok(value="Duration")
    @lpl(value="Text that describes what will improve when the player levels up a skill.")
    public static final lox tCA = tCo.BC("ImprovesDuration");
    @lok(value="Mana Consumption")
    @lpl(value="Text that describes what will improve when the player levels up a skill.")
    public static final lox tCB = tCo.BC("ImprovesMana");
    @lok(value="Stamina Consumption")
    @lpl(value="Text that describes what will improve when the player levels up a skill.")
    public static final lox tCC = tCo.BC("ImprovesStamina");
    @lok(value="Cooldown Time")
    @lpl(value="Text that describes what will improve when the player levels up a skill.")
    public static final lox tCD = tCo.BC("ImprovesCooldown");
    @lok(value="Casting Time")
    @lpl(value="Text that describes what will improve when the player levels up a skill.")
    public static final lox tCE = tCo.BC("ImprovesCast");
    @lok(value="Area Of Effect")
    @lpl(value="Text that describes what will improve when the player levels up a skill.")
    public static final lox tCF = tCo.BC("ImprovesAOE");
    @lok(value="Speed")
    @lpl(value="Text that describes what will improve when the player levels up a skill.")
    public static final lox tCG = tCo.BC("ImprovesSpeed");
    @lok(value="Success Rate")
    @lpl(value="Text that describes what will improve when the player levels up a skill.")
    public static final lox tCH = tCo.BC("ImprovesSuccess");
    @lok(value="Time")
    @lpl(value="Text that describes what will improve when the player levels up a skill.")
    public static final lox tCI = tCo.BC("ImprovesTime");
    @lok(value="Recipes")
    @lpl(value="Text that describes what will improve when the player levels up a skill.")
    public static final lox tCJ = tCo.BC("ImprovesRecipes");
    @lok(value="Number Of Stacks")
    @lpl(value="Text that describes what will improve when the player levels up a skill.")
    public static final lox tCK = tCo.BC("NumberOfStacks");
    @lok(value="Bonuses for Costs and Cooldown apply for Primary School only.")
    @lpl(value="Note that appears on the level up window for Role School skills.")
    public static final lox tCL = tCo.BC("PrimarySkillsNote");
    @lok(value="Skills")
    @lpl(value="Name of the root view of the skills list")
    public static final lox tCM = tCo.BC("SkillsListTitle");

    protected lya(String string) {
        super("Skills." + string);
    }

    private lya() {
        super("Skills");
    }
}

