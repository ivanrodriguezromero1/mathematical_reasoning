# For the C++ Hello World app
cmake_minimum_required(VERSION 3.10.2)

project(mathematical_reasoning)

add_library(lib SHARED lib.cpp)

find_library(log-lib log)

# Corregir el paréntesis en target_link_libraries
target_link_libraries(lib ${log-lib})
