package ind.tutorial.koo.flms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButtonClickListener();
    }

    private void setButtonClickListener() {
        Button btnInquiry = findViewById(R.id.btn_inquiry);
        Button btnOrder = findViewById(R.id.btn_orderParts);
        Button btnIncomeStatement = findViewById(R.id.btn_checkIncomeStatement);

        btnInquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InquiryActivity.class);
                startActivity(intent);
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OrderActivity.class);
                startActivity(intent);
            }
        });

        btnIncomeStatement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IncomeStatementActivity.class);
                startActivity(intent);
            }
        });
    }
}
