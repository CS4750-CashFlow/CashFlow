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
import java.util.Date;
import java.util.HashMap;

public class DatePickerFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DatePickerFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DatePickerFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static DatePickerFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DatePickerFragmentArgs __result = new DatePickerFragmentArgs();
    bundle.setClassLoader(DatePickerFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("expenseDate")) {
      Date expenseDate;
      if (Parcelable.class.isAssignableFrom(Date.class) || Serializable.class.isAssignableFrom(Date.class)) {
        expenseDate = (Date) bundle.get("expenseDate");
      } else {
        throw new UnsupportedOperationException(Date.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (expenseDate == null) {
        throw new IllegalArgumentException("Argument \"expenseDate\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("expenseDate", expenseDate);
    } else {
      throw new IllegalArgumentException("Required argument \"expenseDate\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DatePickerFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    DatePickerFragmentArgs __result = new DatePickerFragmentArgs();
    if (savedStateHandle.contains("expenseDate")) {
      Date expenseDate;
      expenseDate = savedStateHandle.get("expenseDate");
      if (expenseDate == null) {
        throw new IllegalArgumentException("Argument \"expenseDate\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("expenseDate", expenseDate);
    } else {
      throw new IllegalArgumentException("Required argument \"expenseDate\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Date getExpenseDate() {
    return (Date) arguments.get("expenseDate");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("expenseDate")) {
      Date expenseDate = (Date) arguments.get("expenseDate");
      if (Parcelable.class.isAssignableFrom(Date.class) || expenseDate == null) {
        __result.putParcelable("expenseDate", Parcelable.class.cast(expenseDate));
      } else if (Serializable.class.isAssignableFrom(Date.class)) {
        __result.putSerializable("expenseDate", Serializable.class.cast(expenseDate));
      } else {
        throw new UnsupportedOperationException(Date.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("expenseDate")) {
      Date expenseDate = (Date) arguments.get("expenseDate");
      if (Parcelable.class.isAssignableFrom(Date.class) || expenseDate == null) {
        __result.set("expenseDate", Parcelable.class.cast(expenseDate));
      } else if (Serializable.class.isAssignableFrom(Date.class)) {
        __result.set("expenseDate", Serializable.class.cast(expenseDate));
      } else {
        throw new UnsupportedOperationException(Date.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
    DatePickerFragmentArgs that = (DatePickerFragmentArgs) object;
    if (arguments.containsKey("expenseDate") != that.arguments.containsKey("expenseDate")) {
      return false;
    }
    if (getExpenseDate() != null ? !getExpenseDate().equals(that.getExpenseDate()) : that.getExpenseDate() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getExpenseDate() != null ? getExpenseDate().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DatePickerFragmentArgs{"
        + "expenseDate=" + getExpenseDate()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull DatePickerFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Date expenseDate) {
      if (expenseDate == null) {
        throw new IllegalArgumentException("Argument \"expenseDate\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("expenseDate", expenseDate);
    }

    @NonNull
    public DatePickerFragmentArgs build() {
      DatePickerFragmentArgs result = new DatePickerFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setExpenseDate(@NonNull Date expenseDate) {
      if (expenseDate == null) {
        throw new IllegalArgumentException("Argument \"expenseDate\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("expenseDate", expenseDate);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Date getExpenseDate() {
      return (Date) arguments.get("expenseDate");
    }
  }
}
