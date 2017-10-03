package com.felix.yestask.code.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by user on 03/10/2017.
 */

class RMCategory : RealmObject(){

    @PrimaryKey
    var id: Int = 1
    var name : String? = null
    var color : Integer? = null
}