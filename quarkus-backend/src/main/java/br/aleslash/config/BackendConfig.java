package br.aleslash.config;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithName;

@ConfigMapping(prefix = "backend")
public interface BackendConfig {
    @WithName("error.rate")
    int errorRate();

}
