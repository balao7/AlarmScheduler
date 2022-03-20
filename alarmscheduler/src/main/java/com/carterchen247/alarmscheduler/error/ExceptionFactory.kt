package com.carterchen247.alarmscheduler.error

internal object ExceptionFactory {
    fun failedToCancelAlarmTask(throwable: Throwable) = IllegalStateException("Failed to cancelAlarmTask", throwable)
    fun failedToCancelAllAlarmTasks(throwable: Throwable) = IllegalStateException("Failed to cancelAllAlarmTasks", throwable)
    fun failedToGetScheduledAlarmTaskCountAsync(throwable: Throwable) = IllegalStateException("Failed to getScheduledAlarmTaskCountAsync", throwable)
    fun failedToRescheduleAlarms(throwable: Throwable) = IllegalStateException("Failed to rescheduleAlarms", throwable)
    fun failedToCreateAlarmTask(throwable: Throwable) = IllegalStateException("Failed to create AlarmTask triggering callback", throwable)
    fun failedToRemoveAlarmState(throwable: Throwable) = IllegalStateException("Failed to removed triggered alarm id", throwable)
    fun failedToScheduleAlarm(throwable: Throwable) = Exception("Failed to schedule the alarm", throwable)

    fun nullAlarmTaskFactory() = IllegalStateException("Failed creating AlarmTask, alarmTaskFactory is null")
    fun nullAlarmManager() = IllegalStateException("AlarmManager should not be null")
    fun nullPendingIntent() = IllegalStateException("PendingIntent should not be null")

    fun cannotScheduleExactAlarms() = CannotScheduleExactAlarmsException()
}