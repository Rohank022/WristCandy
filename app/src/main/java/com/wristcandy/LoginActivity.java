package com.wristcandy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.ViewCompat;

import com.wristcandy.R;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // ✅ Ensure this is called first

        // Fix: Ensure the view is not null before using it
        View rootView = findViewById(R.id.root_layout);
        if (rootView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(rootView, (v, insets) -> insets);
        }
    }
}
