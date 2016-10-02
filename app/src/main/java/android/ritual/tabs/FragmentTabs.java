package android.ritual.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by androidritual.com on 10/06/2016.
 */
public class FragmentTabs extends Fragment {
    private View v;
    public static FragmentTabs createInstance(String data) {
        FragmentTabs fragment = new FragmentTabs();
        Bundle bundle = new Bundle();
        bundle.putString("data", data);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_tab, container, false);
        Bundle bundle = this.getArguments();
        String data = bundle.getString("data");
        TextView text = (TextView)v.findViewById(R.id.section_label);
        text.setText(data);
        return v;
    }


}
