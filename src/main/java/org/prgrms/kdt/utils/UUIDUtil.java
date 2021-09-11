package org.prgrms.kdt.utils;

import java.nio.ByteBuffer;
import java.util.UUID;

public class UUIDUtil {
    public static UUID toUUID(byte[] bytes) {
        var byteBuffer = ByteBuffer.wrap(bytes);
        return new UUID(byteBuffer.getLong(), byteBuffer.getLong());
    }
}