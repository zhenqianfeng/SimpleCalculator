package com.concordia.cejv669.simplecalculator;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        TextView history = findViewById(R.id.tv_history);
        Intent intent = getIntent();
        history.setText(intent.getStringExtra("HistoryLog"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.side_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int itemId=item.getItemId();

        if (itemId == R.id.back) {
//            Toast.makeText(getApplicationContext(), "You Clicked on History", Toast.LENGTH_SHORT).show();
            TextView history = findViewById(R.id.tv_history);
            Intent rtn_intent = new Intent();
            rtn_intent.putExtra("HistoryLog", history.getText().toString());
            History.this.finish();
        }
        return true;
    }
}
