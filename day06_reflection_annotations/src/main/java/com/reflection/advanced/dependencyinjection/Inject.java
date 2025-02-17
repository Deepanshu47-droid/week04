package com.reflection.advanced.dependencyinjection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Defining @Inject annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

