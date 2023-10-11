package com.akbarrahmatm.a2112500851_fragment.ui.main

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

class ViewerBaru: ViewPager {
    private var swipeable = false
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    fun setSwipeable(swipeable:Boolean) {
        this.swipeable = swipeable
    }
    override fun onInterceptTouchEvent(arg0: MotionEvent):Boolean {
        return if ((this.swipeable)) super.onInterceptTouchEvent(arg0) else false
    }

    override fun onTouchEvent(event:MotionEvent):Boolean {
        return if (this.swipeable) super.onTouchEvent(event) else false
    }


}
