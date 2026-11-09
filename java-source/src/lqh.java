/*
 * Decompiled with CFR.
 */
public class lqh
extends lqd {
    private static final lqh scG = new lqh();
    @lok(value="Command to reset the state of a complete, or in-progress, quest... [int:QuestID] Identifier of the quest to reset")
    @lol(value="Developer command help text")
    public static final lox scH = scG.BC("HelpResetQuest");
    @lok(value="Command to force the progression of an in-progress quest... [int:QuestID] Identifier of the quest to progress")
    @lol(value="Developer command help text")
    public static final lox scI = scG.BC("HelpProgressQuest");
    @lok(value="No Quest Found With ID $(QuestID)")
    @lol(value="Console Error Message When Entered Quest ID is Invalid!")
    public static final lox scJ = scG.a("QuestNotFound", lqh.Bh("QuestID"));
    @lok(value="Reset of progress for quest $(QuestID) requested")
    @lol(value="Console Output for Reset Quest Progress Requested")
    public static final lox scK = scG.a("QuestResetRequested", lqh.Bh("QuestID"));
    @lok(value="Forced progress for quest $(QuestID) requested")
    @lol(value="Console Output for Progress Quest Progress Requested")
    public static final lox scL = scG.a("QuestProgressRequested", lqh.Bh("QuestID"));

    private lqh() {
        super("Quests");
    }

    protected lqh(String string) {
        super("Quests." + string);
    }
}

