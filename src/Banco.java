import java.util.List;

import lombok.Getter;
import lombok.Setter;


public class Banco {
    @Getter @Setter
    private String nome;
    private List<Conta> contas;

    
}
