package me.leorblx.webtools;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableAsync
@EnableScheduling
public class ServerConfiguration
{
    @Bean
    public NativeBridge nativeBridge() {
        return new NativeBridge();
    }
}
