package dev.srylax.bbbassets.input.provider;

import dev.srylax.bbbassets.input.message.MessageSpec;
import dev.srylax.bbbassets.input.validation.ValidationMiddleware;

public interface InputProvider<T extends MessageSpec> {
    <R> R input(T messageSpec, ValidationMiddleware... validationStrategies);
}
