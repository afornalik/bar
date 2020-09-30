// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client/src/main/java/bar.proto

package pl.afornalik.bar.model;

/**
 * Protobuf type {@code Menu}
 */
public  final class Menu extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Menu)
    MenuOrBuilder {
  // Use Menu.newBuilder() to construct.
  private Menu(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Menu() {
    id_ = 0;
    meals_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Menu(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              meals_ = new java.util.ArrayList<pl.afornalik.bar.model.Meal>();
              mutable_bitField0_ |= 0x00000002;
            }
            meals_.add(
                input.readMessage(pl.afornalik.bar.model.Meal.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        meals_ = java.util.Collections.unmodifiableList(meals_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return pl.afornalik.bar.model.Bar.internal_static_Menu_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return pl.afornalik.bar.model.Bar.internal_static_Menu_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            pl.afornalik.bar.model.Menu.class, pl.afornalik.bar.model.Menu.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>optional int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int MEALS_FIELD_NUMBER = 2;
  private java.util.List<pl.afornalik.bar.model.Meal> meals_;
  /**
   * <code>repeated .Meal meals = 2;</code>
   */
  public java.util.List<pl.afornalik.bar.model.Meal> getMealsList() {
    return meals_;
  }
  /**
   * <code>repeated .Meal meals = 2;</code>
   */
  public java.util.List<? extends pl.afornalik.bar.model.MealOrBuilder> 
      getMealsOrBuilderList() {
    return meals_;
  }
  /**
   * <code>repeated .Meal meals = 2;</code>
   */
  public int getMealsCount() {
    return meals_.size();
  }
  /**
   * <code>repeated .Meal meals = 2;</code>
   */
  public pl.afornalik.bar.model.Meal getMeals(int index) {
    return meals_.get(index);
  }
  /**
   * <code>repeated .Meal meals = 2;</code>
   */
  public pl.afornalik.bar.model.MealOrBuilder getMealsOrBuilder(
      int index) {
    return meals_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    for (int i = 0; i < meals_.size(); i++) {
      output.writeMessage(2, meals_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    for (int i = 0; i < meals_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, meals_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof pl.afornalik.bar.model.Menu)) {
      return super.equals(obj);
    }
    pl.afornalik.bar.model.Menu other = (pl.afornalik.bar.model.Menu) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getMealsList()
        .equals(other.getMealsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    if (getMealsCount() > 0) {
      hash = (37 * hash) + MEALS_FIELD_NUMBER;
      hash = (53 * hash) + getMealsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static pl.afornalik.bar.model.Menu parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pl.afornalik.bar.model.Menu parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pl.afornalik.bar.model.Menu parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pl.afornalik.bar.model.Menu parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pl.afornalik.bar.model.Menu parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pl.afornalik.bar.model.Menu parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static pl.afornalik.bar.model.Menu parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static pl.afornalik.bar.model.Menu parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static pl.afornalik.bar.model.Menu parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pl.afornalik.bar.model.Menu parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(pl.afornalik.bar.model.Menu prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Menu}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Menu)
      pl.afornalik.bar.model.MenuOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.afornalik.bar.model.Bar.internal_static_Menu_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.afornalik.bar.model.Bar.internal_static_Menu_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pl.afornalik.bar.model.Menu.class, pl.afornalik.bar.model.Menu.Builder.class);
    }

    // Construct using pl.afornalik.bar.model.Menu.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getMealsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0;

      if (mealsBuilder_ == null) {
        meals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        mealsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return pl.afornalik.bar.model.Bar.internal_static_Menu_descriptor;
    }

    public pl.afornalik.bar.model.Menu getDefaultInstanceForType() {
      return pl.afornalik.bar.model.Menu.getDefaultInstance();
    }

    public pl.afornalik.bar.model.Menu build() {
      pl.afornalik.bar.model.Menu result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public pl.afornalik.bar.model.Menu buildPartial() {
      pl.afornalik.bar.model.Menu result = new pl.afornalik.bar.model.Menu(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      if (mealsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          meals_ = java.util.Collections.unmodifiableList(meals_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.meals_ = meals_;
      } else {
        result.meals_ = mealsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof pl.afornalik.bar.model.Menu) {
        return mergeFrom((pl.afornalik.bar.model.Menu)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(pl.afornalik.bar.model.Menu other) {
      if (other == pl.afornalik.bar.model.Menu.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (mealsBuilder_ == null) {
        if (!other.meals_.isEmpty()) {
          if (meals_.isEmpty()) {
            meals_ = other.meals_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMealsIsMutable();
            meals_.addAll(other.meals_);
          }
          onChanged();
        }
      } else {
        if (!other.meals_.isEmpty()) {
          if (mealsBuilder_.isEmpty()) {
            mealsBuilder_.dispose();
            mealsBuilder_ = null;
            meals_ = other.meals_;
            bitField0_ = (bitField0_ & ~0x00000002);
            mealsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMealsFieldBuilder() : null;
          } else {
            mealsBuilder_.addAllMessages(other.meals_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      pl.afornalik.bar.model.Menu parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (pl.afornalik.bar.model.Menu) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int id_ ;
    /**
     * <code>optional int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>optional int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<pl.afornalik.bar.model.Meal> meals_ =
      java.util.Collections.emptyList();
    private void ensureMealsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        meals_ = new java.util.ArrayList<pl.afornalik.bar.model.Meal>(meals_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        pl.afornalik.bar.model.Meal, pl.afornalik.bar.model.Meal.Builder, pl.afornalik.bar.model.MealOrBuilder> mealsBuilder_;

    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public java.util.List<pl.afornalik.bar.model.Meal> getMealsList() {
      if (mealsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(meals_);
      } else {
        return mealsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public int getMealsCount() {
      if (mealsBuilder_ == null) {
        return meals_.size();
      } else {
        return mealsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public pl.afornalik.bar.model.Meal getMeals(int index) {
      if (mealsBuilder_ == null) {
        return meals_.get(index);
      } else {
        return mealsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public Builder setMeals(
        int index, pl.afornalik.bar.model.Meal value) {
      if (mealsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMealsIsMutable();
        meals_.set(index, value);
        onChanged();
      } else {
        mealsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public Builder setMeals(
        int index, pl.afornalik.bar.model.Meal.Builder builderForValue) {
      if (mealsBuilder_ == null) {
        ensureMealsIsMutable();
        meals_.set(index, builderForValue.build());
        onChanged();
      } else {
        mealsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public Builder addMeals(pl.afornalik.bar.model.Meal value) {
      if (mealsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMealsIsMutable();
        meals_.add(value);
        onChanged();
      } else {
        mealsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public Builder addMeals(
        int index, pl.afornalik.bar.model.Meal value) {
      if (mealsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMealsIsMutable();
        meals_.add(index, value);
        onChanged();
      } else {
        mealsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public Builder addMeals(
        pl.afornalik.bar.model.Meal.Builder builderForValue) {
      if (mealsBuilder_ == null) {
        ensureMealsIsMutable();
        meals_.add(builderForValue.build());
        onChanged();
      } else {
        mealsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public Builder addMeals(
        int index, pl.afornalik.bar.model.Meal.Builder builderForValue) {
      if (mealsBuilder_ == null) {
        ensureMealsIsMutable();
        meals_.add(index, builderForValue.build());
        onChanged();
      } else {
        mealsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public Builder addAllMeals(
        java.lang.Iterable<? extends pl.afornalik.bar.model.Meal> values) {
      if (mealsBuilder_ == null) {
        ensureMealsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, meals_);
        onChanged();
      } else {
        mealsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public Builder clearMeals() {
      if (mealsBuilder_ == null) {
        meals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        mealsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public Builder removeMeals(int index) {
      if (mealsBuilder_ == null) {
        ensureMealsIsMutable();
        meals_.remove(index);
        onChanged();
      } else {
        mealsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public pl.afornalik.bar.model.Meal.Builder getMealsBuilder(
        int index) {
      return getMealsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public pl.afornalik.bar.model.MealOrBuilder getMealsOrBuilder(
        int index) {
      if (mealsBuilder_ == null) {
        return meals_.get(index);  } else {
        return mealsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public java.util.List<? extends pl.afornalik.bar.model.MealOrBuilder> 
         getMealsOrBuilderList() {
      if (mealsBuilder_ != null) {
        return mealsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(meals_);
      }
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public pl.afornalik.bar.model.Meal.Builder addMealsBuilder() {
      return getMealsFieldBuilder().addBuilder(
          pl.afornalik.bar.model.Meal.getDefaultInstance());
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public pl.afornalik.bar.model.Meal.Builder addMealsBuilder(
        int index) {
      return getMealsFieldBuilder().addBuilder(
          index, pl.afornalik.bar.model.Meal.getDefaultInstance());
    }
    /**
     * <code>repeated .Meal meals = 2;</code>
     */
    public java.util.List<pl.afornalik.bar.model.Meal.Builder> 
         getMealsBuilderList() {
      return getMealsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        pl.afornalik.bar.model.Meal, pl.afornalik.bar.model.Meal.Builder, pl.afornalik.bar.model.MealOrBuilder> 
        getMealsFieldBuilder() {
      if (mealsBuilder_ == null) {
        mealsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            pl.afornalik.bar.model.Meal, pl.afornalik.bar.model.Meal.Builder, pl.afornalik.bar.model.MealOrBuilder>(
                meals_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        meals_ = null;
      }
      return mealsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Menu)
  }

  // @@protoc_insertion_point(class_scope:Menu)
  private static final pl.afornalik.bar.model.Menu DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new pl.afornalik.bar.model.Menu();
  }

  public static pl.afornalik.bar.model.Menu getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Menu>
      PARSER = new com.google.protobuf.AbstractParser<Menu>() {
    public Menu parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Menu(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Menu> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Menu> getParserForType() {
    return PARSER;
  }

  public pl.afornalik.bar.model.Menu getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
