
package com.fluentexemple;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 *
 * @author felipe
 */

@Builder
@Accessors(fluent = true)
public class Empresa {
    
    @Getter @Setter
    private String razaoSocial;
    @Getter @Setter
    private String telefone;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private boolean status; 
    
}
