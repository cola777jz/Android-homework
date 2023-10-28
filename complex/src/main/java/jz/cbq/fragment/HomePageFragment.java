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
 * @name HomePageFragment
 * @date 2023/10/22 13:31
 * @since 1.0.0
 */
public class HomePageFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home_page, container, false);
    }

}
