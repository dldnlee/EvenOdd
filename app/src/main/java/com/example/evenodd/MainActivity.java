package com.example.evenodd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.evenodd.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.checkButton.setOnClickListener(v -> evenOdd());
    }

    protected void evenOdd () {
        String text = binding.input.getText().toString();

        if (text.isEmpty()) {
            Toast.makeText(this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
            return;
        }

        int number = Integer.parseInt(text);
        String message;

        if (number % 2 == 0) {
            message = "%d는 짝수입니다.";
        } else {
            message = "%d는 홀수입니다.";
        }

        Toast.makeText(this, String.format(message, number), Toast.LENGTH_LONG).show();
    }
}