package dev.srylax.bbbassets.input.provider;

import dev.srylax.bbbassets.input.message.MessageSpec;
import dev.srylax.bbbassets.input.validation.Validator;

import java.util.function.Function;

public interface InputProvider<M extends MessageSpec,T> {
    <R> R input(M messageSpec, Function<T,R> transformer, Validator<Object,?>... validators);
}
