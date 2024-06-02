package com.cs4750.team15.expensetracker.expenselist.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.UUIDUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.cs4750.team15.expensetracker.expenselist.Expense;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ExpenseDao_Impl implements ExpenseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Expense> __insertionAdapterOfExpense;

  private final ExpenseTypeConverters __expenseTypeConverters = new ExpenseTypeConverters();

  private final EntityDeletionOrUpdateAdapter<Expense> __deletionAdapterOfExpense;

  private final EntityDeletionOrUpdateAdapter<Expense> __updateAdapterOfExpense;

  public ExpenseDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExpense = new EntityInsertionAdapter<Expense>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `Expense` (`id`,`title`,`date`,`amount`,`category`,`photoFileName`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final Expense entity) {
        statement.bindBlob(1, UUIDUtil.convertUUIDToByte(entity.getId()));
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        final long _tmp = __expenseTypeConverters.fromDate(entity.getDate());
        statement.bindLong(3, _tmp);
        statement.bindDouble(4, entity.getAmount());
        if (entity.getCategory() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getCategory());
        }
        if (entity.getPhotoFileName() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getPhotoFileName());
        }
      }
    };
    this.__deletionAdapterOfExpense = new EntityDeletionOrUpdateAdapter<Expense>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `Expense` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final Expense entity) {
        statement.bindBlob(1, UUIDUtil.convertUUIDToByte(entity.getId()));
      }
    };
    this.__updateAdapterOfExpense = new EntityDeletionOrUpdateAdapter<Expense>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `Expense` SET `id` = ?,`title` = ?,`date` = ?,`amount` = ?,`category` = ?,`photoFileName` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final Expense entity) {
        statement.bindBlob(1, UUIDUtil.convertUUIDToByte(entity.getId()));
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        final long _tmp = __expenseTypeConverters.fromDate(entity.getDate());
        statement.bindLong(3, _tmp);
        statement.bindDouble(4, entity.getAmount());
        if (entity.getCategory() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getCategory());
        }
        if (entity.getPhotoFileName() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getPhotoFileName());
        }
        statement.bindBlob(7, UUIDUtil.convertUUIDToByte(entity.getId()));
      }
    };
  }

  @Override
  public Object addExpense(final Expense expense, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfExpense.insert(expense);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteExpense(final Expense expense, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfExpense.handle(expense);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateExpense(final Expense expense, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfExpense.handle(expense);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<Expense>> getExpenses() {
    final String _sql = "SELECT * FROM expense";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"expense"}, new Callable<List<Expense>>() {
      @Override
      @NonNull
      public List<Expense> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfPhotoFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "photoFileName");
          final List<Expense> _result = new ArrayList<Expense>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Expense _item;
            final UUID _tmpId;
            _tmpId = UUIDUtil.convertByteToUUID(_cursor.getBlob(_cursorIndexOfId));
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Date _tmpDate;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfDate);
            _tmpDate = __expenseTypeConverters.toDate(_tmp);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpPhotoFileName;
            if (_cursor.isNull(_cursorIndexOfPhotoFileName)) {
              _tmpPhotoFileName = null;
            } else {
              _tmpPhotoFileName = _cursor.getString(_cursorIndexOfPhotoFileName);
            }
            _item = new Expense(_tmpId,_tmpTitle,_tmpDate,_tmpAmount,_tmpCategory,_tmpPhotoFileName);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<Expense> getSimpleExpenses() {
    final String _sql = "SELECT * FROM expense";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfPhotoFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "photoFileName");
      final List<Expense> _result = new ArrayList<Expense>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Expense _item;
        final UUID _tmpId;
        _tmpId = UUIDUtil.convertByteToUUID(_cursor.getBlob(_cursorIndexOfId));
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final Date _tmpDate;
        final long _tmp;
        _tmp = _cursor.getLong(_cursorIndexOfDate);
        _tmpDate = __expenseTypeConverters.toDate(_tmp);
        final double _tmpAmount;
        _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
        final String _tmpCategory;
        if (_cursor.isNull(_cursorIndexOfCategory)) {
          _tmpCategory = null;
        } else {
          _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        }
        final String _tmpPhotoFileName;
        if (_cursor.isNull(_cursorIndexOfPhotoFileName)) {
          _tmpPhotoFileName = null;
        } else {
          _tmpPhotoFileName = _cursor.getString(_cursorIndexOfPhotoFileName);
        }
        _item = new Expense(_tmpId,_tmpTitle,_tmpDate,_tmpAmount,_tmpCategory,_tmpPhotoFileName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object getExpense(final UUID id, final Continuation<? super Expense> $completion) {
    final String _sql = "SELECT * FROM expense WHERE id=(?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindBlob(_argIndex, UUIDUtil.convertUUIDToByte(id));
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Expense>() {
      @Override
      @NonNull
      public Expense call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfPhotoFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "photoFileName");
          final Expense _result;
          if (_cursor.moveToFirst()) {
            final UUID _tmpId;
            _tmpId = UUIDUtil.convertByteToUUID(_cursor.getBlob(_cursorIndexOfId));
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Date _tmpDate;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfDate);
            _tmpDate = __expenseTypeConverters.toDate(_tmp);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpPhotoFileName;
            if (_cursor.isNull(_cursorIndexOfPhotoFileName)) {
              _tmpPhotoFileName = null;
            } else {
              _tmpPhotoFileName = _cursor.getString(_cursorIndexOfPhotoFileName);
            }
            _result = new Expense(_tmpId,_tmpTitle,_tmpDate,_tmpAmount,_tmpCategory,_tmpPhotoFileName);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
