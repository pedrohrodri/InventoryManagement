package br.com.pedro.inventorymanagement.core.utils;

import java.util.UUID;

public class UUIDUtils {

    public static String genId() {
        return UUID.randomUUID().toString();
    }

}
