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
import java.util.HashMap;
import java.util.UUID;

public class ExpenseListFragmentDirections {
  private ExpenseListFragmentDirections() {
  }

  @NonNull
  public static ShowExpenseDetail showExpenseDetail(@NonNull UUID expenseId) {
    return new ShowExpenseDetail(expenseId);
  }

  public static class ShowExpenseDetail implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ShowExpenseDetail(@NonNull UUID expenseId) {
      if (expenseId == null) {
        throw new IllegalArgumentException("Argument \"expenseId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("expenseId", expenseId);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ShowExpenseDetail setExpenseId(@NonNull UUID expenseId) {
      if (expenseId == null) {
        throw new IllegalArgumentException("Argument \"expenseId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("expenseId", expenseId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.show_expense_detail;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public UUID getExpenseId() {
      return (UUID) arguments.get("expenseId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ShowExpenseDetail that = (ShowExpenseDetail) object;
      if (arguments.containsKey("expenseId") != that.arguments.containsKey("expenseId")) {
        return false;
      }
      if (getExpenseId() != null ? !getExpenseId().equals(that.getExpenseId()) : that.getExpenseId() != null) {
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
      result = 31 * result + (getExpenseId() != null ? getExpenseId().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ShowExpenseDetail(actionId=" + getActionId() + "){"
          + "expenseId=" + getExpenseId()
          + "}";
    }
  }
}
