// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client/src/main/java/bar.proto

package pl.afornalik.bar.model;

public final class Bar {
  private Bar() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Meal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Meal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Menu_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Menu_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Client_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Client_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Waiter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Waiter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036client/src/main/java/bar.proto\"\226\001\n\004Mea" +
      "l\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\r\n\005price\030\003 \001" +
      "(\002\022\024\n\014prepare_time\030\004 \001(\005\022\023\n\013deliverable\030" +
      "\005 \001(\010\":\n\004Type\022\r\n\tBREAKFAST\020\000\022\n\n\006DINNER\020\001" +
      "\022\013\n\007DESSERT\020\002\022\n\n\006SUPPER\020\003\"(\n\004Menu\022\n\n\002id\030" +
      "\001 \001(\005\022\024\n\005meals\030\002 \003(\0132\005.Meal\"t\n\006Client\022\n\n" +
      "\002id\030\001 \001(\005\022\024\n\005meals\030\002 \003(\0132\005.Meal\022\014\n\004bill\030" +
      "\003 \001(\002\":\n\014Satisfaction\022\010\n\004POOR\020\000\022\013\n\007AVERA" +
      "GE\020\001\022\010\n\004GOOD\020\002\022\t\n\005GREAT\020\003\"<\n\006Waiter\022\n\n\002i" +
      "d\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\030\n\007clients\030\003 \003(\0132\007",
      ".ClientB\032\n\026pl.afornalik.bar.modelP\001b\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Meal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Meal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Meal_descriptor,
        new java.lang.String[] { "Id", "Name", "Price", "PrepareTime", "Deliverable", });
    internal_static_Menu_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Menu_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Menu_descriptor,
        new java.lang.String[] { "Id", "Meals", });
    internal_static_Client_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Client_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Client_descriptor,
        new java.lang.String[] { "Id", "Meals", "Bill", });
    internal_static_Waiter_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Waiter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Waiter_descriptor,
        new java.lang.String[] { "Id", "Name", "Clients", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
