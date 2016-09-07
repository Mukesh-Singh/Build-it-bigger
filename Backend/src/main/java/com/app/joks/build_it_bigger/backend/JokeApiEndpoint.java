package com.app.joks.build_it_bigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.build_it_bigger.joks.app.com",
                ownerName = "backend.build_it_bigger.joks.app.com",
                packagePath = ""
        )
)
public class JokeApiEndpoint {

    /**
     * A simple endpoint method that takes a name and says Hi back
     */
    @ApiMethod(name = "tellJoke")
    public JokeApiBean tellJoke() {
        return new JokeApiBean();
    }

}
