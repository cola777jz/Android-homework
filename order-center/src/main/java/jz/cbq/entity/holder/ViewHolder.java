package jz.cbq.entity.holder;

import android.widget.TextView;

/**
 * ViewHolder
 *
 * @author Cola777jz
 * @date 2023/10/27 23:21
 * @since 1.0.0
 */
public class ViewHolder {
    private TextView title;
    private TextView price;
    private TextView status;
    private TextView time;

    public TextView getTitle() {
        return title;
    }

    public void setTitle(TextView title) {
        this.title = title;
    }

    public TextView getPrice() {
        return price;
    }

    public void setPrice(TextView price) {
        this.price = price;
    }

    public TextView getStatus() {
        return status;
    }

    public void setStatus(TextView status) {
        this.status = status;
    }

    public TextView getTime() {
        return time;
    }

    public void setTime(TextView time) {
        this.time = time;
    }
}