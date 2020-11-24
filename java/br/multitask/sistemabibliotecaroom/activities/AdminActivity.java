package br.multitask.sistemabibliotecaroom.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.multitask.sistemabibliotecaroom.AppDataBase;
import br.multitask.sistemabibliotecaroom.Book;
import br.multitask.sistemabibliotecaroom.R;

public class AdminActivity extends Activity {

    public Button addBook = findViewById(R.id.btn_addBook);
    public Button delBook = findViewById(R.id.Btn_delBook);
    public EditText nameBook = findViewById(R.id.nameBook);
    public EditText codBook = findViewById(R.id.codBook);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        addBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book = new Book();
                book.setName(nameBook.getText().toString());
                book.setCod(codBook.getText().toString());

                AppDataBase.getConnection(getApplicationContext()).bookDao().insertAll(book);
            }
        });

    }
}
