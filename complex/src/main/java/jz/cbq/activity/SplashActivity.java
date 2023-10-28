package jz.cbq.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import jz.cbq.MainActivity;
import jz.cbq.R;


/**
 * @author Cola777jz
 * @name SplashActivity
 * @date 2023/10/22 12:29
 * @since 1.0.0
 */
public class SplashActivity extends AppCompatActivity {
    private static final long SPLASH_DELAY = 2000; // 启动页显示时间（单位：毫秒）

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> {
            // 跳转到应用主界面
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // 结束当前 Activity
        }, SPLASH_DELAY);
    }
}
