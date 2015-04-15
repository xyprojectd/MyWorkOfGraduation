package com.jikexueyuan.zitao.myworkofgraduation;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by zitao on 15-4-5.
 */
public class Aty1 extends Activity {

    private Button btnInsert, btnDelete, btnClear;
    protected EditText editTextInsertValue, editTextInsertPosition, editTextDeletePosition;
    private final int maxPosition = 12;
    private int length = 1;
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11, tv12, lengthShow, maxSize;


    //还可以在界面中加入maxSize以及length

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty1_layout);

        lengthShow = (TextView) findViewById(R.id.Length);
        maxSize = (TextView) findViewById(R.id.maxSize);
        btnInsert = (Button) findViewById(R.id.btnInsert);
        editTextInsertPosition = (EditText) findViewById(R.id.editTextInsertPosition);
        editTextInsertValue = (EditText) findViewById(R.id.editTextInsertValue);

        editTextInsertPosition.setInputType(EditorInfo.TYPE_CLASS_PHONE);
        editTextInsertValue.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView4);
        tv5 = (TextView) findViewById(R.id.textView5);
        tv6 = (TextView) findViewById(R.id.textView6);
        tv7 = (TextView) findViewById(R.id.textView7);
        tv8 = (TextView) findViewById(R.id.textView8);
        tv9 = (TextView) findViewById(R.id.textView9);
        tv10 = (TextView) findViewById(R.id.textView10);
        tv11 = (TextView) findViewById(R.id.textView11);
        tv12 = (TextView) findViewById(R.id.textView12);



        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (TextUtils.isEmpty(editTextInsertValue.getText()) || TextUtils.isEmpty(editTextInsertPosition.getText())) {
                    Toast.makeText(Aty1.this, "插入位置和值不能为空", Toast.LENGTH_SHORT).show();

                } else if (Integer.parseInt(editTextInsertPosition.getText().toString(), 10) > maxPosition
                        || Integer.parseInt(editTextInsertPosition.getText().toString(), 10) <= 0
                        || Integer.parseInt(editTextInsertPosition.getText().toString(), 10) > length) {

                    Toast.makeText(Aty1.this, "插入位置不合理", Toast.LENGTH_SHORT).show();

                } else {


                    if (length > maxPosition) {
                        Toast.makeText(Aty1.this, "空间已满，不能插入", Toast.LENGTH_SHORT).show();
                    } else {

                        switch (Integer.parseInt(editTextInsertPosition.getText().toString(), 10)) {
                            case 1:
                                if (tv1.getText()=="") {

                                    tv1.setText(editTextInsertValue.getText());
//                                    tv1.setTextColor(0x00FFCC00);
                                    length++;
                                    showLength();

                                } else if (tv1.getTextSize() > 0) {
                                    tv12.setText(tv11.getText());
                                    tv11.setText(tv10.getText());
                                    tv10.setText(tv9.getText());
                                    tv9.setText(tv8.getText());
                                    tv8.setText(tv7.getText());
                                    tv7.setText(tv6.getText());
                                    tv6.setText(tv5.getText());
                                    tv5.setText(tv4.getText());
                                    tv4.setText(tv3.getText());
                                    tv3.setText(tv2.getText());
                                    tv2.setText(tv1.getText());
                                    tv1.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                }
                                break;
                            case 2:
                                if (tv2.getTextSize() == 0) {

                                    tv2.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                } else if (tv2.getTextSize() > 0) {
                                    tv12.setText(tv11.getText());
                                    tv11.setText(tv10.getText());
                                    tv10.setText(tv9.getText());
                                    tv9.setText(tv8.getText());
                                    tv8.setText(tv7.getText());
                                    tv7.setText(tv6.getText());
                                    tv6.setText(tv5.getText());
                                    tv5.setText(tv4.getText());
                                    tv4.setText(tv3.getText());
                                    tv3.setText(tv2.getText());
                                    tv2.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                }
                                break;
                            case 3:
                                if (tv3.getTextSize() == 0) {

                                    tv3.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                } else if (tv3.getTextSize() > 0) {
                                    tv12.setText(tv11.getText());
                                    tv11.setText(tv10.getText());
                                    tv10.setText(tv9.getText());
                                    tv9.setText(tv8.getText());
                                    tv8.setText(tv7.getText());
                                    tv7.setText(tv6.getText());
                                    tv6.setText(tv5.getText());
                                    tv5.setText(tv4.getText());
                                    tv4.setText(tv3.getText());
                                    tv3.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                }
                                break;
                            case 4:
                                if (tv4.getTextSize() == 0) {

                                    tv4.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                } else if (tv4.getTextSize() > 0) {
                                    tv12.setText(tv11.getText());
                                    tv11.setText(tv10.getText());
                                    tv10.setText(tv9.getText());
                                    tv9.setText(tv8.getText());
                                    tv8.setText(tv7.getText());
                                    tv7.setText(tv6.getText());
                                    tv6.setText(tv5.getText());
                                    tv5.setText(tv4.getText());
                                    tv4.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                }
                                break;
                            case 5:
                                if (tv5.getTextSize() == 0) {

                                    tv5.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                } else if (tv5.getTextSize() > 0) {
                                    tv12.setText(tv11.getText());
                                    tv11.setText(tv10.getText());
                                    tv10.setText(tv9.getText());
                                    tv9.setText(tv8.getText());
                                    tv8.setText(tv7.getText());
                                    tv7.setText(tv6.getText());
                                    tv6.setText(tv5.getText());
                                    tv5.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                }
                                break;
                            case 6:
                                if (tv6.getTextSize() == 0) {

                                    tv6.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                } else if (tv6.getTextSize() > 0) {
                                    tv12.setText(tv11.getText());
                                    tv11.setText(tv10.getText());
                                    tv10.setText(tv9.getText());
                                    tv9.setText(tv8.getText());
                                    tv8.setText(tv7.getText());
                                    tv7.setText(tv6.getText());
                                    tv6.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                }
                                break;
                            case 7:
                                if (tv7.getTextSize() == 0) {

                                    tv7.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();


                                } else if (tv7.getTextSize() > 0) {
                                    tv12.setText(tv11.getText());
                                    tv11.setText(tv10.getText());
                                    tv10.setText(tv9.getText());
                                    tv9.setText(tv8.getText());
                                    tv8.setText(tv7.getText());
                                    tv7.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                }
                                break;
                            case 8:
                                if (tv8.getTextSize() == 0) {

                                    tv8.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                } else if (tv8.getTextSize() > 0) {
                                    tv12.setText(tv11.getText());
                                    tv11.setText(tv10.getText());
                                    tv10.setText(tv9.getText());
                                    tv9.setText(tv8.getText());
                                    tv8.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                }
                                break;
                            case 9:
                                if (tv9.getTextSize() == 0) {

                                    tv9.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                } else if (tv9.getTextSize() > 0) {
                                    tv12.setText(tv11.getText());
                                    tv11.setText(tv10.getText());
                                    tv10.setText(tv9.getText());
                                    tv9.setText(editTextInsertValue.getText());

                                    length++;
                                    showLength();

                                }
                                break;
                            case 10:
                                if (tv10.getTextSize() == 0) {

                                    tv10.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                } else if (tv10.getTextSize() > 0) {
                                    tv12.setText(tv11.getText());
                                    tv11.setText(tv10.getText());
                                    tv10.setText(editTextInsertValue.getText());

                                    length++;
                                    showLength();

                                }
                                break;

                            case 11:
                                if (tv11.getTextSize() == 0) {

                                    tv11.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                } else if (tv11.getTextSize() > 0) {
                                    tv12.setText(tv11.getText());
                                    tv11.setText(editTextInsertValue.getText());

                                    length++;
                                    showLength();

                                }
                                break;
                            case 12:
                                if (tv12.getTextSize() == 0) {

                                    tv12.setText(editTextInsertValue.getText());
                                    length++;
                                    showLength();

                                }
                                break;

                        }
                    }

                }

            }
        });


        btnDelete = (Button) findViewById(R.id.btnDelete);
        editTextDeletePosition = (EditText) findViewById(R.id.editTextDeletePosition);

        editTextDeletePosition.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(editTextDeletePosition.getText())) {
                    Toast.makeText(Aty1.this, "删除位置不能为空", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(editTextDeletePosition.getText().toString(), 10) > maxPosition
                        || Integer.parseInt(editTextDeletePosition.getText().toString(), 10) < 0
                        || Integer.parseInt(editTextDeletePosition.getText().toString(), 10) > length) {
                    Toast.makeText(Aty1.this, "删除位置不合理", Toast.LENGTH_SHORT).show();
                }else{

                    if(length <= 1){
                        Toast.makeText(Aty1.this, "全部元素已删除", Toast.LENGTH_SHORT).show();
                    }else{

                        switch (Integer.parseInt(editTextDeletePosition.getText().toString(), 10)){
                            case 1:
                                if(tv1.getTextSize()>0){
                                    tv1.setText(tv2.getText());
                                    tv2.setText(tv3.getText());
                                    tv3.setText(tv4.getText());
                                    tv4.setText(tv5.getText());
                                    tv5.setText(tv6.getText());
                                    tv6.setText(tv7.getText());
                                    tv7.setText(tv8.getText());
                                    tv8.setText(tv9.getText());
                                    tv9.setText(tv10.getText());
                                    tv10.setText(tv11.getText());
                                    tv11.setText(tv12.getText());
                                    tv12.setText("");

                                    length--;
                                    showLength();

                                }
                                break;
                            case 2:
                                if(tv2.getTextSize()>0){
                                    tv2.setText(tv3.getText());
                                    tv3.setText(tv4.getText());
                                    tv4.setText(tv5.getText());
                                    tv5.setText(tv6.getText());
                                    tv6.setText(tv7.getText());
                                    tv7.setText(tv8.getText());
                                    tv8.setText(tv9.getText());
                                    tv9.setText(tv10.getText());
                                    tv10.setText(tv11.getText());
                                    tv11.setText(tv12.getText());
                                    tv12.setText("");

                                    length--;
                                    showLength();

                                }else{
                                    Toast.makeText(Aty1.this, "元素已经为空，不能删除", Toast.LENGTH_SHORT).show();
                                }
                                break;
                            case 3:
                                if(tv3.getTextSize()>0){
                                    tv3.setText(tv4.getText());
                                    tv4.setText(tv5.getText());
                                    tv5.setText(tv6.getText());
                                    tv6.setText(tv7.getText());
                                    tv7.setText(tv8.getText());
                                    tv8.setText(tv9.getText());
                                    tv9.setText(tv10.getText());
                                    tv10.setText(tv11.getText());
                                    tv11.setText(tv12.getText());
                                    tv12.setText("");

                                    length--;
                                    showLength();

                                }else{
                                    Toast.makeText(Aty1.this, "元素已经为空，不能删除", Toast.LENGTH_SHORT).show();
                                }
                                break;
                            case 4:
                                if(tv4.getTextSize()>0){
                                    tv4.setText(tv5.getText());
                                    tv5.setText(tv6.getText());
                                    tv6.setText(tv7.getText());
                                    tv7.setText(tv8.getText());
                                    tv8.setText(tv9.getText());
                                    tv9.setText(tv10.getText());
                                    tv10.setText(tv11.getText());
                                    tv11.setText(tv12.getText());
                                    tv12.setText("");

                                    length--;
                                    showLength();

                                }else{
                                    Toast.makeText(Aty1.this, "元素已经为空，不能删除", Toast.LENGTH_SHORT).show();
                                }
                                break;
                            case 5:
                                if(tv5.getTextSize()>0){
                                    tv5.setText(tv6.getText());
                                    tv6.setText(tv7.getText());
                                    tv7.setText(tv8.getText());
                                    tv8.setText(tv9.getText());
                                    tv9.setText(tv10.getText());
                                    tv10.setText(tv11.getText());
                                    tv11.setText(tv12.getText());
                                    tv12.setText("");

                                    length--;
                                    showLength();

                                }else{
                                    Toast.makeText(Aty1.this, "元素已经为空，不能删除", Toast.LENGTH_SHORT).show();
                                }
                                break;
                            case 6:
                                if(tv6.getTextSize()>0){
                                    tv6.setText(tv7.getText());
                                    tv7.setText(tv8.getText());
                                    tv8.setText(tv9.getText());
                                    tv9.setText(tv10.getText());
                                    tv10.setText(tv11.getText());
                                    tv11.setText(tv12.getText());
                                    tv12.setText("");

                                    length--;
                                    showLength();

                                }else{

                                    Toast.makeText(Aty1.this, "元素已经为空，不能删除", Toast.LENGTH_SHORT).show();
                                }
                                break;
                            case 7:
                                if(tv7.getTextSize()>0){
                                    tv7.setText(tv8.getText());
                                    tv8.setText(tv9.getText());
                                    tv9.setText(tv10.getText());
                                    tv10.setText(tv11.getText());
                                    tv11.setText(tv12.getText());
                                    tv12.setText("");

                                    length--;
                                    showLength();

                                }else{
                                    Toast.makeText(Aty1.this, "元素已经为空，不能删除", Toast.LENGTH_SHORT).show();
                                }
                                break;
                            case 8:
                                if(tv8.getTextSize()>0){
                                    tv8.setText(tv9.getText());
                                    tv9.setText(tv10.getText());
                                    tv10.setText(tv11.getText());
                                    tv11.setText(tv12.getText());
                                    tv12.setText("");

                                    length--;
                                    showLength();
                                }else{
                                    Toast.makeText(Aty1.this, "元素已经为空，不能删除", Toast.LENGTH_SHORT).show();
                                }
                                break;
                            case 9:
                                if(tv9.getTextSize()>0){
                                    tv9.setText(tv10.getText());
                                    tv10.setText(tv11.getText());
                                    tv11.setText(tv12.getText());
                                    tv12.setText("");

                                    length--;
                                    showLength();

                                }else{
                                    Toast.makeText(Aty1.this, "元素已经为空，不能删除", Toast.LENGTH_SHORT).show();
                                }
                                break;
                            case 10:
                                if(tv10.getTextSize()>0){
                                    tv10.setText(tv11.getText());
                                    tv11.setText(tv12.getText());
                                    tv12.setText("");

                                    length--;
                                    showLength();
                                }else{
                                    Toast.makeText(Aty1.this, "元素已经为空，不能删除", Toast.LENGTH_SHORT).show();
                                }
                                break;
                            case 11:
                                if(tv11.getTextSize()>0){
                                    tv11.setText(tv12.getText());
                                    tv12.setText("");

                                    length--;
                                    showLength();
                                }else{
                                    Toast.makeText(Aty1.this, "元素已经为空，不能删除", Toast.LENGTH_SHORT).show();
                                }
                                break;
                            case 12:
                                if(tv9.getTextSize()>0){
                                    tv12.setText("");
                                    length--;
                                    showLength();
                                }else{
                                    Toast.makeText(Aty1.this, "元素已经为空，不能删除", Toast.LENGTH_SHORT).show();
                                }
                                break;
                        }

                    }
                }
            }
        });

        btnClear = (Button) findViewById(R.id.btnClear);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(tv1.getText().length()==0 && tv2.getText().length()==0 &&tv3.getText().length()==0 &&
                        tv4.getText().length()==0 &&tv4.getText().length()==0 &&tv5.getText().length()==0 &&
                        tv6.getText().length()==0 &&tv7.getText().length()==0 &&tv8.getText().length()==0 &&
                        tv9.getText().length()==0 &&tv10.getText().length()==0 &&tv11.getText().length()==0 &&
                        tv12.getText().length()==0
                        ){
                    Toast.makeText(Aty1.this, "全部元素已经删除", Toast.LENGTH_SHORT).show();
                }else{

                    length = 1;
                    tv1.setText("");
                    tv2.setText("");
                    tv3.setText("");
                    tv4.setText("");
                    tv5.setText("");
                    tv6.setText("");
                    tv7.setText("");
                    tv8.setText("");
                    tv9.setText("");
                    tv10.setText("");
                    tv11.setText("");
                    tv12.setText("");
                    showLength();
                }


            }
        });

    }

    public void showLength(){
        lengthShow.setText("length:" + Integer.toString(length - 1));

    }



}


