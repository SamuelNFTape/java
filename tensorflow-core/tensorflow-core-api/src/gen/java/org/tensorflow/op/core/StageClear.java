/* Copyright 2018-2022 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.core;

import java.util.Arrays;
import java.util.List;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.op.Operands;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.OpInputsMetadata;
import org.tensorflow.op.annotation.OpMetadata;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.proto.framework.DataType;
import org.tensorflow.types.family.TType;

/**
 * Op removes all elements in the underlying container.
 */
@OpMetadata(
    opType = StageClear.OP_NAME,
    inputsClass = StageClear.Inputs.class
)
@Operator
public final class StageClear extends RawOp {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "StageClear";

  public StageClear(Operation operation) {
    super(operation, OP_NAME);
  }

  /**
   * Factory method to create a class wrapping a new StageClear operation.
   *
   * @param scope current scope
   * @param dtypes The value of the dtypes attribute
   * @param options carries optional attribute values
   * @return a new instance of StageClear
   */
  @Endpoint(
      describeByClass = true
  )
  public static StageClear create(Scope scope, List<Class<? extends TType>> dtypes,
      Options... options) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "StageClear");
    opBuilder.setAttr("dtypes", Operands.toDataTypes(dtypes));
    if (options != null) {
      for (Options opts : options) {
        if (opts.capacity != null) {
          opBuilder.setAttr("capacity", opts.capacity);
        }
        if (opts.memoryLimit != null) {
          opBuilder.setAttr("memory_limit", opts.memoryLimit);
        }
        if (opts.container != null) {
          opBuilder.setAttr("container", opts.container);
        }
        if (opts.sharedName != null) {
          opBuilder.setAttr("shared_name", opts.sharedName);
        }
      }
    }
    return new StageClear(opBuilder.build());
  }

  /**
   * Sets the capacity option.
   *
   * @param capacity the capacity option
   * @return this Options instance.
   */
  public static Options capacity(Long capacity) {
    return new Options().capacity(capacity);
  }

  /**
   * Sets the memoryLimit option.
   *
   * @param memoryLimit the memoryLimit option
   * @return this Options instance.
   */
  public static Options memoryLimit(Long memoryLimit) {
    return new Options().memoryLimit(memoryLimit);
  }

  /**
   * Sets the container option.
   *
   * @param container the container option
   * @return this Options instance.
   */
  public static Options container(String container) {
    return new Options().container(container);
  }

  /**
   * Sets the sharedName option.
   *
   * @param sharedName the sharedName option
   * @return this Options instance.
   */
  public static Options sharedName(String sharedName) {
    return new Options().sharedName(sharedName);
  }

  /**
   * Optional attributes for {@link org.tensorflow.op.core.StageClear}
   */
  public static class Options {
    private Long capacity;

    private Long memoryLimit;

    private String container;

    private String sharedName;

    private Options() {
    }

    /**
     * Sets the capacity option.
     *
     * @param capacity the capacity option
     * @return this Options instance.
     */
    public Options capacity(Long capacity) {
      this.capacity = capacity;
      return this;
    }

    /**
     * Sets the memoryLimit option.
     *
     * @param memoryLimit the memoryLimit option
     * @return this Options instance.
     */
    public Options memoryLimit(Long memoryLimit) {
      this.memoryLimit = memoryLimit;
      return this;
    }

    /**
     * Sets the container option.
     *
     * @param container the container option
     * @return this Options instance.
     */
    public Options container(String container) {
      this.container = container;
      return this;
    }

    /**
     * Sets the sharedName option.
     *
     * @param sharedName the sharedName option
     * @return this Options instance.
     */
    public Options sharedName(String sharedName) {
      this.sharedName = sharedName;
      return this;
    }
  }

  @OpInputsMetadata(
      outputsClass = StageClear.class
  )
  public static class Inputs extends RawOpInputs<StageClear> {
    /**
     * The capacity attribute
     */
    public final long capacity;

    /**
     * The memoryLimit attribute
     */
    public final long memoryLimit;

    /**
     * The dtypes attribute
     */
    public final DataType[] dtypes;

    /**
     * The container attribute
     */
    public final String container;

    /**
     * The sharedName attribute
     */
    public final String sharedName;

    public Inputs(GraphOperation op) {
      super(new StageClear(op), op, Arrays.asList("capacity", "memory_limit", "dtypes", "container", "shared_name"));
      int inputIndex = 0;
      capacity = op.attributes().getAttrInt("capacity");
      memoryLimit = op.attributes().getAttrInt("memory_limit");
      dtypes = op.attributes().getAttrTypeList("dtypes");
      container = op.attributes().getAttrString("container");
      sharedName = op.attributes().getAttrString("shared_name");
    }
  }
}
