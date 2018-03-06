package com.example.yyamasawa.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //変数 = (キャスト)findViewById(使いたいウィジェットのID)
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ここにタップされた時の処理を記述

                String text = editText.getText().toString(); //EditText(テキストボックス)から文字列を取得
                if (!text.equals("")){
                    textView.setText(text); //TextViewに文字列をセット
                    editText.setText("");
                    Toast.makeText(view.getContext(), text, Toast.LENGTH_LONG).show(); //Toast.makeText(コンテキスト, 表示したい文字列, どれぐらい(時間)表示させるか(LONG or SHORT)).show();

                }
                else {
                    Toast.makeText(view.getContext(), "未入力です", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
