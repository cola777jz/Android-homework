package jz.cbq.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import jz.cbq.R;

import java.util.List;

/**
 * ChatAdapter
 *
 * @author Cola777jz
 * @date 2023/10/27 23:36
 * @since 1.0.0
 */
public class ChatAdapter extends BaseAdapter {
    private List<String> messages;
    private Context context;

    public ChatAdapter(Context context, List<String> messages) {
        this.context = context;
        this.messages = messages;
    }

    @Override
    public int getCount() {
        return messages.size();
    }

    @Override
    public Object getItem(int position) {
        return messages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String message = messages.get(position);

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item_chat_message, parent, false);
        }

        ImageView imageViewUser1 = convertView.findViewById(R.id.image_view_user1);
        ImageView imageViewUser2 = convertView.findViewById(R.id.image_view_user2);
        TextView textViewUser1 = convertView.findViewById(R.id.text_view_message_user1);
        TextView textViewUser2 = convertView.findViewById(R.id.text_view_message_user2);

        if (position % 2 == 0) {
            // 用户1发送的消息，位于左侧
            imageViewUser1.setVisibility(View.VISIBLE);
            textViewUser1.setVisibility(View.VISIBLE);
            textViewUser1.setText(message);
            imageViewUser2.setVisibility(View.GONE);
            textViewUser2.setVisibility(View.GONE);
        } else {
            // 用户2发送的消息，位于右侧
            imageViewUser1.setVisibility(View.GONE);
            textViewUser1.setVisibility(View.GONE);
            imageViewUser2.setVisibility(View.VISIBLE);
            textViewUser2.setVisibility(View.VISIBLE);
            textViewUser2.setText(message);
        }

        return convertView;
    }
}
