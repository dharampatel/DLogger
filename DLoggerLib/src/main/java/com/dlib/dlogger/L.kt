package com.dlib.dlogger

import android.util.Log

object L {

    private fun extraInfo(stack: StackTraceElement): String {
        return "className: ${stack.className}, fileName: ${stack.fileName}, " +
                "methodName: ${stack.methodName}, lineNumber: ${stack.lineNumber}"
    }

    fun i(tag: String? = DLogger.ownTag, text: String, isLogEnableForFile: Boolean = true) {
        if(DLogger.isDLoggerEnable && isLogEnableForFile) {
            val stack = Thread.currentThread().stackTrace[4]
            Log.i(tag, "${extraInfo(stack)}, message: $text")
        }
    }

    fun v(tag: String? = DLogger.ownTag, text: String, isLogEnableForFile: Boolean = true) {
        if(DLogger.isDLoggerEnable && isLogEnableForFile) {
            val stack = Thread.currentThread().stackTrace[4]
            Log.v(tag, "${extraInfo(stack)}, message: $text")
        }
    }

    fun w(tag: String? = DLogger.ownTag, text: String, isLogEnableForFile: Boolean = true) {
        if(DLogger.isDLoggerEnable && isLogEnableForFile) {
            val stack = Thread.currentThread().stackTrace[4]
            Log.w(tag, "${extraInfo(stack)}, message: $text")
        }
    }

    fun d(tag: String? = DLogger.ownTag, text: String, isLogEnableForFile: Boolean = true) {
        if(DLogger.isDLoggerEnable && isLogEnableForFile) {
            val stack = Thread.currentThread().stackTrace[4]
            Log.d(tag, "${extraInfo(stack)}, message: $text")
        }
    }

    fun e(tag: String? = DLogger.ownTag, text: String, isLogEnableForFile: Boolean = true) {
        if(DLogger.isDLoggerEnable && isLogEnableForFile) {
            val stack = Thread.currentThread().stackTrace[4]
            Log.e(tag, "${extraInfo(stack)}, message: $text")
        }
    }
}