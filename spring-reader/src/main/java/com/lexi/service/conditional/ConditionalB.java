package com.lexi.service.conditional;

import com.lexi.service.conditional.anno.ConditionalOnBean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(ConditionalA.class)
public class ConditionalB {
}
