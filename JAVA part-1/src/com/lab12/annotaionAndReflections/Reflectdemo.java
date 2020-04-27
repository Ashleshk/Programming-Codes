package com.lab12.annotaionAndReflections;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) 
@Inherited
public @interface Reflectdemo {
  /* String decs();
   int val();
	*/
boolean isInherued() default true;
String doSOmething() default "do what??";

}