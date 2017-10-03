package com.felix.yestask.code.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

/**
 * Created by user on 03/10/2017.
 */
class RMActivity : RealmObject() {
    @PrimaryKey
    var id: Int = 1
    var title: String? = null
    var description: String? = null
    var clock: String? = null
    var category: RMCategory? = null
    var date: Date? = null
    var dateDone: Date? = null
    var isCreatAlarm: Boolean = false
    var isDone: Boolean = false
    var priority: Int = 0
}