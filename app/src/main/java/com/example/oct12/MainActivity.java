package com.example.oct12;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkBox);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBox.isChecked()) {
                    showColorToast("Online", Color.GREEN);
                } else {
                    showColorToast("Offline", Color.RED);
                }
            }
        });
    }

    private void showColorToast(String message, int color) {
        SpannableString text = new SpannableString(message);
        text.setSpan(new ForegroundColorSpan(color), 0, message.length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}