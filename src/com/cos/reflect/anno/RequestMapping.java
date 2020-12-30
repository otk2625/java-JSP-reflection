package com.cos.reflect.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//어노테이션을 적용할 대상
@Target({ElementType.METHOD})

//소스상에 유지할 것인지, 컴파일된 클래스까지 유지할 것인지, 
//런타임시에도 유지할 것인지 정하는 것
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {
	String value();
}
