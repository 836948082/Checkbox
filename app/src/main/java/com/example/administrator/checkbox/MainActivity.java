package com.example.administrator.checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button btn;
    PayRadioPurified a;
    PayRadioPurified b;
    PayRadioPurified c;
    PayRadioPurified d;
    String temp = "支付宝客户端支付";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        PayRadioGroup group = (PayRadioGroup) findViewById(R.id.genderGroup);
        a = (PayRadioPurified) findViewById(R.id.p1);
        a.setChangeImg(R.id.p1);
        b = (PayRadioPurified) findViewById(R.id.p2);
        c = (PayRadioPurified) findViewById(R.id.p3);
        d = (PayRadioPurified) findViewById(R.id.p4);
        group.setOnCheckedChangeListener(new PayRadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(PayRadioGroup group, int checkedId) {

                int radioButtonId = group.getCheckedRadioButtonId();

                if (a.getId() == checkedId) {
                    temp = "支付宝客户端支付";
                } else if (b.getId() == checkedId) {
                    temp = "支付宝网页支付";
                } else if (c.getId() == checkedId) {
                    temp = "银联支付";
                } else if (d.getId() == checkedId) {
                    temp = "财付通支付";
                }

                PayRadioPurified rl = (PayRadioPurified) MainActivity.this.findViewById(radioButtonId);
                for (int i = 0; i < group.getChildCount(); i++) {
                    ((PayRadioPurified) group.getChildAt(i)).setChangeImg(checkedId);
                }
//                Toast.makeText(MainActivity.this, temp, Toast.LENGTH_SHORT).show();
//                Log.e("aa",rl.getTextTitle());
            }
        });
        btn = (Button) findViewById(R.id.btn_pay);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, temp + "支付", Toast.LENGTH_LONG).show();
                Log.i("aa", "支付方式" + temp);
            }
        });

    }


//    private boolean isSelected = false ;
//    private Button btn;
//    RadioGroup rg;
//    RadioButton yl;
//    RadioButton zfb;
//    String temp=null;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        rg = (RadioGroup) findViewById(R.id.rg);
//        yl = (RadioButton) findViewById(R.id.yinlian);
//        zfb = (RadioButton) findViewById(R.id.zfb);
//
//        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//
//                if (yl.getId() == i){
//                    temp = "银联";
//                }else {
//                    temp = "支付宝";
//                }
////                Toast.makeText(MainActivity.this,temp+"",Toast.LENGTH_LONG).show();
//            }
//        });
//
//        btn = (Button) findViewById(R.id.btn_pay);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if ("银联".equals(temp)){
//                    Toast.makeText(MainActivity.this,"银联支付",Toast.LENGTH_LONG).show();
//                }else if ("支付宝".equals(temp)){
//                    Toast.makeText(MainActivity.this,"支付宝支付",Toast.LENGTH_LONG).show();
//                }
//
////                Toast.makeText(MainActivity.this,temp+"支付",Toast.LENGTH_LONG).show();
//                Log.i("aa","支付方式"+temp);
//            }
//        });
//    }
}
