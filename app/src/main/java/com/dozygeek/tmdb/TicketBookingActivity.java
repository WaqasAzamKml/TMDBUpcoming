package com.dozygeek.tmdb;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.Collections;

public class TicketBookingActivity extends AppCompatActivity {
    private int total = 0;
    private ArrayList<String> selectedSeats = new ArrayList<>();

    TextView tvSelectedSeats, tvTotal;
    MaterialButton btnPayNow;
    MaterialButton buttonA1, buttonA2, buttonA3, buttonA4, buttonA5;
    MaterialButton buttonB1, buttonB2, buttonB3, buttonB4, buttonB5;
    MaterialButton buttonC1, buttonC2, buttonC3, buttonC4, buttonC5;
    MaterialButton buttonD1, buttonD2, buttonD3, buttonD4, buttonD5;
    MaterialButton buttonE1, buttonE2, buttonE3, buttonE4, buttonE5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_booking);

        tvSelectedSeats = findViewById(R.id.tvSelectedSeats);
        tvTotal = findViewById(R.id.tvTotal);
        tvTotal.setText("0");
        btnPayNow = findViewById(R.id.btnPayNow);
        btnPayNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TicketBookingActivity.this, "Feature coming soon", Toast.LENGTH_SHORT).show();
            }
        });

        initSeatButtons();
    }

    private void initSeatButtons() {
        buttonA1 = findViewById(R.id.buttonA1);
        buttonA1.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("A1");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("A1");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonA2 = findViewById(R.id.buttonA2);
        buttonA2.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("A2");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("A2");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonA3 = findViewById(R.id.buttonA3);
        buttonA3.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("A3");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("A3");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonA4 = findViewById(R.id.buttonA4);
        buttonA4.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("A4");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("A4");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonA5 = findViewById(R.id.buttonA5);
        buttonA5.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("A5");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("A5");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });

        buttonB1 = findViewById(R.id.buttonB1);
        buttonB1.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("B1");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("B1");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonB2 = findViewById(R.id.buttonB2);
        buttonB2.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("B2");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("B2");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonB3 = findViewById(R.id.buttonB3);
        buttonB3.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("B3");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("B3");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonB4 = findViewById(R.id.buttonB4);
        buttonB4.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("B4");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("B4");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonB5 = findViewById(R.id.buttonB5);
        buttonB5.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("B5");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("B5");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });

        buttonC1 = findViewById(R.id.buttonC1);
        buttonC1.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("C1");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("C1");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonC2 = findViewById(R.id.buttonC2);
        buttonC2.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("C2");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("C2");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonC3 = findViewById(R.id.buttonC3);
        buttonC3.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("C3");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("C3");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonC4 = findViewById(R.id.buttonC4);
        buttonC4.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("C4");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("C4");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonC5 = findViewById(R.id.buttonC5);
        buttonC5.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("C5");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("C5");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });

        buttonD1 = findViewById(R.id.buttonD1);
        buttonD1.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("D1");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("D1");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonD2 = findViewById(R.id.buttonD2);
        buttonD2.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("D2");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("D2");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonD3 = findViewById(R.id.buttonD3);
        buttonD3.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("D3");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("D3");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonD4 = findViewById(R.id.buttonD4);
        buttonD4.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("D4");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("D4");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonD5 = findViewById(R.id.buttonD5);
        buttonD5.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("D5");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("D5");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });

        buttonE1 = findViewById(R.id.buttonE1);
        buttonE1.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("E1");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("E1");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonE2 = findViewById(R.id.buttonE2);
        buttonE2.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("E2");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("E2");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonE3 = findViewById(R.id.buttonE3);
        buttonE3.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("E3");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("E3");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonE4 = findViewById(R.id.buttonE4);
        buttonE4.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("E4");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("E4");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
        buttonE5 = findViewById(R.id.buttonE5);
        buttonE5.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(MaterialButton button, boolean isChecked) {
                if (isChecked) {
                    selectedSeats.add("E5");
                    Collections.sort(selectedSeats);
                    total += 500;
                    tvSelectedSeats.setText(selectedSeats.toString());
                    tvTotal.setText(String.valueOf(total));
                } else {
                    selectedSeats.remove("E5");
                    Collections.sort(selectedSeats);
                    total -= 500;
                    tvTotal.setText(String.valueOf(total));
                    if(selectedSeats.size() > 0){
                        tvSelectedSeats.setText(selectedSeats.toString());
                    }else{
                        tvSelectedSeats.setText("");
                    }
                }
            }
        });
    }
}