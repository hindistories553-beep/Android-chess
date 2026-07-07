package com.chessai;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvStatus;
    private Button btnStart;
    private boolean isTraining = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStatus = findViewById(R.id.tvStatus);
        btnStart = findViewById(R.id.btnStart);

        tvStatus.setText("✅ Ready to Train!");

        btnStart.setOnClickListener(v -> {
            isTraining = !isTraining;
            if (isTraining) {
                btnStart.setText("⏸ Pause Training");
                tvStatus.setText("🧠 Training...");
                Toast.makeText(this, "Training Started!", Toast.LENGTH_SHORT).show();
            } else {
                btnStart.setText("▶ Start Training");
                tvStatus.setText("⏸ Paused");
                Toast.makeText(this, "Training Paused", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
