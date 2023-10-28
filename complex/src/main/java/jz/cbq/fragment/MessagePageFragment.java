package jz.cbq.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import jz.cbq.R;


/**
 * @author Cola777jz
 * @name MessagePageFragment
 * @date 2023/10/22 13:32
 * @since 1.0.0
 */
public class MessagePageFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_message_page, container, false);
    }
}
