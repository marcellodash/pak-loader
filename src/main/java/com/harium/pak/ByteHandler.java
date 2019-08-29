package com.harium.pak;

public class ByteHandler {

  public static byte[] intToByteLittleEndian(int value) {
    return new byte[]{
        (byte) (value >>> 24),
        (byte) (value >>> 16),
        (byte) (value >>> 8),
        (byte) value};
  }

  public static byte[] intToByteBigEndian(int value) {
    return new byte[]{
        (byte) (value),
        (byte) (value >>> 8),
        (byte) (value >>> 16),
        (byte) (value >>> 24)};
  }

  public static int readIntBigEndian(byte[] array, int offset) {
    return array[3 + offset] << 24
        | (array[2 + offset] & 0xff) << 16
        | (array[1 + offset] & 0xff) << 8
        | (array[0 + offset] & 0xff);
  }

  public static int readIntBigEndian(byte[] array) {
    return readIntBigEndian(array, 0);
  }
}
