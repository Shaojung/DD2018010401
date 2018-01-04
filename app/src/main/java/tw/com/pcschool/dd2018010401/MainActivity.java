package tw.com.pcschool.dd2018010401;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        // TextView tv = new TextView(this);
        // tv.setText("Hello World");
        Button btn = new Button(this);
        btn.setText("Click Me");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click!!!", Toast.LENGTH_SHORT).show();
            }
        });
        setContentView(btn);


    }
}
