package com.fengsheng.tencentmapdemo

import android.app.Activity
import android.os.Bundle
import com.amap.api.maps.MapView


class MainActivity : Activity() {
    private var mMapView: MapView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMapView = findViewById(R.id.map)
        // 此方法须覆写，虚拟机需要在很多情况下保存地图绘制的当前状态。
//        mapView.startLayoutAnimation()

    }

    override fun onDestroy() {
        super.onDestroy()
        //在activity执行onDestroy时执行mMapView.onDestroy()，销毁地图
        mMapView?.onDestroy()
    }

    override fun onResume() {
        super.onResume()
        //在activity执行onResume时执行mMapView.onResume ()，重新绘制加载地图
        mMapView?.onResume()
    }

    override fun onPause() {
        super.onPause()
        //在activity执行onPause时执行mMapView.onPause ()，暂停地图的绘制
        mMapView?.onPause()
    }

}