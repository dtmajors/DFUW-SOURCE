/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Base64Encoder {
    private static final char[] SIXTY_FOUR_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    private static final int[] REVERSE_MAPPING = new int[123];

    public String encode(byte[] input) {
        StringBuffer result = new StringBuffer();
        int outputCharCount = 0;
        for (int i = 0; i < input.length; i += 3) {
            int remaining = Math.min(3, input.length - i);
            int oneBigNumber = (input[i] & 0xFF) << 16 | (remaining <= 1 ? 0 : input[i + 1] & 0xFF) << 8 | (remaining <= 2 ? 0 : input[i + 2] & 0xFF);
            for (int j = 0; j < 4; ++j) {
                result.append(remaining + 1 > j ? SIXTY_FOUR_CHARS[0x3F & oneBigNumber >> 6 * (3 - j)] : (char)'=');
            }
            if ((outputCharCount += 4) % 76 != 0) continue;
            result.append('\n');
        }
        return result.toString();
    }

    public byte[] decode(String input) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            StringReader in = new StringReader(input);
            for (int i = 0; i < input.length(); i += 4) {
                int[] a2 = new int[]{this.mapCharToInt(in), this.mapCharToInt(in), this.mapCharToInt(in), this.mapCharToInt(in)};
                int oneBigNumber = (a2[0] & 0x3F) << 18 | (a2[1] & 0x3F) << 12 | (a2[2] & 0x3F) << 6 | a2[3] & 0x3F;
                for (int j = 0; j < 3; ++j) {
                    if (a2[j + 1] < 0) continue;
                    out.write(0xFF & oneBigNumber >> 8 * (2 - j));
                }
            }
            return out.toByteArray();
        }
        catch (IOException e) {
            throw new Error(e + ": " + e.getMessage());
        }
    }

    private int mapCharToInt(Reader input) throws IOException {
        int c2;
        while ((c2 = input.read()) != -1) {
            int result = REVERSE_MAPPING[c2];
            if (result != 0) {
                return result - 1;
            }
            if (c2 != 61) continue;
            return -1;
        }
        return -1;
    }

    static {
        for (int i = 0; i < SIXTY_FOUR_CHARS.length; ++i) {
            Base64Encoder.REVERSE_MAPPING[Base64Encoder.SIXTY_FOUR_CHARS[i]] = i + 1;
        }
    }
}

