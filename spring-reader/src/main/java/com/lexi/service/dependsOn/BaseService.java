package com.lexi.service.dependsOn;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("dependsOn")
public class BaseService {
}
