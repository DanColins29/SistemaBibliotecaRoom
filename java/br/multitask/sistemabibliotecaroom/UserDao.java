package br.multitask.sistemabibliotecaroom;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM users")
    List<User> getAll();

    @Query("SELECT * FROM users WHERE code IN (:code)")
    List<User> findByCode(String code);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);
}
