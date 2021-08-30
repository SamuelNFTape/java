// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/dataset_options.proto

package org.tensorflow.proto.data;

public final class DatasetOptionsProtos {
  private DatasetOptionsProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_data_DistributeOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_data_DistributeOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_data_OptimizationOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_data_OptimizationOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_data_ThreadingOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_data_ThreadingOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_data_Options_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_data_Options_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/tensorflow/core/framework/dataset_opti" +
      "ons.proto\022\017tensorflow.data\"\177\n\021Distribute" +
      "Options\022;\n\021auto_shard_policy\030\001 \001(\0162 .ten" +
      "sorflow.data.AutoShardPolicy\022\025\n\013num_devi" +
      "ces\030\002 \001(\005H\000B\026\n\024optional_num_devices\"\270\006\n\023" +
      "OptimizationOptions\022%\n\033apply_default_opt" +
      "imizations\030\001 \001(\010H\000\022\022\n\010autotune\030\002 \001(\010H\001\022\032" +
      "\n\020autotune_buffers\030\003 \001(\010H\002\022\035\n\023autotune_c" +
      "pu_budget\030\004 \001(\005H\003\022\035\n\023autotune_ram_budget" +
      "\030\005 \001(\003H\004\022\027\n\rfilter_fusion\030\006 \001(\010H\005\022\036\n\024map" +
      "_and_batch_fusion\030\t \001(\010H\006\022\037\n\025map_and_fil" +
      "ter_fusion\030\n \001(\010H\007\022\024\n\nmap_fusion\030\013 \001(\010H\010" +
      "\022\035\n\023map_parallelization\030\014 \001(\010H\t\022\032\n\020noop_" +
      "elimination\030\016 \001(\010H\n\022\030\n\016parallel_batch\030\017 " +
      "\001(\010H\013\022#\n\031shuffle_and_repeat_fusion\030\021 \001(\010" +
      "H\014B&\n$optional_apply_default_optimizatio" +
      "nsB\023\n\021optional_autotuneB\033\n\031optional_auto" +
      "tune_buffersB\036\n\034optional_autotune_cpu_bu" +
      "dgetB\036\n\034optional_autotune_ram_budgetB\030\n\026" +
      "optional_filter_fusionB\037\n\035optional_map_a" +
      "nd_batch_fusionB \n\036optional_map_and_filt" +
      "er_fusionB\025\n\023optional_map_fusionB\036\n\034opti" +
      "onal_map_parallelizationB\033\n\031optional_noo" +
      "p_eliminationB\031\n\027optional_parallel_batch" +
      "B$\n\"optional_shuffle_and_repeat_fusionJ\004" +
      "\010\007\020\010J\004\010\010\020\tJ\004\010\r\020\016J\004\010\020\020\021\"\242\001\n\020ThreadingOpti" +
      "ons\022\"\n\030max_intra_op_parallelism\030\001 \001(\005H\000\022" +
      "!\n\027private_threadpool_size\030\002 \001(\005H\001B#\n!op" +
      "tional_max_intra_op_parallelismB\"\n optio" +
      "nal_private_threadpool_size\"\212\003\n\007Options\022" +
      "\027\n\rdeterministic\030\001 \001(\010H\000\022>\n\022distribute_o" +
      "ptions\030\002 \001(\0132\".tensorflow.data.Distribut" +
      "eOptions\022B\n\024optimization_options\030\003 \001(\0132$" +
      ".tensorflow.data.OptimizationOptions\022\017\n\005" +
      "slack\030\004 \001(\010H\001\022<\n\021threading_options\030\005 \001(\013" +
      "2!.tensorflow.data.ThreadingOptions\022E\n\025e" +
      "xternal_state_policy\030\006 \001(\0162$.tensorflow." +
      "data.ExternalStatePolicyH\002B\030\n\026optional_d" +
      "eterministicB\020\n\016optional_slackB \n\036option" +
      "al_external_state_policy*K\n\017AutoShardPol" +
      "icy\022\010\n\004AUTO\020\000\022\010\n\004FILE\020\001\022\010\n\004DATA\020\002\022\010\n\004HIN" +
      "T\020\003\022\020\n\003OFF\020\377\377\377\377\377\377\377\377\377\001*J\n\023ExternalStatePo" +
      "licy\022\017\n\013POLICY_WARN\020\000\022\021\n\rPOLICY_IGNORE\020\001" +
      "\022\017\n\013POLICY_FAIL\020\002B\213\001\n\031org.tensorflow.pro" +
      "to.dataB\024DatasetOptionsProtosP\001ZVgithub." +
      "com/tensorflow/tensorflow/tensorflow/go/" +
      "core/framework/dataset_options_go_protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tensorflow_data_DistributeOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_data_DistributeOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_data_DistributeOptions_descriptor,
        new java.lang.String[] { "AutoShardPolicy", "NumDevices", "OptionalNumDevices", });
    internal_static_tensorflow_data_OptimizationOptions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_data_OptimizationOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_data_OptimizationOptions_descriptor,
        new java.lang.String[] { "ApplyDefaultOptimizations", "Autotune", "AutotuneBuffers", "AutotuneCpuBudget", "AutotuneRamBudget", "FilterFusion", "MapAndBatchFusion", "MapAndFilterFusion", "MapFusion", "MapParallelization", "NoopElimination", "ParallelBatch", "ShuffleAndRepeatFusion", "OptionalApplyDefaultOptimizations", "OptionalAutotune", "OptionalAutotuneBuffers", "OptionalAutotuneCpuBudget", "OptionalAutotuneRamBudget", "OptionalFilterFusion", "OptionalMapAndBatchFusion", "OptionalMapAndFilterFusion", "OptionalMapFusion", "OptionalMapParallelization", "OptionalNoopElimination", "OptionalParallelBatch", "OptionalShuffleAndRepeatFusion", });
    internal_static_tensorflow_data_ThreadingOptions_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_data_ThreadingOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_data_ThreadingOptions_descriptor,
        new java.lang.String[] { "MaxIntraOpParallelism", "PrivateThreadpoolSize", "OptionalMaxIntraOpParallelism", "OptionalPrivateThreadpoolSize", });
    internal_static_tensorflow_data_Options_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_data_Options_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_data_Options_descriptor,
        new java.lang.String[] { "Deterministic", "DistributeOptions", "OptimizationOptions", "Slack", "ThreadingOptions", "ExternalStatePolicy", "OptionalDeterministic", "OptionalSlack", "OptionalExternalStatePolicy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
