package com.fengsheng.tencentmapdemo

import android.graphics.SurfaceTexture
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.tencent.tencentmap.mapsdk.maps.MapRenderLayer
import com.tencent.tencentmap.mapsdk.maps.TencentMap
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<RelativeLayout>(R.id.mainLayout)
        val surface = SurfaceTexture(100)
        val mapOptions = TencentMapOptions()
        mapOptions.extSurface = surface
        mapOptions.setExtSurfaceDimension(900, 900)
        val mapView = MapRenderLayer(this, mapOptions)
        view.addView(mapView)
        mapView.startLayoutAnimation()
        val mMap : TencentMap = mapView.map
        mMap.setOnMapLoadedCallback {
            println("????")
        }
    }
}