/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package raylib;

public class Color {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Color(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Color obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RaylibJNI.delete_Color(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setR(short value) {
    RaylibJNI.Color_r_set(swigCPtr, this, value);
  }

  public short getR() {
    return RaylibJNI.Color_r_get(swigCPtr, this);
  }

  public void setG(short value) {
    RaylibJNI.Color_g_set(swigCPtr, this, value);
  }

  public short getG() {
    return RaylibJNI.Color_g_get(swigCPtr, this);
  }

  public void setB(short value) {
    RaylibJNI.Color_b_set(swigCPtr, this, value);
  }

  public short getB() {
    return RaylibJNI.Color_b_get(swigCPtr, this);
  }

  public void setA(short value) {
    RaylibJNI.Color_a_set(swigCPtr, this, value);
  }

  public short getA() {
    return RaylibJNI.Color_a_get(swigCPtr, this);
  }

  public Color() {
    this(RaylibJNI.new_Color(), true);
  }

  public Color(int r, int g, int b, int a) {
    this();
    this.setR((short)r);
    this.setG((short)g);
    this.setB((short)b);
    this.setA((short)a);
  }

  public Color(int r, int g, int b) {
    this(r, g, b, 255);
  }

}
