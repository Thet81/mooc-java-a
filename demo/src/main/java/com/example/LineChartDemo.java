package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class LineChartDemo extends Application {
    @Override
    public void start(Stage stage){
        NumberAxis xAxis = new NumberAxis(1968,2008,4);
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%");

        LineChart<Number,Number> lineChart = new LineChart<>(xAxis,yAxis);
        lineChart.setTitle("Relative supprot in the years 1968-2008");

        XYChart.Series rkpData = new XYChart.Series();
        rkpData.setName("RKP");
        rkpData.getData().add(new XYChart.Data<>(1968,5.6));
        rkpData.getData().add(new XYChart.Data<>(1972,5.2));
        rkpData.getData().add(new XYChart.Data<>(1976,4.7));
        rkpData.getData().add(new XYChart.Data<>(1980,4.7));
        rkpData.getData().add(new XYChart.Data<>(1984,5.1));
        rkpData.getData().add(new XYChart.Data<>(1988,5.3));
        rkpData.getData().add(new XYChart.Data<>(1992,5.0));
        rkpData.getData().add(new XYChart.Data<>(1996,5.4));
        rkpData.getData().add(new XYChart.Data<>(2000,5.1));
        rkpData.getData().add(new XYChart.Data<>(2004,5.2));
        rkpData.getData().add(new XYChart.Data<>(2008,4.7));

        lineChart.getData().add(rkpData);
        Scene view = new Scene(lineChart,640,480);
        stage.setScene(view);
        stage.show();
    }

}














