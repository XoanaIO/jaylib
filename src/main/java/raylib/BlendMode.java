/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package raylib;

public final class BlendMode {
  public final static BlendMode BLEND_ALPHA = new BlendMode("BLEND_ALPHA", RaylibJNI.BLEND_ALPHA_get());
  public final static BlendMode BLEND_ADDITIVE = new BlendMode("BLEND_ADDITIVE");
  public final static BlendMode BLEND_MULTIPLIED = new BlendMode("BLEND_MULTIPLIED");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static BlendMode swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + BlendMode.class + " with value " + swigValue);
  }

  private BlendMode(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private BlendMode(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private BlendMode(String swigName, BlendMode swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static BlendMode[] swigValues = { BLEND_ALPHA, BLEND_ADDITIVE, BLEND_MULTIPLIED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

