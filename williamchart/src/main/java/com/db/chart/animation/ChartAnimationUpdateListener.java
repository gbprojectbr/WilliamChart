package com.db.chart.animation;

import android.animation.ValueAnimator;

/**
 * Interface used by {@link Animation} to interact with {@link com.db.chart.view.ChartView}
 */
public interface ChartAnimationUpdateListener {

    /**
     * Callback to let {@link com.db.chart.view.ChartView} know when to invalidate and present new data.
     *
     * @param animator Current value animation.
     * @return True if {@link com.db.chart.view.ChartView} accepts the call, False otherwise.
     */
    boolean onAnimationUpdate(ValueAnimator animator);
}
