package com.lyf.dimension

import android.os.Build
import android.os.Bundle
import android.util.TypedValue
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var typedValue = TypedValue()

        resources.getValue(R.dimen.tpx, typedValue, true)
        println("10px == ${Integer.toBinaryString(typedValue.data)}")
        println(resources.getDimension(R.dimen.tpx))

        resources.getValue(R.dimen.tdp, typedValue, true)
        println("10dp == ${Integer.toBinaryString(typedValue.data)}")
        println(resources.getDimension(R.dimen.tdp))

        resources.getValue(R.dimen.tsp, typedValue, true)
        println("10sp == ${Integer.toBinaryString(typedValue.data)}")
        println(resources.getDimension(R.dimen.tsp))

        resources.getValue(R.dimen.tpt, typedValue, true)
        println("10pt == ${Integer.toBinaryString(typedValue.data)}")
        println(resources.getDimension(R.dimen.tpt))

        resources.getValue(R.dimen.tin, typedValue, true)
        println("10in == ${Integer.toBinaryString(typedValue.data)}")
        println(resources.getDimension(R.dimen.tin))

        resources.getValue(R.dimen.tmm, typedValue, true)
        println("10mm == ${Integer.toBinaryString(typedValue.data)}")
        println(resources.getDimension(R.dimen.tmm))

        println(resources.getFraction(R.fraction.base, 2, 1))
        println(resources.getFraction(R.fraction.pbase, 2, 1))

        println(resources.getFraction(R.fraction.base, 1, 2))
        println(resources.getFraction(R.fraction.pbase, 1, 2))

        println()

        println("bool = ${resources.getBoolean(R.bool.gender)}")

    }
}
