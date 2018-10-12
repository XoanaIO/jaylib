/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package raylib;

public class Ray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Ray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Ray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RaylibJNI.delete_Ray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPosition(Vector3 value) {
    RaylibJNI.Ray_position_set(swigCPtr, this, Vector3.getCPtr(value), value);
  }

  public Vector3 getPosition() {
    long cPtr = RaylibJNI.Ray_position_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Vector3(cPtr, false);
  }

  public void setDirection(Vector3 value) {
    RaylibJNI.Ray_direction_set(swigCPtr, this, Vector3.getCPtr(value), value);
  }

  public Vector3 getDirection() {
    long cPtr = RaylibJNI.Ray_direction_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Vector3(cPtr, false);
  }

  public Ray() {
    this(RaylibJNI.new_Ray(), true);
  }

}
