package com.example.dz_4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView soccerBall = findViewById(R.id.soccer_ball);
        float startX = soccerBall.getX(); // Начальная x позиция футбольного мяча
        float endX = startX + 500f; // Конечная x позиция футбольного мяча
        ObjectAnimator animator = ObjectAnimator.ofFloat(soccerBall, "x", startX, endX);
        animator.setDuration(2000); // Продолжительность анимации в миллисекундах
        animator.setRepeatCount(ValueAnimator.INFINITE); // Повторять анимацию бесконечно
        animator.setRepeatMode(ValueAnimator.REVERSE); // Переворачивать анимацию при каждом повторе
        animator.start(); // Запустить анимацию

    }

}