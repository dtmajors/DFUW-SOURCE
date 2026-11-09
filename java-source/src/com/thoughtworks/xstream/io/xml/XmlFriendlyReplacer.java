/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml;

public class XmlFriendlyReplacer {
    private String dollarReplacement;
    private String underscoreReplacement;

    public XmlFriendlyReplacer() {
        this("_-", "__");
    }

    public XmlFriendlyReplacer(String dollarReplacement, String underscoreReplacement) {
        this.dollarReplacement = dollarReplacement;
        this.underscoreReplacement = underscoreReplacement;
    }

    public String escapeName(String name) {
        StringBuffer result = new StringBuffer();
        int length = name.length();
        for (int i = 0; i < length; ++i) {
            char c2 = name.charAt(i);
            if (c2 == '$') {
                result.append(this.dollarReplacement);
                continue;
            }
            if (c2 == '_') {
                result.append(this.underscoreReplacement);
                continue;
            }
            result.append(c2);
        }
        return result.toString();
    }

    public String unescapeName(String name) {
        StringBuffer result = new StringBuffer();
        int length = name.length();
        for (int i = 0; i < length; ++i) {
            char c2 = name.charAt(i);
            if (this.stringFoundAt(name, i, this.underscoreReplacement)) {
                i += this.underscoreReplacement.length() - 1;
                result.append('_');
                continue;
            }
            if (this.stringFoundAt(name, i, this.dollarReplacement)) {
                i += this.dollarReplacement.length() - 1;
                result.append('$');
                continue;
            }
            result.append(c2);
        }
        return result.toString();
    }

    private boolean stringFoundAt(String name, int i, String replacement) {
        return name.length() >= i + replacement.length() && name.substring(i, i + replacement.length()).equals(replacement);
    }
}

