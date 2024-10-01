#include <jni.h>
#include <string>

// Función para Home
extern "C" JNIEXPORT jstring JNICALL
Java_com_mathematical_1reasoning_raz_1mat_MainActivity_stringFromHome(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hola desde Home";
    return env->NewStringUTF(hello.c_str());
}

// Función para Settings
extern "C" JNIEXPORT jstring JNICALL
Java_com_mathematical_1reasoning_raz_1mat_MainActivity_stringFromSettings(
        JNIEnv* env,
        jobject /* this */) {
    std::string settings = "Hola desde Configuración";
    return env->NewStringUTF(settings.c_str());
}

