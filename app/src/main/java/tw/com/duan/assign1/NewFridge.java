package tw.com.duan.assign1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Context;
import android.widget.Toast;

public class NewFridge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_fridge);


        final Button button = findViewById(R.id.btnCheck);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // create new fridge

                // prompt user
                Context context = getApplicationContext();
                CharSequence text = "長出冰箱囉";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();

                // go back to fridge list
                Intent intent = new Intent();
                intent.setClass(NewFridge.this , FridgeList.class);
                startActivity(intent);
            }
        });
    }
}
