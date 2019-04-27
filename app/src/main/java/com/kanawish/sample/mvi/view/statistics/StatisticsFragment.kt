package com.kanawish.sample.mvi.view.statistics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kanawish.sample.mvi.R

/**
 * Shows statistics for the app.
 */
class StatisticsFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.statistics_frag, container, false)
    }

}