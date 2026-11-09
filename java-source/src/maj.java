/*
 * Decompiled with CFR.
 */
public class maj
extends mai {
    private static final maj ubk = new maj();
    @lok(value="Transaction Failed")
    @lpl(value="Indicates that the requested transaction was not performed, due to a generic and unspecified error")
    public static final lox uaZ = ubk.BC("TransactionFailed");
    @lok(value="Requesting Player Not Clan Member")
    @lpl(value="Indicates that the requested transaction was not performed, as the requesting player is not a member of the clan")
    public static final lox ubl = ubk.BC("RequestingPlayerNotClanMember");
    @lok(value="Requesting Player Permission Denied")
    @lpl(value="Indicates that the requested transaction was not performed, as the requesting player does not have a sufficient access-level to perform the transaction")
    public static final lox ubm = ubk.BC("RequestingPlayerAccessLevelTooLow");
    @lok(value="Invalid Delta For Transaction Type")
    @lpl(value="Indicates that the requested transaction was not performed, as the supplied points delta is not valid for the supplied transaction type")
    public static final lox ubn = ubk.BC("InvalidDeltaForTransactionType");
    @lok(value="Not Enough Points Available")
    @lpl(value="Indicates that the requested transaction was not performed, as it would have left the clan in deficit")
    public static final lox uba = ubk.BC("NotEnoughPointsAvailable");
    @lok(value="Transaction Successful")
    @lpl(value="Indicates that the requested transaction was successfully performed")
    public static final lox ubb = ubk.BC("TransactionSuccessful");

    protected maj(String string) {
        super("ClanPointsTransactionResults." + string);
    }

    private maj() {
        super("ClanPointsTransactionResults");
    }
}

