# DLogger

This is first version of Logger lib

You can use it in any android project , It has some benefits such as 
1-You can enable/disable logs as project level as well as file level
2-It will provide extra info except the message that you provide such as 

**className: com.dlib.mylogger.MainActivity, fileName: MainActivity.kt, methodName: onCreate, lineNumber: 17, message: Test MainActivity logging**

**#Uses**

1- Add jitpack at project level build.gradle or settings.gradle file it depends Android studio version
In my case I added in settings.gradle you can check.

maven { url 'https://jitpack.io' }

2- Add DLogger dependency at module level build.gradle file 

implementation 'com.github.dharampatel:DLogger:Tag'

3- Current version is 1.0.0, replace Tag with 1.0.0

And you are able to use it 

4- DLogger.setTag("Some string")//Optional

The above line is used if you want to set ur tag at project level. you can also use it as class level

5-DLogger.setDLoggerEnable(true/flase)
 It is use to enable/disable logs at project level
 
6- L.i(text = "Test MainActivity Logging")
   L.i(tag = "TAG",text = "Test MainActivity Logging")
   L.i(tag = "TAG",text = "Test MainActivity Logging", isLogEnableForFile = false)
