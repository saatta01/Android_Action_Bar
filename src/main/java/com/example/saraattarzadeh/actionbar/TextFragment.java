package com.example.saraattarzadeh.actionbar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * Created by Sara Attarzadeh on 10/24/2016.
 */

public class TextFragment extends Fragment {
    TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_fragment, container, false);
        text = (TextView)view.findViewById(R.id.txt);
        String menu = getArguments().getString("Menu");
        text.setText(menu);
        return view;
    }
}
