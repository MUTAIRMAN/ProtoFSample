// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee.proto

package example.myapp.helloworld.grpc;

public final class HelloEmployeeProto {
  private HelloEmployeeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_employee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_employee_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016employee.proto\022\nhelloworld\"$\n\010employee" +
      "\022\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\tB5\n\035example.my" +
      "app.helloworld.grpcB\022HelloEmployeeProtoP" +
      "\001b\006proto3"
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
    internal_static_helloworld_employee_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_helloworld_employee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_employee_descriptor,
        new java.lang.String[] { "Name", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
