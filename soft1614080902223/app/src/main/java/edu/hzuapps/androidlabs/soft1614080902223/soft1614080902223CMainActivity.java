package edu.hzuapps.androidlabs.soft1614080902223;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class soft1614080902223CMainActivity extends AppCompatActivity {

    private Button delete,return01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soft1614080902223_cmain);
        delete=(Button)findViewById(R.id.button_delete);
        return01=(Button)findViewById(R.id.button_return);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(soft1614080902223CMainActivity.this,soft1614080902223BMainActivity.class);
                startActivity(intent);
            }
        });
        return01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(soft1614080902223CMainActivity.this,soft1614080902223BMainActivity.class);
                startActivity(intent);
            }
        });
    }

}
