package com.rorpheeyah.tableview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TableRow;
import android.widget.Toast;

import com.rorpheeyah.tableview.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        // Add Header
        String value = "증빙구분 | 가맹점명 | 사용일시 | 사용금액 | 신청금액 | 카드번호";
        List<String> list = Arrays.asList(value.split("\\|"));
        binding.tbv.addHeader(list);

        // Add Cells
        LinkedHashMap<Integer, List<String>> rows = new LinkedHashMap<>();
        for (int i = 0; i < 15; i++) {
            value = (i+1) + ".법인카드 영수증 | 교촌치킨 | 2021-07-01(일) 12:00 | 999,000원 | 999,000원 | ";
            rows.put(i, Arrays.asList(value.split("\\|")));
        }
        binding.tbv.addRows(rows);

        binding.tbv.setTableViewListener(new TableView.OnTableViewListener() {
            @Override
            public void onRowClicked(@NonNull TableRow tableRow, int position, List<String> row) {
                Toast.makeText(getApplicationContext(), row.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClicked(@NonNull TableRow tableRow, int position, List<String> row) {
                Toast.makeText(getApplicationContext(), row.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}