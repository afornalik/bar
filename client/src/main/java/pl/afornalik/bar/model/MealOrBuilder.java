// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client/src/main/java/bar.proto

package pl.afornalik.bar.model;

public interface MealOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Meal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>optional string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional float price = 3;</code>
   */
  float getPrice();

  /**
   * <code>optional int32 prepare_time = 4;</code>
   */
  int getPrepareTime();

  /**
   * <code>optional bool deliverable = 5;</code>
   */
  boolean getDeliverable();
}
