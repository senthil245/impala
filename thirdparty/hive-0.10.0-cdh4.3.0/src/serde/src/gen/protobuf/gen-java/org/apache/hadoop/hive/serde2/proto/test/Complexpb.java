// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: complexpb.proto

package org.apache.hadoop.hive.serde2.proto.test;

public final class Complexpb {
  private Complexpb() {}

  public static final class IntString {
    public IntString(int myInt, String myString, int underscoreInt) {
      this.myint_ = myInt;
      this.hasMyint = true;
      this.myString_ = myString;
      this.hasMyString = true;
      this.underscoreInt_ = underscoreInt;
      this.hasUnderscoreInt = true;
    }

    // optional int32 myint = 1;
    public static final int MYINT_FIELD_NUMBER = 1;
    private final boolean hasMyint;
    private int myint_ = 0;
    public boolean hasMyint() { return hasMyint; }
    public int getMyint() { return myint_; }

    // optional string myString = 2;
    public static final int MYSTRING_FIELD_NUMBER = 2;
    private final boolean hasMyString;
    private java.lang.String myString_ = "";
    public boolean hasMyString() { return hasMyString; }
    public java.lang.String getMyString() { return myString_; }

    // optional int32 underscore_int = 3;
    public static final int UNDERSCORE_INT_FIELD_NUMBER = 3;
    private final boolean hasUnderscoreInt;
    private int underscoreInt_ = 0;
    public boolean hasUnderscoreInt() { return hasUnderscoreInt; }
    public int getUnderscoreInt() { return underscoreInt_; }

    public final boolean isInitialized() {
      return true;
    }

  }

  public static final class Complex {
    // Use Complex.newBuilder() to construct.
    public Complex(int aint, String aString, java.util.List<Integer> lint, java.util.List<String> lString, java.util.List<IntString> lintString) {
      this.aint_ = aint;
      this.hasAint = true;
      this.aString_ = aString;
      this.hasAString = true;
      this.lint_ = lint;
      this.lString_ = lString;
      this.lintString_ = lintString;
    }

    // optional int32 aint = 1;
    public static final int AINT_FIELD_NUMBER = 1;
    private final boolean hasAint;
    private int aint_ = 0;
    public boolean hasAint() { return hasAint; }
    public int getAint() { return aint_; }

    // optional string aString = 2;
    public static final int ASTRING_FIELD_NUMBER = 2;
    private final boolean hasAString;
    private java.lang.String aString_ = "";
    public boolean hasAString() { return hasAString; }
    public java.lang.String getAString() { return aString_; }

    // repeated int32 lint = 3;
    public static final int LINT_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Integer> lint_ =
      java.util.Collections.emptyList();
    public java.util.List<java.lang.Integer> getLintList() {
      return lint_;
    }
    public int getLintCount() { return lint_.size(); }
    public int getLint(int index) {
      return lint_.get(index);
    }

    // repeated string lString = 4;
    public static final int LSTRING_FIELD_NUMBER = 4;
    private java.util.List<java.lang.String> lString_ =
      java.util.Collections.emptyList();
    public java.util.List<java.lang.String> getLStringList() {
      return lString_;
    }
    public int getLStringCount() { return lString_.size(); }
    public java.lang.String getLString(int index) {
      return lString_.get(index);
    }

    // repeated .org.apache.hadoop.hive.serde2.proto.test.IntString lintString = 5;
    public static final int LINTSTRING_FIELD_NUMBER = 5;
    private java.util.List<org.apache.hadoop.hive.serde2.proto.test.Complexpb.IntString> lintString_ =
      java.util.Collections.emptyList();
    public java.util.List<org.apache.hadoop.hive.serde2.proto.test.Complexpb.IntString> getLintStringList() {
      return lintString_;
    }
    public int getLintStringCount() { return lintString_.size(); }
    public org.apache.hadoop.hive.serde2.proto.test.Complexpb.IntString getLintString(int index) {
      return lintString_.get(index);
    }

    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }

    // @@protoc_insertion_point(class_scope:org.apache.hadoop.hive.serde2.proto.test.Complex)
  }

  // @@protoc_insertion_point(outer_class_scope)
}