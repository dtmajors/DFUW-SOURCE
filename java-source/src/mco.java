/*
 * Decompiled with CFR.
 */
public class mco
extends lzh {
    private static final mco uwI = new mco();
    @lok(value="Quest Available: $(Quest.Name)")
    @lpl(value="Notification to inform the player that a new quest is available to them")
    public static final lox uwJ = uwI.a("QuestUnlocked", mco.Bw("Quest"));
    @lok(value="Quest Progressed: $(Quest.Name)")
    @lpl(value="Notification to inform the player that a quest has progressed")
    public static final lox tyh = uwI.a("QuestProgressed", mco.Bw("Quest"));
    @lok(value="Quest Completed: $(Quest.Name)")
    @lpl(value="Notification to inform the player that a quest has been completed")
    public static final lox tyd = uwI.a("QuestCompleted", mco.Bw("Quest"));

    protected mco(String string) {
        super("Quests." + string);
    }

    private mco() {
        super("Quests");
    }
}

