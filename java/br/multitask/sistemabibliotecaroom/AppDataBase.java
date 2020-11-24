package br.multitask.sistemabibliotecaroom;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Book.class, User.class}, version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {

    public abstract BookDao bookDao();
    public abstract UserDao userDao();

    public static AppDataBase getConnection(Context appContext){
        return Room.databaseBuilder(appContext,
                AppDataBase.class, "app_database").build();
    }
}
