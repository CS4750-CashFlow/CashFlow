package com.cs4750.team15.expensetracker;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class WelcomeFragmentDirections {
  private WelcomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections showExpenseList() {
    return new ActionOnlyNavDirections(R.id.show_expense_list);
  }

  @NonNull
  public static ShowSpendingAnalysis showSpendingAnalysis(float budget) {
    return new ShowSpendingAnalysis(budget);
  }

  @NonNull
  public static NavDirections showChat() {
    return new ActionOnlyNavDirections(R.id.show_chat);
  }

  public static class ShowSpendingAnalysis implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ShowSpendingAnalysis(float budget) {
      this.arguments.put("budget", budget);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ShowSpendingAnalysis setBudget(float budget) {
      this.arguments.put("budget", budget);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("budget")) {
        float budget = (float) arguments.get("budget");
        __result.putFloat("budget", budget);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.show_spending_analysis;
    }

    @SuppressWarnings("unchecked")
    public float getBudget() {
      return (float) arguments.get("budget");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ShowSpendingAnalysis that = (ShowSpendingAnalysis) object;
      if (arguments.containsKey("budget") != that.arguments.containsKey("budget")) {
        return false;
      }
      if (Float.compare(that.getBudget(), getBudget()) != 0) {
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
      result = 31 * result + Float.floatToIntBits(getBudget());
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ShowSpendingAnalysis(actionId=" + getActionId() + "){"
          + "budget=" + getBudget()
          + "}";
    }
  }
}
