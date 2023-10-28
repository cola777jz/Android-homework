package jz.cbq;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getResource();
    }

    /**
     * Android 中可以通过 R. 获得各种资源信息
     * <b>R 用于映射 res 中的各种资源</b>
     * R.id  获取 对应 id 的资源信息
     * R.string  获取 values 中 strings.xml 中定义的信息
     * R.color  获取 values 中 colors.xml 中定义的信息
     * R.drawable  获取 drawable 中相关信息
     * R.layout  获取 layout 中相关信息
     */
    void getResource(){
        System.out.println("R.string.app_name: " + R.string.app_name);
        System.out.println("R.string.mcdd_rose = " + R.string.mcdd_rose);

        System.out.println("R.id.layout_main = " + R.id.layout_main);

        System.out.println("R.color.black = " + R.color.black);

        System.out.println("R.drawable.mcdd_01 = " + R.drawable.mcdd_01);

        System.out.println("R.layout.activity_main = " + R.layout.activity_main);
    }
}