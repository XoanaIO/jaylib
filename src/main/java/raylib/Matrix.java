/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package raylib;

public class Matrix {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  /* Struct Layout: 0-16 in order = column major.
  float m0, m4, m8, m12;
  float m1, m5, m9, m13;
  float m2, m6, m10, m14;
  float m3, m7, m11, m15;
  */

  protected Matrix(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Matrix obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RaylibJNI.delete_Matrix(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM0(float value) {
    RaylibJNI.Matrix_m0_set(swigCPtr, this, value);
  }

  public float getM0() {
    return RaylibJNI.Matrix_m0_get(swigCPtr, this);
  }

  public void setM4(float value) {
    RaylibJNI.Matrix_m4_set(swigCPtr, this, value);
  }

  public float getM4() {
    return RaylibJNI.Matrix_m4_get(swigCPtr, this);
  }

  public void setM8(float value) {
    RaylibJNI.Matrix_m8_set(swigCPtr, this, value);
  }

  public float getM8() {
    return RaylibJNI.Matrix_m8_get(swigCPtr, this);
  }

  public void setM12(float value) {
    RaylibJNI.Matrix_m12_set(swigCPtr, this, value);
  }

  public float getM12() {
    return RaylibJNI.Matrix_m12_get(swigCPtr, this);
  }

  public void setM1(float value) {
    RaylibJNI.Matrix_m1_set(swigCPtr, this, value);
  }

  public float getM1() {
    return RaylibJNI.Matrix_m1_get(swigCPtr, this);
  }

  public void setM5(float value) {
    RaylibJNI.Matrix_m5_set(swigCPtr, this, value);
  }

  public float getM5() {
    return RaylibJNI.Matrix_m5_get(swigCPtr, this);
  }

  public void setM9(float value) {
    RaylibJNI.Matrix_m9_set(swigCPtr, this, value);
  }

  public float getM9() {
    return RaylibJNI.Matrix_m9_get(swigCPtr, this);
  }

  public void setM13(float value) {
    RaylibJNI.Matrix_m13_set(swigCPtr, this, value);
  }

  public float getM13() {
    return RaylibJNI.Matrix_m13_get(swigCPtr, this);
  }

  public void setM2(float value) {
    RaylibJNI.Matrix_m2_set(swigCPtr, this, value);
  }

  public float getM2() {
    return RaylibJNI.Matrix_m2_get(swigCPtr, this);
  }

  public void setM6(float value) {
    RaylibJNI.Matrix_m6_set(swigCPtr, this, value);
  }

  public float getM6() {
    return RaylibJNI.Matrix_m6_get(swigCPtr, this);
  }

  public void setM10(float value) {
    RaylibJNI.Matrix_m10_set(swigCPtr, this, value);
  }

  public float getM10() {
    return RaylibJNI.Matrix_m10_get(swigCPtr, this);
  }

  public void setM14(float value) {
    RaylibJNI.Matrix_m14_set(swigCPtr, this, value);
  }

  public float getM14() {
    return RaylibJNI.Matrix_m14_get(swigCPtr, this);
  }

  public void setM3(float value) {
    RaylibJNI.Matrix_m3_set(swigCPtr, this, value);
  }

  public float getM3() {
    return RaylibJNI.Matrix_m3_get(swigCPtr, this);
  }

  public void setM7(float value) {
    RaylibJNI.Matrix_m7_set(swigCPtr, this, value);
  }

  public float getM7() {
    return RaylibJNI.Matrix_m7_get(swigCPtr, this);
  }

  public void setM11(float value) {
    RaylibJNI.Matrix_m11_set(swigCPtr, this, value);
  }

  public float getM11() {
    return RaylibJNI.Matrix_m11_get(swigCPtr, this);
  }

  public void setM15(float value) {
    RaylibJNI.Matrix_m15_set(swigCPtr, this, value);
  }

  public float getM15() {
    return RaylibJNI.Matrix_m15_get(swigCPtr, this);
  }

  public Matrix() {
    this(RaylibJNI.new_Matrix(), true);
  }

  public void setToIdentity() {
    setRowMajor(new float[]{
      1, 0, 0, 0,
      0, 1, 0, 0,
      0, 0, 1, 0,
      0, 0, 0, 1
    });
  }

  // TODO: This is really messy.  See about getting a contiguous array working with JNI.
  // TODO: Add algebraic operators and the ability to set/get specific places.

  public void setColumns(Vector4 c0, Vector4 c1, Vector4 c2, Vector4 c3) {
    setM0(c0.getX());
    setM1(c0.getY());
    setM2(c0.getZ());
    setM3(c0.getW());

    setM4(c1.getX());
    setM5(c1.getY());
    setM6(c1.getZ());
    setM7(c1.getW());

    setM8(c2.getX());
    setM9(c2.getY());
    setM10(c2.getZ());
    setM11(c2.getW());

    setM12(c3.getX());
    setM13(c3.getY());
    setM14(c3.getZ());
    setM15(c3.getW());
  }

  public void setRows(Vector4 r0, Vector4 r1, Vector4 r2, Vector4 r3) {
    setM0(r0.getX());
    setM4(r0.getY());
    setM8(r0.getZ());
    setM12(r0.getW());

    setM1(r1.getX());
    setM5(r1.getY());
    setM9(r1.getZ());
    setM13(r1.getW());

    setM2(r2.getX());
    setM6(r2.getY());
    setM10(r2.getZ());
    setM14(r2.getW());

    setM3(r3.getX());
    setM7(r3.getY());
    setM11(r3.getZ());
    setM15(r3.getW());
  }

  public void setRowMajor(float[] value) {
    setM0(value[0]);
    setM1(value[4]);
    setM2(value[8]);
    setM3(value[12]);

    setM4(value[1]);
    setM5(value[5]);
    setM6(value[9]);
    setM7(value[13]);

    setM8(value[2]);
    setM9(value[6]);
    setM10(value[10]);
    setM11(value[14]);

    setM12(value[3]);
    setM13(value[7]);
    setM14(value[11]);
    setM15(value[15]);
  }

  public void setColumnMajor(float[] value) {
    setM0(value[0]);
    setM1(value[1]);
    setM2(value[2]);
    setM3(value[3]);

    setM4(value[4]);
    setM5(value[5]);
    setM6(value[6]);
    setM7(value[7]);

    setM8(value[8]);
    setM9(value[9]);
    setM10(value[10]);
    setM11(value[11]);

    setM12(value[12]);
    setM13(value[13]);
    setM14(value[14]);
    setM15(value[15]);
  }
}
