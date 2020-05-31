package com.carterchen247.alarmscheduler

import com.carterchen247.alarmscheduler.logger.AlarmSchedulerLogger
import com.carterchen247.alarmscheduler.model.AlarmSchedulerResultCallback
import com.carterchen247.alarmscheduler.task.AlarmTaskFactory

internal interface AlarmSchedulerContract {
    fun setAlarmTaskFactory(alarmTaskFactory: AlarmTaskFactory)
    fun setLogger(logger: AlarmSchedulerLogger?)
    fun isAlarmTaskScheduled(alarmId: Int): Boolean
    fun cancelAlarmTask(alarmId: Int)
    fun cancelAllAlarmTasks()
    fun getScheduledAlarmTaskCountAsync(callback: AlarmSchedulerResultCallback<Int>)
}