package com.linechart;

import android.graphics.Color;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

/**
 * Created by BaiMeng on 2017/7/6.
 */
public class LineChartShow {
//    private LineChart mLineChart;
//    private LineData mLineData;
//
//    //默认显示
//    public LineChartShow(LineChart lineChart) {
//        mLineChart = lineChart;
//        showChart(mLineChart,new LineData(), Color.TRANSPARENT);
//    }
//    //清除数据
//    public void ClearData(){
//        showChart(mLineChart,new LineData(),Color.TRANSPARENT);
//    }
//    //画图，传入参数
//    public void drawLineonStart(float[] yData,int WLstartpoint,int WLendpoint,int WLspace) {
//        mLineData = getLineData(yData,WLstartpoint,WLendpoint,WLspace);
//        showChart(mLineChart, mLineData, Color.TRANSPARENT);
//    }
//
//    // 设置显示的样式
//    private void showChart(LineChart lineChart, LineData lineData, int color) {
//        lineChart.setDrawBorders(true); // 是否在折线图上添加边框
////        lineChart.setDescription("NIRSA");// 数据描述
////        lineChart.setDescriptionPosition(550,60);//设置表格描述
////        lineChart.setDescriptionColor(Color.BLACK);//设置颜色
////        // 如果没有数据的时候，会显示这个，类似listview的emtpyview
////        lineChart.setNoDataTextDescription("You need to provide data for the chart.");
//        lineChart.setDrawGridBackground(true); // 是否显示表格颜色
////        lineChart.setGridBackgroundColor(Color.WHITE & 0x70FFFFFF); // 表格的的颜色，在这里是是给颜色设置一个透明度
//        lineChart.setGridBackgroundColor(Color.WHITE);
//        lineChart.setTouchEnabled(true); // 设置是否可以触摸
//        lineChart.setDragEnabled(true);// 是否可以拖拽
//        lineChart.setScaleEnabled(true);// 是否可以缩放
//        lineChart.setPinchZoom(true);//X、Y轴同时缩放
//        lineChart.getAxisRight().setEnabled(false); // 隐藏右边 的坐标轴
////        lineChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);//设置横坐标在底部
//        lineChart.getXAxis().setGridColor(Color.TRANSPARENT);//去掉网格中竖线的显示
//        // if disabled, scaling can be done on x- and y-axis separately
//        lineChart.setPinchZoom(false);//
//        lineChart.setBackgroundColor(color);// 设置背景
//        // add data
//        lineChart.setData(lineData); // 设置数据,默认设置空数据
//        // get the legend (only possible after setting data)
//        Legend mLegend = lineChart.getLegend(); // 设置比例图标示，就是那个一组y的value的
//        mLegend.setForm(Legend.LegendForm.CIRCLE);// 样式
//        mLegend.setFormSize(6f);// 字体
//        mLegend.setTextColor(Color.WHITE);// 颜色
//        // mLegend.setTypeface(mTf);// 字体
//        lineChart.animateX(0); // 立即执行的动画,x轴
//
//        /**
//         * 设置X轴
//         * */
//        XAxis xAxis = lineChart.getXAxis();
//        xAxis.setEnabled(true);//显示X轴
//        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);//X轴位置
//        xAxis.setDrawGridLines(true);//设置x轴上每个点对应的线
//       // xAxis.setSpaceBetweenLabels(2);
//        xAxis.setDrawGridLines(false);
//
//
//        /**
//         *
//         * 设置左侧Y轴
//         * */
//
//        YAxis leftAxis = lineChart.getAxisLeft();
//        leftAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
////        leftAxis.setValueFormatter();//自定义Y轴数据格式
//        leftAxis.setStartAtZero(false);//设置Y轴的数据不是从0开始
//        leftAxis.setDrawTopYLabelEntry(true);
//    }


    /**
     * 生成一个数据
     *
     * @return
     * @paramcount 表示图表中有多少个坐标点
     * @paramrange 用来生成range以内的随机数
     */
//    private LineData getLineData(float[] yData,int WLstartpoint,int WLendpoint,int WLspace) {
//
//        //设置X轴的标签，此处只是简单的数字
//        String[] xData = new String[yData.length];
//        int count = 0;
//        int[] app = new int[yData.length];
//        for (int i = 0; i < app.length; i++){
//            app[i] = count;
//            xData[i] = String.valueOf(app[i]);
//            count++;
//        }
//
//        // X轴的数据，这里传入了Xstart、Xend、Xspace值
//        int dataLength = yData.length;
//        ArrayList<String> xValues = new ArrayList<String>();
//        for (int i = WLstartpoint; i <= WLendpoint; i+=WLspace) {
//            xValues.add("" + i);
//        }
//        // y轴的数据
////        ArrayList<Entry> yValues = new ArrayList<Entry>();
////        for (int i = 0; i < dataLength; i++) {
////            yValues.add(new Entry(yData[i], i));
////        }
//
//        // y轴的数据集合
//       // LineDataSet lineDataSet = new LineDataSet(yValues, "" /* 显示在比例图上 */);
//        // 用y轴的集合来设置参数
//        lineDataSet.setLineWidth(2.0f); // 线宽
//        lineDataSet.setCircleSize(0f);// 显示的圆形大小
//        lineDataSet.setColor(Color.BLUE);// 显示颜色
//        lineDataSet.setCircleColor(Color.TRANSPARENT);// 圆形的颜色
//        lineDataSet.setHighLightColor(Color.TRANSPARENT); // 点击后高亮的线的颜色
//        lineDataSet.setDrawValues(false);//隐藏折线图每个数据点的值
//        ArrayList<LineDataSet> lineDataSets = new ArrayList<LineDataSet>();
//        lineDataSets.add(lineDataSet); // add the datasets
//        lineDataSet.setDrawCircles(false);//图表上的数据点是否用小圆圈表示
//        lineDataSet.setDrawCubic(true);//允许设置平滑曲线
////        lineDataSet.setCubicIntensity(2.0f);//设置折线的平滑度
//        lineDataSet.setDrawFilled(false);//是否填充折线下方
//        lineDataSet.setFillColor(Color.rgb(0, 255, 255));//折线图下方填充颜色设置
//        LineData lineData = new LineData(xValues,lineDataSets);
//        return lineData;
//    }
}
