package com.fabrosoft.greendaoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button retriveBtn;
    UserDao userDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        retriveBtn=findViewById(R.id.retriveBTN);
         userDao = ((DemoDatabaseApp)getApplication()).getDaoSession().getUserDao();
        userDao.insertOrReplace(new User(1L, "Franklin Jino","1111", "2222"));
        Toast.makeText(MainActivity.this,"Insert Successfully",Toast.LENGTH_LONG).show();

        retriveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              List<User> userDao=  ((DemoDatabaseApp)getApplication()).getDaoSession().getUserDao().loadAll();
              Toast.makeText(MainActivity.this, userDao.get(0).getName(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
