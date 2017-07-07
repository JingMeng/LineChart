package com.linechart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    //x轴坐标对应的数据
    private List<String> xValue = new ArrayList<>();
    //y轴坐标对应的数据
    private List<Integer> yValue = new ArrayList<>();
    //折线对应的数据
    //private Map<String, Integer> value = new HashMap<>();
    private List<Data> value = new ArrayList<Data>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 12; i++) {
            xValue.add((i + 1) + "月");
            value.add(new Data((i + 1) + "月", (int) (Math.random() * 181 + 1000)));//60--240
        }

        for (int i = 0; i < 6; i++) {
            yValue.add(i * 60);
        }

        final ChartView chartView = (ChartView) findViewById(R.id.chartview);
        chartView.setValue(value,xValue,yValue);
//        chartView.setValue(value, xValue, yValue);
        chartView.addOnLineChartMoveListener(new ChartView.OnLineChartMoveListener() {
            @Override
            public void onMoveToStart(String start) {
//                value.addAll(value);
//                xValue.addAll(xValue);
//                yValue.addAll(yValue);


                Log.i("折线图","滑动到左边");
                xValue.clear();
                value.clear();
                for (int i = 0; i < 12; i++) {
                    xValue.add((i + 1) + "日");
                    value.add(new Data((i + 1) + "日", (int) (Math.random() * 181 + 1000)));//60--240
                }
                yValue.clear();
                for (int i = 0; i < 6; i++) {
                    yValue.add(i * 60);
                }

                chartView.setValue(value,xValue,yValue);
            }

            @Override
            public void onMoVeToEnd(String end) {
                Log.i("折线图","滑动到右边");
            }
        });
    }
}

