package com.ehighsun.dialogfragmentpractice;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by Administrator on 2017/12/5 0005.
 */

public class MyDialog2 extends DialogFragment implements View.OnClickListener {
    private Button btn_v1;
    private Button btn_v2;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_v1,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        btn_v1 = view.findViewById(R.id.btn_v1);
        btn_v2 = view.findViewById(R.id.btn_v2);
        btn_v1.setOnClickListener(this);
        btn_v2.setOnClickListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog =getDialog();//获取Dialog
        WindowManager.LayoutParams attr = dialog.getWindow().getAttributes();//获取Dialog属性
        WindowManager wm= (WindowManager) dialog.getContext().getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetric=new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetric);
        attr.width= (outMetric.widthPixels);
        attr.gravity= Gravity.BOTTOM;
        attr.windowAnimations = R.style.pop_add_ainm;
        dialog.getWindow().setAttributes(attr);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_v1:
                dismiss();
                break;
            case R.id.btn_v2:
                dismiss();
                break;
        }
    }
}
