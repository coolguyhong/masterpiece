package com.pjsconsulting.masterpiece.util;

import java.util.UUID;

public class UuidUtil {

    public static String generateId(String prefix) {
        StringBuffer sb = new StringBuffer();
        sb.append(prefix).append("-").append(UUID.randomUUID().toString().replace("-", ""));
        return sb.substring(0, 35);
    }
}
