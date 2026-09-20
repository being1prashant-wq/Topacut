package com.topacut.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public final class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView view = new TextView(this);
        view.setText("Topacut");
        view.setTextSize(28f);
        view.setGravity(android.view.Gravity.CENTER);
        setContentView(view);
    }
}
