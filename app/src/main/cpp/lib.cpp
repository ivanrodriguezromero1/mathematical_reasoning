#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_mathematical_1reasoning_raz_1mat_MainActivity_stringFromJNI(
    JNIEnv* env,
    jobject /* this */) {
    std::string hello = "mathematical_reasoning desde C++";
    return env->NewStringUTF(hello.c_str());
}
