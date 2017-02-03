package com.christianbahl.kapt3argbug

import com.tickaroo.tikxml.annotation.Attribute
import com.tickaroo.tikxml.annotation.Xml

/**
 * Created by cbahl on 03.02.17.
 */
@Xml data class Test(@Attribute val test: String)