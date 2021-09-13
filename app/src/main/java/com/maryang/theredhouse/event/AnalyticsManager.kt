package com.maryang.theredhouse.event

import android.content.Context
import android.os.Bundle
import android.util.Log
import com.amplitude.api.Amplitude
import com.amplitude.api.Identify
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.installations.FirebaseInstallations
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AnalyticsManager @Inject constructor(
    @ApplicationContext context: Context
) {

    private val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
    private val amplitude = Amplitude.getInstance()
}
