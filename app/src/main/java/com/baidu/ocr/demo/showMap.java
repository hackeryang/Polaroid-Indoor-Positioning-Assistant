package com.baidu.ocr.demo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.CameraUpdateFactory;
import com.amap.api.maps2d.MapView;
import com.amap.api.maps2d.model.BitmapDescriptorFactory;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.maps2d.model.PolygonOptions;

import java.util.Arrays;
import java.util.List;

public class showMap extends AppCompatActivity {  //Activity
    private AMap aMap;
    private MapView mapView;
    private Marker marker;
    private MarkerOptions markerOption;
    private MarkerOptions markerOption1;
    private Marker marker1;
    private MarkerOptions markerOption2;
    private Marker marker2;
    private MarkerOptions markerOption3;
    private Marker marker3;
    private MarkerOptions markerOption4;
    private Marker marker4;
    private MarkerOptions markerOption5;
    private Marker marker5;
    private MarkerOptions markerOption6;
    private Marker marker6;
    private MarkerOptions markerOption7;
    private Marker marker7;
    private MarkerOptions markerOption8;
    private Marker marker8;
    private MarkerOptions markerOption9;
    private Marker marker9;
    private MarkerOptions markerOption10;
    private Marker marker10;
    private MarkerOptions markerOption11;
    private Marker marker11;
    private MarkerOptions markerOption12;
    private Marker marker12;
    private MarkerOptions markerOption13;
    private Marker marker13;
    private MarkerOptions markerOption14;
    private Marker marker14;
    private MarkerOptions markerOption15;
    private Marker marker15;
    private MarkerOptions markerOption16;
    private Marker marker16;
    private MarkerOptions markerOption17;
    private Marker marker17;
    private MarkerOptions markerOption18;
    private Marker marker18;
    //声明定位点及其绘制参数
    private Marker location;
    private MarkerOptions locationOption;

    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_map);
        //获取弹窗数据
        Intent intent = getIntent();
        data = intent.getStringExtra("extra_data");
        //获取地图控件引用
        mapView = (MapView) findViewById(R.id.map);
        //在activity执行onCreate时执行mMapView.onCreate(savedInstanceState)，创建地图
        mapView.onCreate(savedInstanceState);
        initiate();
    }
        /**
         * 初始化
         */
    private void initiate(){
        if(aMap==null){
            aMap=mapView.getMap();
            setUpMap();
        }
        /*mLocationErrText=(TextView)findViewById(R.id.location_errInfo_text);
        mLocationErrText.setVisibility(View.GONE);*/
    }

    /**
     * 设置一些amap的属性
     */
    private void setUpMap(){
        // 设置指定的可视区域地图
        aMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(32.196781,119.509934),19));
        // 绘制一个长方形
        //112
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196838,119.510266), 0.00006, 0.00005))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //110
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196860,119.510136), 0.00006, 0.00005))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //108
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196909,119.509710), 0.00008, 0.00005))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //106
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196935,119.509535), 0.00008, 0.00005))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //104
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196953,119.509380), 0.00006, 0.00005))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //102
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196982,119.509221), 0.00006, 0.00005))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //117
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196680,119.510285), 0.00005, 0.00007))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //115
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196525,119.510255), 0.00005, 0.00007))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //113
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196295,119.510185), 0.00006, 0.00004))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //111
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196330,119.510000), 0.00006, 0.00004))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //109
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196340,119.509865), 0.00006, 0.00004))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //107
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196380,119.509600), 0.00006, 0.00004))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //105
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196395,119.509460), 0.00006, 0.00004))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //103
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196430,119.509260), 0.00005, 0.00004))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //101
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196435,119.509140), 0.00005, 0.00004))
                .fillColor(Color.rgb(255,248,220)).strokeColor(Color.RED).strokeWidth(0));
        //elevator
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196542,119.509934), 0.00004, 0.00004))
                .fillColor(Color.rgb(240,255,255)).strokeColor(Color.RED).strokeWidth(0));
        //toilet
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.1968,119.509194), 0.00005, 0.00006))
                .fillColor(Color.rgb(255,227,132)).strokeColor(Color.RED).strokeWidth(0));
        //学院牌子
        aMap.addPolygon(new PolygonOptions()
                .addAll(createRectangle(new LatLng(32.196455,119.509730), 0.00008, 0.00002))
                .fillColor(Color.rgb(193,255,193)).strokeColor(Color.RED).strokeWidth(0));
        addMarkersToMap();// 往地图上添加marker
        /*aMap.setLocationSource(this);// 设置定位监听
        aMap.getUiSettings().setMyLocationButtonEnabled(true);// 设置默认定位按钮是否显示
        aMap.setMyLocationEnabled(true);// 设置为true表示显示定位层并可触发定位，false表示隐藏定位层并不可触发定位，默认是false
        setupLocationStyle();*/
    }

    private void addMarkersToMap(){
        //112
        markerOption1 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room112))
                .position(new LatLng(32.196800,119.510266)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker1 = aMap.addMarker(markerOption1);
        //110
        markerOption2 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room110))
                .position(new LatLng(32.196822,119.510136)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker2 = aMap.addMarker(markerOption2);
        //108
        markerOption3 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room108))
                .position(new LatLng(32.196871,119.509710)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker3 = aMap.addMarker(markerOption3);
        //106
        markerOption4 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room106))
                .position(new LatLng(32.196897,119.509535)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker4 = aMap.addMarker(markerOption4);
        //104
        markerOption5 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room104))
                .position(new LatLng(32.196915,119.509380)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker5 = aMap.addMarker(markerOption5);
        //102
        markerOption6 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room102))
                .position(new LatLng(32.196944,119.509221)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker6 = aMap.addMarker(markerOption6);
        //toilet
        markerOption7 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.toilet))
                .position(new LatLng(32.196762,119.509202)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker7 = aMap.addMarker(markerOption7);
        //elevator
        markerOption8 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.elevator))
                .position(new LatLng(32.196504,119.509934)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker8 = aMap.addMarker(markerOption8);
        //117
        markerOption9 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room117))
                .position(new LatLng(32.196642,119.510285)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker9 = aMap.addMarker(markerOption9);
        //115
        markerOption10 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room115))
                .position(new LatLng(32.196487,119.510255)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker10 = aMap.addMarker(markerOption10);
        //113
        markerOption11 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room113))
                .position(new LatLng(32.196257,119.510185)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker11 = aMap.addMarker(markerOption11);
        //111
        markerOption12 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room111))
                .position(new LatLng(32.196292,119.510000)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker12 = aMap.addMarker(markerOption12);
        //109
        markerOption13 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room109))
                .position(new LatLng(32.196302,119.509865)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker13 = aMap.addMarker(markerOption13);
        //107
        markerOption14 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room107))
                .position(new LatLng(32.196342,119.509600)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker14 = aMap.addMarker(markerOption14);
        //105
        markerOption15 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room105))
                .position(new LatLng(32.196357,119.509460)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker15 = aMap.addMarker(markerOption15);
        //103
        markerOption16 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room103))
                .position(new LatLng(32.196392,119.509260)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker16 = aMap.addMarker(markerOption16);
        //101
        markerOption17 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.room101))
                .position(new LatLng(32.196397,119.509140)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker17 = aMap.addMarker(markerOption17);
        //学院牌子
        markerOption18 = new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.board))
                .position(new LatLng(32.196417,119.509730)) //latitude -38 is the center of picture
                .draggable(false)
                .visible(true);
        marker18 = aMap.addMarker(markerOption18);

        //判定MainActivity传来的data是否符合房间号，符合就绘制定位点
        if(data.contains("105")||data.contains("信息安全")){
            //定位点
            locationOption = new MarkerOptions().icon(BitmapDescriptorFactory.
                    defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                    .position(new LatLng(32.196445,119.509460)) //比房间中心往上一点
                    .title("105")
                    .snippet("信息安全")
                    .draggable(false)
                    .visible(true);
            location = aMap.addMarker(locationOption);
            location.showInfoWindow();
        }
        if(data.contains("通信")||data.contains("communication")){
            locationOption = new MarkerOptions().icon(BitmapDescriptorFactory.
                    defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                    .position(new LatLng(32.196485,119.509730)) //latitude -38 is the center of picture
                    .title("学院牌子")
                    .snippet("计算机院")
                    .draggable(false)
                    .visible(true);
            location = aMap.addMarker(locationOption);
            location.showInfoWindow();
        }
        if(data.contains("103")||data.contains("网络工程")){
            locationOption = new MarkerOptions().icon(BitmapDescriptorFactory.
                    defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                    .position(new LatLng(32.196460,119.509260)) //latitude -38 is the center of picture
                    .title("103")
                    .snippet("网络工程")
                    .draggable(false)
                    .visible(true);
            location = aMap.addMarker(locationOption);
            location.showInfoWindow();
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，销毁地图
        mapView.onDestroy();
        /*if(null!=mLocationClient){
            mLocationClient.onDestroy();
        }*/
    }

    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView.onResume ()，重新绘制加载地图
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView.onPause ()，暂停地图的绘制
        mapView.onPause();
        //deactivate();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，保存地图当前的状态
        mapView.onSaveInstanceState(outState);
    }

    /**
     * 生成一个长方形的四个坐标点
     */
    private List<LatLng> createRectangle(LatLng center, double halfWidth, double halfHeight) {
        return Arrays.asList(new LatLng(center.latitude - halfHeight, center.longitude - halfWidth), //left bottom
                new LatLng(center.latitude - halfHeight, center.longitude + halfWidth),//right bottom
                new LatLng(center.latitude + halfHeight, center.longitude + halfWidth),//right top
                new LatLng(center.latitude + halfHeight, center.longitude - halfWidth));//left top
    }
}
