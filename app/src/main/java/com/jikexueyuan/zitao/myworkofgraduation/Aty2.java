package com.jikexueyuan.zitao.myworkofgraduation;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by zitao on 15-4-5.
 */
public class Aty2 extends Activity {


    private Button btnInsert, btnDelete, btnRecover;
    private EditText editTextInsert, editTextDeletePosition;
    private ImageView imageView1To2, imageView2To3, imageView1To4,
            imageView4To2, imageView1To3, imageView4To1, imageView4ToNull,
            imageView3To4, imageView2ToNull, imageView3ToNull, ivHeadTo1,
            ivHeadTo4, ivHeadTo2;
    private TextView tvNum;

    private int num = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty2_layout);

        tvNum = (TextView) findViewById(R.id.tvNum);


        imageView1To2 = (ImageView) findViewById(R.id.imageView1);//右一
        imageView2To3 = (ImageView) findViewById(R.id.imageView2);//右二
        imageView1To4 = (ImageView) findViewById(R.id.imageView3);//下
        imageView4To2 = (ImageView) findViewById(R.id.imageView4);//上
        imageView1To3 = (ImageView) findViewById(R.id.imageView5);//弯曲
        imageView4To1 = (ImageView) findViewById(R.id.imageView6);//左斜上
        imageView4ToNull = (ImageView) findViewById(R.id.imageView7);//指向NULL
        imageView3To4 = (ImageView) findViewById(R.id.imageView8);//指向listnode4
        imageView2ToNull = (ImageView) findViewById(R.id.imageView10);
        imageView3ToNull = (ImageView) findViewById(R.id.NULL);
        ivHeadTo2 = (ImageView) findViewById(R.id.headToNode2);
        ivHeadTo1 = (ImageView) findViewById(R.id.ivHead);
        ivHeadTo4 = (ImageView) findViewById(R.id.ivHeadTo4);

        imageView1To4.setVisibility(View.INVISIBLE);
        imageView4To2.setVisibility(View.INVISIBLE);
        imageView1To3.setVisibility(View.INVISIBLE);
        imageView4To1.setVisibility(View.INVISIBLE);
        imageView4ToNull.setVisibility(View.INVISIBLE);
        imageView3To4.setVisibility(View.INVISIBLE);
        imageView2ToNull.setVisibility(View.INVISIBLE);
        ivHeadTo4.setVisibility(View.INVISIBLE);
        ivHeadTo2.setVisibility(View.INVISIBLE);


        btnInsert = (Button) findViewById(R.id.btnInsert);
        editTextInsert = (EditText) findViewById(R.id.editTextInsertPosition);
        editTextInsert.setFocusable(true);
        editTextInsert.setFocusableInTouchMode(true);
        editTextInsert.requestFocus();
        editTextInsert.requestFocusFromTouch();
        editTextInsert.setInputType(EditorInfo.TYPE_CLASS_NUMBER);


        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(editTextInsert.getText())) {//需要第一个判断是否为空

                    Toast.makeText(Aty2.this, "插入位置不能为空", Toast.LENGTH_SHORT).show();

                }else if (Integer.parseInt(editTextInsert.getText().toString(), 10) > num + 1
                        || Integer.parseInt(editTextInsert.getText().toString(), 10) <= 0) {

                    Toast.makeText(Aty2.this, "插入位置不合理", Toast.LENGTH_SHORT).show();

                } else {

                    switch (Integer.parseInt(editTextInsert.getText().toString(), 10)) {

                        case 1:

                            ivHeadTo1.setVisibility(View.INVISIBLE);
                            ivHeadTo4.setVisibility(View.VISIBLE);
                            imageView4To1.setVisibility(View.VISIBLE);
                            num++;
                            showNum();

                            break;
                        case 2:

                            imageView1To2.setVisibility(View.INVISIBLE);
                            imageView1To4.setVisibility(View.VISIBLE);
                            imageView4To2.setVisibility(View.VISIBLE);
                            num++;
                            showNum();

                            break;
                        case 3:
                            showNum();
                            break;
                        case 4:

                            imageView4ToNull.setVisibility(View.VISIBLE);
                            imageView3ToNull.setVisibility(View.INVISIBLE);
                            imageView3To4.setVisibility(View.VISIBLE);
                            num++;
                            showNum();

                            break;


                    }
                }
            }
        });

        btnDelete = (Button) findViewById(R.id.btnDelete);
        editTextDeletePosition = (EditText) findViewById(R.id.editTextDeletePosition);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(editTextDeletePosition.getText())) {

                    Toast.makeText(Aty2.this, "删除结点不能为空", Toast.LENGTH_SHORT).show();

                }else if (Integer.parseInt(editTextDeletePosition.getText().toString(), 10) <= 0
                        || Integer.parseInt(editTextDeletePosition.getText().toString(), 10) > num) {

                    Toast.makeText(Aty2.this, "删除位置不合理", Toast.LENGTH_SHORT).show();

                }else {

                    switch (Integer.parseInt(editTextDeletePosition.getText().toString(), 10)) {

                        case 1:

                            ivHeadTo2.setVisibility(View.VISIBLE);
                            imageView1To2.setVisibility(View.INVISIBLE);
                            ivHeadTo1.setVisibility(View.INVISIBLE);
                            num--;
                            showNum();

                            break;
                        case 2:

                            imageView1To2.setVisibility(View.INVISIBLE);
                            imageView2To3.setVisibility(View.INVISIBLE);
                            imageView1To3.setVisibility(View.VISIBLE);
                            num--;
                            showNum();

                            break;
                        case 3:

                            imageView3ToNull.setVisibility(View.INVISIBLE);
                            imageView2To3.setVisibility(View.INVISIBLE);
                            imageView2ToNull.setVisibility(View.VISIBLE);
                            num--;
                            showNum();

                            break;

                    }
                }
            }
        });


        btnRecover = (Button) findViewById(R.id.btnRecover);

        btnRecover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num = 3;
                imageView1To2.setVisibility(View.VISIBLE);
                imageView2To3.setVisibility(View.VISIBLE);
                imageView1To4.setVisibility(View.INVISIBLE);
                imageView4To2.setVisibility(View.INVISIBLE);
                imageView1To3.setVisibility(View.INVISIBLE);
                imageView4To1.setVisibility(View.INVISIBLE);
                imageView4ToNull.setVisibility(View.INVISIBLE);
                imageView3To4.setVisibility(View.INVISIBLE);
                imageView2ToNull.setVisibility(View.INVISIBLE);
                ivHeadTo1.setVisibility(View.VISIBLE);
                ivHeadTo2.setVisibility(View.INVISIBLE);
                ivHeadTo4.setVisibility(View.INVISIBLE);
                imageView3ToNull.setVisibility(View.VISIBLE);
                showNum();

            }
        });
    }

    public void showNum(){
        tvNum.setText("listNode Num: "+Integer.toString(num));
    }
}
