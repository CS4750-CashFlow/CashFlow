package com.cs4750.team15.expensetracker.expenselist;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.UUID;

public class ExpenseDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ExpenseDetailFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private ExpenseDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static ExpenseDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ExpenseDetailFragmentArgs __result = new ExpenseDetailFragmentArgs();
    bundle.setClassLoader(ExpenseDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("expenseId")) {
      UUID expenseId;
      if (Parcelable.class.isAssignableFrom(UUID.class) || Serializable.class.isAssignableFrom(UUID.class)) {
        expenseId = (UUID) bundle.get("expenseId");
      } else {
        throw new UnsupportedOperationException(UUID.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (expenseId == null) {
        throw new IllegalArgumentException("Argument \"expenseId\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("expenseId", expenseId);
    } else {
      throw new IllegalArgumentException("Required argument \"expenseId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ExpenseDetailFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    ExpenseDetailFragmentArgs __result = new ExpenseDetailFragmentArgs();
    if (savedStateHandle.contains("expenseId")) {
      UUID expenseId;
      expenseId = savedStateHandle.get("expenseId");
      if (expenseId == null) {
        throw new IllegalArgumentException("Argument \"expenseId\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("expenseId", expenseId);
    } else {
      throw new IllegalArgumentException("Required argument \"expenseId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public UUID getExpenseId() {
    return (UUID) arguments.get("expenseId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("expenseId")) {
      UUID expenseId = (UUID) arguments.get("expenseId");
      if (Parcelable.class.isAssignableFrom(UUID.class) || expenseId == null) {
        __result.putParcelable("expenseId", Parcelable.class.cast(expenseId));
      } else if (Serializable.class.isAssignableFrom(UUID.class)) {
        __result.putSerializable("expenseId", Serializable.class.cast(expenseId));
      } else {
        throw new UnsupportedOperationException(UUID.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("expenseId")) {
      UUID expenseId = (UUID) arguments.get("expenseId");
      if (Parcelable.class.isAssignableFrom(UUID.class) || expenseId == null) {
        __result.set("expenseId", Parcelable.class.cast(expenseId));
      } else if (Serializable.class.isAssignableFrom(UUID.class)) {
        __result.set("expenseId", Serializable.class.cast(expenseId));
      } else {
        throw new UnsupportedOperationException(UUID.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ExpenseDetailFragmentArgs that = (ExpenseDetailFragmentArgs) object;
    if (arguments.containsKey("expenseId") != that.arguments.containsKey("expenseId")) {
      return false;
    }
    if (getExpenseId() != null ? !getExpenseId().equals(that.getExpenseId()) : that.getExpenseId() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getExpenseId() != null ? getExpenseId().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ExpenseDetailFragmentArgs{"
        + "expenseId=" + getExpenseId()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull ExpenseDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull UUID expenseId) {
      if (expenseId == null) {
        throw new IllegalArgumentException("Argument \"expenseId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("expenseId", expenseId);
    }

    @NonNull
    public ExpenseDetailFragmentArgs build() {
      ExpenseDetailFragmentArgs result = new ExpenseDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setExpenseId(@NonNull UUID expenseId) {
      if (expenseId == null) {
        throw new IllegalArgumentException("Argument \"expenseId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("expenseId", expenseId);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public UUID getExpenseId() {
      return (UUID) arguments.get("expenseId");
    }
  }
}
