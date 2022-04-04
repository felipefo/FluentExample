
import com.fluentexemple.Cliente;
import com.fluentexemple.Empresa;

/**
 *
 * @author felipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cliente cliente = new Cliente();
        cliente.comNome("Felipe")
                  .comSobreNome("Oliveira")
                  .comEmail("felipefo@gmail.com")
                  .habilitado();
        
        
        Empresa novaEmpresa = Empresa.builder()
                .email("minhaempresa@gmail.com")
                .build();
        
        System.out.println(novaEmpresa.email());
    }
    
}
