package com.mabble.retreat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ShowAllOptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("   Amayaan");
        setContentView(R.layout.activity_show_all_option);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
