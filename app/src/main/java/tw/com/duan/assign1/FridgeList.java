package tw.com.duan.assign1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Button;
import android.view.View;

public class FridgeList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fridgelist);

        ListView listview = (ListView) findViewById(R.id.listview);
        //ListView 要顯示的內容
        String[] str = {"新北市","台北市","台中市","台南市","高雄市"};
        //android.R.layout.simple_list_item_1 為內建樣式，還有其他樣式可自行研究
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                str);
        listview.setAdapter(adapter);

        final Button button = findViewById(R.id.btnNew);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(FridgeList.this , NewFridge.class);
                startActivity(intent);
            }
        });
    }
}
