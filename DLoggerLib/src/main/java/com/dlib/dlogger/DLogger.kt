package com.dlib.dlogger

object DLogger {
    internal var isDLoggerEnable = true
    internal var ownTag = "DLogger"

    //Optional
    fun setTag(ownTag: String) {
        this.ownTag = ownTag
    }

    //Optional, it is use to enable/disable log at application level
    fun setDLoggerEnable(isDLoggerEnable: Boolean) {
        this.isDLoggerEnable = isDLoggerEnable
    }
}