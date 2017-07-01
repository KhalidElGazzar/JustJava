/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 */

package com.example.android.justjava;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantity;

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        // display(1);

        int coffeeCupPrice = 5;

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        int quantity = Integer.valueOf((String) quantityTextView.getText());


        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        // priceTextView.setText(coffeeCupPrice * quantity);
        displayPrice(coffeeCupPrice * quantity);

    }

    public void increment(View view) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantity = Integer.valueOf((String) quantityTextView.getText());
        quantity++;
        display(quantity);
    }

    public void decrement(View view) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantity = Integer.valueOf((String) quantityTextView.getText());
        if (quantity > 0)
            quantity--;
        display(quantity);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
       /*
           // KG code to be used later on.

            int i_prevValue;
            String s_preValue;

            TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);

            s_preValue = (String)quantityTextView.getText();
            i_prevValue = Integer.valueOf(s_preValue);
            i_prevValue = i_prevValue + number;

            quantityTextView.setText(String.valueOf(i_prevValue));
        */

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on screen
     *
     * @param number: price to be displayed.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage (String message){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}