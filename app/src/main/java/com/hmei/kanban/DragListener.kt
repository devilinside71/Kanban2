package com.hmei.kanban

import android.util.Log
import android.view.DragEvent
import android.view.View
import android.view.View.OnDragListener


class DragListener internal constructor(private val listener: Listener) : OnDragListener {
    private var isDropped = false
    override fun onDrag(v: View, event: DragEvent): Boolean {
        when (event.action) {
            DragEvent.ACTION_DROP -> {
                isDropped = true
                val viewId = v.id
                Log.e("Dropped",viewId.toString())
            }
        }
        if (!isDropped && event.localState != null) {
            (event.localState as View).visibility = View.VISIBLE
        }
        return true
    }
}