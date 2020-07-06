package com.translate.wordapp.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

/**
 * created by Abdulaziz Erel on 23:24 27.06.2020
 **/
@Configuration
@EntityScan(basePackages = "com.translate.wordapp.entity")
public class BaseConfiguration {
}
