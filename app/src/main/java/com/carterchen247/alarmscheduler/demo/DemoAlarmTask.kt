package com.carterchen247.alarmscheduler.demo

import com.carterchen247.alarmscheduler.AlarmTask
import com.carterchen247.alarmscheduler.DataPayload
import timber.log.Timber

class DemoAlarmTask : AlarmTask {

    companion object {
        const val TYPE = 1
    }

    override fun onAlarmFires(alarmId: Int, dataPayload: DataPayload) {
        Timber.d("alarm fires alarmId=$alarmId dataPayload.keySet=${dataPayload.keySet().toList()}")
    }
}
