package jz.cbq;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import jz.cbq.adapter.ChatAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listViewChat;
    EditText editTextMessage;
    Button buttonSend;
    List<String> messages;
    ChatAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewChat = findViewById(R.id.list_view_chat);
        editTextMessage = findViewById(R.id.edit_text_message);
        buttonSend = findViewById(R.id.button_send);
        messages = new ArrayList<>();
        adapter = new ChatAdapter(this, messages);
        listViewChat.setAdapter(adapter);

        buttonSend.setOnClickListener(v -> {
            String message = editTextMessage.getText().toString();
            if (!message.isEmpty()) {
                messages.add(message);
                adapter.notifyDataSetChanged();
                editTextMessage.setText("");

                // 模拟交替发送消息
                if (adapter.getCount() % 2 == 0) {
                    // 用户2发送消息

                    Toast.makeText(this, "用户2发送的消息", Toast.LENGTH_SHORT).show();
                } else {
                    // 用户1发送消息
                    Toast.makeText(this, "用户1发送的消息", Toast.LENGTH_SHORT).show();

                }
                adapter.notifyDataSetChanged();
            }
        });

    }
}