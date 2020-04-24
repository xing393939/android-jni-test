LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
 
#模块名称
LOCAL_MODULE    := jnitest
   
LOCAL_C_INCLUDES := $(LOCAL_PATH)
   
#源文件名
LOCAL_SRC_FILES := jnitest.c \

#链接log库
 LOCAL_LDLIBS := -llog

include $(BUILD_SHARED_LIBRARY)

   