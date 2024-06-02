package com.cs4750.team15.expensetracker.spendinganalysis;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SpendingAnalysisFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private SpendingAnalysisFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private SpendingAnalysisFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SpendingAnalysisFragmentArgs fromBundle(@NonNull Bundle bundle) {
    SpendingAnalysisFragmentArgs __result = new SpendingAnalysisFragmentArgs();
    bundle.setClassLoader(SpendingAnalysisFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("budget")) {
      float budget;
      budget = bundle.getFloat("budget");
      __result.arguments.put("budget", budget);
    } else {
      throw new IllegalArgumentException("Required argument \"budget\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SpendingAnalysisFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    SpendingAnalysisFragmentArgs __result = new SpendingAnalysisFragmentArgs();
    if (savedStateHandle.contains("budget")) {
      float budget;
      budget = savedStateHandle.get("budget");
      __result.arguments.put("budget", budget);
    } else {
      throw new IllegalArgumentException("Required argument \"budget\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public float getBudget() {
    return (float) arguments.get("budget");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("budget")) {
      float budget = (float) arguments.get("budget");
      __result.putFloat("budget", budget);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("budget")) {
      float budget = (float) arguments.get("budget");
      __result.set("budget", budget);
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
    SpendingAnalysisFragmentArgs that = (SpendingAnalysisFragmentArgs) object;
    if (arguments.containsKey("budget") != that.arguments.containsKey("budget")) {
      return false;
    }
    if (Float.compare(that.getBudget(), getBudget()) != 0) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + Float.floatToIntBits(getBudget());
    return result;
  }

  @Override
  public String toString() {
    return "SpendingAnalysisFragmentArgs{"
        + "budget=" + getBudget()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull SpendingAnalysisFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(float budget) {
      this.arguments.put("budget", budget);
    }

    @NonNull
    public SpendingAnalysisFragmentArgs build() {
      SpendingAnalysisFragmentArgs result = new SpendingAnalysisFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setBudget(float budget) {
      this.arguments.put("budget", budget);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public float getBudget() {
      return (float) arguments.get("budget");
    }
  }
}
