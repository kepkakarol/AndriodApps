package com.example.kepka.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {
    private int m_quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(m_quantity);
    }

    public void submitOrder(View view) {
        displayPrice(5 * m_quantity);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    public void increment(View view){
        display(++m_quantity);
    }

    public void decrement(View view){
        display(--m_quantity);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}
