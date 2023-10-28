package jz.cbq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * LoginActivity
 *
 * @author Cola777jz
 * @date 2023/10/27 23:18
 * @since 1.0.0
 */
public class LoginActivity extends AppCompatActivity {
    private TextView txRegister;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txRegister = findViewById(R.id.tx_register);
        txRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
