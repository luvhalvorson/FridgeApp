package tw.com.duan.assign1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void clicked(View v) {
        TextView tv1 = (TextView)findViewById(R.id.tv1);
        tv1.setText("短短好可愛");

        Intent intent = new Intent();
        intent.setClass(MainActivity.this , FridgeList.class);
        startActivity(intent);
    }
}
