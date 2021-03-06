package com.tjeit.a20190414_java_xml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView contentTxtView;
    EditText inputEditText;
    Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("메인-onCreate테스트", "정말 실행되나??");
        Log.e("메인-e로그","어떻게 나오나?");

        contentTxtView = findViewById(R.id.contentTxtView);
        inputEditText = findViewById(R.id.inputEditText);
        okBtn = findViewById(R.id.okBtn);

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("확인버튼","터치 이벤트 발생 했다!");

//                Ctrl + /
//                입력에딧텍스트의 내용을 뽑아서 (get) userInputStr 변수에 저장.
                String userInputStr = inputEditText.getText().toString();

//                담겨있던 내용을 가져다가 내용 TextView의 text로 집어 넣음(set).
                contentTxtView.setText(userInputStr);

                Toast.makeText(MainActivity.this, "입력값이 반영되었습니다.", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "두번째 토스트", Toast.LENGTH_LONG).show();
            }
        });

    }
}





















