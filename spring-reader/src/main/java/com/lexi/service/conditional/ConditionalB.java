package com.lexi.service.conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(ConditionalOnBean.class)
public class ConditionalB {

}
