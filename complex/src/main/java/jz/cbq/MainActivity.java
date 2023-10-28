package jz.cbq;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import jz.cbq.fragment.HomePageFragment;
import jz.cbq.fragment.MessagePageFragment;
import jz.cbq.fragment.MyPageFragment;
import jz.cbq.fragment.ProjectPageFragment;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bar;
    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        window = getWindow();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 设置窗口特性，启用背景模糊效果
        window.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

// 设置窗口背景为透明
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        initBottomNav();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contentContainer, new HomePageFragment()).commit();
    }


    private void initBottomNav(){
        bar = findViewById(R.id.bottom_nav);
        bar.setItemIconTintList(null); // 取消图标的着色效果

        bar.setOnNavigationItemSelectedListener(item -> {
            Fragment fragment = new HomePageFragment();
            if (item.getItemId() == R.id.tab_home) {
                fragment = new HomePageFragment();
                Toast.makeText(MainActivity.this, "HOME", Toast.LENGTH_SHORT).show();
            } else if (item.getItemId() == R.id.tab_my) {
                fragment = new MyPageFragment();
                Toast.makeText(MainActivity.this, "MY", Toast.LENGTH_SHORT).show();
            } else if (item.getItemId() == R.id.tab_message) {
                fragment = new MessagePageFragment();
                Toast.makeText(MainActivity.this, "MESSAGE", Toast.LENGTH_SHORT).show();
            } else if (item.getItemId() == R.id.tab_project) {
                fragment = new ProjectPageFragment();
                Toast.makeText(MainActivity.this, "PROJECT", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "请选择 Bar（EX）", Toast.LENGTH_SHORT).show();
            }
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contentContainer, fragment).commit();
            return true;
        });
    }
}