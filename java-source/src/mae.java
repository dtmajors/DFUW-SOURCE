/*
 * Decompiled with CFR.
 */
public class mae
extends mab {
    private static final mae uaY = new mae();
    @lok(value="Transaction Failed")
    @lpl(value="Displayed to indicate that the requested transaction was not performed, due to a generic and unspecified error")
    public static final lox uaZ = uaY.BC("TransactionFailed");
    @lok(value="Not Enough Prowess Available")
    @lpl(value="Displayed to indicate that the requested transaction was not performed, as it would have left the character in deficit")
    public static final lox uba = uaY.BC("NotEnoughPointsAvailable");
    @lok(value="Transaction Successful")
    @lpl(value="Displayed to indicate that the requested transaction was successfully performed")
    public static final lox ubb = uaY.BC("TransactionSuccessful");

    protected mae(String string) {
        super("PlayerPointsTransactionResults." + string);
    }

    private mae() {
        super("PlayerPointsTransactionResults");
    }
}

