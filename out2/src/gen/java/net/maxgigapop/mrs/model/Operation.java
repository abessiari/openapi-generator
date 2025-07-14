package net.maxgigapop.mrs.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Operation
 */
public enum Operation {
  
  CANCEL("cancel"),
  
  FORCE_CANCEL("force_cancel"),
  
  RELEASE("release"),
  
  FORCE_RELEASE("force_release"),
  
  PROVISION("provision"),
  
  REINSTATE("reinstate"),
  
  ROLLBACK("rollback"),
  
  FORCE_RETRY("force_retry"),
  
  DELETE("delete"),
  
  FORCE_DELETE("force_delete"),
  
  ARCHIVE("archive"),
  
  UNARCHIVE("unarchive"),
  
  RESET("reset"),
  
  VERIFY("verify"),
  
  UNVERIFY("unverify");

  private String value;

  Operation(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static Operation fromString(String s) {
      for (Operation b : Operation.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Operation fromValue(String value) {
    for (Operation b : Operation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


