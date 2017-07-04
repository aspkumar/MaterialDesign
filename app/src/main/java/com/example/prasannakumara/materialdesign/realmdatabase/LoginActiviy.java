package com.example.prasannakumara.materialdesign.realmdatabase;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.prasannakumara.materialdesign.R;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by PrasannakumarA on 6/6/2017.
 */

public class LoginActiviy extends AppCompatActivity {

    EditText name, age;
    Button save, click;
    Realm realm;
    TextView log, specific;
    RealnModel user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_login);

        name = (EditText) findViewById(R.id.name_TV);
        age = (EditText) findViewById(R.id.age_TV);
        save = (Button) findViewById(R.id.save_BTN);
        log = (TextView) findViewById(R.id.log_TV);
        specific = (TextView) findViewById(R.id.specific_TV);
        click = (Button) findViewById(R.id.specificbtn_TV);

        Realm.init(getApplicationContext());
        realm = Realm.getDefaultInstance();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//TODO: add validation
                save_into_database(name.getText().toString().trim(), Integer.parseInt(age.getText().toString().trim()));
                refresh_Views();
            }

            private void refresh_Views() {

                // Build the query looking at all users:
//                RealmQuery<RealnModel> query = realm.where(RealnModel.class);

//// Add query conditions:
//                query.equalTo("name", "John");
//                query.or().equalTo("name", "Peter");
//
//// Execute the query:
//                RealmResults<User> result1 = query.findAll();

// Or alternatively do the same all at once (the "Fluent interface"):
                RealmResults<RealnModel> result2 = realm.where(RealnModel.class).findAll();
                String output = "";
                for (RealnModel real : result2) {
                    output += real.toString();
                }
                log.setText(output);
            }
        });


        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlete_from_database();
            }
        });



    }

    private void save_into_database(final String name, final int age) {
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm bgRealm) {
                user = bgRealm.createObject(RealnModel.class);
                user.setName(name);
                user.setAge(age);
            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {

                // Transaction was a success.
                Log.v("database", ">>>>>>>stored ok<<<<<<<<<");
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                // Transaction failed and was automatically canceled.
                Log.e("database", error.getMessage());

            }
        });
    }

    public void dlete_from_database() {
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
// Or alternatively do the same all at once (the "Fluent interface"):
                RealmResults<RealnModel> result3 = realm.where(RealnModel.class)
                        .equalTo("name", "sai")
                        .findAll();
              String re=result3.toString();
                specific.setText(re);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }
}
