package br.multitask.sistemabibliotecaroom;

import androidx.room.RoomDatabase;

public abstract class AppDataBase extends RoomDatabase {
    public abstract UserDAO userDAO();
    public abstract Book book();
    public abstract User user();
}
