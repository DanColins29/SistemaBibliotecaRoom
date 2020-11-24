package br.multitask.sistemabibliotecaroom;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface BookDao {
    @Query("SELECT * FROM books")
    List<Book> getAll();

    @Query("SELECT * FROM books WHERE code In (:code)")
    List<Book> findByCode(String code);

    @Insert
    void insertAll(Book... books);

    @Delete
    void delete(Book book);
}
