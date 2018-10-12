/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package raylib;

public class BoundingBox {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BoundingBox(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BoundingBox obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RaylibJNI.delete_BoundingBox(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMin(Vector3 value) {
    RaylibJNI.BoundingBox_min_set(swigCPtr, this, Vector3.getCPtr(value), value);
  }

  public Vector3 getMin() {
    long cPtr = RaylibJNI.BoundingBox_min_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Vector3(cPtr, false);
  }

  public void setMax(Vector3 value) {
    RaylibJNI.BoundingBox_max_set(swigCPtr, this, Vector3.getCPtr(value), value);
  }

  public Vector3 getMax() {
    long cPtr = RaylibJNI.BoundingBox_max_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Vector3(cPtr, false);
  }

  public BoundingBox() {
    this(RaylibJNI.new_BoundingBox(), true);
  }

}
