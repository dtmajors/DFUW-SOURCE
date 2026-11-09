/*
 * Decompiled with CFR.
 */
public class mdi
extends mdh {
    private static final mdi uIw = new mdi();
    @lok(value="Undefined")
    @lpl(value="Name of the quest category 'Undefined'")
    public static final lox uIx = uIw.BC("Undefined");
    @lok(value="Training")
    @lpl(value="Name of the quest category 'TrainingQuest'")
    public static final lox uIy = uIw.BC("TrainingQuest");
    @lok(value="Side-Quests")
    @lpl(value="Name of the quest category 'SideQuest'")
    public static final lox uIz = uIw.BC("SideQuest");
    @lok(value="Rumours")
    @lpl(value="Name of the quest category 'RumorQuest'")
    public static final lox uIA = uIw.BC("RumorQuest");
    @lok(value="Lore")
    @lpl(value="Name of the quest category 'LoreQuest'")
    public static final lox uIB = uIw.BC("LoreQuest");
    @lok(value="Testing")
    @lpl(value="Name of the quest category 'TestQuest'")
    public static final lox uIC = uIw.BC("TestQuest");

    public mdi() {
        super("Categories");
    }

    public mdi(String string) {
        super("Categories." + string);
    }
}

