package com.ehighsun.dialogfragmentpractice;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_1;
    private Button btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_1:
                MyDialog1 myDialog1 = new MyDialog1();
                myDialog1.setCancelable(false);
                myDialog1.setStyle(DialogFragment.STYLE_NO_TITLE,R.style.MyDialog);
                myDialog1.show(getFragmentManager(),"myDialog1");
                break;
            case R.id.btn_2:
                MyDialog2 myDialog2 = new MyDialog2();
                myDialog2.setCancelable(false);
                myDialog2.setStyle(DialogFragment.STYLE_NORMAL,R.style.MyDialog1);
                myDialog2.show(getFragmentManager(),"myDialog1");
                break;
        }
    }
}
