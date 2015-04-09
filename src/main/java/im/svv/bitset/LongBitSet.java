package im.svv.bitset;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

/**
 * Long BitSet Class
 * Supports unsigned 
 */

public class LongBitSet {


  // KIFS: Keep it fucking simple
  static final long BIT_CHOPPER = 65535;
  static final long BIT_SHIFTER = 16;

  // KIFS: Keep it fucking simple
  // thief 1 =>  -8608480567731124088
  // thief 2 =>  4919131752989213764
  // thief 3 =>  2459565876494606882
  // thief 4 =>  1229782938247303441
  // These numbers relate to having exactly 4 buckets
  // static final long BIT_THIEF_01 = -8608480567731124088;
  // static final long BIT_THIEF_02 = +4919131752989213764;
  // static final long BIT_THIEF_03 = +2459565876494606882;
  // static final long BIT_THIEF_04 = +1229782938247303441;

  // byte buffer for conversion between bytes[4] <-> long
  ByteBuffer mByteBuffer;

  MessageDigest mHasher;

  BitSet mBucket01;
  BitSet mBucket02;
  BitSet mBucket03;
  BitSet mBucket04;

  /**
   * Construct a LongBitSet
   */
  LongBitSet() {
    try {
      mHasher = MessageDigest.getInstance("MD5");
    } catch(NoSuchAlgorithmException e) {
      mHasher = null;
    }

    mByteBuffer = ByteBuffer.allocate(Long.BYTES);

    mBucket01 = new BitSet();
    mBucket02 = new BitSet();
    mBucket03 = new BitSet();
    mBucket04 = new BitSet();
  }


  /**
   * Add a new value to the 
   */
  void set(long index, boolean value) {

    // int LARGEST_INT = 2147483648;
    // int tail_cutter = 2147483647;
    //
    //

    // int  bit_set_key = index & BIT_CHOPPER;
    // long bucket_key  = index >>> BIT_SHIFTER;

    // At this point we have 33 bits left to do crap with
  }


  /**
   *
   */
  void remove(long index) {
  }


  /**
   *
   */
  void get(long index) {
  }

  /**
   * Convert 4-bytes to *positive* integer
   */
  public byte[] longToBytes(long x) {
    mByteBuffer.putLong(0, x);
    return mByteBuffer.array();
  }

  
  /**
   *
   */
  public long bytesToLong(byte[] bytes) {
    mByteBuffer.clear();
    mByteBuffer.put(bytes);
    mByteBuffer.flip();
    return mByteBuffer.getLong();
  }
}
