package im.svv.bitset;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.BitSet;

public class LongBitSetTest {

  @Test public void testBitSet() {
    BitSet x = new BitSet();
    BitSet y = new BitSet();

    // x.set(-10);
    // x.set(-11);
    x.set(11);
    x.set(110);
    // y.set(-10);
    // y.set(-11);
    y.set(11);
    y.set(110);

    assertTrue(x.get(11));
    assertTrue(x.get(110));
    // assertTrue(x.get(-10));
    // assertTrue(x.get(-11));
    assertFalse(x.get(0));
    assertFalse(x.get(9));
    // assertFalse(x.get(-9));
    assertTrue(x.equals(y));
  }

  @Test public void testBytesToLong() {
    LongBitSet bs = new LongBitSet();
  }

  @Test public void testLongToBytes() {
    LongBitSet bs = new LongBitSet();
    long val;
    byte[] res;

    val = 10L;
    res = bs.longToBytes(val);
    assertEquals(res.length, 8);

    val = 9223372036854775807L;
    res = bs.longToBytes(val);
    assertEquals(res.length, 8);

    val = -9223372036854775808L;
    res = bs.longToBytes(val);
    assertEquals(res.length, 8);

    val = 9223372036854775807L;
    res = bs.longToBytes(val);
    assertEquals(res.length, 8);
  }

  @Test public void testConversionInvertability() {
    LongBitSet bs = new LongBitSet();
    byte[] val;
    long res;

    val = new byte[]{ 0, 0, 0, 0, 0, 0, 0, 0 };
    res = bs.bytesToLong(val);
    assertEquals(res, 0L);

    val = new byte[]{ 1, 1, 1, 1, 1, 1, 1, 1 };
    res = bs.bytesToLong(val);
    assertEquals(res, 72340172838076673L);

    val = bs.longToBytes(-72057594037927936L);
    res = bs.bytesToLong(val);
    assertEquals(res, -72057594037927936L);

    val = bs.longToBytes(-70000L);
    res = bs.bytesToLong(val);
    assertEquals(res, -70000L);
  }

  @Test public void testBitShift() {
    assertEquals(511 >> 8, 1);
    assertEquals(256 >> 8, 1);
  }

  @Test public void testTrivial() {
    assertEquals(true, true);
  }

  @Test public void testDefaultConstructor() {
  }
}
