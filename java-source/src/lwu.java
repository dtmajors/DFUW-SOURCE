/*
 * Decompiled with CFR.
 */
public class lwu
extends lvn {
    private static final lwu thZ = new lwu();
    @lok(value="Duel")
    @lpl(value="Duel window title.")
    public static final lox tia = thZ.BC("Duel");
    @lok(value="Duel Spectator")
    @lpl(value="Duel spectator window title.")
    public static final lox tib = thZ.BC("Duel Spectator");
    @lok(value="Challenger")
    @lpl(value="Challenger label in duel window.")
    public static final lox tic = thZ.BC("Challenger");
    @lok(value="Challengee")
    @lpl(value="Challengee label in duel window.")
    public static final lox tid = thZ.BC("Challengee");
    @lok(value="Prowess")
    @lpl(value="Prowess label in duel window.")
    public static final lox tie = thZ.BC("Prowess");
    @lok(value="Wager")
    @lpl(value="Wager label in duel window.")
    public static final lox tif = thZ.BC("Wager");
    @lok(value="Bank Gold")
    @lpl(value="Bank Gold label in duel window.")
    public static final lox tig = thZ.BC("BankGold");

    protected lwu(String string) {
        super("Duel." + string);
    }

    protected lwu() {
        super("Duel");
    }
}

