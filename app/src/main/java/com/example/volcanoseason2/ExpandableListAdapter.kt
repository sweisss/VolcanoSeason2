package com.example.volcanoseason2

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter

class ExpandableListAdapter(var context: Context, var header: MutableList<String>, var body: MutableList<Any>) : BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return header.size
    }

    override fun getChildrenCount(p0: Int): Int {
        return body.size    // differs from tutorial
    }

    override fun getGroup(p0: Int): Any {
        return header[p0]
    }

    override fun getChild(p0: Int, p1: Int): Any {
        return body[p1]     // differs from tutorial
    }

    override fun getGroupId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getChildId(p0: Int, p1: Int): Long {
        return p1.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(p0: Int, p1: Boolean, p2: View?, p3: ViewGroup?): View {
        TODO("Not yet implemented")
    }

    override fun getChildView(p0: Int, p1: Int, p2: Boolean, p3: View?, p4: ViewGroup?): View {
        TODO("Not yet implemented")
    }

    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
        return true
    }
}