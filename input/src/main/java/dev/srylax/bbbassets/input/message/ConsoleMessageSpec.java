package dev.srylax.bbbassets.input.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class ConsoleMessageSpec implements MessageSpec {
    private String message;
}
