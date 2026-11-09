/*
 * Decompiled with CFR.
 */
public class lys
extends lyk {
    private static final lys tJd = new lys();
    @lok(value="Accept")
    @lpl(value="Tooltip to display for the accept button displayed next to each membership application")
    public static final lox tJe = tJd.BC("AcceptTitle");
    @lok(value="Marks the player's membership application for acceptance")
    @lpl(value="Tooltip to display for the accept button displayed next to each membership application")
    public static final lox tJf = tJd.BC("AcceptDescription");
    @lok(value="Reject")
    @lpl(value="Tooltip to display for the reject button displayed next to each membership application")
    public static final lox tJg = tJd.BC("RejectTitle");
    @lok(value="Marks the player's membership application for rejection")
    @lpl(value="Tooltip to display for the reject button displayed next to each membership application")
    public static final lox tJh = tJd.BC("RejectDescription");

    protected lys(String string) {
        super("Recruits." + string);
    }

    private lys() {
        super("Recruits");
    }
}

