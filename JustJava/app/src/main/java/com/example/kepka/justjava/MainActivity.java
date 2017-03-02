package com.example.kepka.justjava;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    private int m_quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayQuantity(m_quantity);
    }

    public void submitOrder(View view) {
        CheckBox whippedCream = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        String whippedCramMessage = "Add whipped Cream? " + whippedCream.isChecked();
        displayMessage(createOrderSumary(calculatePrice(), whippedCramMessage));
    }

    private int calculatePrice() {
        return m_quantity * 5;
    }

    private String createOrderSumary(int price, String whippedCream) {
        String priceMessage = "Name: Kaptain Kunal\n";
        priceMessage += whippedCream + "\n";
        priceMessage += "Quantity: " + m_quantity + "\n";
        priceMessage += "Total: $" + price + "\n";
        priceMessage += "Thank you!";
        return priceMessage;
    }

    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
        quantityTextView.setTextColor(Color.GREEN);
    }

    public void increment(View view) {
        displayQuantity(++m_quantity);
    }

    public void decrement(View view) {
        displayQuantity(--m_quantity);
    }

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }


}
