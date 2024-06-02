package com.cs4750.team15.expensetracker.expenselist;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.cs4750.team15.expensetracker.R;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Date;
import java.util.HashMap;

public class ExpenseDetailFragmentDirections {
  private ExpenseDetailFragmentDirections() {
  }

  @NonNull
  public static SelectDate selectDate(@NonNull Date expenseDate) {
    return new SelectDate(expenseDate);
  }

  public static class SelectDate implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private SelectDate(@NonNull Date expenseDate) {
      if (expenseDate == null) {
        throw new IllegalArgumentException("Argument \"expenseDate\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("expenseDate", expenseDate);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public SelectDate setExpenseDate(@NonNull Date expenseDate) {
      if (expenseDate == null) {
        throw new IllegalArgumentException("Argument \"expenseDate\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("expenseDate", expenseDate);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.select_date;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Date getExpenseDate() {
      return (Date) arguments.get("expenseDate");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      SelectDate that = (SelectDate) object;
      if (arguments.containsKey("expenseDate") != that.arguments.containsKey("expenseDate")) {
        return false;
      }
      if (getExpenseDate() != null ? !getExpenseDate().equals(that.getExpenseDate()) : that.getExpenseDate() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getExpenseDate() != null ? getExpenseDate().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "SelectDate(actionId=" + getActionId() + "){"
          + "expenseDate=" + getExpenseDate()
          + "}";
    }
  }
}
