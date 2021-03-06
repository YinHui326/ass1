package android.example.ass1.ui.deals;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.example.ass1.R;


public class DealsFragment extends Fragment {

    private DealsViewModel dealsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dealsViewModel =
                ViewModelProviders.of(this).get(DealsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_deals, container, false);
        final TextView textView = root.findViewById(R.id.text_deals);
        dealsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}