/*
 * Decompiled with CFR.
 */
public class lze
extends lpa {
    private static final lze tRM = new lze();
    @lok(value="Mendicant")
    @lpl(value="Name of the leader-board rank 'Mendicant'")
    public static final lox tRN = tRM.BC("Mendicant");
    @lok(value="Battler")
    @lpl(value="Name of the leader-board rank 'Battler'")
    public static final lox tRO = tRM.BC("Battler");
    @lok(value="Combatant")
    @lpl(value="Name of the leader-board rank 'Combatant'")
    public static final lox tRP = tRM.BC("Combatant");
    @lok(value="Challenger")
    @lpl(value="Name of the leader-board rank 'Challenger'")
    public static final lox tic = tRM.BC("Challenger");
    @lok(value="Maniac")
    @lpl(value="Name of the leader-board rank 'Maniac'")
    public static final lox tRQ = tRM.BC("Maniac");
    @lok(value="Exterminator")
    @lpl(value="Name of the leader-board rank 'Exterminator'")
    public static final lox tRR = tRM.BC("Exterminator");
    @lok(value="Butcher")
    @lpl(value="Name of the leader-board rank 'Butcher'")
    public static final lox tRS = tRM.BC("Butcher");
    @lok(value="Assassin")
    @lpl(value="Name of the leader-board rank 'Assassin'")
    public static final lox tRT = tRM.BC("Assassin");
    @lok(value="Executioner")
    @lpl(value="Name of the leader-board rank 'Executioner'")
    public static final lox tRU = tRM.BC("Executioner");
    @lok(value="Vanquisher")
    @lpl(value="Name of the leader-board rank 'Vanquisher'")
    public static final lox tRV = tRM.BC("Vanquisher");
    @lok(value="Legend")
    @lpl(value="Name of the leader-board rank 'Legend'")
    public static final lox tRW = tRM.BC("Legend");

    protected lze(String string) {
        super("LeaderBoardRanks." + string);
    }

    private lze() {
        super("LeaderBoardRanks");
    }
}

